package mvc.entity;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author UC228286
 * 
 */
public class Mt564AllEntity {
	private String a_info_id;
	private String a_field28_page_num;
	private String a_fieldset20;
	private String a_field23_msg_fun;
	private String a_fieldset22;
	private String a_field98_prep_dt;
	private String a_field25_status;
	private String a_create_dt;
	private String a_update_dt;

	private String a1_info_id;
	private String a1_field22_link_type;
	private String a1_field13_link_msg;
	private String a1_field20_msg_ref;

	private String b_usecu_id;
	private String b_field35_iden_sec;
	private String b_isin_nm;
	private String b_common_code_nm;

	private String b1_usecu_id;
	private String b1_field94_plis;
	private String b1_field22_mico;
	private String b1_fieldset12;
	private String b1_field11_deno;
	private String b1_fieldset98;
	private String b1_fieldset92;
	private String b1_fieldset36;

	private String b2_usecu_id;
	private String b2_field95_acow;
	private String b2_field97_safe_account;
	private String b2_field94_safe_account;
	private String b2_fieldset93;

	private String c_interm_sec_id;
	private String c_field35_iden_sec;
	private String c_field36_iden_sec;
	private String c_fieldset93;
	private String c_fieldset22;
	private String c_field92_rtun;
	private String c_field90_mrkt;
	private String c_fieldset98;
	private String c_field69_trdp;

	private String d_detail_id;
	private String d_fieldset98;
	private String d_fieldset69;
	private String d_field99_daac;
	private String d_fieldset92;
	private String d_fieldset90;
	private String d_fieldset36;
	private String d_field13_coup;
	private String d_fieldset17;
	private String d_fieldset22;
	private String d_fieldset94;
	private String d_fieldset70;

	private String e_caoptn_id;
	private String e_field13_caon;
	private String e_fieldset22;
	private String e_fieldset94;
	private String e_field11_optn;
	private String e_fieldset17;
	private String e_field35_iden_sec;
	private String e_fieldset98;
	private String e_fieldset69;
	private String e_fieldset92;
	private String e_fieldset90;
	private String e_fieldset36;
	private String e_fieldset70;

	private String e1_caoptn_id;
	private String e1_fieldset22;
	private String e1_field35_iden_sec;
	private String e1_field36_entl;
	private String e1_fieldset94;
	private String e1_field22_disf;
	private String e1_field11_optn;
	private String e1_field69_trdp;
	private String e1_fieldset90;
	private String e1_fieldset92;
	private String e1_fieldset98;

	private String e1a_caoptn_id;
	private String e1a_field94_plis;
	private String e1a_field22_mico;
	private String e1a_fieldset12;
	private String e1a_field11_deno;
	private String e1a_fieldset98;
	private String e1a_field90_issu;
	private String e1a_fieldset92;
	private String e1a_fieldset36;

	private String e2_caoptn_id;
	private String e2_fieldset22;
	private String e2_field94_coin;
	private String e2_field97_cash;
	private String e2_fieldset19;
	private String e2_fieldset98;
	private String e2_fieldset92;
	private String e2_fieldset90;

	private String f_addinfo_id;
	private String f_fieldset70;
	private String f_fieldset95;

	

	

	public static List<Mt564AllEntity> getMt564Model(
			List<Map<String, Object>> obj) {
		List<Mt564AllEntity> result = new ArrayList<Mt564AllEntity>();
		Method m;
		Class<Mt564AllEntity> clazz = Mt564AllEntity.class;
		for (Map<String, Object> mt : obj) {
			Mt564AllEntity re = new Mt564AllEntity();
			Set<String> columns = mt.keySet();
			for (String str : columns) {
				String value = (String) mt.get(str);
				if (value != null && !value.equals("")) {
					value = value.replaceAll("#CL#", "<br>");
					char[] c = str.toCharArray();
					c[0] = Character.toUpperCase(c[0]);
					String methodName = String.copyValueOf(c);
					try {
						//split methodName
						String sp[] = Mt564AllEntity.regMatch(methodName);
						m = clazz.getMethod("set" + sp[0], String.class);
						value = sp[1]+": "+ value;
						m.invoke(re,value);
					} catch (NoSuchMethodException e) {
						try {
							// get fieldname 
//							String fieldname = methodName.replaceFirst("^[a-fA-F1-2]+_", "").toUpperCase();
							m = clazz.getMethod("set" + methodName,
									String.class);
//							value = fieldname + ": " + value;
							m.invoke(re ,value);
						} catch (Exception e1) {
							e.printStackTrace();
							e1.printStackTrace();
						}
						// e.printStackTrace();
					} catch (Exception e) {
						// e.printStackTrace();
					}

				}
			}
			result.add(re);
		}
		return result;
	}

	public String getA_info_id() {
		return a_info_id;
	}

	public void setA_info_id(String a_info_id) {
		if (this.a_info_id != null) {
			this.a_info_id = this.a_info_id + "<br>" + a_info_id;
		} else {
			this.a_info_id = a_info_id;
		}
	}

	public String getA_field28_page_num() {
		return a_field28_page_num;
	}

