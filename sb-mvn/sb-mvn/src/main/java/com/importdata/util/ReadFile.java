package com.importdata.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.log4j.Logger;

import mvc.controller.ParserMainController;

public class ReadFile {
	static Logger log = Logger.getLogger(ReadFile.class);

	public ReadFile() {
	}

	/**
	 * 读取某个文件夹下的所有文件
	 */
	public static List<String> readfile(String filepath)
			throws FileNotFoundException, IOException {
		List<String> filePahts = new ArrayList<String>();
		try {
			
			File file = new File(filepath);
			judeDirExists(file);
			String parent = file.getParent();
			String parentFileName = parent.substring(parent
					.lastIndexOf(File.separator));
			if (!file.isDirectory()
					&& parentFileName.equals(File.separator + "new")) {
				String fileName = file.getName();
				String prefix = fileName
						.substring(fileName.lastIndexOf(".") + 1);
				if (prefix.toLowerCase().equals("txt")) {
					filePahts.add(file.getPath());
				}
				log.info("this is file");
				log.info("path=" + file.getPath());
				log.info("absolutepath=" + file.getAbsolutePath());
				log.info("name=" + file.getName());
			} else if (file.isDirectory()) {
				log.info("this is folder");
				log.info("path=" + file.getPath());
				log.info("absolutepath=" + file.getAbsolutePath());
				log.info("name=" + file.getName());
				String[] filelist = file.list();
				for (int i = 0; i < filelist.length; i++) {
					if (filelist[i].equals("backup")) {
						continue;
					}
					File readfile = new File(filepath + File.separator
							+ filelist[i]);
					parent = readfile.getParent();
					parentFileName = parent.substring(parent
							.lastIndexOf(File.separator));
					if (!readfile.isDirectory()
							&& parentFileName.equals(File.separator + "new")) {
						String fileName = readfile.getName();
						String prefix = fileName.substring(fileName
								.lastIndexOf(".") + 1);
						if (prefix.toLowerCase().equals("txt")) {
							filePahts.add(readfile.getPath());
						}

						log.info("this is file");
						log.info("path=" + readfile.getPath());
						log.info("absolutepath=" + readfile.getAbsolutePath());
						log.info("name=" + readfile.getName());

					} else if (readfile.isDirectory()) {
						filePahts.addAll(readfile(filepath + File.separator
								+ filelist[i]));
					}
				}
				if(file.getPath().equals(ParserMainController.filePath)){
					//创建new 和 backup 文件夹
					File b = new File(filepath+File.separator+"backup");
					File n = new File(filepath+File.separator+"new");
					judeDirExists(b);
					judeDirExists(n);
				}
				
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("readfile()   Exception:" + e.getMessage());
		}
		
		return filePahts;
	}

	/**
	 * 备份txt文件
	 * 
	 * @param afile
	 * @param file
	 * @param filePath
	 */
	public static void backupFile(File afile, String file, String filePath) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
			afile = new File(file);
			File newPath = new File(filePath + File.separator + "backup");
			ReadFile.judeDirExists(newPath);
			String fileName = afile.getName();
			if (afile
					.renameTo(new File(filePath + File.separator + "backup"
							+ File.separator + fileName + "."
							+ sdf.format(new Date())))) {
				log.info(afile.getPath() + ":File is moved successful!");
			} else {
				log.info(afile.getPath() + "File is failed to move!");
			}

		} catch (Exception e) {
			log.error("File Backup exception" + afile.getPath() + e);
			e.printStackTrace();

		}
	}

	/**
	 * 判断文件是否存在
	 * 
	 * @param file
	 */
	public static void judeFileExists(File file) {

		if (file.exists()) {
			System.out.println("file exists");
		} else {
			System.out.println("file not exists, create it ..."+file.getPath());
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	/**
	 * 判断文件夹是否存在
	 * 
	 * @param file
	 */
	public static void judeDirExists(File file) {

		if (file.exists()) {
			if (file.isDirectory()) {
				System.out.println("dir exists");
			} else {
				System.out.println("the same name file exists, can not create dir");
			}
		} else {
			System.out.println("dir not exists, create it ..."+file.getPath());
			file.mkdir();
		}

	}

}