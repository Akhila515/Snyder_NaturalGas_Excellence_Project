package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ldc_charges")
public class ChargesEntity {

	
	@Column(name = "ldc_id")
	private Integer ldcid;

	@Column(name = "charge_name")
	private String name;

	@Id
	@Column(name = "ldc_charge_id")
	private Integer chargeid;

	@Column(name = "meter_type_id")
	private Integer meterid;

	@Column(name = "charge_type")
	private Integer chargetype;

	public Integer getLdcid() {
		return ldcid;
	}

	public void setLdcid(Integer ldcid) {
		this.ldcid = ldcid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getChargeid() {
		return chargeid;
	}

	public void setChargeid(Integer chargeid) {
		this.chargeid = chargeid;
	}

	public Integer getMeterid() {
		return meterid;
	}

	public void setMeterid(Integer meterid) {
		this.meterid = meterid;
	}

	public Integer getChargetype() {
		return chargetype;
	}

	public void setChargetype(Integer chargetype) {
		this.chargetype = chargetype;
	}

}
