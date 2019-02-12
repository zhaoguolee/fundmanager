package com.puyitou.fundmanager.fundCommon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.puyitou.fundmanager.fundCommon.model.User;
import com.puyitou.fundmanager.fundCommon.system.response.RestResponseBody;
import com.puyitou.fundmanager.fundCommon.system.security.SecurityUserService;

@RestController
@RequestMapping(path = "/users")
public class UserController {

	@Autowired
	private SecurityUserService securityUserService;
	
	@RequestMapping(value = "/me", method = RequestMethod.GET)
	public RestResponseBody<?> me() {
		User user = securityUserService.currentUser();
		return new RestResponseBody<>(RestResponseBody.SUCCESS, user);
	}
	
}
