package com.puyitou.fundmanager.auth.system.security;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import com.puyitou.fundmanager.auth.model.PytUser;
import com.puyitou.fundmanager.auth.service.UserService;
import com.puyitou.fundmanager.auth.system.exception.ApplicationException;

@Component
public class PytAuthenticationProvider implements AuthenticationProvider {

	private final Logger log = LoggerFactory.getLogger(getClass());

	@Autowired
	private UserService userService;

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		String username = String.valueOf(authentication.getPrincipal());
		String password = String.valueOf(authentication.getCredentials());
		try {
			String token = userService.getToken(username, password);
			PytUser pytUser = userService.getPytUser(token);
			Set<String> auths = userService.getAuthorities(token);
			User user = new User(pytUser);
			user.setUserToken(token);
			user.setAuthorities(auths);
			UsernamePasswordAuthenticationToken result = new UsernamePasswordAuthenticationToken(user,
					authentication.getCredentials(), user.getAuthorities());
			 result.setDetails(authentication.getDetails());
			return result;
		} catch (ApplicationException e) {
			log.error("authenticate error", e);
			throw new BadCredentialsException(e.getMessage());
		}
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
	}

}
