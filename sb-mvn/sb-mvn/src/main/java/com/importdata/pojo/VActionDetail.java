package com.importdata.pojo;

import java.util.ArrayList;
import java.util.UUID;

import org.apache.ibatis.session.SqlSession;

import com.importdata.common.Adaptee;
import com.importdata.common.Mt;
import com.importdata.mapper.VActionDetailMapper;

public class VActionDetail extends Adaptee{
	private String detailId;

	private String infoId;

	private String anou;

	private String f98Cert;

	private String xdte;

	private String effd;

	private String fdat;

	private String prod;

	private String regi;

	private String resu;

	private String splt;

	private String f98Meet;

	private String rdte;

	private String taxb;

	private String tsdt;

	private String f98Loto;

	private String unco;

	private String wuco;

	private String f98Met2;

	private String f98Met3;

	private String equl;

	private String ecdt;

	private String ifix;

	private String mfix;

	private String coap;

	private String matu;

	private String oapd;

	private String sxdt;

	private String gupa;

	private String ecpd;

	private String lapd;

	private String mctd;

	private String payd;

	private String tpdt;

	private String etpd;

	private String pldt;

	private String fill;

	private String hear;

	private String ecrd;

	private String pric;

	private String inpe;

	private String cspd;

	private String blok;

	private String clcp;

	private String dswn;

	private String dsde;

	private String dsbt;

	private String dsda;

	private String dswa;

	private String dspl;

	private String dsse;

	private String dsws;

	private String bocl;

	private String cods;

	private String splp;

	private String daac;

	private String rdis;

	private String intr;

	private String bidi;

	private String nwfc;

	private String ptsc;

	private String prfc;

	private String rinr;

	private String rspr;

	private String shrt;

	private String rlos;

	private String devi;

	private String maxp;

	private String minp;

	private String mqso;

	private String qtso;

	private String nblt;

	private String newd;

	private String base;

	private String incr;

	private String coup;

	private String f17Cert;

	private String rchg;

	private String comp;

	private String acin;

	private String leog;

	private String divi;

	private String conv;

	private String dity;

	private String offe;

	private String sell;

	private String esta;

	private String addb;

	private String chan;

	private String rhdi;

	private String ecio;

	private String tdta;

	private String elct;

	private String f22Loto;

	private String cefi;

	private String cons;

	private String info;

	private String f94Meet;

	private String f94Met2;

	private String f94Met3;

	private String npli;

	private String offo;

	private String webb;

	private String name;

	public VActionDetail() {
		this.detailId = UUID.randomUUID().toString().replace("-", "");
	}
	
