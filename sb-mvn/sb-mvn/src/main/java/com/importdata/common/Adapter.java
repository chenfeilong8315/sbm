package com.importdata.common;

import org.apache.ibatis.session.SqlSession;


public class Adapter implements Target {

	private Adaptee adaptee;

	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	public int insert(SqlSession session, Mt mt) {
		return this.adaptee.insertMyDB(session, mt);
	}
}
