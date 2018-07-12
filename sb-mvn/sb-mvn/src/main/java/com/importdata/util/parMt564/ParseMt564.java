package com.importdata.util.parMt564;

import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

import com.importdata.common.Const;
import com.importdata.pojo.Mt564;
import com.importdata.util.CatErr;
import com.importdata.util.CountUtil;
import com.importdata.util.ParseUtil;
import com.importdata.util.ReadUtil;

public class ParseMt564 {
	static Logger log = Logger.getLogger(ParseMt564.class);

	/**
	 * parse A,B,C,D,E,F
	 * 
	 * @param s
	 * @param aUuid
	 * @param mt
	 */
	public ArrayList<Mt564> parAll(String filepath) {
		Parse par;
		String filename = filepath.replaceAll(".+\\\\", "");
		String msg = "";
		int count = 0;
		ArrayList<Mt564> list = new ArrayList<Mt564>();
		try {
			msg = ReadUtil.readFile(filepath);
			log.info("parse " + filepath);
			// 根据“-”分组
			//String[] g_msg = msg.split("\n-\n");
			String[] g_msg = msg.split("\n(-\n)+");

			f: for (String str : g_msg) {
				str = str.trim();
				if (str.startsWith(":")) {
					count++;
					Mt564 mt = new Mt564();
					// 根据“16S”分表
					String[] t_msg = str
							.split("(:16S:GENL)|(:16S:USECU)|(:16S:INTSEC)|(:16S:CADETL)|(:16S:CAOPTN)|(:16S:ADDINFO)");
					String aUuid = UUID.randomUUID().toString()
							.replace("-", "");
					for (String s : t_msg) {
						if(!(s.startsWith(":16R")||s.startsWith("\n:16R")))
							continue;
						String tabName = ParseUtil.transName(s);
						s = s.trim();
						s = ParseUtil.transN(s, Const.TAGN);
						try {
							par = (Parse) Class.forName(
									Const.PARSEPRE + "Mt564.Par" + tabName)
									.newInstance();
							par.parse(s, aUuid, mt);
						} catch (Exception e) {
							CatErr.catErr(str, filename);
							e.printStackTrace();
							continue f;
						}
					}
					list.add(mt);
					CountUtil.countParse(mt.getNum());
				}
			}
			log.info("error count:" + (count - list.size()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}

	/**
	 * 字符串匹配
	 * 
	 * @param withinText
	 * @param regString
	 * @return 匹配数组
	 */
	public static String[] regMatch(String withinText, String regString) {
		String[] code = new String[3];
		Pattern pattern = Pattern.compile(regString, Pattern.DOTALL);
		Matcher matcher = pattern.matcher(withinText);
		while (matcher.find()) {
			code[0] = matcher.group(1);
			code[1] = matcher.group(2);
			if (matcher.groupCount() == 3)
				code[2] = matcher.group(3);
		}
		return code;
	}
}
