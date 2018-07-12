package com.importdata.pojo;

import java.util.ArrayList;
import java.util.UUID;

import org.apache.ibatis.session.SqlSession;

import com.importdata.common.Adaptee;
import com.importdata.common.Mt;
import com.importdata.mapper.VActionOptionE2Mapper;

public class VActionOptionE2 extends Adaptee{
    private String e2CaoptnId;

    private String caoptnId;

    private String crdb;

    private String cont;

    private String nelp;

    private String ityp;

    private String txap;

    private String etyp;

    private String coin;

    private String cash;

    private String entl;

    private String resu;

    private String ocmt;

    private String capg;

    private String indm;

    private String cinl;

    private String f19Char;

    private String f19Flfr;

    private String unfr;

    private String txfr;

    private String txdf;

    private String soic;

    private String f19Grss;

    private String intr;

    private String mktc;

    private String f19Nett;

    private String prin;

    private String rein;

    private String f19Taxc;

    private String f19Taxr;

    private String f19Witl;

    private String redp;

    private String f19Atax;

    private String inco;

    private String f19Exec;

    private String loco;

    private String pamm;

    private String regf;

    private String ship;

    private String f19Sofe;

    private String stam;

    private String stex;

    private String vata;

    private String f19Fisc;

    private String mfdv;

    private String f19Txrc;

    private String eutr;

    private String acru;

    private String f19Equl;

    private String ftca;

    private String nrat;

    private String bwit;

    private String f19Txin;

    private String trax;

    private String payd;

    private String valu;

    private String earl;

    private String fxdt;

    private String f92Atax;

    private String f92Char;

    private String f92Equl;

    private String esof;

    private String f92Flfr;

    private String f92Fisc;

    private String f92Grss;

    private String exch;

    private String ince;

    private String intp;

    private String f92Nett;

    private String nres;

    private String rate;

    private String f92Sofe;

    private String f92Taxc;

    private String f92Taxr;

    private String f92Txin;

    private String txpr;

    private String f92Txrc;

    private String f92Witl;

    private String offr;

    private String prpp;

