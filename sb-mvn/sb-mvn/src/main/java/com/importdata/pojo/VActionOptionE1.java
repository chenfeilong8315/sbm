package com.importdata.pojo;

import java.util.ArrayList;
import java.util.UUID;

import org.apache.ibatis.session.SqlSession;

import com.importdata.common.Adaptee;
import com.importdata.common.Mt;
import com.importdata.mapper.VActionOptionE1Mapper;

public class VActionOptionE1 extends Adaptee{
    private String e1CaoptnId;

    private String caoptnId;

    private String crdb;

    private String f22Temp;

    private String nelp;

    private String txap;

    private String nsis;

    private String ityp;

    private String etyp;

    private String idenSec;

    private String entl;

    private String f94Safe;

    private String coin;

    private String disf;

    private String optn;

    private String trdp;

    private String indcMrkt;

    private String cinl;

    private String offr;

    private String prpp;

    private String cava;

    private String adex;

    private String newo;

    private String adsr;

    private String trat;

    private String f92Char;

    private String fisc;

    private String rate;

    private String taxc;

    private String trax;

    private String payd;

    private String aval;

    private String divr;

    private String earl;

    private String ppdt;

    private String ltrd;

    public VActionOptionE1() {
    	this.e1CaoptnId = UUID.randomUUID().toString().replace("-", "");
	}
    
