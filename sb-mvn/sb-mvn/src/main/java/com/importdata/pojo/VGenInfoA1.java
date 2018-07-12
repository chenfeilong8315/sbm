package com.importdata.pojo;

import java.util.ArrayList;
import java.util.UUID;

import org.apache.ibatis.session.SqlSession;

import com.importdata.common.Adaptee;
import com.importdata.common.Mt;
import com.importdata.mapper.VGenInfoA1Mapper;

public class VGenInfoA1 extends Adaptee{
    private String a1InfoId;

    private String infoId;

    private String linkType;

    private String linkMsg;

    private String msgRef;

    public VGenInfoA1() {
		this.a1InfoId = UUID.randomUUID().toString().replace("-", "");
	}
    
    @Override
	public int insertMyDB(SqlSession session, Mt mt) {
    	int count = 0;
    	Mt564 mt564 = (Mt564) mt;
		ArrayList<VGenInfoA1> a1 = mt564.getA1();
		if (null != a1 && a1.size() > 0) {
			VGenInfoA1Mapper mapperA1 = session
					.getMapper(VGenInfoA1Mapper.class);
			for (VGenInfoA1 mt564GenInfoA1 : a1) {
				if(mapperA1.insertSelective(mt564GenInfoA1)!=-1){
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
				+ ((a1InfoId == null) ? 0 : a1InfoId.hashCode());
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
		VGenInfoA1 other = (VGenInfoA1) obj;
		if (a1InfoId == null) {
			if (other.a1InfoId != null)
				return false;
		} else if (!a1InfoId.equals(other.a1InfoId))
			return false;
		if (infoId == null) {
			if (other.infoId != null)
				return false;
		} else if (!infoId.equals(other.infoId))
			return false;
		return true;
	}

	public String getA1InfoId() {
        return a1InfoId;
    }

    public void setA1InfoId(String a1InfoId) {
        this.a1InfoId = a1InfoId == null ? null : a1InfoId.trim();
    }

    public String getInfoId() {
        return infoId;
    }

    public void setInfoId(String infoId) {
        this.infoId = infoId == null ? null : infoId.trim();
    }

    public String getLinkType() {
        return linkType;
    }

    public void setLinkType(String linkType) {
        this.linkType = linkType == null ? null : linkType.trim();
    }

    public String getLinkMsg() {
        return linkMsg;
    }

    public void setLinkMsg(String linkMsg) {
        this.linkMsg = linkMsg == null ? null : linkMsg.trim();
    }

    public String getMsgRef() {
        return msgRef;
    }

    public void setMsgRef(String msgRef) {
        this.msgRef = msgRef == null ? null : msgRef.trim();
    }
}