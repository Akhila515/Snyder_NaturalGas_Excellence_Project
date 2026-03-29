package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pooling_points")
public class PoolEntity {

	@Id
	@Column(name = "ldc_id")
	private Integer ldcid;

	@Column(name = "ldc_pooling_id")
	private Integer ldcpoolid;

	@Column(name = "pool_name")
	private String poolname;

	@Column(name = "account_number")
	private String accountnumber;

	@Column(name = "primary_pipeline")
	private Integer primarypileline;

	public Integer getLdcid() {
		return ldcid;
	}

	public void setLdcid(Integer ldcid) {
		this.ldcid = ldcid;
	}

	public Integer getLdcpoolid() {
		return ldcpoolid;
	}

	public void setLdcpoolid(Integer ldcpoolid) {
		this.ldcpoolid = ldcpoolid;
	}

	public String getPoolname() {
		return poolname;
	}

	public void setPoolname(String poolname) {
		this.poolname = poolname;
	}

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public Integer getPrimarypileline() {
		return primarypileline;
	}

	public void setPrimarypileline(Integer primarypileline) {
		this.primarypileline = primarypileline;
	}

}
