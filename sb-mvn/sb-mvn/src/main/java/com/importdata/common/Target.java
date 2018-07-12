package com.importdata.common;

import org.apache.ibatis.session.SqlSession;


public interface Target {
	public int insert(SqlSession session, Mt mt) throws Exception;
}
