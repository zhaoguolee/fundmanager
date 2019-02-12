package com.puyitou.fundmanager.fundCommon.system.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.puyitou.fundmanager.fundCommon.model.User;
import com.puyitou.fundmanager.fundCommon.system.exception.ApplicationException;

@Service
public class SecurityUserServiceImpl implements SecurityUserService {
	
	@Autowired
	private ObjectMapper mapper;
	
	@Override
	public User currentUser() {
		OAuth2Authentication authentication = (OAuth2Authentication) SecurityContextHolder.getContext().getAuthentication();
		if (null == authentication) {
			return null;
		}
		Authentication userAuthentication = authentication.getUserAuthentication();
		try {
			String detail = mapper.writeValueAsString(userAuthentication.getDetails());
			User user = mapper.readValue(detail, User.class);
			user.setLocalAuthorities(userAuthentication.getAuthorities());
			return user;
		} catch (Exception e) {
			throw new ApplicationException("currentUser error", e);
		}
	}
	
}
