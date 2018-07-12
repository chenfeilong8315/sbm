package com.importdata.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadUtil {
	/**
	 * Read the content of the given file into a string.
	 * 
	 * @param filename
	 *            the name of the file to be read
	 * @see #readFile(File)
	 * @since 7.6
	 * @throws IOException
	 *             if an error occurs during read
	 */
	public static String readFile(final String filename) throws IOException {
		return readFile(new File(filename));
	}

	/**
	 * Read the content of the given file into a string, usign UTF8 as default
	 * encoding
	 * 
	 * @see #readFile(File, String)
	 */
	public static String readFile(final File file) throws IOException {
		return readFile(file, "UTF8");
	}

	/**
	 * Read the content of the given file into a string.
	 * 
	 * @param file
	 *            the file to be read
	 * @param encoding
	 *            encoding to use
	 * @return the file contents or null if file is null or does not exist, or
	 *         can't be read, or is not a file
	 * @throws IOException
	 *             if an error occurs during read
	 */
	public static String readFile(final File file, final String encoding)
			throws IOException {
		// 文件读取起点 ：
		boolean flag = false;
		if (file == null || !file.exists() || !file.canRead() || !file.isFile()) {
			return null;
		}
		BufferedReader in = new BufferedReader(new InputStreamReader(
				new FileInputStream(file), encoding));
		final StringBuilder sb = new StringBuilder((int) file.length());
		try {
			String str = null;
			String temp = null;
			while ((str = in.readLine()) != null) {
				if (!flag) {
					temp = str;
					if (temp.matches("^:.+")) {
						flag = true;
						sb.append(str);
					}
				} else {
					sb.append("\n");
					sb.append(str);
				}
			}
		} finally {
			if (flag)
				flag = false;
			in.close();
		}
		return sb.toString();
	}
}
