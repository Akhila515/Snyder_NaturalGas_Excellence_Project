package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "monthly_tolerance")
public class ToleranceEntity {

	@Id
	@Column(name = "ldc_id")
	private Integer ldcid;

	@Column(name = "category_id")
	private Integer categoryid;

	@Column(name = "name")
	private String name;

	@Column(name = "target_notes")
	private String targetnotes;

	@Column(name = "status")
	private String status;

	@Column(name = "use_as_exception")
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