    @Override
	public int insertMyDB(SqlSession session, Mt mt) {
    	int count = 0;
    	Mt564 mt564 = (Mt564) mt;
		ArrayList<VActionOptionE1> listE1 = mt564.getE1();
		if (null != listE1 && listE1.size() > 0) {
			VActionOptionE1Mapper e1 = session
					.getMapper(VActionOptionE1Mapper.class);
			for (VActionOptionE1 mt564ActionOptionE1 : listE1) {
				
				if(e1.insertSelective(mt564ActionOptionE1) != -1){
					count ++;
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
				+ ((caoptnId == null) ? 0 : caoptnId.hashCode());
		result = prime * result
				+ ((e1CaoptnId == null) ? 0 : e1CaoptnId.hashCode());
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
		VActionOptionE1 other = (VActionOptionE1) obj;
		if (caoptnId == null) {
			if (other.caoptnId != null)
				return false;
		} else if (!caoptnId.equals(other.caoptnId))
			return false;
		if (e1CaoptnId == null) {
			if (other.e1CaoptnId != null)
				return false;
		} else if (!e1CaoptnId.equals(other.e1CaoptnId))
			return false;
		return true;
	}

	public String getE1CaoptnId() {
        return e1CaoptnId;
    }

    public void setE1CaoptnId(String e1CaoptnId) {
        this.e1CaoptnId = e1CaoptnId == null ? null : e1CaoptnId.trim();
    }

    public String getCaoptnId() {
        return caoptnId;
    }

    public void setCaoptnId(String caoptnId) {
        this.caoptnId = caoptnId == null ? null : caoptnId.trim();
    }

    public String getCrdb() {
        return crdb;
    }

    public void setCrdb(String crdb) {
        this.crdb = crdb == null ? null : crdb.trim();
    }

    public String getF22Temp() {
        return f22Temp;
    }

    public void setF22Temp(String f22Temp) {
        this.f22Temp = f22Temp == null ? null : f22Temp.trim();
    }

    public String getNelp() {
        return nelp;
    }

    public void setNelp(String nelp) {
        this.nelp = nelp == null ? null : nelp.trim();
    }

    public String getTxap() {
        return txap;
    }

    public void setTxap(String txap) {
        this.txap = txap == null ? null : txap.trim();
    }

    public String getNsis() {
        return nsis;
    }

    public void setNsis(String nsis) {
        this.nsis = nsis == null ? null : nsis.trim();
    }

    public String getItyp() {
        return ityp;
    }

    public void setItyp(String ityp) {
        this.ityp = ityp == null ? null : ityp.trim();
    }

    public String getEtyp() {
        return etyp;
    }

    public void setEtyp(String etyp) {
        this.etyp = etyp == null ? null : etyp.trim();
    }

    public String getIdenSec() {
        return idenSec;
    }

    public void setIdenSec(String idenSec) {
        this.idenSec = idenSec == null ? null : idenSec.trim();
    }

    public String getEntl() {
        return entl;
    }

    public void setEntl(String entl) {
        this.entl = entl == null ? null : entl.trim();
    }

    public String getF94Safe() {
        return f94Safe;
    }

    public void setF94Safe(String f94Safe) {
        this.f94Safe = f94Safe == null ? null : f94Safe.trim();
    }

    public String getCoin() {
        return coin;
    }

    public void setCoin(String coin) {
        this.coin = coin == null ? null : coin.trim();
    }

    public String getDisf() {
        return disf;
    }

    public void setDisf(String disf) {
        this.disf = disf == null ? null : disf.trim();
    }

    public String getOptn() {
        return optn;
    }

    public void setOptn(String optn) {
        this.optn = optn == null ? null : optn.trim();
    }

    public String getTrdp() {
        return trdp;
    }

    public void setTrdp(String trdp) {
        this.trdp = trdp == null ? null : trdp.trim();
    }

    public String getIndcMrkt() {
        return indcMrkt;
    }

    public void setIndcMrkt(String indcMrkt) {
        this.indcMrkt = indcMrkt == null ? null : indcMrkt.trim();
    }

    public String getCinl() {
        return cinl;
    }

    public void setCinl(String cinl) {
        this.cinl = cinl == null ? null : cinl.trim();
    }

    public String getOffr() {
        return offr;
    }

    public void setOffr(String offr) {
        this.offr = offr == null ? null : offr.trim();
    }

    public String getPrpp() {
        return prpp;
    }

    public void setPrpp(String prpp) {
        this.prpp = prpp == null ? null : prpp.trim();
    }

    public String getCava() {
        return cava;
    }

    public void setCava(String cava) {
        this.cava = cava == null ? null : cava.trim();
    }

    public String getAdex() {
        return adex;
    }

    public void setAdex(String adex) {
        this.adex = adex == null ? null : adex.trim();
    }

    public String getNewo() {
        return newo;
    }

    public void setNewo(String newo) {
        this.newo = newo == null ? null : newo.trim();
    }

    public String getAdsr() {
        return adsr;
    }

    public void setAdsr(String adsr) {
        this.adsr = adsr == null ? null : adsr.trim();
    }

    public String getTrat() {
        return trat;
    }

    public void setTrat(String trat) {
        this.trat = trat == null ? null : trat.trim();
    }

    public String getF92Char() {
        return f92Char;
    }

    public void setF92Char(String f92Char) {
        this.f92Char = f92Char == null ? null : f92Char.trim();
    }

    public String getFisc() {
        return fisc;
    }

    public void setFisc(String fisc) {
        this.fisc = fisc == null ? null : fisc.trim();
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate == null ? null : rate.trim();
    }

    public String getTaxc() {
        return taxc;
    }

    public void setTaxc(String taxc) {
        this.taxc = taxc == null ? null : taxc.trim();
    }

    public String getTrax() {
        return trax;
    }

    public void setTrax(String trax) {
        this.trax = trax == null ? null : trax.trim();
    }

    public String getPayd() {
        return payd;
    }

    public void setPayd(String payd) {
        this.payd = payd == null ? null : payd.trim();
    }

    public String getAval() {
        return aval;
    }

    public void setAval(String aval) {
        this.aval = aval == null ? null : aval.trim();
    }

    public String getDivr() {
        return divr;
    }

    public void setDivr(String divr) {
        this.divr = divr == null ? null : divr.trim();
    }

    public String getEarl() {
        return earl;
    }

    public void setEarl(String earl) {
        this.earl = earl == null ? null : earl.trim();
    }

    public String getPpdt() {
        return ppdt;
    }

    public void setPpdt(String ppdt) {
        this.ppdt = ppdt == null ? null : ppdt.trim();
    }

    public String getLtrd() {
        return ltrd;
    }

    public void setLtrd(String ltrd) {
        this.ltrd = ltrd == null ? null : ltrd.trim();
    }
}