package com.puyitou.fundmanager.auth.system.security;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.puyitou.fundmanager.auth.model.PytUser;

public class User extends PytUser implements UserDetails {

	private static final long serialVersionUID = 6969307040652918221L;

	public User(PytUser pytUser) {
		super();
		this.setAgencyInfo(pytUser.getAgencyInfo());
		this.setLoginName(pytUser.getUserId());
		this.setUserId(pytUser.getUserId());
		this.setUserName(pytUser.getUserName());
		this.setSearchType(pytUser.getSearchType());
	}
	
	private String userToken;
	
	private Set<String> authorities = new HashSet<>();

	public void setAuthorities(Set<String> authorities) {
		this.authorities = authorities;
	}

	public String getUserToken() {
		return userToken;
	}

	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities.stream().map(auth -> new SimpleGrantedAuthority(auth)).collect(Collectors.toList());
	}

	@JsonIgnore
	@Override
	public String getPassword() {
		return null;
	}

	@JsonIgnore
	@Override
	public String getUsername() {
		return super.getUserName();
	}

	@JsonIgnore
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@JsonIgnore
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@JsonIgnore
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@JsonIgnore
	@Override
	public boolean isEnabled() {
		return true;
	}

}
