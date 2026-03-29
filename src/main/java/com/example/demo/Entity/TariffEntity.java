package com.example.demo.Entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ldc_tariff")
public class TariffEntity {

	@Id
	@Column(name = "ldc_id")
	private Integer ldcid;

	@Column(name = "ldc_rr_id")
	private Integer ldcrrid;

	@Column(name = "meter_type")
	private String metertype;

	@Column(name = "unit")
	private String unit;

	@Column(name = "amount")
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
