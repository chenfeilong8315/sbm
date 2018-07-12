package com.importdata.util.parMt564;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;

public class FieldSetUtil {
	public static final String REG1 = "([0-9A-Z]+):(.+)";
	public static final String REG2 = "([0-9]+)(?:[A-Z])::(\\w+)(?://|/)(.+)";
	static Logger log = Logger.getLogger(FieldSetUtil.class);

	/**
	 * Field赋值
	 * 
	 * @param obj
	 * @param str
	 * @return
	 * @throws NoSuchMethodException
	 * @throws Exception
	 */
	public static <T> T setValue(T obj, String str)
			throws NoSuchMethodException, Exception {
		String[] t = new String[3];
		try {
			t = ParseMt564.regMatch(str, REG2);
			if(t[2] ==null){
				Exception e = new NoSuchMethodException();
				throw(e);
			}
			String fieldName = t[1];
			Class<?> clazz = obj.getClass();
			String firstLetter = fieldName.substring(0, 1);
			String namesuf = firstLetter + fieldName.substring(1).toLowerCase();
			String setMethodName = "set" + namesuf;
			Method m = null;
			try {
				m = clazz.getMethod(setMethodName, String.class);
			} catch (NoSuchMethodException e) {
				try {
					setMethodName = "setF" + t[0] + namesuf;
					m = clazz.getMethod(setMethodName, String.class);
				} catch (NoSuchMethodException e1) {
					log.debug("FieldSetUtil.setValue: " + str);
					throw (e1);
				}
			}
			if (m != null) {
				m.invoke(obj, t[2]);
			}
		} catch (NoSuchMethodException e) {
			throw (e);
		} catch (Exception e) {
			log.error("FieldSetUtilError:  " + str);
			throw (e);
		}
		return obj;
	}
}