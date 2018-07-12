package com.importdata.util.parMt564;

import java.util.ArrayList;

import com.importdata.common.Const;
import com.importdata.pojo.Mt564;
import com.importdata.pojo.VGenInfo;
import com.importdata.pojo.VGenInfoA1;
import com.importdata.util.ParseUtil;

public class ParGenl implements Parse {

	/**
	 * parse A
	 * 
	 * @param s
	 * @param mt
	 * @throws Exception
	 */
	@Override
	public void parse(String s, String aUuid, Mt564 mt) throws Exception {
		VGenInfo a = new VGenInfo();
		a.setInfoId(aUuid);
		ArrayList<VGenInfoA1> a1list = new ArrayList<VGenInfoA1>();
		String maTab = ParseUtil.getMaTab(s, "LINK");
		String[] entity = ParseUtil.splitTabStr(maTab);
		String[] t = new String[3];

		for (int i = 1; i < entity.length; i++) {
			String str = entity[i];
			t = ParseMt564.regMatch(str, Const.REG1);
			if (str.startsWith("28")) {
				a.setPageNum(t[1].replace("ONLY", "1"));
			} else if (str.startsWith("23")) {
				a.setMsgFun(t[1]);
			} else if (str.startsWith("98")) {
				t = ParseMt564.regMatch(str, Const.REG2);
				a.setPrepDt(t[2]);
			} else if (str.startsWith("25")) {
				t = ParseMt564.regMatch(str, Const.REG2);
				a.setStatus(t[2]);
			} else {
				// 20,22
				FieldSetUtil.setValue(a, str);
			}
		}
		mt.setA(a);

		// parse a1
		ArrayList<String> chTab = ParseUtil.getChTab(s, "LINK");
		for (String string : chTab) {
			VGenInfoA1 a1 = new VGenInfoA1();
			String[] entity_1 = ParseUtil.splitTabStr(string);
			for (int i = 1; i < entity_1.length; i++) {
				String cStr = entity_1[i];
				t = ParseMt564.regMatch(cStr, Const.REG2);
				if (cStr.startsWith("22")) {
					a1.setLinkType(t[2]);
				} else if (cStr.startsWith("13")) {
					a1.setLinkMsg(t[2]);
				} else if (cStr.startsWith("20")) {
					a1.setMsgRef(t[2]);
				}
			}
			a1.setInfoId(a.getInfoId());
			a1list.add(a1);
		}
		mt.setA1(a1list);
	}
}