	  @Override
		public int insertMyDB(SqlSession session, Mt mt) {
	    	int count = 0;
	    	Mt564 mt564 = (Mt564)mt;
			ArrayList<VActionDetail> listD = mt564.getD();
			if (null != listD && listD.size() > 0) {
				VActionDetailMapper d = session
						.getMapper(VActionDetailMapper.class);
				for (VActionDetail mt564ActionDetail : listD) {
					if(d.insertSelective(mt564ActionDetail) != -1){
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
				+ ((detailId == null) ? 0 : detailId.hashCode());
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
		VActionDetail other = (VActionDetail) obj;
		if (detailId == null) {
			if (other.detailId != null)
				return false;
		} else if (!detailId.equals(other.detailId))
			return false;
		if (infoId == null) {
			if (other.infoId != null)
				return false;
		} else if (!infoId.equals(other.infoId))
			return false;
		return true;
	}

	public String getDetailId() {
		return detailId;
	}

	public void setDetailId(String detailId) {
		this.detailId = detailId == null ? null : detailId.trim();
	}

	public String getInfoId() {
		return infoId;
	}

	public void setInfoId(String infoId) {
		this.infoId = infoId == null ? null : infoId.trim();
	}

	public String getAnou() {
		return anou;
	}

	public void setAnou(String anou) {
		this.anou = anou == null ? null : anou.trim();
	}

	public String getF98Cert() {
		return f98Cert;
	}

	public void setF98Cert(String f98Cert) {
		this.f98Cert = f98Cert == null ? null : f98Cert.trim();
	}

	public String getXdte() {
		return xdte;
	}

	public void setXdte(String xdte) {
		this.xdte = xdte == null ? null : xdte.trim();
	}

	public String getEffd() {
		return effd;
	}

	public void setEffd(String effd) {
		this.effd = effd == null ? null : effd.trim();
	}

	public String getFdat() {
		return fdat;
	}

	public void setFdat(String fdat) {
		this.fdat = fdat == null ? null : fdat.trim();
	}

	public String getProd() {
		return prod;
	}

	public void setProd(String prod) {
		this.prod = prod == null ? null : prod.trim();
	}

	public String getRegi() {
		return regi;
	}

	public void setRegi(String regi) {
		this.regi = regi == null ? null : regi.trim();
	}

	public String getResu() {
		return resu;
	}

	public void setResu(String resu) {
		this.resu = resu == null ? null : resu.trim();
	}

	public String getSplt() {
		return splt;
	}

	public void setSplt(String splt) {
		this.splt = splt == null ? null : splt.trim();
	}

	public String getF98Meet() {
		return f98Meet;
	}

	public void setF98Meet(String f98Meet) {
		this.f98Meet = f98Meet == null ? null : f98Meet.trim();
	}

	public String getRdte() {
		return rdte;
	}

	public void setRdte(String rdte) {
		this.rdte = rdte == null ? null : rdte.trim();
	}

	public String getTaxb() {
		return taxb;
	}

	public void setTaxb(String taxb) {
		this.taxb = taxb == null ? null : taxb.trim();
	}

	public String getTsdt() {
		return tsdt;
	}

	public void setTsdt(String tsdt) {
		this.tsdt = tsdt == null ? null : tsdt.trim();
	}

	public String getF98Loto() {
		return f98Loto;
	}

	public void setF98Loto(String f98Loto) {
		this.f98Loto = f98Loto == null ? null : f98Loto.trim();
	}

	public String getUnco() {
		return unco;
	}

	public void setUnco(String unco) {
		this.unco = unco == null ? null : unco.trim();
	}

	public String getWuco() {
		return wuco;
	}

	public void setWuco(String wuco) {
		this.wuco = wuco == null ? null : wuco.trim();
	}

	public String getF98Met2() {
		return f98Met2;
	}

	public void setF98Met2(String f98Met2) {
		this.f98Met2 = f98Met2 == null ? null : f98Met2.trim();
	}

	public String getF98Met3() {
		return f98Met3;
	}

	public void setF98Met3(String f98Met3) {
		this.f98Met3 = f98Met3 == null ? null : f98Met3.trim();
	}

	public String getEqul() {
		return equl;
	}

	public void setEqul(String equl) {
		this.equl = equl == null ? null : equl.trim();
	}

	public String getEcdt() {
		return ecdt;
	}

	public void setEcdt(String ecdt) {
		this.ecdt = ecdt == null ? null : ecdt.trim();
	}

	public String getIfix() {
		return ifix;
	}

	public void setIfix(String ifix) {
		this.ifix = ifix == null ? null : ifix.trim();
	}

	public String getMfix() {
		return mfix;
	}

	public void setMfix(String mfix) {
		this.mfix = mfix == null ? null : mfix.trim();
	}

	public String getCoap() {
		return coap;
	}

	public void setCoap(String coap) {
		this.coap = coap == null ? null : coap.trim();
	}

	public String getMatu() {
		return matu;
	}

	public void setMatu(String matu) {
		this.matu = matu == null ? null : matu.trim();
	}

	public String getOapd() {
		return oapd;
	}

	public void setOapd(String oapd) {
		this.oapd = oapd == null ? null : oapd.trim();
	}

	public String getSxdt() {
		return sxdt;
	}

	public void setSxdt(String sxdt) {
		this.sxdt = sxdt == null ? null : sxdt.trim();
	}

	public String getGupa() {
		return gupa;
	}

	public void setGupa(String gupa) {
		this.gupa = gupa == null ? null : gupa.trim();
	}

	public String getEcpd() {
		return ecpd;
	}

	public void setEcpd(String ecpd) {
		this.ecpd = ecpd == null ? null : ecpd.trim();
	}

	public String getLapd() {
		return lapd;
	}

	public void setLapd(String lapd) {
		this.lapd = lapd == null ? null : lapd.trim();
	}

	public String getMctd() {
		return mctd;
	}

	public void setMctd(String mctd) {
		this.mctd = mctd == null ? null : mctd.trim();
	}

	public String getPayd() {
		return payd;
	}

	public void setPayd(String payd) {
		this.payd = payd == null ? null : payd.trim();
	}

	public String getTpdt() {
		return tpdt;
	}

	public void setTpdt(String tpdt) {
		this.tpdt = tpdt == null ? null : tpdt.trim();
	}

	public String getEtpd() {
		return etpd;
	}

	public void setEtpd(String etpd) {
		this.etpd = etpd == null ? null : etpd.trim();
	}

	public String getPldt() {
		return pldt;
	}

	public void setPldt(String pldt) {
		this.pldt = pldt == null ? null : pldt.trim();
	}

	public String getFill() {
		return fill;
	}

	public void setFill(String fill) {
		this.fill = fill == null ? null : fill.trim();
	}

	public String getHear() {
		return hear;
	}

	public void setHear(String hear) {
		this.hear = hear == null ? null : hear.trim();
	}

	public String getEcrd() {
		return ecrd;
	}

	public void setEcrd(String ecrd) {
		this.ecrd = ecrd == null ? null : ecrd.trim();
	}

	public String getPric() {
		return pric;
	}

	public void setPric(String pric) {
		this.pric = pric == null ? null : pric.trim();
	}

	public String getInpe() {
		return inpe;
	}

	public void setInpe(String inpe) {
		this.inpe = inpe == null ? null : inpe.trim();
	}

	public String getCspd() {
		return cspd;
	}

	public void setCspd(String cspd) {
		this.cspd = cspd == null ? null : cspd.trim();
	}

	public String getBlok() {
		return blok;
	}

	public void setBlok(String blok) {
		this.blok = blok == null ? null : blok.trim();
	}

	public String getClcp() {
		return clcp;
	}

	public void setClcp(String clcp) {
		this.clcp = clcp == null ? null : clcp.trim();
	}

	public String getDswn() {
		return dswn;
	}

	public void setDswn(String dswn) {
		this.dswn = dswn == null ? null : dswn.trim();
	}

	public String getDsde() {
		return dsde;
	}

	public void setDsde(String dsde) {
		this.dsde = dsde == null ? null : dsde.trim();
	}

	public String getDsbt() {
		return dsbt;
	}

	public void setDsbt(String dsbt) {
		this.dsbt = dsbt == null ? null : dsbt.trim();
	}

	public String getDsda() {
		return dsda;
	}

	public void setDsda(String dsda) {
		this.dsda = dsda == null ? null : dsda.trim();
	}

	public String getDswa() {
		return dswa;
	}

	public void setDswa(String dswa) {
		this.dswa = dswa == null ? null : dswa.trim();
	}

	public String getDspl() {
		return dspl;
	}

	public void setDspl(String dspl) {
		this.dspl = dspl == null ? null : dspl.trim();
	}

	public String getDsse() {
		return dsse;
	}

	public void setDsse(String dsse) {
		this.dsse = dsse == null ? null : dsse.trim();
	}

	public String getDsws() {
		return dsws;
	}

	public void setDsws(String dsws) {
		this.dsws = dsws == null ? null : dsws.trim();
	}

	public String getBocl() {
		return bocl;
	}

	public void setBocl(String bocl) {
		this.bocl = bocl == null ? null : bocl.trim();
	}

	public String getCods() {
		return cods;
	}

	public void setCods(String cods) {
		this.cods = cods == null ? null : cods.trim();
	}

	public String getSplp() {
		return splp;
	}

	public void setSplp(String splp) {
		this.splp = splp == null ? null : splp.trim();
	}

	public String getDaac() {
		return daac;
	}

	public void setDaac(String daac) {
		this.daac = daac == null ? null : daac.trim();
	}

	public String getRdis() {
		return rdis;
	}

	public void setRdis(String rdis) {
		this.rdis = rdis == null ? null : rdis.trim();
	}

	public String getIntr() {
		return intr;
	}

	public void setIntr(String intr) {
		this.intr = intr == null ? null : intr.trim();
	}

	public String getBidi() {
		return bidi;
	}

	public void setBidi(String bidi) {
		this.bidi = bidi == null ? null : bidi.trim();
	}

	public String getNwfc() {
		return nwfc;
	}

	public void setNwfc(String nwfc) {
		this.nwfc = nwfc == null ? null : nwfc.trim();
	}

	public String getPtsc() {
		return ptsc;
	}

	public void setPtsc(String ptsc) {
		this.ptsc = ptsc == null ? null : ptsc.trim();
	}

	public String getPrfc() {
		return prfc;
	}

	public void setPrfc(String prfc) {
		this.prfc = prfc == null ? null : prfc.trim();
	}

	public String getRinr() {
		return rinr;
	}

	public void setRinr(String rinr) {
		this.rinr = rinr == null ? null : rinr.trim();
	}

	public String getRspr() {
		return rspr;
	}

	public void setRspr(String rspr) {
		this.rspr = rspr == null ? null : rspr.trim();
	}

	public String getShrt() {
		return shrt;
	}

	public void setShrt(String shrt) {
		this.shrt = shrt == null ? null : shrt.trim();
	}

	public String getRlos() {
		return rlos;
	}

	public void setRlos(String rlos) {
		this.rlos = rlos == null ? null : rlos.trim();
	}

	public String getDevi() {
		return devi;
	}

	public void setDevi(String devi) {
		this.devi = devi == null ? null : devi.trim();
	}

	public String getMaxp() {
		return maxp;
	}

	public void setMaxp(String maxp) {
		this.maxp = maxp == null ? null : maxp.trim();
	}

	public String getMinp() {
		return minp;
	}

	public void setMinp(String minp) {
		this.minp = minp == null ? null : minp.trim();
	}

	public String getMqso() {
		return mqso;
	}

	public void setMqso(String mqso) {
		this.mqso = mqso == null ? null : mqso.trim();
	}

	public String getQtso() {
		return qtso;
	}

	public void setQtso(String qtso) {
		this.qtso = qtso == null ? null : qtso.trim();
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

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base == null ? null : base.trim();
	}

	public String getIncr() {
		return incr;
	}

	public void setIncr(String incr) {
		this.incr = incr == null ? null : incr.trim();
	}

	public String getCoup() {
		return coup;
	}

	public void setCoup(String coup) {
		this.coup = coup == null ? null : coup.trim();
	}

	public String getF17Cert() {
		return f17Cert;
	}

	public void setF17Cert(String f17Cert) {
		this.f17Cert = f17Cert == null ? null : f17Cert.trim();
	}

	public String getRchg() {
		return rchg;
	}

	public void setRchg(String rchg) {
		this.rchg = rchg == null ? null : rchg.trim();
	}

	public String getComp() {
		return comp;
	}

	public void setComp(String comp) {
		this.comp = comp == null ? null : comp.trim();
	}

	public String getAcin() {
		return acin;
	}

	public void setAcin(String acin) {
		this.acin = acin == null ? null : acin.trim();
	}

	public String getLeog() {
		return leog;
	}

	public void setLeog(String leog) {
		this.leog = leog == null ? null : leog.trim();
	}

	public String getDivi() {
		return divi;
	}

	public void setDivi(String divi) {
		this.divi = divi == null ? null : divi.trim();
	}

	public String getConv() {
		return conv;
	}

	public void setConv(String conv) {
		this.conv = conv == null ? null : conv.trim();
	}

	public String getDity() {
		return dity;
	}

	public void setDity(String dity) {
		this.dity = dity == null ? null : dity.trim();
	}

	public String getOffe() {
		return offe;
	}

	public void setOffe(String offe) {
		this.offe = offe == null ? null : offe.trim();
	}

	public String getSell() {
		return sell;
	}

	public void setSell(String sell) {
		this.sell = sell == null ? null : sell.trim();
	}

	public String getEsta() {
		return esta;
	}

	public void setEsta(String esta) {
		this.esta = esta == null ? null : esta.trim();
	}

	public String getAddb() {
		return addb;
	}

	public void setAddb(String addb) {
		this.addb = addb == null ? null : addb.trim();
	}

	public String getChan() {
		return chan;
	}

	public void setChan(String chan) {
		this.chan = chan == null ? null : chan.trim();
	}

	public String getRhdi() {
		return rhdi;
	}

	public void setRhdi(String rhdi) {
		this.rhdi = rhdi == null ? null : rhdi.trim();
	}

	public String getEcio() {
		return ecio;
	}

	public void setEcio(String ecio) {
		this.ecio = ecio == null ? null : ecio.trim();
	}

	public String getTdta() {
		return tdta;
	}

	public void setTdta(String tdta) {
		this.tdta = tdta == null ? null : tdta.trim();
	}

	public String getElct() {
		return elct;
	}

	public void setElct(String elct) {
		this.elct = elct == null ? null : elct.trim();
	}

	public String getF22Loto() {
		return f22Loto;
	}

	public void setF22Loto(String f22Loto) {
		this.f22Loto = f22Loto == null ? null : f22Loto.trim();
	}

	public String getCefi() {
		return cefi;
	}

	public void setCefi(String cefi) {
		this.cefi = cefi == null ? null : cefi.trim();
	}

	public String getCons() {
		return cons;
	}

	public void setCons(String cons) {
		this.cons = cons == null ? null : cons.trim();
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info == null ? null : info.trim();
	}

	public String getF94Meet() {
		return f94Meet;
	}

	public void setF94Meet(String f94Meet) {
		this.f94Meet = f94Meet == null ? null : f94Meet.trim();
	}

	public String getF94Met2() {
		return f94Met2;
	}

	public void setF94Met2(String f94Met2) {
		this.f94Met2 = f94Met2 == null ? null : f94Met2.trim();
	}

	public String getF94Met3() {
		return f94Met3;
	}

	public void setF94Met3(String f94Met3) {
		this.f94Met3 = f94Met3 == null ? null : f94Met3.trim();
	}

	public String getNpli() {
		return npli;
	}

	public void setNpli(String npli) {
		this.npli = npli == null ? null : npli.trim();
	}

	public String getOffo() {
		return offo;
	}

	public void setOffo(String offo) {
		this.offo = offo == null ? null : offo.trim();
	}

	public String getWebb() {
		return webb;
	}

	public void setWebb(String webb) {
		this.webb = webb == null ? null : webb.trim();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}
}