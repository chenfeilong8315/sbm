package com.importdata.pojo;

import java.util.ArrayList;
import java.util.UUID;

import org.apache.ibatis.session.SqlSession;

import com.importdata.common.Adaptee;
import com.importdata.common.Mt;
import com.importdata.mapper.VUnderlyingSecB2Mapper;

public class VUnderlyingSecB2 extends Adaptee{
    private String b2UsecuId;

    private String usecuId;

    private String acow;

    private String safeAccount;

    private String safePlace;

    private String elig;

    private String blok;

    private String borr;

    private String coli;

    private String colo;

    private String loan;

    private String pend;

    private String penr;

    private String rego;

    private String sett;

    private String spos;

    private String trad;

    private String f93Tran;

    private String nomi;

    private String unba;

    private String inba;

    private String obal;

    private String affb;

    private String unaf;

    public VUnderlyingSecB2() {
		this.b2UsecuId = UUID.randomUUID().toString().replace("-", "");
	}

    @Override
	public int insertMyDB(SqlSession session, Mt mt) {
    	int count = 0;
    	Mt564 mt564 = (Mt564) mt;
		ArrayList<VUnderlyingSecB2> listb2 = mt564.getB2();
		if (null != listb2 && listb2.size() > 0) {
			VUnderlyingSecB2Mapper b2 = session
					.getMapper(VUnderlyingSecB2Mapper.class);
			for (VUnderlyingSecB2 mt564UnderlyingSecB2 : listb2) {
				if(b2.insertSelective(mt564UnderlyingSecB2) != -1){
					count++;
				}
			}
		}
		return count;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((b2UsecuId == null) ? 0 : b2UsecuId.hashCode());
		result = prime * result + ((usecuId == null) ? 0 : usecuId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VUnderlyingSecB2 other = (VUnderlyingSecB2) obj;
		if (b2UsecuId == null) {
			if (other.b2UsecuId != null)
				return false;
		} else if (!b2UsecuId.equals(other.b2UsecuId))
			return false;
		if (usecuId == null) {
			if (other.usecuId != null)
				return false;
		} else if (!usecuId.equals(other.usecuId))
			return false;
		return true;
	}

	public String getB2UsecuId() {
        return b2UsecuId;
    }

    public void setB2UsecuId(String b2UsecuId) {
        this.b2UsecuId = b2UsecuId == null ? null : b2UsecuId.trim();
    }

    public String getUsecuId() {
        return usecuId;
    }

    public void setUsecuId(String usecuId) {
        this.usecuId = usecuId == null ? null : usecuId.trim();
    }

    public String getAcow() {
        return acow;
    }

    public void setAcow(String acow) {
        this.acow = acow == null ? null : acow.trim();
    }

    public String getSafeAccount() {
        return safeAccount;
    }

    public void setSafeAccount(String safeAccount) {
        this.safeAccount = safeAccount == null ? null : safeAccount.trim();
    }

    public String getSafePlace() {
        return safePlace;
    }

    public void setSafePlace(String safePlace) {
        this.safePlace = safePlace == null ? null : safePlace.trim();
    }

    public String getElig() {
        return elig;
    }

    public void setElig(String elig) {
        this.elig = elig == null ? null : elig.trim();
    }

    public String getBlok() {
        return blok;
    }

    public void setBlok(String blok) {
        this.blok = blok == null ? null : blok.trim();
    }

    public String getBorr() {
        return borr;
    }

    public void setBorr(String borr) {
        this.borr = borr == null ? null : borr.trim();
    }

    public String getColi() {
        return coli;
    }

    public void setColi(String coli) {
        this.coli = coli == null ? null : coli.trim();
    }

    public String getColo() {
        return colo;
    }

    public void setColo(String colo) {
        this.colo = colo == null ? null : colo.trim();
    }

    public String getLoan() {
        return loan;
    }

    public void setLoan(String loan) {
        this.loan = loan == null ? null : loan.trim();
    }

    public String getPend() {
        return pend;
    }

    public void setPend(String pend) {
        this.pend = pend == null ? null : pend.trim();
    }

    public String getPenr() {
        return penr;
    }

    public void setPenr(String penr) {
        this.penr = penr == null ? null : penr.trim();
    }

    public String getRego() {
        return rego;
    }

    public void setRego(String rego) {
        this.rego = rego == null ? null : rego.trim();
    }

    public String getSett() {
        return sett;
    }

    public void setSett(String sett) {
        this.sett = sett == null ? null : sett.trim();
    }

    public String getSpos() {
        return spos;
    }

    public void setSpos(String spos) {
        this.spos = spos == null ? null : spos.trim();
    }

    public String getTrad() {
        return trad;
    }

    public void setTrad(String trad) {
        this.trad = trad == null ? null : trad.trim();
    }

    public String getF93Tran() {
        return f93Tran;
    }

    public void setF93Tran(String f93Tran) {
        this.f93Tran = f93Tran == null ? null : f93Tran.trim();
    }

    public String getNomi() {
        return nomi;
    }

    public void setNomi(String nomi) {
        this.nomi = nomi == null ? null : nomi.trim();
    }

    public String getUnba() {
        return unba;
    }

    public void setUnba(String unba) {
        this.unba = unba == null ? null : unba.trim();
    }

    public String getInba() {
        return inba;
    }

    public void setInba(String inba) {
        this.inba = inba == null ? null : inba.trim();
    }

    public String getObal() {
        return obal;
    }

    public void setObal(String obal) {
        this.obal = obal == null ? null : obal.trim();
    }

    public String getAffb() {
        return affb;
    }

    public void setAffb(String affb) {
        this.affb = affb == null ? null : affb.trim();
    }

    public String getUnaf() {
        return unaf;
    }

    public void setUnaf(String unaf) {
        this.unaf = unaf == null ? null : unaf.trim();
    }
}