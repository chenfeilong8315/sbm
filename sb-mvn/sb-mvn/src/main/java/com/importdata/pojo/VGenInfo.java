package com.importdata.pojo;

import java.util.Date;
import java.util.UUID;

import org.apache.ibatis.session.SqlSession;

import com.importdata.common.Adaptee;
import com.importdata.common.Mt;
import com.importdata.mapper.VGenInfoMapper;

public class VGenInfo extends Adaptee{
	private String infoId;

	private String pageNum;

	private String corp;

	private String seme;

	private String coaf;

	private String msgFun;

	private String caep;

	private String caev;

	private String camv;

	private String prepDt;

	private String status;

	private Date createDt;

	private Date updateDt;

	public VGenInfo() {
		this.infoId = UUID.randomUUID().toString().replace("-", "");
	}

	@Override
	public int insertMyDB(SqlSession session, Mt mt) {
		Mt564 mt564 = (Mt564) mt;
		VGenInfo a = mt564.getA();
		VGenInfoMapper mapperA = session.getMapper(VGenInfoMapper.class);
		return mapperA.insertSelective(a);// 插入A表
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		VGenInfo other = (VGenInfo) obj;
		if (infoId == null) {
			if (other.infoId != null)
				return false;
		} else if (!infoId.equals(other.infoId))
			return false;
		return true;
	}

	public String getInfoId() {
		return infoId;
	}

	public void setInfoId(String infoId) {
		this.infoId = infoId == null ? null : infoId.trim();
	}

	public String getPageNum() {
		return pageNum;
	}

	public void setPageNum(String pageNum) {
		this.pageNum = pageNum == null ? null : pageNum.trim();
	}

	public String getCorp() {
		return corp;
	}

	public void setCorp(String corp) {
		this.corp = corp == null ? null : corp.trim();
	}

	public String getSeme() {
		return seme;
	}

	public void setSeme(String seme) {
		this.seme = seme == null ? null : seme.trim();
	}

	public String getCoaf() {
		return coaf;
	}

	public void setCoaf(String coaf) {
		this.coaf = coaf == null ? null : coaf.trim();
	}

	public String getMsgFun() {
		return msgFun;
	}

	public void setMsgFun(String msgFun) {
		this.msgFun = msgFun == null ? null : msgFun.trim();
	}

	public String getCaep() {
		return caep;
	}

	public void setCaep(String caep) {
		this.caep = caep == null ? null : caep.trim();
	}

	public String getCaev() {
		return caev;
	}

	public void setCaev(String caev) {
		this.caev = caev == null ? null : caev.trim();
	}

	public String getCamv() {
		return camv;
	}

	public void setCamv(String camv) {
		this.camv = camv == null ? null : camv.trim();
	}

	public String getPrepDt() {
		return prepDt;
	}

	public void setPrepDt(String prepDt) {
		this.prepDt = prepDt == null ? null : prepDt.trim();
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	public Date getCreateDt() {
		return createDt;
	}

	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}

	public Date getUpdateDt() {
		return updateDt;
	}

	public void setUpdateDt(Date updateDt) {
		this.updateDt = updateDt;
	}
}