	public void setA_field28_page_num(String a_field28_page_num) {
		if (this.a_field28_page_num != null) {
			this.a_field28_page_num = this.a_field28_page_num + "<br>"
					+ a_field28_page_num;
		} else {
			this.a_field28_page_num = a_field28_page_num;
		}
	}

	public String getA_fieldset20() {
		return a_fieldset20;
	}

	public void setA_fieldset20(String a_fieldset20) {
		if (this.a_fieldset20 != null) {
			this.a_fieldset20 = this.a_fieldset20 + "<br>" + a_fieldset20;
		} else {
			this.a_fieldset20 = a_fieldset20;
		}
	}

	public String getA_field23_msg_fun() {
		return a_field23_msg_fun;
	}

	public void setA_field23_msg_fun(String a_field23_msg_fun) {
		if (this.a_field23_msg_fun != null) {
			this.a_field23_msg_fun = this.a_field23_msg_fun + "<br>"
					+ a_field23_msg_fun;
		} else {
			this.a_field23_msg_fun = a_field23_msg_fun;
		}
	}

	public String getA_fieldset22() {
		return a_fieldset22;
	}

	public void setA_fieldset22(String a_fieldset22) {
		if (this.a_fieldset22 != null) {
			this.a_fieldset22 = this.a_fieldset22 + "<br>" + a_fieldset22;
		} else {
			this.a_fieldset22 = a_fieldset22;
		}
	}

	public String getA_field98_prep_dt() {
		return a_field98_prep_dt;
	}

	public void setA_field98_prep_dt(String a_field98_prep_dt) {
		if (this.a_field98_prep_dt != null) {
			this.a_field98_prep_dt = this.a_field98_prep_dt + "<br>"
					+ a_field98_prep_dt;
		} else {
			this.a_field98_prep_dt = a_field98_prep_dt;
		}
	}

	public String getA_field25_status() {
		return a_field25_status;
	}

	public void setA_field25_status(String a_field25_status) {
		if (this.a_field25_status != null) {
			this.a_field25_status = this.a_field25_status + "<br>"
					+ a_field25_status;
		} else {
			this.a_field25_status = a_field25_status;
		}
	}

	public String getA_create_dt() {
		return a_create_dt;
	}

	public void setA_create_dt(String a_create_dt) {
		if (this.a_create_dt != null) {
			this.a_create_dt = this.a_create_dt + "<br>" + a_create_dt;
		} else {
			this.a_create_dt = a_create_dt;
		}
	}

	public String getA_update_dt() {
		return a_update_dt;
	}

	public void setA_update_dt(String a_update_dt) {
		if (this.a_update_dt != null) {
			this.a_update_dt = this.a_update_dt + "<br>" + a_update_dt;
		} else {
			this.a_update_dt = a_update_dt;
		}
	}

	public String getA1_info_id() {
		return a1_info_id;
	}

	public void setA1_info_id(String a1_info_id) {
		if (this.a1_info_id != null) {
			this.a1_info_id = this.a1_info_id + "<br>" + a1_info_id;
		} else {
			this.a1_info_id = a1_info_id;
		}
	}

	public String getA1_field22_link_type() {
		return a1_field22_link_type;
	}

	public void setA1_field22_link_type(String a1_field22_link_type) {
		if (this.a1_field22_link_type != null) {
			this.a1_field22_link_type = this.a1_field22_link_type + "<br>"
					+ a1_field22_link_type;
		} else {
			this.a1_field22_link_type = a1_field22_link_type;
		}
	}

	public String getA1_field13_link_msg() {
		return a1_field13_link_msg;
	}

	public void setA1_field13_link_msg(String a1_field13_link_msg) {
		if (this.a1_field13_link_msg != null) {
			this.a1_field13_link_msg = this.a1_field13_link_msg + "<br>"
					+ a1_field13_link_msg;
		} else {
			this.a1_field13_link_msg = a1_field13_link_msg;
		}
	}

	public String getA1_field20_msg_ref() {
		return a1_field20_msg_ref;
	}

	public void setA1_field20_msg_ref(String a1_field20_msg_ref) {
		if (this.a1_field20_msg_ref != null) {
			this.a1_field20_msg_ref = this.a1_field20_msg_ref + "<br>"
					+ a1_field20_msg_ref;
		} else {
			this.a1_field20_msg_ref = a1_field20_msg_ref;
		}
	}

	public String getB_usecu_id() {
		return b_usecu_id;
	}

	public void setB_usecu_id(String b_usecu_id) {
		if (this.b_usecu_id != null) {
			this.b_usecu_id = this.b_usecu_id + "<br>" + b_usecu_id;
		} else {
			this.b_usecu_id = b_usecu_id;
		}
	}

	public String getB_field35_iden_sec() {
		return b_field35_iden_sec;
	}

	public void setB_field35_iden_sec(String b_field35_iden_sec) {
		if (this.b_field35_iden_sec != null) {
			this.b_field35_iden_sec = this.b_field35_iden_sec + "<br>"
					+ b_field35_iden_sec;
		} else {
			this.b_field35_iden_sec = b_field35_iden_sec;
		}
	}

