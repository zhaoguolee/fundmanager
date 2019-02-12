package com.puyitou.fundmanager.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.puyitou.fundmanager.auth.system.security.SecurityUserService;
import com.puyitou.fundmanager.auth.system.security.User;

@RestController
@RequestMapping("users")
public class UserController {

	@Autowired
	private SecurityUserService securityUserService;
	
	@RequestMapping(value = "/me", method = RequestMethod.GET)
    public User user() {
        return securityUserService.currentUser();
    }

}
