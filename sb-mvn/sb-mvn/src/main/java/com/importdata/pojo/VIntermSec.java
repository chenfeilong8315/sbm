package com.importdata.pojo;

import java.util.ArrayList;
import java.util.UUID;

import org.apache.ibatis.session.SqlSession;

import com.importdata.common.Adaptee;
import com.importdata.common.Mt;
import com.importdata.mapper.VIntermSecMapper;

public class VIntermSec extends Adaptee{
    private String intermSecId;

    private String infoId;

    private String idenSec;

    private String qint;

    private String inba;

    private String unba;

    private String disf;

    private String sell;

    private String rtun;

    private String mrkt;

    private String expi;

    private String post;

    private String trdp;
    

    public VIntermSec() {
		this.intermSecId = UUID.randomUUID().toString().replace("-", "");
	}
    
    @Override
	public int insertMyDB(SqlSession session, Mt mt) {
    	int count = 0;
    	Mt564 mt564 = (Mt564) mt;
		ArrayList<VIntermSec> listC = mt564.getC();
		if (null != listC && listC.size() > 0) {
			VIntermSecMapper c = session
					.getMapper(VIntermSecMapper.class);
			for (VIntermSec mt564IntermSec : listC) {
				if(c.insertSelective(mt564IntermSec) != -1){
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
		result = prime * result + ((infoId == null) ? 0 : infoId.hashCode());
		result = prime * result
				+ ((intermSecId == null) ? 0 : intermSecId.hashCode());
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
		VIntermSec other = (VIntermSec) obj;
		if (infoId == null) {
			if (other.infoId != null)
				return false;
		} else if (!infoId.equals(other.infoId))
			return false;
		if (intermSecId == null) {
			if (other.intermSecId != null)
				return false;
		} else if (!intermSecId.equals(other.intermSecId))
			return false;
		return true;
	}

	public String getIntermSecId() {
        return intermSecId;
    }

    public void setIntermSecId(String intermSecId) {
        this.intermSecId = intermSecId == null ? null : intermSecId.trim();
    }

    public String getInfoId() {
        return infoId;
    }

    public void setInfoId(String infoId) {
        this.infoId = infoId == null ? null : infoId.trim();
    }

    public String getIdenSec() {
        return idenSec;
    }

    public void setIdenSec(String idenSec) {
        this.idenSec = idenSec == null ? null : idenSec.trim();
    }

    public String getQint() {
        return qint;
    }

    public void setQint(String qint) {
        this.qint = qint == null ? null : qint.trim();
    }

    public String getInba() {
        return inba;
    }

    public void setInba(String inba) {
        this.inba = inba == null ? null : inba.trim();
    }

    public String getUnba() {
        return unba;
    }

    public void setUnba(String unba) {
        this.unba = unba == null ? null : unba.trim();
    }

    public String getDisf() {
        return disf;
    }

    public void setDisf(String disf) {
        this.disf = disf == null ? null : disf.trim();
    }

    public String getSell() {
        return sell;
    }

    public void setSell(String sell) {
        this.sell = sell == null ? null : sell.trim();
    }

    public String getRtun() {
        return rtun;
    }

    public void setRtun(String rtun) {
        this.rtun = rtun == null ? null : rtun.trim();
    }

    public String getMrkt() {
        return mrkt;
    }

    public void setMrkt(String mrkt) {
        this.mrkt = mrkt == null ? null : mrkt.trim();
    }

    public String getExpi() {
        return expi;
    }

    public void setExpi(String expi) {
        this.expi = expi == null ? null : expi.trim();
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post == null ? null : post.trim();
    }

    public String getTrdp() {
        return trdp;
    }

    public void setTrdp(String trdp) {
        this.trdp = trdp == null ? null : trdp.trim();
    }
}