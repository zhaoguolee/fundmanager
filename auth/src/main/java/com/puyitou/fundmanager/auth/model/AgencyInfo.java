package com.puyitou.fundmanager.auth.model;

public class AgencyInfo {

	private String agencyId;
	
	private String agencyName;

	public String getAgencyId() {
		return agencyId;
	}

	public void setAgencyId(String agencyId) {
		this.agencyId = agencyId;
	}

	public String getAgencyName() {
		return agencyName;
	}

	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}

	@Override
	public String toString() {
		return "AgencyInfo [agencyId=" + agencyId + ", agencyName=" + agencyName + "]";
	}
	
}
