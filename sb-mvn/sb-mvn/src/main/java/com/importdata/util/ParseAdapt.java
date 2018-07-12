package com.importdata.util;

import java.util.ArrayList;

import com.importdata.util.parMt564.ParseMt564;

/**
 * 适配不同类型报文
 *
 */
public class ParseAdapt {
	ParseMt564  mt;
	public ParseAdapt(ParseMt564 mt){
		this.mt = mt;
	}
	public ArrayList<?> parse(String filepath){
		return mt.parAll(filepath);
	}
}