	public String getB_isin_nm() {
		return b_isin_nm;
	}

	public void setB_isin_nm(String b_isin_nm) {
		if (this.b_isin_nm != null) {
			this.b_isin_nm = this.b_isin_nm + "<br>" + b_isin_nm;
		} else {
			this.b_isin_nm = b_isin_nm;
		}
	}

	public String getB_common_code_nm() {
		return b_common_code_nm;
	}

	public void setB_common_code_nm(String b_common_code_nm) {
		if (this.b_common_code_nm != null) {
			this.b_common_code_nm = this.b_common_code_nm + "<br>"
					+ b_common_code_nm;
		} else {
			this.b_common_code_nm = b_common_code_nm;
		}
	}

	public String getB1_usecu_id() {
		return b1_usecu_id;
	}

	public void setB1_usecu_id(String b1_usecu_id) {
		if (this.b1_usecu_id != null) {
			this.b1_usecu_id = this.b1_usecu_id + "<br>" + b1_usecu_id;
		} else {
			this.b1_usecu_id = b1_usecu_id;
		}
	}

	public String getB1_field94_plis() {
		return b1_field94_plis;
	}

	public void setB1_field94_plis(String b1_field94_plis) {
		if (this.b1_field94_plis != null) {
			this.b1_field94_plis = this.b1_field94_plis + "<br>" + b1_field94_plis;
		} else {
			this.b1_field94_plis = b1_field94_plis;
		}
	}

	public String getB1_field22_mico() {
		return b1_field22_mico;
	}

	public void setB1_field22_mico(String b1_field22_mico) {
		if (this.b1_field22_mico != null) {
			this.b1_field22_mico = this.b1_field22_mico + "<br>" + b1_field22_mico;
		} else {
			this.b1_field22_mico = b1_field22_mico;
		}
	}

	public String getB1_fieldset12() {
		return b1_fieldset12;
	}

	public void setB1_fieldset12(String b1_fieldset12) {
		if (this.b1_fieldset12 != null) {
			this.b1_fieldset12 = this.b1_fieldset12 + "<br>" + b1_fieldset12;
		} else {
			this.b1_fieldset12 = b1_fieldset12;
		}
	}

	public String getB1_field11_deno() {
		return b1_field11_deno;
	}

	public void setB1_field11_deno(String b1_field11_deno) {
		if (this.b1_field11_deno != null) {
			this.b1_field11_deno = this.b1_field11_deno + "<br>" + b1_field11_deno;
		} else {
			this.b1_field11_deno = b1_field11_deno;
		}
	}

	public String getB1_fieldset98() {
		return b1_fieldset98;
	}

	public void setB1_fieldset98(String b1_fieldset98) {
		if (this.b1_fieldset98 != null) {
			this.b1_fieldset98 = this.b1_fieldset98 + "<br>" + b1_fieldset98;
		} else {
			this.b1_fieldset98 = b1_fieldset98;
		}
	}

	public String getB1_fieldset92() {
		return b1_fieldset92;
	}

	public void setB1_fieldset92(String b1_fieldset92) {
		if (this.b1_fieldset92 != null) {
			this.b1_fieldset92 = this.b1_fieldset92 + "<br>" + b1_fieldset92;
		} else {
			this.b1_fieldset92 = b1_fieldset92;
		}
	}

	public String getB1_fieldset36() {
		return b1_fieldset36;
	}

	public void setB1_fieldset36(String b1_fieldset36) {
		if (this.b1_fieldset36 != null) {
			this.b1_fieldset36 = this.b1_fieldset36 + "<br>" + b1_fieldset36;
		} else {
			this.b1_fieldset36 = b1_fieldset36;
		}
	}

	public String getB2_usecu_id() {
		return b2_usecu_id;
	}

	public void setB2_usecu_id(String b2_usecu_id) {
		if (this.b2_usecu_id != null) {
			this.b2_usecu_id = this.b2_usecu_id + "<br>" + b2_usecu_id;
		} else {
			this.b2_usecu_id = b2_usecu_id;
		}
	}

	public String getB2_field95_acow() {
		return b2_field95_acow;
	}

	public void setB2_field95_acow(String b2_field95_acow) {
		if (this.b2_field95_acow != null) {
			this.b2_field95_acow = this.b2_field95_acow + "<br>" + b2_field95_acow;
		} else {
			this.b2_field95_acow = b2_field95_acow;
		}
	}

	public String getB2_field97_safe_account() {
		return b2_field97_safe_account;
	}

	public void setB2_field97_safe_account(String b2_field97_safe_account) {
		if (this.b2_field97_safe_account != null) {
			this.b2_field97_safe_account = this.b2_field97_safe_account + "<br>"
					+ b2_field97_safe_account;
		} else {
			this.b2_field97_safe_account = b2_field97_safe_account;
		}
	}

	public String getB2_field94_safe_account() {
		return b2_field94_safe_account;
	}

