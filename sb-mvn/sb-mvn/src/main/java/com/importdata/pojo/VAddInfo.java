package com.importdata.pojo;

import java.util.ArrayList;
import java.util.UUID;

import org.apache.ibatis.session.SqlSession;

import com.importdata.common.Adaptee;
import com.importdata.common.Mt;
import com.importdata.mapper.VAddInfoMapper;

public class VAddInfo extends Adaptee{
    private String addinfoId;

    private String infoId;

    private String adtx;

    private String txnr;

    private String regi;

    private String inco;

    private String comp;

    private String paco;

    private String taxe;

    private String disc;

    private String bain;

    private String ceti;

    private String meor;

    private String mere;

    private String isag;

    private String paya;

    private String codo;

    private String regr;

    private String f95Drop;

    private String psag;

    private String resa;

    private String sola;

    private String infa;

    public VAddInfo() {
		this.addinfoId = UUID.randomUUID().toString().replace("-", "");
	}
    
    
    @Override
  	public int insertMyDB(SqlSession session, Mt mt) {
      	int count = 0;
      	Mt564 mt564 = (Mt564) mt;
  		ArrayList<VAddInfo> listF = mt564.getF();
  		if (null != listF && listF.size() > 0) {
  			VAddInfoMapper f = session.getMapper(VAddInfoMapper.class);
  			for (VAddInfo mt564AddInfo : listF) {
  				if (f.insertSelective(mt564AddInfo) != -1) {
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
				+ ((addinfoId == null) ? 0 : addinfoId.hashCode());
		result = prime * result + ((infoId == null) ? 0 : infoId.hashCode());
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
		VAddInfo other = (VAddInfo) obj;
		if (addinfoId == null) {
			if (other.addinfoId != null)
				return false;
		} else if (!addinfoId.equals(other.addinfoId))
			return false;
		if (infoId == null) {
			if (other.infoId != null)
				return false;
		} else if (!infoId.equals(other.infoId))
			return false;
		return true;
	}

	public String getAddinfoId() {
        return addinfoId;
    }

    public void setAddinfoId(String addinfoId) {
        this.addinfoId = addinfoId == null ? null : addinfoId.trim();
    }

    public String getInfoId() {
        return infoId;
    }

    public void setInfoId(String infoId) {
        this.infoId = infoId == null ? null : infoId.trim();
    }

    public String getAdtx() {
        return adtx;
    }

    public void setAdtx(String adtx) {
        this.adtx = adtx == null ? null : adtx.trim();
    }

    public String getTxnr() {
        return txnr;
    }

    public void setTxnr(String txnr) {
        this.txnr = txnr == null ? null : txnr.trim();
    }

    public String getRegi() {
        return regi;
    }

    public void setRegi(String regi) {
        this.regi = regi == null ? null : regi.trim();
    }

    public String getInco() {
        return inco;
    }

    public void setInco(String inco) {
        this.inco = inco == null ? null : inco.trim();
    }

    public String getComp() {
        return comp;
    }

    public void setComp(String comp) {
        this.comp = comp == null ? null : comp.trim();
    }

    public String getPaco() {
        return paco;
    }

    public void setPaco(String paco) {
        this.paco = paco == null ? null : paco.trim();
    }

    public String getTaxe() {
        return taxe;
    }

    public void setTaxe(String taxe) {
        this.taxe = taxe == null ? null : taxe.trim();
    }

    public String getDisc() {
        return disc;
    }

    public void setDisc(String disc) {
        this.disc = disc == null ? null : disc.trim();
    }

    public String getBain() {
        return bain;
    }

    public void setBain(String bain) {
        this.bain = bain == null ? null : bain.trim();
    }

    public String getCeti() {
        return ceti;
    }

    public void setCeti(String ceti) {
        this.ceti = ceti == null ? null : ceti.trim();
    }

    public String getMeor() {
        return meor;
    }

    public void setMeor(String meor) {
        this.meor = meor == null ? null : meor.trim();
    }

    public String getMere() {
        return mere;
    }

    public void setMere(String mere) {
        this.mere = mere == null ? null : mere.trim();
    }

    public String getIsag() {
        return isag;
    }

    public void setIsag(String isag) {
        this.isag = isag == null ? null : isag.trim();
    }

    public String getPaya() {
        return paya;
    }

    public void setPaya(String paya) {
        this.paya = paya == null ? null : paya.trim();
    }

    public String getCodo() {
        return codo;
    }

    public void setCodo(String codo) {
        this.codo = codo == null ? null : codo.trim();
    }

    public String getRegr() {
        return regr;
    }

    public void setRegr(String regr) {
        this.regr = regr == null ? null : regr.trim();
    }

    public String getF95Drop() {
        return f95Drop;
    }

    public void setF95Drop(String f95Drop) {
        this.f95Drop = f95Drop == null ? null : f95Drop.trim();
    }

    public String getPsag() {
        return psag;
    }

    public void setPsag(String psag) {
        this.psag = psag == null ? null : psag.trim();
    }

    public String getResa() {
        return resa;
    }

    public void setResa(String resa) {
        this.resa = resa == null ? null : resa.trim();
    }

    public String getSola() {
        return sola;
    }

    public void setSola(String sola) {
        this.sola = sola == null ? null : sola.trim();
    }

    public String getInfa() {
        return infa;
    }

    public void setInfa(String infa) {
        this.infa = infa == null ? null : infa.trim();
    }
}