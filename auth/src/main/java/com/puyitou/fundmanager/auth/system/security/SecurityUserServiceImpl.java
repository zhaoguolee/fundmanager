package com.puyitou.fundmanager.auth.system.security;

import java.util.Optional;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class SecurityUserServiceImpl implements SecurityUserService {

	@Override
	public User currentUser() {
		return (User) Optional.ofNullable(SecurityContextHolder.getContext().getAuthentication())
		.map(authentication -> authentication.getPrincipal())
		.orElse(null);
	}
	
}