	public void setB2_field94_safe_account(String b2_field94_safe_account) {
		if (this.b2_field94_safe_account != null) {
			this.b2_field94_safe_account = this.b2_field94_safe_account + "<br>"
					+ b2_field94_safe_account;
		} else {
			this.b2_field94_safe_account = b2_field94_safe_account;
		}
	}

	public String getB2_fieldset93() {
		return b2_fieldset93;
	}

	public void setB2_fieldset93(String b2_fieldset93) {
		if (this.b2_fieldset93 != null) {
			this.b2_fieldset93 = this.b2_fieldset93 + "<br>" + b2_fieldset93;
		} else {
			this.b2_fieldset93 = b2_fieldset93;
		}
	}

	public String getC_interm_sec_id() {
		return c_interm_sec_id;
	}

	public void setC_interm_sec_id(String c_interm_sec_id) {
		if (this.c_interm_sec_id != null) {
			this.c_interm_sec_id = this.c_interm_sec_id + "<br>" + c_interm_sec_id;
		} else {
			this.c_interm_sec_id = c_interm_sec_id;
		}
	}

	public String getC_field35_iden_sec() {
		return c_field35_iden_sec;
	}

	public void setC_field35_iden_sec(String c_field35_iden_sec) {
		if (this.c_field35_iden_sec != null) {
			this.c_field35_iden_sec = this.c_field35_iden_sec + "<br>"
					+ c_field35_iden_sec;
		} else {
			this.c_field35_iden_sec = c_field35_iden_sec;
		}
	}

	public String getC_field36_iden_sec() {
		return c_field36_iden_sec;
	}

	public void setC_field36_iden_sec(String c_field36_iden_sec) {
		if (this.c_field36_iden_sec != null) {
			this.c_field36_iden_sec = this.c_field36_iden_sec + "<br>"
					+ c_field36_iden_sec;
		} else {
			this.c_field36_iden_sec = c_field36_iden_sec;
		}
	}

	public String getC_fieldset93() {
		return c_fieldset93;
	}

	public void setC_fieldset93(String c_fieldset93) {
		if (this.c_fieldset93 != null) {
			this.c_fieldset93 = this.c_fieldset93 + "<br>" + c_fieldset93;
		} else {
			this.c_fieldset93 = c_fieldset93;
		}
	}

	public String getC_fieldset22() {
		return c_fieldset22;
	}

	public void setC_fieldset22(String c_fieldset22) {
		if (this.c_fieldset22 != null) {
			this.c_fieldset22 = this.c_fieldset22 + "<br>" + c_fieldset22;
		} else {
			this.c_fieldset22 = c_fieldset22;
		}
	}

	public String getC_field92_rtun() {
		return c_field92_rtun;
	}

	public void setC_field92_rtun(String c_field92_rtun) {
		if (this.c_field92_rtun != null) {
			this.c_field92_rtun = this.c_field92_rtun + "<br>" + c_field92_rtun;
		} else {
			this.c_field92_rtun = c_field92_rtun;
		}
	}

	public String getC_field90_mrkt() {
		return c_field90_mrkt;
	}

	public void setC_field90_mrkt(String c_field90_mrkt) {
		if (this.c_field90_mrkt != null) {
			this.c_field90_mrkt = this.c_field90_mrkt + "<br>" + c_field90_mrkt;
		} else {
			this.c_field90_mrkt = c_field90_mrkt;
		}
	}

	public String getC_fieldset98() {
		return c_fieldset98;
	}

	public void setC_fieldset98(String c_fieldset98) {
		if (this.c_fieldset98 != null) {
			this.c_fieldset98 = this.c_fieldset98 + "<br>" + c_fieldset98;
		} else {
			this.c_fieldset98 = c_fieldset98;
		}
	}

	public String getC_field69_trdp() {
		return c_field69_trdp;
	}

	public void setC_field69_trdp(String c_field69_trdp) {
		if (this.c_field69_trdp != null) {
			this.c_field69_trdp = this.c_field69_trdp + "<br>" + c_field69_trdp;
		} else {
			this.c_field69_trdp = c_field69_trdp;
		}
	}

	public String getD_detail_id() {
		return d_detail_id;
	}

	public void setD_detail_id(String d_detail_id) {
		if (this.d_detail_id != null) {
			this.d_detail_id = this.d_detail_id + "<br>" + d_detail_id;
		} else {
			this.d_detail_id = d_detail_id;
		}
	}

	public String getD_fieldset98() {
		return d_fieldset98;
	}

	public void setD_fieldset98(String d_fieldset98) {
		if (this.d_fieldset98 != null) {
			this.d_fieldset98 = this.d_fieldset98 + "<br>" + d_fieldset98;
		} else {
			this.d_fieldset98 = d_fieldset98;
		}
	}

	public String getD_fieldset69() {
		return d_fieldset69;
	}

	public void setD_fieldset69(String d_fieldset69) {
		if (this.d_fieldset69 != null) {
			this.d_fieldset69 = this.d_fieldset69 + "<br>" + d_fieldset69;
		} else {
			this.d_fieldset69 = d_fieldset69;
		}
	}

	public String getD_field99_daac() {
		return d_field99_daac;
	}

