package com.importdata.util.parMt564;

import com.importdata.pojo.Mt564;
import com.importdata.pojo.VActionDetail;
import com.importdata.util.ParseUtil;

public class ParCadetl implements Parse {

	/**
	 * parse D
	 * 
	 * @param s
	 * @param aUuid
	 * @param mt
	 * @throws Exception
	 */
	@Override
	public void parse(String s, String aUuid, Mt564 mt) throws Exception {
		VActionDetail d = new VActionDetail();
		d.setInfoId(aUuid);
		String[] entity = ParseUtil.splitTabStr(s);
		for (int i = 1; i < entity.length; i++) {
			String str = entity[i];

			// 17,22,36,69,70,90,92,94,98
			FieldSetUtil.setValue(d, str);
		}
		mt.getD().add(d);
	}
}
