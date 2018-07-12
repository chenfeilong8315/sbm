package com.importdata.util;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.importdata.common.Adaptee;
import com.importdata.common.Adapter;
import com.importdata.common.Mt;
import com.importdata.common.Target;

public class InsertMt {
	public static Logger log = Logger.getLogger(InsertMt.class);

	/**
	 * abcdef Sequential storage
	 * 
	 * @param session
	 * @param mt564
	 */
	public void insertMtSimple(SqlSession session, Object obj)
			throws PersistenceException, Exception {

		Field[] fields = obj.getClass().getDeclaredFields();
		AccessibleObject.setAccessible(fields, true);
		for (Field field : fields) {
			List<?> l = (List<?>) field.get(obj);
			if (l.size()>0) {
				Object e = l.get(0);
				Target adapter = new Adapter((Adaptee) e);
				CountUtil.countInsert(adapter.insert(session, (Mt) obj));
			}
		}
	}
}
