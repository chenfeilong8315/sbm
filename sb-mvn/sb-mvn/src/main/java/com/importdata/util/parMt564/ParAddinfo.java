package com.importdata.util.parMt564;

import com.importdata.pojo.Mt564;
import com.importdata.pojo.VAddInfo;
import com.importdata.util.ParseUtil;

public class ParAddinfo implements Parse{

	/**
	 * F表解析
	 * 
	 * @param s
	 * @param aUuid
	 * @param mt
	 * @throws Exception 
	 */
	@Override
	public void parse(String s, String aUuid, Mt564 mt) throws Exception {
		VAddInfo f = new VAddInfo();
		f.setInfoId(aUuid);
		String[] entity = ParseUtil.splitTabStr(s);

		for (int i = 1; i < entity.length; i++) {
			String str = entity[i];
			//70,95
			FieldSetUtil.setValue(f, str);
		}
		mt.getF().add(f);
	}
}