	public void setD_field99_daac(String d_field99_daac) {
		if (this.d_field99_daac != null) {
			this.d_field99_daac = this.d_field99_daac + "<br>" + d_field99_daac;
		} else {
			this.d_field99_daac = d_field99_daac;
		}
	}

	public String getD_fieldset92() {
		return d_fieldset92;
	}

	public void setD_fieldset92(String d_fieldset92) {
		if (this.d_fieldset92 != null) {
			this.d_fieldset92 = this.d_fieldset92 + "<br>" + d_fieldset92;
		} else {
			this.d_fieldset92 = d_fieldset92;
		}
	}

	public String getD_fieldset90() {
		return d_fieldset90;
	}

	public void setD_fieldset90(String d_fieldset90) {
		if (this.d_fieldset90 != null) {
			this.d_fieldset90 = this.d_fieldset90 + "<br>" + d_fieldset90;
		} else {
			this.d_fieldset90 = d_fieldset90;
		}
	}

	public String getD_fieldset36() {
		return d_fieldset36;
	}

	public void setD_fieldset36(String d_fieldset36) {
		if (this.d_fieldset36 != null) {
			this.d_fieldset36 = this.d_fieldset36 + "<br>" + d_fieldset36;
		} else {
			this.d_fieldset36 = d_fieldset36;
		}
	}

	public String getD_field13_coup() {
		return d_field13_coup;
	}

	public void setD_field13_coup(String d_field13_coup) {
		if (this.d_field13_coup != null) {
			this.d_field13_coup = this.d_field13_coup + "<br>" + d_field13_coup;
		} else {
			this.d_field13_coup = d_field13_coup;
		}
	}

	public String getD_fieldset17() {
		return d_fieldset17;
	}

	public void setD_fieldset17(String d_fieldset17) {
		if (this.d_fieldset17 != null) {
			this.d_fieldset17 = this.d_fieldset17 + "<br>" + d_fieldset17;
		} else {
			this.d_fieldset17 = d_fieldset17;
		}
	}

	public String getD_fieldset22() {
		return d_fieldset22;
	}

	public void setD_fieldset22(String d_fieldset22) {
		if (this.d_fieldset22 != null) {
			this.d_fieldset22 = this.d_fieldset22 + "<br>" + d_fieldset22;
		} else {
			this.d_fieldset22 = d_fieldset22;
		}
	}

	public String getD_fieldset94() {
		return d_fieldset94;
	}

	public void setD_fieldset94(String d_fieldset94) {
		if (this.d_fieldset94 != null) {
			this.d_fieldset94 = this.d_fieldset94 + "<br>" + d_fieldset94;
		} else {
			this.d_fieldset94 = d_fieldset94;
		}
	}

	public String getD_fieldset70() {
		return d_fieldset70;
	}

	public void setD_fieldset70(String d_fieldset70) {
		if (this.d_fieldset70 != null) {
			this.d_fieldset70 = this.d_fieldset70 + "<br>" + d_fieldset70;
		} else {
			this.d_fieldset70 = d_fieldset70;
		}
	}

	public String getE_caoptn_id() {
		return e_caoptn_id;
	}

	public void setE_caoptn_id(String e_caoptn_id) {
		if (this.e_caoptn_id != null) {
			this.e_caoptn_id = this.e_caoptn_id + "<br>" + e_caoptn_id;
		} else {
			this.e_caoptn_id = e_caoptn_id;
		}
	}

	public String getE_field13_caon() {
		return e_field13_caon;
	}

	public void setE_field13_caon(String e_field13_caon) {
		if (this.e_field13_caon != null) {
			this.e_field13_caon = this.e_field13_caon + "<br>" + e_field13_caon;
		} else {
			this.e_field13_caon = e_field13_caon;
		}
	}

	public String getE_fieldset22() {
		return e_fieldset22;
	}

	public void setE_fieldset22(String e_fieldset22) {
		if (this.e_fieldset22 != null) {
			this.e_fieldset22 = this.e_fieldset22 + "<br>" + e_fieldset22;
		} else {
			this.e_fieldset22 = e_fieldset22;
		}
	}

	public String getE_fieldset94() {
		return e_fieldset94;
	}

	public void setE_fieldset94(String e_fieldset94) {
		if (this.e_fieldset94 != null) {
			this.e_fieldset94 = this.e_fieldset94 + "<br>" + e_fieldset94;
		} else {
			this.e_fieldset94 = e_fieldset94;
		}
	}

	public String getE_field11_optn() {
		return e_field11_optn;
	}

	public void setE_field11_optn(String e_field11_optn) {
		if (this.e_field11_optn != null) {
			this.e_field11_optn = this.e_field11_optn + "<br>" + e_field11_optn;
		} else {
			this.e_field11_optn = e_field11_optn;
		}
	}

	public String getE_fieldset17() {
		return e_fieldset17;
	}

	public void setE_fieldset17(String e_fieldset17) {
		if (this.e_fieldset17 != null) {
			this.e_fieldset17 = this.e_fieldset17 + "<br>" + e_fieldset17;
		} else {
			this.e_fieldset17 = e_fieldset17;
		}
	}

