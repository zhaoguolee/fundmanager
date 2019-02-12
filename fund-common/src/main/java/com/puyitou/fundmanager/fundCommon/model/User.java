package com.puyitou.fundmanager.fundCommon.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class User implements Serializable {

	private static final long serialVersionUID = 7166016190358947250L;

	private int searchType;
	
	private String loginName;
	
	private String userName;
	
	private String userId;
	
	private String userToken;
	
	private Set<AgencyInfo> agencyInfo = new HashSet<>();
	
	private Set<SubAgencyInfo> subAgencyInfo = new HashSet<>();
	
	@JsonIgnore
	private Collection<? extends GrantedAuthority> localAuthorities = new HashSet<>();

	public Collection<String> getAuths() {
		 return localAuthorities.stream().map(a -> a.getAuthority()).collect(Collectors.toList());
	}
	
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

	public String getUserToken() {
		return userToken;
	}

	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}
	
	public Set<AgencyInfo> getAgencyInfo() {
		return agencyInfo;
	}

	public void setAgencyInfo(Set<AgencyInfo> agencyInfo) {
		this.agencyInfo = agencyInfo;
	}

	public Collection<? extends GrantedAuthority> getLocalAuthorities() {
		return localAuthorities;
	}

	public void setLocalAuthorities(Collection<? extends GrantedAuthority> localAuthorities) {
		this.localAuthorities = localAuthorities;
	}

	public Set<SubAgencyInfo> getSubAgencyInfo() {
		return subAgencyInfo;
	}

	public void setSubAgencyInfo(Set<SubAgencyInfo> subAgencyInfo) {
		this.subAgencyInfo = subAgencyInfo;
	}

}
