package com.importdata.util;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import mvc.controller.ParserMainController;
import com.importdata.common.Const;

public class ParseTxt {

	public static ArrayList<?> parAll(String filepath) {
		ParseAdapt p = null;
		try {
			String type = ParserMainController.type;

			Class<?> clazz = Class.forName(Const.PARSEPRE + type+".Parse"+type);
			Object mt = clazz.newInstance();
			Constructor<ParseAdapt> con = ParseAdapt.class.getDeclaredConstructor(clazz);
			p = con.newInstance(mt);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p.parse(filepath);
	}
}