	public String getE_field35_iden_sec() {
		return e_field35_iden_sec;
	}

	public void setE_field35_iden_sec(String e_field35_iden_sec) {
		if (this.e_field35_iden_sec != null) {
			this.e_field35_iden_sec = this.e_field35_iden_sec + "<br>"
					+ e_field35_iden_sec;
		} else {
			this.e_field35_iden_sec = e_field35_iden_sec;
		}
	}

	public String getE_fieldset98() {
		return e_fieldset98;
	}

	public void setE_fieldset98(String e_fieldset98) {
		if (this.e_fieldset98 != null) {
			this.e_fieldset98 = this.e_fieldset98 + "<br>" + e_fieldset98;
		} else {
			this.e_fieldset98 = e_fieldset98;
		}
	}

	public String getE_fieldset69() {
		return e_fieldset69;
	}

	public void setE_fieldset69(String e_fieldset69) {
		if (this.e_fieldset69 != null) {
			this.e_fieldset69 = this.e_fieldset69 + "<br>" + e_fieldset69;
		} else {
			this.e_fieldset69 = e_fieldset69;
		}
	}

	public String getE_fieldset92() {
		return e_fieldset92;
	}

	public void setE_fieldset92(String e_fieldset92) {
		if (this.e_fieldset92 != null) {
			this.e_fieldset92 = this.e_fieldset92 + "<br>" + e_fieldset92;
		} else {
			this.e_fieldset92 = e_fieldset92;
		}
	}

	public String getE_fieldset90() {
		return e_fieldset90;
	}

	public void setE_fieldset90(String e_fieldset90) {
		if (this.e_fieldset90 != null) {
			this.e_fieldset90 = this.e_fieldset90 + "<br>" + e_fieldset90;
		} else {
			this.e_fieldset90 = e_fieldset90;
		}
	}

	public String getE_fieldset36() {
		return e_fieldset36;
	}

	public void setE_fieldset36(String e_fieldset36) {
		if (this.e_fieldset36 != null) {
			this.e_fieldset36 = this.e_fieldset36 + "<br>" + e_fieldset36;
		} else {
			this.e_fieldset36 = e_fieldset36;
		}
	}

	public String getE_fieldset70() {
		return e_fieldset70;
	}

	public void setE_fieldset70(String e_fieldset70) {
		if (this.e_fieldset70 != null) {
			this.e_fieldset70 = this.e_fieldset70 + "<br>" + e_fieldset70;
		} else {
			this.e_fieldset70 = e_fieldset70;
		}
	}

	public String getE1_caoptn_id() {
		return e1_caoptn_id;
	}

	public void setE1_caoptn_id(String e1_caoptn_id) {
		if (this.e1_caoptn_id != null) {
			this.e1_caoptn_id = this.e1_caoptn_id + "<br>" + e1_caoptn_id;
		} else {
			this.e1_caoptn_id = e1_caoptn_id;
		}
	}

	public String getE1_fieldset22() {
		return e1_fieldset22;
	}

	public void setE1_fieldset22(String e1_fieldset22) {
		if (this.e1_fieldset22 != null) {
			this.e1_fieldset22 = this.e1_fieldset22 + "<br>" + e1_fieldset22;
		} else {
			this.e1_fieldset22 = e1_fieldset22;
		}
	}

	public String getE1_field35_iden_sec() {
		return e1_field35_iden_sec;
	}

	public void setE1_field35_iden_sec(String e1_field35_iden_sec) {
		if (this.e1_field35_iden_sec != null) {
			this.e1_field35_iden_sec = this.e1_field35_iden_sec + "<br>"
					+ e1_field35_iden_sec;
		} else {
			this.e1_field35_iden_sec = e1_field35_iden_sec;
		}
	}

	public String getE1_field36_entl() {
		return e1_field36_entl;
	}

	public void setE1_field36_entl(String e1_field36_entl) {
		if (this.e1_field36_entl != null) {
			this.e1_field36_entl = this.e1_field36_entl + "<br>" + e1_field36_entl;
		} else {
			this.e1_field36_entl = e1_field36_entl;
		}
	}

	public String getE1_fieldset94() {
		return e1_fieldset94;
	}

	public void setE1_fieldset94(String e1_fieldset94) {
		if (this.e1_fieldset94 != null) {
			this.e1_fieldset94 = this.e1_fieldset94 + "<br>" + e1_fieldset94;
		} else {
			this.e1_fieldset94 = e1_fieldset94;
		}
	}

	public String getE1_field22_disf() {
		return e1_field22_disf;
	}

	public void setE1_field22_disf(String e1_field22_disf) {
		if (this.e1_field22_disf != null) {
			this.e1_field22_disf = this.e1_field22_disf + "<br>" + e1_field22_disf;
		} else {
			this.e1_field22_disf = e1_field22_disf;
		}
	}

	public String getE1_field11_optn() {
		return e1_field11_optn;
	}

	public void setE1_field11_optn(String e1_field11_optn) {
		if (this.e1_field11_optn != null) {
			this.e1_field11_optn = this.e1_field11_optn + "<br>" + e1_field11_optn;
		} else {
			this.e1_field11_optn = e1_field11_optn;
		}
	}

