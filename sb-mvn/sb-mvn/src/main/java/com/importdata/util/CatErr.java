package com.importdata.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import mvc.controller.ParserMainController;

/**
 * Catch Error
 *
 */
public class CatErr {
	public static void catErr(String str,String filename) {
		String error = ParserMainController.filePath;
		PrintWriter bw = null;
		String errpath = error + "//" + "error_" + filename;
		File err = new File(errpath);

		try {
			bw = new PrintWriter(new FileWriter(err,true));
			bw.write("\n---------ERROR---------\n");
			bw.write(str);
			bw.flush();
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			if (bw != null)
				bw.close();
		}
	}
}
