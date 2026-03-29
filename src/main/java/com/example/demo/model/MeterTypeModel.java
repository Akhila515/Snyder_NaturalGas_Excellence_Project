package com.example.demo.model;

import java.util.Date;

public class MeterTypeModel {

	private Integer id;
	private Integer ldcid;
	private Integer metertypeid;
	private String metertype;
	private String createdby;
	private Date createdon;
	private String updatedby;
	private Date updatedon;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getLdcid() {
		return ldcid;
	}

	public void setLdcid(Integer ldcid) {
		this.ldcid = ldcid;
	}

	public Integer getMetertypeid() {
		return metertypeid;
	}

	public void setMetertypeid(Integer metertypeid) {
		this.metertypeid = metertypeid;
	}

	public String getMetertype() {
		return metertype;
	}

	public void setMetertype(String metertype) {
		this.metertype = metertype;
	}

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public Date getCreatedon() {
		return createdon;
	}

	public void setCreatedon(Date createdon) {
		this.createdon = createdon;
	}

	public String getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}

	public Date getUpdatedon() {
		return updatedon;
	}

	public void setUpdatedon(Date updatedon) {
		this.updatedon = updatedon;
	}

}
