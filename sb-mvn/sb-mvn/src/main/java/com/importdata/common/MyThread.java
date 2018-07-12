package com.importdata.common;

import java.util.Map;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import mvc.common.EntityResult;
import mvc.controller.ParserMainController;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.importdata.util.CountUtil;
import com.importdata.util.InsertMt;
import com.importdata.util.MyBatisUtils;
import com.importdata.util.ParseTxt;
import com.importdata.util.ReadFile;

public class MyThread {
	static Logger log = Logger.getLogger(MyThread.class);
	public static ExecutorService fixedThreadPool = null;

	public static ExecutorService getFixedThreadPool() {
		if (fixedThreadPool == null) {
			fixedThreadPool =  Executors.newFixedThreadPool(10);
//			fixedThreadPool = Executors.newCachedThreadPool();
		}
		return fixedThreadPool;
	}

	public static void myThreadPool(final InsertMt imt, final File afile,
			final String file) {
		fixedThreadPool.execute(new Runnable() {
			@Override
			public void run() {
				SqlSession session=null;
				boolean isok = true;
				session = MyBatisUtils.getSqlSession();
				List<?> list = ParseTxt.parAll(file);
				for (Object obj : list) {
					try {
						imt.insertMtSimple(session, obj);
					} catch (PersistenceException e) {
						isok = false;
						session.rollback();
						log.info("fileName:" + file + ":Failed to import data："
								+ e);
						e.printStackTrace();
						break;
					} catch (Exception e) {
						isok = false;
						session.rollback();
						log.info("fileName:" + file + ":Failed to import data："
								+ e);
						break;
					}
				}
				session.commit();
				session.close();
				log.info("fileName:" + file + ":Import data success");
				// 插入完一个txt文件后 对此txt文件进行备份操作
				if (isok) {
					ReadFile.backupFile(afile, file, ParserMainController.filePath);
				}
			}
		});
	}

	public static void threadsShutDown(long start) {
		if(fixedThreadPool!=null){
			fixedThreadPool.shutdown();
			try {
				// 放置线程卡死影响服务器性能，超时后 强制断开线程 限制为8分钟
				if (!fixedThreadPool.awaitTermination(10 * 60000,
						TimeUnit.MILLISECONDS)) {
					// 超时的时候向线程池中所有的线程发出中断(interrupted)。
					fixedThreadPool.shutdownNow();
				}
			} catch (InterruptedException e1) {
				// awaitTermination方法被中断的时候也中止线程池中全部的线程的执行。
				System.out.println("awaitTermination interrupted: " + e1);
				fixedThreadPool.shutdownNow();
				e1.printStackTrace();
			}
			while (true) {
				if (fixedThreadPool.isTerminated()) {
					System.out.println("Threads shutdown!");
					fixedThreadPool = null;
					long end = System.currentTimeMillis();
					log.info("=================Insert data consumption time:" + (end - start) + " ms=================");
					log.info("=================Total Parse Data count:" + CountUtil.getCountParse()+" =================");
					log.info("=================Total Insert Data count:" + CountUtil.getCountInsert()+" =================");
					
					
					if(CountUtil.getCountInsert()>=0){
						Map<String, Integer> resultMap = new HashMap<String,Integer>();
						resultMap.put("time", (int) (end - start));
						resultMap.put("ParseDataCount", CountUtil.getCountParse());
						resultMap.put("InsertDataCount", CountUtil.getCountInsert());
						resultMap.put("InserTFeilCount", CountUtil.getCountParse() -  CountUtil.getCountInsert() );
						ParserMainController.er = new  EntityResult();
						ParserMainController.er.setData(resultMap);
						ParserMainController.er.setMessage(resultMap.get("InsertDataCount")<=0?"fail":"success");
						ParserMainController.er.seterrorCode(resultMap.get("InsertDataCount")<=0?0:1);
					}else{
						ParserMainController.er = new  EntityResult();
						ParserMainController.er.setMessage("fail");
						ParserMainController.er.seterrorCode(0);
					}
					
					break;
				}
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
