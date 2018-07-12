package com.importdata.util;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author UC228286
 * 
 */
public class ParseUtil {
	/**
	 * get ChildTable
	 * 
	 * @param s
	 * @param tag
	 *            子表标志
	 * @return
	 */
	public static ArrayList<String> getChTab(String s, String tag) {

		String regex = "(:16R:" + tag + ".+?):16S:" + tag;
		Pattern pattern = Pattern.compile(regex, Pattern.DOTALL);
		Matcher m = pattern.matcher(s);
		ArrayList<String> result = new ArrayList<String>();
		while (m.find()) {
			result.add(m.group(1));
		}
		return result;
	}

	/**
	 * 多子表 get main table
	 * 
	 * @param ChildTable
	 *            tag
	 * @return
	 */
	public static String getMaTab(String s, String tag1, String tag2) {
		String regex;
		if (tag2 != null) {
			regex = "(\n:16R:" + tag1 + ".+?:16S:" + tag1 + ")|(\n:16R:" + tag2
					+ ".+?:16S:" + tag2 + ")";
		} else {
			regex = "\n:16R:" + tag1 + ".+?:16S:" + tag1;
		}
		Pattern p = Pattern.compile(regex, Pattern.DOTALL);
		Matcher m = p.matcher(s);
		s = m.replaceAll("");
		return s;
	}

	/**
	 * 单子表get main table
	 * 
	 * @param s
	 * @param tag1
	 * @return
	 */
	public static String getMaTab(String s, String tag1) {
		return getMaTab(s, tag1, null);
	}

	/**
	 * parse Method Name
	 * 
	 * @param str
	 * @return
	 */
	public static String transName(String str) {
		Pattern p = Pattern.compile(":16R:([A-Z]+)");
		Matcher m = p.matcher(str);
		m.find();
		str = m.group(1);
		str = str.toLowerCase();
		char[] strArr = str.toCharArray();
		strArr[0] = Character.toUpperCase(strArr[0]);
		return String.copyValueOf(strArr);
	}

	/**
	 * split str
	 * @param str
	 * @return
	 */
	public static String[] splitTabStr(String str) {
		return str.split("\n:");
	}

	/**
	 * 回车符转换 \n -> tag
	 * @param s
	 * @return
	 */
	public static String transN(String s,String tag) {
		Pattern p = Pattern.compile("(.+?)\n([^:].+)", Pattern.DOTALL);
		Matcher m = p.matcher(s);
		StringBuffer sb = new StringBuffer();
		String s1 = null;
		String s2 = null;
		while (m.find()) {
			s1 = m.group(1);
			s2 = m.group(2);
			sb.append(s1);
			sb.append(tag);
			m.reset(s2);
		}
		if (sb.length()==0) {
			return s;
		} else {
			sb.append(s2);
			return sb.toString();
		}
	}
}
