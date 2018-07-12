package com.importdata.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutorService;

import mvc.common.EntityResult;
import mvc.controller.ParserMainController;

import org.apache.log4j.Logger;
import com.importdata.common.MyThread;

public class ReadMt {
	private InsertMt imt = null;

	public ReadMt(InsertMt imt) {
		this.imt = imt;
	}
	static ExecutorService fixedThreadPool = null;
	static Logger log = Logger.getLogger(ReadMt.class);

	/**
	 * 
	 * @param start
	 *            开始时间
	 * @param filePaths
	 *            批量获取文件集合
	 * @param afile
	 *            备份地址File
	 */
	public boolean importAndBackup(List<String> filePaths, final File afile) {
		try {
			filePaths = ReadFile.readfile(ParserMainController.filePath);
		} catch (FileNotFoundException e) {
			log.info("Retrieving folder exceptions(FileNotFoundException)：" + e);
			e.printStackTrace();
		} catch (IOException e) {
			log.info("Retrieving folder exceptions(IOException)：" + e);
			e.printStackTrace();
		} // 获取所有文件
		if(filePaths.size()>0){
			for (final String file : filePaths) {
				MyThread.getFixedThreadPool();
				MyThread.myThreadPool(imt,afile, file);
			}
		}else{
			ParserMainController.er = new  EntityResult();
			ParserMainController.er.message = "notFiles";
			ParserMainController.er.errorCode = 2;
		}
		return true;
	}

	

}
