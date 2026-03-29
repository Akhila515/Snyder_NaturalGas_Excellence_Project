package com.example.demo.Entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="meter_type")
public class MeterTypeEntity {
	@Id
	private Integer id;
	
	@Column(name="ldc_id")
	private Integer ldcid;
	
	@Column(name="meter_type_id")
	private Integer metertypeid;
	
	@Column(name="meter_type")
	private String metertype;
	
	@Column(name="created_by")
	private String createdby;
	
	@Column(name="created_on")
	private Date createdon;
	
	@Column(name="updated_by")
	private String updatedby;
	
	@Column(name="updated_on")
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
