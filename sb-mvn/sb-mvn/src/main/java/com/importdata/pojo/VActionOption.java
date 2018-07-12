package com.importdata.pojo;

import java.util.ArrayList;
import java.util.UUID;

import org.apache.ibatis.session.SqlSession;

import com.importdata.common.Adaptee;
import com.importdata.common.Mt;
import com.importdata.mapper.VActionOptionMapper;

public class VActionOption extends Adaptee{
    private String caoptnId;

    private String infoId;

    private String caon;

    private String caop;

    private String disf;

    private String offe;

    private String optf;

    private String osta;

    private String f22Ceti;

    private String ndom;

    private String domi;

    private String optn;

    private String dfltStin;

    private String rchg;

    private String cert;

    private String wthd;

    private String chan;

    private String apli;

    private String idenSec;

    private String dvcp;

    private String eard;

    private String expi;

    private String mkdt;

    private String podt;

    private String subs;

    private String rddt;

    private String cvpr;

    private String bord;

    private String pric;

    private String revo;

    private String pwal;

    private String parl;

    private String susp;

    private String arev;

    private String dswo;

    private String grss;

    private String taxr;

    private String atax;

    private String indx;

    private String ovep;

    private String pror;

    private String intp;

    private String tdmt;

    private String nett;

    private String idfx;

    private String txin;

    private String witl;

    private String cinl;

    private String osub;

    private String maex;

    private String miex;

    private String milt;

    private String nblt;

    private String newd;

    private String bolq;

    private String folq;

    private String adtx;

    private String f70Ceti;

    private String comp;

    private String disc;

    private String inco;

    private String nser;

    private String taxe;

    private String txnr;

    public VActionOption() {
		this.caoptnId = UUID.randomUUID().toString().replace("-", "");
	}