    public VActionOptionE2() {
		this.e2CaoptnId = UUID.randomUUID().toString().replace("-", "");
	}
    
    
    @Override
  	public int insertMyDB(SqlSession session, Mt mt) {
      	int count = 0;
      	Mt564 mt564 = (Mt564) mt;
  		ArrayList<VActionOptionE2> listE2 = mt564.getE2();
  		if (null != listE2 && listE2.size() > 0) {
  			VActionOptionE2Mapper e2 = session
  					.getMapper(VActionOptionE2Mapper.class);
  			for (VActionOptionE2 mt564ActionOptionE2 : listE2) {
  				if(e2.insertSelective(mt564ActionOptionE2) != -1){
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
		result = prime * result
				+ ((e2CaoptnId == null) ? 0 : e2CaoptnId.hashCode());
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
		VActionOptionE2 other = (VActionOptionE2) obj;
		if (caoptnId == null) {
			if (other.caoptnId != null)
				return false;
		} else if (!caoptnId.equals(other.caoptnId))
			return false;
		if (e2CaoptnId == null) {
			if (other.e2CaoptnId != null)
				return false;
		} else if (!e2CaoptnId.equals(other.e2CaoptnId))
			return false;
		return true;
	}

	public String getE2CaoptnId() {
        return e2CaoptnId;
    }

    public void setE2CaoptnId(String e2CaoptnId) {
        this.e2CaoptnId = e2CaoptnId == null ? null : e2CaoptnId.trim();
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

    public String getCont() {
        return cont;
    }

    public void setCont(String cont) {
        this.cont = cont == null ? null : cont.trim();
    }

    public String getNelp() {
        return nelp;
    }

    public void setNelp(String nelp) {
        this.nelp = nelp == null ? null : nelp.trim();
    }

    public String getItyp() {
        return ityp;
    }

    public void setItyp(String ityp) {
        this.ityp = ityp == null ? null : ityp.trim();
    }

    public String getTxap() {
        return txap;
    }

    public void setTxap(String txap) {
        this.txap = txap == null ? null : txap.trim();
    }

    public String getEtyp() {
        return etyp;
    }

    public void setEtyp(String etyp) {
        this.etyp = etyp == null ? null : etyp.trim();
    }

    public String getCoin() {
        return coin;
    }

    public void setCoin(String coin) {
        this.coin = coin == null ? null : coin.trim();
    }

    public String getCash() {
        return cash;
    }

    public void setCash(String cash) {
        this.cash = cash == null ? null : cash.trim();
    }

    public String getEntl() {
        return entl;
    }

    public void setEntl(String entl) {
        this.entl = entl == null ? null : entl.trim();
    }

    public String getResu() {
        return resu;
    }

    public void setResu(String resu) {
        this.resu = resu == null ? null : resu.trim();
    }

    public String getOcmt() {
        return ocmt;
    }

    public void setOcmt(String ocmt) {
        this.ocmt = ocmt == null ? null : ocmt.trim();
    }

    public String getCapg() {
        return capg;
    }

    public void setCapg(String capg) {
        this.capg = capg == null ? null : capg.trim();
    }

    public String getIndm() {
        return indm;
    }

    public void setIndm(String indm) {
        this.indm = indm == null ? null : indm.trim();
    }

    public String getCinl() {
        return cinl;
    }

    public void setCinl(String cinl) {
        this.cinl = cinl == null ? null : cinl.trim();
    }

    public String getF19Char() {
        return f19Char;
    }

    public void setF19Char(String f19Char) {
        this.f19Char = f19Char == null ? null : f19Char.trim();
    }

    public String getF19Flfr() {
        return f19Flfr;
    }

    public void setF19Flfr(String f19Flfr) {
        this.f19Flfr = f19Flfr == null ? null : f19Flfr.trim();
    }

    public String getUnfr() {
        return unfr;
    }

    public void setUnfr(String unfr) {
        this.unfr = unfr == null ? null : unfr.trim();
    }

    public String getTxfr() {
        return txfr;
    }

    public void setTxfr(String txfr) {
        this.txfr = txfr == null ? null : txfr.trim();
    }

    public String getTxdf() {
        return txdf;
    }

    public void setTxdf(String txdf) {
        this.txdf = txdf == null ? null : txdf.trim();
    }

    public String getSoic() {
        return soic;
    }

    public void setSoic(String soic) {
        this.soic = soic == null ? null : soic.trim();
    }

    public String getF19Grss() {
        return f19Grss;
    }

    public void setF19Grss(String f19Grss) {
        this.f19Grss = f19Grss == null ? null : f19Grss.trim();
    }

    public String getIntr() {
        return intr;
    }

    public void setIntr(String intr) {
        this.intr = intr == null ? null : intr.trim();
    }

    public String getMktc() {
        return mktc;
    }

    public void setMktc(String mktc) {
        this.mktc = mktc == null ? null : mktc.trim();
    }

    public String getF19Nett() {
        return f19Nett;
    }

    public void setF19Nett(String f19Nett) {
        this.f19Nett = f19Nett == null ? null : f19Nett.trim();
    }

    public String getPrin() {
        return prin;
    }

    public void setPrin(String prin) {
        this.prin = prin == null ? null : prin.trim();
    }

    public String getRein() {
        return rein;
    }

    public void setRein(String rein) {
        this.rein = rein == null ? null : rein.trim();
    }

    public String getF19Taxc() {
        return f19Taxc;
    }

    public void setF19Taxc(String f19Taxc) {
        this.f19Taxc = f19Taxc == null ? null : f19Taxc.trim();
    }

    public String getF19Taxr() {
        return f19Taxr;
    }

    public void setF19Taxr(String f19Taxr) {
        this.f19Taxr = f19Taxr == null ? null : f19Taxr.trim();
    }

    public String getF19Witl() {
        return f19Witl;
    }

    public void setF19Witl(String f19Witl) {
        this.f19Witl = f19Witl == null ? null : f19Witl.trim();
    }

    public String getRedp() {
        return redp;
    }

    public void setRedp(String redp) {
        this.redp = redp == null ? null : redp.trim();
    }

    public String getF19Atax() {
        return f19Atax;
    }

    public void setF19Atax(String f19Atax) {
        this.f19Atax = f19Atax == null ? null : f19Atax.trim();
    }

    public String getInco() {
        return inco;
    }

    public void setInco(String inco) {
        this.inco = inco == null ? null : inco.trim();
    }

    public String getF19Exec() {
        return f19Exec;
    }

    public void setF19Exec(String f19Exec) {
        this.f19Exec = f19Exec == null ? null : f19Exec.trim();
    }

    public String getLoco() {
        return loco;
    }

    public void setLoco(String loco) {
        this.loco = loco == null ? null : loco.trim();
    }

    public String getPamm() {
        return pamm;
    }

    public void setPamm(String pamm) {
        this.pamm = pamm == null ? null : pamm.trim();
    }

    public String getRegf() {
        return regf;
    }

    public void setRegf(String regf) {
        this.regf = regf == null ? null : regf.trim();
    }

    public String getShip() {
        return ship;
    }

    public void setShip(String ship) {
        this.ship = ship == null ? null : ship.trim();
    }

    public String getF19Sofe() {
        return f19Sofe;
    }

    public void setF19Sofe(String f19Sofe) {
        this.f19Sofe = f19Sofe == null ? null : f19Sofe.trim();
    }

    public String getStam() {
        return stam;
    }

    public void setStam(String stam) {
        this.stam = stam == null ? null : stam.trim();
    }

    public String getStex() {
        return stex;
    }

    public void setStex(String stex) {
        this.stex = stex == null ? null : stex.trim();
    }

    public String getVata() {
        return vata;
    }

    public void setVata(String vata) {
        this.vata = vata == null ? null : vata.trim();
    }

    public String getF19Fisc() {
        return f19Fisc;
    }

    public void setF19Fisc(String f19Fisc) {
        this.f19Fisc = f19Fisc == null ? null : f19Fisc.trim();
    }

    public String getMfdv() {
        return mfdv;
    }

    public void setMfdv(String mfdv) {
        this.mfdv = mfdv == null ? null : mfdv.trim();
    }

    public String getF19Txrc() {
        return f19Txrc;
    }

    public void setF19Txrc(String f19Txrc) {
        this.f19Txrc = f19Txrc == null ? null : f19Txrc.trim();
    }

    public String getEutr() {
        return eutr;
    }

    public void setEutr(String eutr) {
        this.eutr = eutr == null ? null : eutr.trim();
    }

    public String getAcru() {
        return acru;
    }

    public void setAcru(String acru) {
        this.acru = acru == null ? null : acru.trim();
    }

    public String getF19Equl() {
        return f19Equl;
    }

    public void setF19Equl(String f19Equl) {
        this.f19Equl = f19Equl == null ? null : f19Equl.trim();
    }

    public String getFtca() {
        return ftca;
    }

    public void setFtca(String ftca) {
        this.ftca = ftca == null ? null : ftca.trim();
    }

    public String getNrat() {
        return nrat;
    }

    public void setNrat(String nrat) {
        this.nrat = nrat == null ? null : nrat.trim();
    }

    public String getBwit() {
        return bwit;
    }

    public void setBwit(String bwit) {
        this.bwit = bwit == null ? null : bwit.trim();
    }

    public String getF19Txin() {
        return f19Txin;
    }

    public void setF19Txin(String f19Txin) {
        this.f19Txin = f19Txin == null ? null : f19Txin.trim();
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

    public String getValu() {
        return valu;
    }

    public void setValu(String valu) {
        this.valu = valu == null ? null : valu.trim();
    }

    public String getEarl() {
        return earl;
    }

    public void setEarl(String earl) {
        this.earl = earl == null ? null : earl.trim();
    }

    public String getFxdt() {
        return fxdt;
    }

    public void setFxdt(String fxdt) {
        this.fxdt = fxdt == null ? null : fxdt.trim();
    }

    public String getF92Atax() {
        return f92Atax;
    }

    public void setF92Atax(String f92Atax) {
        this.f92Atax = f92Atax == null ? null : f92Atax.trim();
    }

    public String getF92Char() {
        return f92Char;
    }

    public void setF92Char(String f92Char) {
        this.f92Char = f92Char == null ? null : f92Char.trim();
    }

    public String getF92Equl() {
        return f92Equl;
    }

    public void setF92Equl(String f92Equl) {
        this.f92Equl = f92Equl == null ? null : f92Equl.trim();
    }

    public String getEsof() {
        return esof;
    }

    public void setEsof(String esof) {
        this.esof = esof == null ? null : esof.trim();
    }

    public String getF92Flfr() {
        return f92Flfr;
    }

    public void setF92Flfr(String f92Flfr) {
        this.f92Flfr = f92Flfr == null ? null : f92Flfr.trim();
    }

    public String getF92Fisc() {
        return f92Fisc;
    }

    public void setF92Fisc(String f92Fisc) {
        this.f92Fisc = f92Fisc == null ? null : f92Fisc.trim();
    }

    public String getF92Grss() {
        return f92Grss;
    }

    public void setF92Grss(String f92Grss) {
        this.f92Grss = f92Grss == null ? null : f92Grss.trim();
    }

    public String getExch() {
        return exch;
    }

    public void setExch(String exch) {
        this.exch = exch == null ? null : exch.trim();
    }

    public String getInce() {
        return ince;
    }

    public void setInce(String ince) {
        this.ince = ince == null ? null : ince.trim();
    }

    public String getIntp() {
        return intp;
    }

    public void setIntp(String intp) {
        this.intp = intp == null ? null : intp.trim();
    }

    public String getF92Nett() {
        return f92Nett;
    }

    public void setF92Nett(String f92Nett) {
        this.f92Nett = f92Nett == null ? null : f92Nett.trim();
    }

    public String getNres() {
        return nres;
    }

    public void setNres(String nres) {
        this.nres = nres == null ? null : nres.trim();
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate == null ? null : rate.trim();
    }

    public String getF92Sofe() {
        return f92Sofe;
    }

    public void setF92Sofe(String f92Sofe) {
        this.f92Sofe = f92Sofe == null ? null : f92Sofe.trim();
    }

    public String getF92Taxc() {
        return f92Taxc;
    }

    public void setF92Taxc(String f92Taxc) {
        this.f92Taxc = f92Taxc == null ? null : f92Taxc.trim();
    }

    public String getF92Taxr() {
        return f92Taxr;
    }

    public void setF92Taxr(String f92Taxr) {
        this.f92Taxr = f92Taxr == null ? null : f92Taxr.trim();
    }

    public String getF92Txin() {
        return f92Txin;
    }

    public void setF92Txin(String f92Txin) {
        this.f92Txin = f92Txin == null ? null : f92Txin.trim();
    }

    public String getTxpr() {
        return txpr;
    }

    public void setTxpr(String txpr) {
        this.txpr = txpr == null ? null : txpr.trim();
    }

    public String getF92Txrc() {
        return f92Txrc;
    }

    public void setF92Txrc(String f92Txrc) {
        this.f92Txrc = f92Txrc == null ? null : f92Txrc.trim();
    }

    public String getF92Witl() {
        return f92Witl;
    }

    public void setF92Witl(String f92Witl) {
        this.f92Witl = f92Witl == null ? null : f92Witl.trim();
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
}