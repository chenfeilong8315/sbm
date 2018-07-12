package com.importdata.util.parMt564;

import com.importdata.common.Const;
import com.importdata.pojo.Mt564;
import com.importdata.pojo.VIntermSec;
import com.importdata.util.ParseUtil;

public class ParIntsec implements Parse {

	/**
	 * parse C
	 * 
	 * @param s
	 * @param aUuid
	 * @param mt
	 * @throws Exception
	 */
	@Override
	public void parse(String s, String aUuid, Mt564 mt) throws Exception {
		String[] t = new String[3];
		VIntermSec c = new VIntermSec();
		c.setInfoId(aUuid);
		// 根据\n分字段
		String[] entity = ParseUtil.splitTabStr(s);
		for (int i = 1; i < entity.length; i++) {
			String str = entity[i];
			try {
				FieldSetUtil.setValue(c, str);
			} catch (NoSuchMethodException e) {
				if (str.startsWith("35")) {
					t = ParseMt564.regMatch(str, Const.REG1);
					c.setIdenSec(t[1]);
				}
			}
		}
		mt.getC().add(c);
	}
}
