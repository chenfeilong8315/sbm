package mvc.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.importdata.common.MyThread;
import com.importdata.util.CountUtil;
import com.importdata.util.InsertMt;
import com.importdata.util.ReadMt;
import mvc.common.EntityResult;

@RequestMapping("/api/v1")
@RestController
public class ParserMainController {
	public static EntityResult er;
	public static String filePath = "";
	public static String type = "";

	@RequestMapping("/mt564s/transaction/{confFilePath}")
	public EntityResult ParsetData(@PathVariable String confFilePath) {
		boolean isok =false;
		CountUtil.Reset();//Reset Insertcount;
		Logger log = Logger.getLogger(ParserMainController.class);
		long start = System.currentTimeMillis();
		List<String> filePaths = null;
		Properties prop = new Properties();
		String confFile = "/importdata.properties";
//		String confFile = File.separator+"importdata.properties";
		InputStream in;
		File afile = null;
		confFilePath = confFilePath == null||confFilePath==""?confFilePath = "-t":confFilePath;
		if ("-t".equals(confFilePath)) {
			String path = System.getProperty("user.dir");
			confFile = path.replace('\\', '/') + confFile;
//			confFile = path.replace('\\', File.pathSeparatorChar) + confFile;
		} else {
			confFile = confFilePath;
		}
		try {
			in = new FileInputStream(new File(confFile));
			prop.load(in);
			in.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			log.info("File exception reading 'importdata.properties'：" + e);
			e.printStackTrace();
		}
		filePath = System.getProperty("user.dir")+"/files";//prop.getProperty("filePath");
		type = prop.getProperty("type");
		InsertMt imt = new InsertMt();
		ReadMt rm = new ReadMt(imt);
		
		isok = rm.importAndBackup(filePaths, afile);//等待 任务都放入线程队列后 得到反馈在执行shutdown
		while(isok){
			MyThread.threadsShutDown(start);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}
		
		return er;
	}
}
