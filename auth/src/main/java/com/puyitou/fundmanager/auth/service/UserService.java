package com.puyitou.fundmanager.auth.service;

import java.util.Set;

import com.puyitou.fundmanager.auth.model.PytUser;

public interface UserService {

	String getToken(String username, String password);

	PytUser getPytUser(String token);

	Set<String> getAuthorities(String token);

}
