package com.puyitou.fundmanager.hedge.model;

public class SubAgencyInfo {

	private String subAgencyId;
	
	private String subAgencyName;

	public String getSubAgencyId() {
		return subAgencyId;
	}

	public void setSubAgencyId(String subAgencyId) {
		this.subAgencyId = subAgencyId;
	}

	public String getSubAgencyName() {
		return subAgencyName;
	}

	public void setSubAgencyName(String subAgencyName) {
		this.subAgencyName = subAgencyName;
	}

	@Override
	public String toString() {
		return "SubAgencyInfo [subAgencyId=" + subAgencyId + ", subAgencyName=" + subAgencyName + "]";
	}
	
}
