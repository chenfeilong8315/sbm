package com.importdata.util.parMt564;

import java.util.ArrayList;

import com.importdata.common.Const;
import com.importdata.pojo.Mt564;
import com.importdata.pojo.VUnderlyingSec;
import com.importdata.pojo.VUnderlyingSecB1;
import com.importdata.pojo.VUnderlyingSecB2;
import com.importdata.util.ParseUtil;

public class ParUsecu implements Parse {

	/**
	 * parse B
	 * 
	 * @param s
	 * @param aUuid
	 * @param mt
	 * @throws Exception
	 */
	@Override
	public void parse(String s, String aUuid, Mt564 mt) throws Exception {

		String[] t = new String[3];
		// parse b
		VUnderlyingSec b = new VUnderlyingSec();
		b.setInfoId(aUuid);

		// get main table
		String maTab = ParseUtil.getMaTab(s, "FIA", "ACCTINFO");
		String[] entity = ParseUtil.splitTabStr(maTab);
		for (String str : entity) {
			if (str.startsWith("35")) {
				t = ParseMt564.regMatch(str, Const.REG1);
				b.setIdenSec(t[1]);
				if(t[1].startsWith("ISIN")){
					t = ParseMt564.regMatch(t[1], "(ISIN )([A-Z0-9]+)"+Const.TAGN);
					if(t[1] !=null){
						b.setIsinNm(t[1]);
					}else{
						Exception e = new NoSuchMethodException("ISIN");
						throw (e);
					}
				}
			}
		}
		mt.getB().add(b);

		// parse b1
		ArrayList<String> chTabF = ParseUtil.getChTab(s, "FIA");
		for (String string : chTabF) {
			VUnderlyingSecB1 b1 = new VUnderlyingSecB1();
			b1.setUsecuId(b.getUsecuId());
			String[] entity_b1 = ParseUtil.splitTabStr(string);
			for (int i = 1; i < entity_b1.length; i++) {
				String str = entity_b1[i];
				// 94,22,12,11,98,92,36
				FieldSetUtil.setValue(b1, str);
			}
			mt.getB1().add(b1);
		}

		// parse b2
		ArrayList<String> chTabA = ParseUtil.getChTab(s, "ACCTINFO");
		for (String string : chTabA) {
			VUnderlyingSecB2 b2 = new VUnderlyingSecB2();
			b2.setUsecuId(b.getUsecuId());
			String[] entity_b2 = ParseUtil.splitTabStr(string);
			for (int i = 1; i < entity_b2.length; i++) {
				String str = entity_b2[i];
				try {
					FieldSetUtil.setValue(b2, str);
				} catch (NoSuchMethodException e) {
					t = ParseMt564.regMatch(str, Const.REG2);
					if (str.startsWith("97")) {
						b2.setSafeAccount(t[2]);
					} else if (str.startsWith("94")) {
						b2.setSafePlace(t[2]);
					}
				}
			}
			mt.getB2().add(b2);
		}
	}
}
