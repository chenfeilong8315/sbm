package com.importdata.util;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtils {
	private static SqlSessionFactory factory = null;
	
	public static SqlSession getSqlSession() {
		SqlSession session = null;
		String resource = "mybatis.xml";
		try {
			if( factory == null){
				InputStream inputStream = Resources.getResourceAsStream(resource);
				factory = new SqlSessionFactoryBuilder().build(inputStream);
			}
			
			session = factory.openSession();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return session;
	}
	
	public static void CloseSqlSession(SqlSession session){
		session.close();
	}

}
