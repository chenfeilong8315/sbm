package com.importdata.pojo;

import java.util.ArrayList;
import java.util.UUID;

import org.apache.ibatis.session.SqlSession;

import com.importdata.common.Adaptee;
import com.importdata.common.Mt;
import com.importdata.mapper.VActionOptionE1aMapper;

public class VActionOptionE1a extends Adaptee{
    private String e1aCaoptnId;

    private String e1CaoptnId;

    private String plis;

    private String mico;

    private String clas;

    private String opst;

    private String deno;

    private String coup;

    private String frnr;

    private String matu;

    private String f98Issu;

    private String cald;

    private String putt;

    private String ddte;

    private String conv;

    private String f90Issu;

    private String prfc;

    private String nwfc;

    private String intr;

    private String nxrt;

    private String mino;

    private String miex;

    private String milt;

    private String f36Size;

    public VActionOptionE1a() {
		this.e1aCaoptnId = UUID.randomUUID().toString().replace("-", "");
	}
    
    @Override
	public int insertMyDB(SqlSession session, Mt mt) {
    	int count = 0;
    	Mt564 mt564 = (Mt564) mt;
		ArrayList<VActionOptionE1a> listE1a = mt564.getE1a();
		if (null != listE1a && listE1a.size() > 0) {
			VActionOptionE1aMapper e1a = session
					.getMapper(VActionOptionE1aMapper.class);
			for (VActionOptionE1a mt564ActionOptionE1a : listE1a) {
				if(e1a.insertSelective(mt564ActionOptionE1a) != -1){
					count++;
				}
			}
		}
		return count;
	}


	public String getE1aCaoptnId() {
        return e1aCaoptnId;
    }

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((e1CaoptnId == null) ? 0 : e1CaoptnId.hashCode());
		result = prime * result
				+ ((e1aCaoptnId == null) ? 0 : e1aCaoptnId.hashCode());
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
		VActionOptionE1a other = (VActionOptionE1a) obj;
		if (e1CaoptnId == null) {
			if (other.e1CaoptnId != null)
				return false;
		} else if (!e1CaoptnId.equals(other.e1CaoptnId))
			return false;
		if (e1aCaoptnId == null) {
			if (other.e1aCaoptnId != null)
				return false;
		} else if (!e1aCaoptnId.equals(other.e1aCaoptnId))
			return false;
		return true;
	}

	public void setE1aCaoptnId(String e1aCaoptnId) {
        this.e1aCaoptnId = e1aCaoptnId == null ? null : e1aCaoptnId.trim();
    }

    public String getE1CaoptnId() {
        return e1CaoptnId;
    }

    public void setE1CaoptnId(String e1CaoptnId) {
        this.e1CaoptnId = e1CaoptnId == null ? null : e1CaoptnId.trim();
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

    public String getF98Issu() {
        return f98Issu;
    }

    public void setF98Issu(String f98Issu) {
        this.f98Issu = f98Issu == null ? null : f98Issu.trim();
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

    public String getF90Issu() {
        return f90Issu;
    }

    public void setF90Issu(String f90Issu) {
        this.f90Issu = f90Issu == null ? null : f90Issu.trim();
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

    public String getMino() {
        return mino;
    }

    public void setMino(String mino) {
        this.mino = mino == null ? null : mino.trim();
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

    public String getF36Size() {
        return f36Size;
    }

    public void setF36Size(String f36Size) {
        this.f36Size = f36Size == null ? null : f36Size.trim();
    }
}