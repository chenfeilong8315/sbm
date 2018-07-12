package com.importdata.util;

public class CountUtil {
	private static Integer countParse = 0;
	private static Integer countInsert = 0;
	public synchronized static void countParse(int p){
		countParse = countParse + p;
	}
	public synchronized static void countInsert(int i){
		countInsert = countInsert + i;
	}
	public static Integer getCountParse() {
		return countParse;
	}
	public static Integer getCountInsert() {
		return countInsert;
	}
	
	public static void Reset(){
		countParse = 0;
		countInsert = 0;
	}
}
