package com.example.demo.model;

import java.util.Date;

public class QuantityModel {
	
	private Integer ldcid;
	private Integer dailytypeid;
	private String name;
	private String abbrevation;
	private Date startdate;
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