	public String getE1_field69_trdp() {
		return e1_field69_trdp;
	}

	public void setE1_field69_trdp(String e1_field69_trdp) {
		if (this.e1_field69_trdp != null) {
			this.e1_field69_trdp = this.e1_field69_trdp + "<br>" + e1_field69_trdp;
		} else {
			this.e1_field69_trdp = e1_field69_trdp;
		}
	}

	public String getE1_fieldset90() {
		return e1_fieldset90;
	}

	public void setE1_fieldset90(String e1_fieldset90) {
		if (this.e1_fieldset90 != null) {
			this.e1_fieldset90 = this.e1_fieldset90 + "<br>" + e1_fieldset90;
		} else {
			this.e1_fieldset90 = e1_fieldset90;
		}
	}

	public String getE1_fieldset92() {
		return e1_fieldset92;
	}

	public void setE1_fieldset92(String e1_fieldset92) {
		if (this.e1_fieldset92 != null) {
			this.e1_fieldset92 = this.e1_fieldset92 + "<br>" + e1_fieldset92;
		} else {
			this.e1_fieldset92 = e1_fieldset92;
		}
	}

	public String getE1_fieldset98() {
		return e1_fieldset98;
	}

	public void setE1_fieldset98(String e1_fieldset98) {
		if (this.e1_fieldset98 != null) {
			this.e1_fieldset98 = this.e1_fieldset98 + "<br>" + e1_fieldset98;
		} else {
			this.e1_fieldset98 = e1_fieldset98;
		}
	}

	public String getE1a_caoptn_id() {
		return e1a_caoptn_id;
	}

	public void setE1a_caoptn_id(String e1a_caoptn_id) {
		if (this.e1a_caoptn_id != null) {
			this.e1a_caoptn_id = this.e1a_caoptn_id + "<br>" + e1a_caoptn_id;
		} else {
			this.e1a_caoptn_id = e1a_caoptn_id;
		}
	}

	public String getE1a_field94_plis() {
		return e1a_field94_plis;
	}

	public void setE1a_field94_plis(String e1a_field94_plis) {
		if (this.e1a_field94_plis != null) {
			this.e1a_field94_plis = this.e1a_field94_plis + "<br>"
					+ e1a_field94_plis;
		} else {
			this.e1a_field94_plis = e1a_field94_plis;
		}
	}

	public String getE1a_field22_mico() {
		return e1a_field22_mico;
	}

	public void setE1a_field22_mico(String e1a_field22_mico) {
		if (this.e1a_field22_mico != null) {
			this.e1a_field22_mico = this.e1a_field22_mico + "<br>"
					+ e1a_field22_mico;
		} else {
			this.e1a_field22_mico = e1a_field22_mico;
		}
	}

	public String getE1a_fieldset12() {
		return e1a_fieldset12;
	}

	public void setE1a_fieldset12(String e1a_fieldset12) {
		if (this.e1a_fieldset12 != null) {
			this.e1a_fieldset12 = this.e1a_fieldset12 + "<br>" + e1a_fieldset12;
		} else {
			this.e1a_fieldset12 = e1a_fieldset12;
		}
	}

	public String getE1a_field11_deno() {
		return e1a_field11_deno;
	}

	public void setE1a_field11_deno(String e1a_field11_deno) {
		if (this.e1a_field11_deno != null) {
			this.e1a_field11_deno = this.e1a_field11_deno + "<br>"
					+ e1a_field11_deno;
		} else {
			this.e1a_field11_deno = e1a_field11_deno;
		}
	}

	public String getE1a_fieldset98() {
		return e1a_fieldset98;
	}

	public void setE1a_fieldset98(String e1a_fieldset98) {
		if (this.e1a_fieldset98 != null) {
			this.e1a_fieldset98 = this.e1a_fieldset98 + "<br>" + e1a_fieldset98;
		} else {
			this.e1a_fieldset98 = e1a_fieldset98;
		}
	}

	public String getE1a_field90_issu() {
		return e1a_field90_issu;
	}

	public void setE1a_field90_issu(String e1a_field90_issu) {
		if (this.e1a_field90_issu != null) {
			this.e1a_field90_issu = this.e1a_field90_issu + "<br>"
					+ e1a_field90_issu;
		} else {
			this.e1a_field90_issu = e1a_field90_issu;
		}
	}

	public String getE1a_fieldset92() {
		return e1a_fieldset92;
	}

	public void setE1a_fieldset92(String e1a_fieldset92) {
		if (this.e1a_fieldset92 != null) {
			this.e1a_fieldset92 = this.e1a_fieldset92 + "<br>" + e1a_fieldset92;
		} else {
			this.e1a_fieldset92 = e1a_fieldset92;
		}
	}

	public String getE1a_fieldset36() {
		return e1a_fieldset36;
	}

	public void setE1a_fieldset36(String e1a_fieldset36) {
		if (this.e1a_fieldset36 != null) {
			this.e1a_fieldset36 = this.e1a_fieldset36 + "<br>" + e1a_fieldset36;
		} else {
			this.e1a_fieldset36 = e1a_fieldset36;
		}
	}

