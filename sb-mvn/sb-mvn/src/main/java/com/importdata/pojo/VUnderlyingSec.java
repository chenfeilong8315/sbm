package com.importdata.pojo;

import java.util.ArrayList;
import java.util.UUID;

import org.apache.ibatis.session.SqlSession;

import com.importdata.common.Adaptee;
import com.importdata.common.Mt;
import com.importdata.mapper.VUnderlyingSecMapper;

public class VUnderlyingSec extends Adaptee{
    private String usecuId;

    private String infoId;

    private String idenSec;

    private String isinNm;

    private String commonCodeNm;

    public VUnderlyingSec() {
		this.usecuId = UUID.randomUUID().toString().replace("-", "");
	}
    
    @Override
 	public int insertMyDB(SqlSession session, Mt mt) {
     	int count = 0;
     	Mt564 mt564 = (Mt564) mt;
 		ArrayList<VUnderlyingSec> listB = mt564.getB();
 		if (null != listB && listB.size() > 0) {
 			VUnderlyingSecMapper b = session
 					.getMapper(VUnderlyingSecMapper.class);
 			for (VUnderlyingSec mt564UnderlyingSec : listB) {
 				if(b.insertSelective(mt564UnderlyingSec)!=-1){
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
		VUnderlyingSec other = (VUnderlyingSec) obj;
		if (infoId == null) {
			if (other.infoId != null)
				return false;
		} else if (!infoId.equals(other.infoId))
			return false;
		if (usecuId == null) {
			if (other.usecuId != null)
				return false;
		} else if (!usecuId.equals(other.usecuId))
			return false;
		return true;
	}

	public String getUsecuId() {
        return usecuId;
    }

    public void setUsecuId(String usecuId) {
        this.usecuId = usecuId == null ? null : usecuId.trim();
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

    public String getIsinNm() {
        return isinNm;
    }

    public void setIsinNm(String isinNm) {
        this.isinNm = isinNm == null ? null : isinNm.trim();
    }

    public String getCommonCodeNm() {
        return commonCodeNm;
    }

    public void setCommonCodeNm(String commonCodeNm) {
        this.commonCodeNm = commonCodeNm == null ? null : commonCodeNm.trim();
    }
}