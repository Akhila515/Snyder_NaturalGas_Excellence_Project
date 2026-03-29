package com.example.demo.model;

import java.math.BigDecimal;

public class TariffModel {

	private Integer ldcid;
	private Integer ldcrrid;
	private String metertype;
	private String unit;
	private BigDecimal amount;

	public Integer getLdcid() {
		return ldcid;
	}

	public void setLdcid(Integer ldcid) {
		this.ldcid = ldcid;
	}

	public Integer getLdcrrid() {
		return ldcrrid;
	}

	public void setLdcrrid(Integer ldcrrid) {
		this.ldcrrid = ldcrrid;
	}

	public String getMetertype() {
		return metertype;
	}

	public void setMetertype(String metertype) {
		this.metertype = metertype;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

}