	public String getE2_caoptn_id() {
		return e2_caoptn_id;
	}

	public void setE2_caoptn_id(String e2_caoptn_id) {
		if (this.e2_caoptn_id != null) {
			this.e2_caoptn_id = this.e2_caoptn_id + "<br>" + e2_caoptn_id;
		} else {
			this.e2_caoptn_id = e2_caoptn_id;
		}
	}

	public String getE2_fieldset22() {
		return e2_fieldset22;
	}

	public void setE2_fieldset22(String e2_fieldset22) {
		if (this.e2_fieldset22 != null) {
			this.e2_fieldset22 = this.e2_fieldset22 + "<br>" + e2_fieldset22;
		} else {
			this.e2_fieldset22 = e2_fieldset22;
		}
	}

	public String getE2_field94_coin() {
		return e2_field94_coin;
	}

	public void setE2_field94_coin(String e2_field94_coin) {
		if (this.e2_field94_coin != null) {
			this.e2_field94_coin = this.e2_field94_coin + "<br>" + e2_field94_coin;
		} else {
			this.e2_field94_coin = e2_field94_coin;
		}
	}

	public String getE2_field97_cash() {
		return e2_field97_cash;
	}

	public void setE2_field97_cash(String e2_field97_cash) {
		if (this.e2_field97_cash != null) {
			this.e2_field97_cash = this.e2_field97_cash + "<br>" + e2_field97_cash;
		} else {
			this.e2_field97_cash = e2_field97_cash;
		}
	}

	public String getE2_fieldset19() {
		return e2_fieldset19;
	}

	public void setE2_fieldset19(String e2_fieldset19) {
		if (this.e2_fieldset19 != null) {
			this.e2_fieldset19 = this.e2_fieldset19 + "<br>" + e2_fieldset19;
		} else {
			this.e2_fieldset19 = e2_fieldset19;
		}
	}

	public String getE2_fieldset98() {
		return e2_fieldset98;
	}

	public void setE2_fieldset98(String e2_fieldset98) {
		if (this.e2_fieldset98 != null) {
			this.e2_fieldset98 = this.e2_fieldset98 + "<br>" + e2_fieldset98;
		} else {
			this.e2_fieldset98 = e2_fieldset98;
		}
	}

	public String getE2_fieldset92() {
		return e2_fieldset92;
	}

	public void setE2_fieldset92(String e2_fieldset92) {
		if (this.e2_fieldset92 != null) {
			this.e2_fieldset92 = this.e2_fieldset92 + "<br>" + e2_fieldset92;
		} else {
			this.e2_fieldset92 = e2_fieldset92;
		}
	}

	public String getE2_fieldset90() {
		return e2_fieldset90;
	}

	public void setE2_fieldset90(String e2_fieldset90) {
		if (this.e2_fieldset90 != null) {
			this.e2_fieldset90 = this.e2_fieldset90 + "<br>" + e2_fieldset90;
		} else {
			this.e2_fieldset90 = e2_fieldset90;
		}
	}

	public String getF_addinfo_id() {
		return f_addinfo_id;
	}

	public void setF_addinfo_id(String f_addinfo_id) {
		if (this.f_addinfo_id != null) {
			this.f_addinfo_id = this.f_addinfo_id + "<br>" + f_addinfo_id;
		} else {
			this.f_addinfo_id = f_addinfo_id;
		}
	}

	public String getF_fieldset70() {
		return f_fieldset70;
	}

	public void setF_fieldset70(String f_fieldset70) {
		if (this.f_fieldset70 != null) {
			this.f_fieldset70 = this.f_fieldset70 + "<br>" + f_fieldset70;
		} else {
			this.f_fieldset70 = f_fieldset70;
		}
	}

	public String getF_fieldset95() {
		return f_fieldset95;
	}

	public void setF_fieldset95(String f_fieldset95) {
		if (this.f_fieldset95 != null) {
			this.f_fieldset95 = this.f_fieldset95 + "<br>" + f_fieldset95;
		} else {
			this.f_fieldset95 = f_fieldset95;
		}
	}

	/**
	 * 字符串匹配, 取得方法名前缀
	 * 
	 * @param withinText
	 * @param regString
	 * @return 匹配数组
	 */
	public static String[] regMatch(String withinText) {
		String code[] = new String[2];
		String regString = "(^[a-fA-F1-2]+_[a-z0-9]+)_(.+)";
		Pattern pattern = Pattern.compile(regString);
		Matcher matcher = pattern.matcher(withinText);
		while (matcher.find()) {
			code[0] = matcher.group(1);
			code[1] = matcher.group(2).toUpperCase();
		}
		return code;
	}
//test regx
//	public static void main(String[] args) {
//		String str = "e2_fieldset92_msg_fun";
//		String res[] = regMatch(str);
//		System.out.println(res[0] + ':' + res[1]);
//		System.out.println(str.replaceFirst("^[a-fA-F1-2]+_", ""));
//	}
}