    @Override
   	public int insertMyDB(SqlSession session, Mt mt) {
       	int count = 0;
       	Mt564 mt564 = (Mt564) mt;
   		ArrayList<VActionOption> listE = mt564.getE();
   		if (null != listE && listE.size() > 0) {
   			VActionOptionMapper e = session
   					.getMapper(VActionOptionMapper.class);
   			for (VActionOption mt564ActionOption : listE) {
   				
   				if(e.insertSelective(mt564ActionOption) != -1){
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
				+ ((caoptnId == null) ? 0 : caoptnId.hashCode());
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
		VActionOption other = (VActionOption) obj;
		if (caoptnId == null) {
			if (other.caoptnId != null)
				return false;
		} else if (!caoptnId.equals(other.caoptnId))
			return false;
		if (infoId == null) {
			if (other.infoId != null)
				return false;
		} else if (!infoId.equals(other.infoId))
			return false;
		return true;
	}

	public String getCaoptnId() {
        return caoptnId;
    }

    public void setCaoptnId(String caoptnId) {
        this.caoptnId = caoptnId == null ? null : caoptnId.trim();
    }

    public String getInfoId() {
        return infoId;
    }

    public void setInfoId(String infoId) {
        this.infoId = infoId == null ? null : infoId.trim();
    }

    public String getCaon() {
        return caon;
    }

    public void setCaon(String caon) {
        this.caon = caon == null ? null : caon.trim();
    }

    public String getCaop() {
        return caop;
    }

    public void setCaop(String caop) {
        this.caop = caop == null ? null : caop.trim();
    }

    public String getDisf() {
        return disf;
    }

    public void setDisf(String disf) {
        this.disf = disf == null ? null : disf.trim();
    }

    public String getOffe() {
        return offe;
    }

    public void setOffe(String offe) {
        this.offe = offe == null ? null : offe.trim();
    }

    public String getOptf() {
        return optf;
    }

    public void setOptf(String optf) {
        this.optf = optf == null ? null : optf.trim();
    }

    public String getOsta() {
        return osta;
    }

    public void setOsta(String osta) {
        this.osta = osta == null ? null : osta.trim();
    }

    public String getF22Ceti() {
        return f22Ceti;
    }

    public void setF22Ceti(String f22Ceti) {
        this.f22Ceti = f22Ceti == null ? null : f22Ceti.trim();
    }

    public String getNdom() {
        return ndom;
    }

    public void setNdom(String ndom) {
        this.ndom = ndom == null ? null : ndom.trim();
    }

    public String getDomi() {
        return domi;
    }

    public void setDomi(String domi) {
        this.domi = domi == null ? null : domi.trim();
    }

    public String getOptn() {
        return optn;
    }

    public void setOptn(String optn) {
        this.optn = optn == null ? null : optn.trim();
    }

    public String getDfltStin() {
        return dfltStin;
    }

    public void setDfltStin(String dfltStin) {
        this.dfltStin = dfltStin == null ? null : dfltStin.trim();
    }

    public String getRchg() {
        return rchg;
    }

    public void setRchg(String rchg) {
        this.rchg = rchg == null ? null : rchg.trim();
    }

    public String getCert() {
        return cert;
    }

    public void setCert(String cert) {
        this.cert = cert == null ? null : cert.trim();
    }

    public String getWthd() {
        return wthd;
    }

    public void setWthd(String wthd) {
        this.wthd = wthd == null ? null : wthd.trim();
    }

    public String getChan() {
        return chan;
    }

    public void setChan(String chan) {
        this.chan = chan == null ? null : chan.trim();
    }

    public String getApli() {
        return apli;
    }

    public void setApli(String apli) {
        this.apli = apli == null ? null : apli.trim();
    }

    public String getIdenSec() {
        return idenSec;
    }

    public void setIdenSec(String idenSec) {
        this.idenSec = idenSec == null ? null : idenSec.trim();
    }

    public String getDvcp() {
        return dvcp;
    }

    public void setDvcp(String dvcp) {
        this.dvcp = dvcp == null ? null : dvcp.trim();
    }

    public String getEard() {
        return eard;
    }

    public void setEard(String eard) {
        this.eard = eard == null ? null : eard.trim();
    }

    public String getExpi() {
        return expi;
    }

    public void setExpi(String expi) {
        this.expi = expi == null ? null : expi.trim();
    }

    public String getMkdt() {
        return mkdt;
    }

    public void setMkdt(String mkdt) {
        this.mkdt = mkdt == null ? null : mkdt.trim();
    }

    public String getPodt() {
        return podt;
    }

    public void setPodt(String podt) {
        this.podt = podt == null ? null : podt.trim();
    }

    public String getSubs() {
        return subs;
    }

    public void setSubs(String subs) {
        this.subs = subs == null ? null : subs.trim();
    }

    public String getRddt() {
        return rddt;
    }

    public void setRddt(String rddt) {
        this.rddt = rddt == null ? null : rddt.trim();
    }

    public String getCvpr() {
        return cvpr;
    }

    public void setCvpr(String cvpr) {
        this.cvpr = cvpr == null ? null : cvpr.trim();
    }

    public String getBord() {
        return bord;
    }

    public void setBord(String bord) {
        this.bord = bord == null ? null : bord.trim();
    }

    public String getPric() {
        return pric;
    }

    public void setPric(String pric) {
        this.pric = pric == null ? null : pric.trim();
    }

    public String getRevo() {
        return revo;
    }

    public void setRevo(String revo) {
        this.revo = revo == null ? null : revo.trim();
    }

    public String getPwal() {
        return pwal;
    }

    public void setPwal(String pwal) {
        this.pwal = pwal == null ? null : pwal.trim();
    }

    public String getParl() {
        return parl;
    }

    public void setParl(String parl) {
        this.parl = parl == null ? null : parl.trim();
    }

    public String getSusp() {
        return susp;
    }

    public void setSusp(String susp) {
        this.susp = susp == null ? null : susp.trim();
    }

    public String getArev() {
        return arev;
    }

    public void setArev(String arev) {
        this.arev = arev == null ? null : arev.trim();
    }

    public String getDswo() {
        return dswo;
    }

    public void setDswo(String dswo) {
        this.dswo = dswo == null ? null : dswo.trim();
    }

    public String getGrss() {
        return grss;
    }

    public void setGrss(String grss) {
        this.grss = grss == null ? null : grss.trim();
    }

    public String getTaxr() {
        return taxr;
    }

    public void setTaxr(String taxr) {
        this.taxr = taxr == null ? null : taxr.trim();
    }

    public String getAtax() {
        return atax;
    }

    public void setAtax(String atax) {
        this.atax = atax == null ? null : atax.trim();
    }

    public String getIndx() {
        return indx;
    }

    public void setIndx(String indx) {
        this.indx = indx == null ? null : indx.trim();
    }

    public String getOvep() {
        return ovep;
    }

    public void setOvep(String ovep) {
        this.ovep = ovep == null ? null : ovep.trim();
    }

    public String getPror() {
        return pror;
    }

    public void setPror(String pror) {
        this.pror = pror == null ? null : pror.trim();
    }

    public String getIntp() {
        return intp;
    }

    public void setIntp(String intp) {
        this.intp = intp == null ? null : intp.trim();
    }

    public String getTdmt() {
        return tdmt;
    }

    public void setTdmt(String tdmt) {
        this.tdmt = tdmt == null ? null : tdmt.trim();
    }

    public String getNett() {
        return nett;
    }

    public void setNett(String nett) {
        this.nett = nett == null ? null : nett.trim();
    }

    public String getIdfx() {
        return idfx;
    }

    public void setIdfx(String idfx) {
        this.idfx = idfx == null ? null : idfx.trim();
    }

    public String getTxin() {
        return txin;
    }

    public void setTxin(String txin) {
        this.txin = txin == null ? null : txin.trim();
    }

    public String getWitl() {
        return witl;
    }

    public void setWitl(String witl) {
        this.witl = witl == null ? null : witl.trim();
    }

    public String getCinl() {
        return cinl;
    }

    public void setCinl(String cinl) {
        this.cinl = cinl == null ? null : cinl.trim();
    }

    public String getOsub() {
        return osub;
    }

    public void setOsub(String osub) {
        this.osub = osub == null ? null : osub.trim();
    }

    public String getMaex() {
        return maex;
    }

    public void setMaex(String maex) {
        this.maex = maex == null ? null : maex.trim();
    }

    public String getMiex() {
        return miex;
    }

    public void setMiex(String miex) {
        this.miex = miex == null ? null : miex.trim();
    }

    public String getMilt() {
        return milt;
    }

    public void setMilt(String milt) {
        this.milt = milt == null ? null : milt.trim();
    }

    public String getNblt() {
        return nblt;
    }

    public void setNblt(String nblt) {
        this.nblt = nblt == null ? null : nblt.trim();
    }

    public String getNewd() {
        return newd;
    }

    public void setNewd(String newd) {
        this.newd = newd == null ? null : newd.trim();
    }

    public String getBolq() {
        return bolq;
    }

    public void setBolq(String bolq) {
        this.bolq = bolq == null ? null : bolq.trim();
    }

    public String getFolq() {
        return folq;
    }

    public void setFolq(String folq) {
        this.folq = folq == null ? null : folq.trim();
    }

    public String getAdtx() {
        return adtx;
    }

    public void setAdtx(String adtx) {
        this.adtx = adtx == null ? null : adtx.trim();
    }

    public String getF70Ceti() {
        return f70Ceti;
    }

    public void setF70Ceti(String f70Ceti) {
        this.f70Ceti = f70Ceti == null ? null : f70Ceti.trim();
    }

    public String getComp() {
        return comp;
    }

    public void setComp(String comp) {
        this.comp = comp == null ? null : comp.trim();
    }

    public String getDisc() {
        return disc;
    }

    public void setDisc(String disc) {
        this.disc = disc == null ? null : disc.trim();
    }

    public String getInco() {
        return inco;
    }

    public void setInco(String inco) {
        this.inco = inco == null ? null : inco.trim();
    }

    public String getNser() {
        return nser;
    }

    public void setNser(String nser) {
        this.nser = nser == null ? null : nser.trim();
    }

    public String getTaxe() {
        return taxe;
    }

    public void setTaxe(String taxe) {
        this.taxe = taxe == null ? null : taxe.trim();
    }

    public String getTxnr() {
        return txnr;
    }

    public void setTxnr(String txnr) {
        this.txnr = txnr == null ? null : txnr.trim();
    }
}