package com.puyitou.fundmanager.auth.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class PytUser implements Serializable {

	private static final long serialVersionUID = 6231140757898843666L;

	private int searchType;
	
	private String loginName;
	
	private String userName;
	
	private String userId;
	
	private Set<AgencyInfo> agencyInfo = new HashSet<>();
	
	private Set<SubAgencyInfo> subAgencyInfo = new HashSet<>();

	public int getSearchType() {
		return searchType;
	}

	public void setSearchType(int searchType) {
		this.searchType = searchType;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Set<AgencyInfo> getAgencyInfo() {
		return agencyInfo;
	}

	public void setAgencyInfo(Set<AgencyInfo> agencyInfo) {
		this.agencyInfo = agencyInfo;
	}

	public Set<SubAgencyInfo> getSubAgencyInfo() {
		return subAgencyInfo;
	}

	public void setSubAgencyInfo(Set<SubAgencyInfo> subAgencyInfo) {
		this.subAgencyInfo = subAgencyInfo;
	}

	@Override
	public String toString() {
		return "PytUser [searchType=" + searchType + ", loginName=" + loginName + ", userName=" + userName + ", userId="
				+ userId + ", agencyInfo=" + agencyInfo + ", subAgencyInfo=" + subAgencyInfo + "]";
	}

}
