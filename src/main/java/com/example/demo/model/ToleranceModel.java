package com.example.demo.model;

public class ToleranceModel {

	private Integer ldcid;
	private Integer categoryid;
	private String name;
	private String targetnotes;
	private String status;
	private String useasexception;

	public Integer getLdcid() {
		return ldcid;
	}

	public void setLdcid(Integer ldcid) {
		this.ldcid = ldcid;
	}

	public Integer getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(Integer categoryid) {
		this.categoryid = categoryid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTargetnotes() {
		return targetnotes;
	}

	public void setTargetnotes(String targetnotes) {
		this.targetnotes = targetnotes;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUseasexception() {
		return useasexception;
	}

	public void setUseasexception(String useasexception) {
		this.useasexception = useasexception;
	}

}
