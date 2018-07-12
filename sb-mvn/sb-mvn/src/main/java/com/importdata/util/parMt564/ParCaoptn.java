package com.importdata.util.parMt564;

import java.util.ArrayList;

import com.importdata.common.Const;
import com.importdata.pojo.Mt564;
import com.importdata.pojo.VActionOption;
import com.importdata.pojo.VActionOptionE1;
import com.importdata.pojo.VActionOptionE1a;
import com.importdata.pojo.VActionOptionE2;
import com.importdata.util.ParseUtil;

public class ParCaoptn implements Parse {

	/**
	 * parse E
	 * 
	 * @param s
	 * @param aUuid
	 * @param mt
	 * @throws Exception
	 */
	@Override
	public void parse(String s, String aUuid, Mt564 mt) throws Exception {
		VActionOption e = new VActionOption();
		e.setInfoId(aUuid);
		String t[] = new String[3];
		// 解析主表e
		String maTab = ParseUtil.getMaTab(s, "SECMOVE", "CASHMOVE");
		String[] entity = ParseUtil.splitTabStr(maTab);
		for (int i = 1; i < entity.length; i++) {
			String str = entity[i];
			try {
				FieldSetUtil.setValue(e, str);
			} catch (NoSuchMethodException ee) {
				if (str.startsWith("35")) {
					t = ParseMt564.regMatch(str, Const.REG1);
					e.setIdenSec(t[1]);
				} else if (str.startsWith("17")) {
					t = ParseMt564.regMatch(str, Const.REG2);
					if (t[1].equals("DFLT") || t[1].equals("STIN")) {
						e.setDfltStin(t[2]);
					}
				}
			}
		}
		mt.getE().add(e);

		// 解析e1
		ArrayList<String> strE1 = ParseUtil.getChTab(s, "SECMOVE");
		for (String string : strE1) {
			VActionOptionE1 e1 = new VActionOptionE1();
			e1.setCaoptnId(e.getCaoptnId());
			String maE1 = ParseUtil.getMaTab(string, "FIA");
			String[] entity_e1 = ParseUtil.splitTabStr(maE1);

			for (int i = 1; i < entity_e1.length; i++) {
				String str = entity_e1[i];
				try {
					// 92,94,98
					FieldSetUtil.setValue(e1, str);
				} catch (NoSuchMethodException ee) {
					if (str.startsWith("35")) {
						t = ParseMt564.regMatch(str, Const.REG1);
						e1.setIdenSec(t[1]);
					} else if (str.startsWith("90")) {
						t = ParseMt564.regMatch(str, Const.REG2);
						if (t[1].equals("INDC") || t[1].equals("MRKT")) {
							e1.setIndcMrkt(t[2]);
						}
					}
				}

			}
			mt.getE1().add(e1);

			// 解析e1a
			ArrayList<String> E1a = ParseUtil.getChTab(string, "FIA");
			for (String strE1a : E1a) {
				VActionOptionE1a e1a = new VActionOptionE1a();
				e1a.setE1CaoptnId(e1.getE1CaoptnId());
				String[] entity_e1a = ParseUtil.splitTabStr(strE1a);

				for (int i = 1; i < entity_e1a.length; i++) {
					String str = entity_e1a[i];
					FieldSetUtil.setValue(e1a, str);
				}
				mt.getE1a().add(e1a);
			}
		}

		// 解析e2
		ArrayList<String> strE2 = ParseUtil.getChTab(s, "CASHMOVE");
		for (String string : strE2) {
			VActionOptionE2 e2 = new VActionOptionE2();
			e2.setCaoptnId(e.getCaoptnId());
			String[] entity_e2 = ParseUtil.splitTabStr(string);

			for (int i = 1; i < entity_e2.length; i++) {
				String str = entity_e2[i];
				FieldSetUtil.setValue(e2, str);
			}
			mt.getE2().add(e2);
		}
	}
}
