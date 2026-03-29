package com.example.demo.Entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ldc_daily_quantity")
public class QuantityEntity {

	@Id
	@Column(name = "ldc_id")
	private Integer ldcid;

	@Column(name = "daily_type_id")
	private Integer dailytypeid;

	@Column(name = "name")
	private String name;

	@Column(name = "abbreviation")
	private String abbrevation;

	@Column(name = "start_date")
	private Date startdate;

	@Column(name = "end_date")
	private Date enddate;

	public Integer getLdcid() {
		return ldcid;
	}

	public void setLdcid(Integer ldcid) {
		this.ldcid = ldcid;
	}

	public Integer getDailytypeid() {
		return dailytypeid;
	}

	public void setDailytypeid(Integer dailytypeid) {
		this.dailytypeid = dailytypeid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbbrevation() {
		return abbrevation;
	}

	public void setAbbrevation(String abbrevation) {
		this.abbrevation = abbrevation;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	
}
