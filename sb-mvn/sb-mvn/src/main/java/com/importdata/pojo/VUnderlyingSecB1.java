package com.importdata.pojo;

import java.util.ArrayList;
import java.util.UUID;

import org.apache.ibatis.session.SqlSession;

import com.importdata.common.Adaptee;
import com.importdata.common.Mt;
import com.importdata.mapper.VUnderlyingSecB1Mapper;

public class VUnderlyingSecB1 extends Adaptee{
    private String b1UsecuId;

    private String usecuId;

    private String plis;

    private String mico;

    private String clas;

    private String opst;

    private String deno;

    private String coup;

    private String expi;

    private String frnr;

    private String matu;

    private String issu;

    private String cald;

    private String putt;

    private String ddte;

    private String conv;

    private String prfc;

    private String nwfc;

    private String intr;

    private String nxrt;

    private String decl;

    private String wapa;

    private String mino;

    private String f36Size;

    public VUnderlyingSecB1() {
		this.b1UsecuId = UUID.randomUUID().toString().replace("-", "");
	}
    
    @Override
	public int insertMyDB(SqlSession session, Mt mt) {
    	int count = 0 ;
    	Mt564 mt564 = (Mt564) mt;
		ArrayList<VUnderlyingSecB1> listb1 = mt564.getB1();
		if (null != listb1 && listb1.size() > 0) {
			VUnderlyingSecB1Mapper b1 = session
					.getMapper(VUnderlyingSecB1Mapper.class);
			for (VUnderlyingSecB1 mt564UnderlyingSecB1 : listb1) {
				if(b1.insertSelective(mt564UnderlyingSecB1) != -1){
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
				+ ((b1UsecuId == null) ? 0 : b1UsecuId.hashCode());
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
		VUnderlyingSecB1 other = (VUnderlyingSecB1) obj;
		if (b1UsecuId == null) {
			if (other.b1UsecuId != null)
				return false;
		} else if (!b1UsecuId.equals(other.b1UsecuId))
			return false;
		if (usecuId == null) {
			if (other.usecuId != null)
				return false;
		} else if (!usecuId.equals(other.usecuId))
			return false;
		return true;
	}

	public String getB1UsecuId() {
        return b1UsecuId;
    }

    public void setB1UsecuId(String b1UsecuId) {
        this.b1UsecuId = b1UsecuId == null ? null : b1UsecuId.trim();
    }

    public String getUsecuId() {
        return usecuId;
    }

    public void setUsecuId(String usecuId) {
        this.usecuId = usecuId == null ? null : usecuId.trim();
    }

    public String getPlis() {
        return plis;
    }

    public void setPlis(String plis) {
        this.plis = plis == null ? null : plis.trim();
    }

    public String getMico() {
        return mico;
    }

    public void setMico(String mico) {
        this.mico = mico == null ? null : mico.trim();
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas == null ? null : clas.trim();
    }

    public String getOpst() {
        return opst;
    }

    public void setOpst(String opst) {
        this.opst = opst == null ? null : opst.trim();
    }

    public String getDeno() {
        return deno;
    }

    public void setDeno(String deno) {
        this.deno = deno == null ? null : deno.trim();
    }

    public String getCoup() {
        return coup;
    }

    public void setCoup(String coup) {
        this.coup = coup == null ? null : coup.trim();
    }

    public String getExpi() {
        return expi;
    }

    public void setExpi(String expi) {
        this.expi = expi == null ? null : expi.trim();
    }

    public String getFrnr() {
        return frnr;
    }

    public void setFrnr(String frnr) {
        this.frnr = frnr == null ? null : frnr.trim();
    }

    public String getMatu() {
        return matu;
    }

    public void setMatu(String matu) {
        this.matu = matu == null ? null : matu.trim();
    }

    public String getIssu() {
        return issu;
    }

    public void setIssu(String issu) {
        this.issu = issu == null ? null : issu.trim();
    }

    public String getCald() {
        return cald;
    }

    public void setCald(String cald) {
        this.cald = cald == null ? null : cald.trim();
    }

    public String getPutt() {
        return putt;
    }

    public void setPutt(String putt) {
        this.putt = putt == null ? null : putt.trim();
    }

    public String getDdte() {
        return ddte;
    }

    public void setDdte(String ddte) {
        this.ddte = ddte == null ? null : ddte.trim();
    }

    public String getConv() {
        return conv;
    }

    public void setConv(String conv) {
        this.conv = conv == null ? null : conv.trim();
    }

    public String getPrfc() {
        return prfc;
    }

    public void setPrfc(String prfc) {
        this.prfc = prfc == null ? null : prfc.trim();
    }

    public String getNwfc() {
        return nwfc;
    }

    public void setNwfc(String nwfc) {
        this.nwfc = nwfc == null ? null : nwfc.trim();
    }

    public String getIntr() {
        return intr;
    }

    public void setIntr(String intr) {
        this.intr = intr == null ? null : intr.trim();
    }

    public String getNxrt() {
        return nxrt;
    }

    public void setNxrt(String nxrt) {
        this.nxrt = nxrt == null ? null : nxrt.trim();
    }

    public String getDecl() {
        return decl;
    }

    public void setDecl(String decl) {
        this.decl = decl == null ? null : decl.trim();
    }

    public String getWapa() {
        return wapa;
    }

    public void setWapa(String wapa) {
        this.wapa = wapa == null ? null : wapa.trim();
    }

    public String getMino() {
        return mino;
    }

    public void setMino(String mino) {
        this.mino = mino == null ? null : mino.trim();
    }

    public String getF36Size() {
        return f36Size;
    }

    public void setF36Size(String f36Size) {
        this.f36Size = f36Size == null ? null : f36Size.trim();
    }
}