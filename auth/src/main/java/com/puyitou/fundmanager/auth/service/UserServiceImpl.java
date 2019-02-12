package com.puyitou.fundmanager.auth.service;

import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.puyitou.fundmanager.auth.model.PytResponse;
import com.puyitou.fundmanager.auth.model.PytUser;
import com.puyitou.fundmanager.auth.system.exception.ApplicationException;
import com.puyitou.fundmanager.auth.system.util.DesUtils;
import com.puyitou.fundmanager.auth.util.HttpEntityBuilder;

@Service
public class UserServiceImpl implements UserService {

	private static final String CODE_SUCCESS = "SUCCESS";

	private final Logger log = LoggerFactory.getLogger(getClass());

	private static final String TOKEN_URL = "/manager/newlogin";

	private static final String USER_URL = "/manager/api/offsales/userInfo";

	private static final String AUTHORITIES_URL = "/manager/api/offsales/list/auth";

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private ObjectMapper mapper;

	@Value(value = "${pyt.des.key}")
	private String DES_KEY;

	@Value(value = "${pyt.http.url}")
	private String PYT_HTTP_URL;

	@Override
	public String getToken(String username, String password) {
		String url = PYT_HTTP_URL + TOKEN_URL;
		HttpEntity<?> httpEntity;
		try {
			httpEntity = new HttpEntityBuilder(DES_KEY).addParam("loginName", DesUtils.encrypt(username, DES_KEY))
					.addParam("passWord", DesUtils.encrypt(password, DES_KEY)).build();
		} catch (Exception e) {
			throw new ApplicationException("encrypt error", e);
		}
		log.info("getPytUser, url: {}, httpEntity: {}", url, httpEntity.toString());
		ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.POST, httpEntity, String.class);
		log.info("getPytUser, response: {}", responseEntity.toString());

		String body = responseEntity.getBody();
		try {
			Map<?, ?> bodyMap = mapper.readValue(body, Map.class);
			if (CODE_SUCCESS.equals(bodyMap.get("code"))) {
				return (String) bodyMap.get("data");
			} else {
				throw new ApplicationException(
						null != bodyMap.get("msg") ? bodyMap.get("msg").toString() : "remote server error");
			}
		} catch (IOException e) {
			throw new ApplicationException("json error", e);
		}
	}

	@Override
	public PytUser getPytUser(String token) {
		String url = PYT_HTTP_URL + USER_URL;
		HttpEntity<?> httpEntity = new HttpEntityBuilder(DES_KEY).token(token).build();
		log.info("getPytUser, url: {}, httpEntity: {}", url, httpEntity.toString());
		ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.POST, httpEntity, String.class);
		log.info("getPytUser, response: {}", responseEntity.toString());

		String body = responseEntity.getBody();
		try {
			PytResponse<PytUser> pytResponse = mapper.readValue(body, new TypeReference<PytResponse<PytUser>>() {
			});
			if (CODE_SUCCESS.equals(pytResponse.getCode())) {
				return pytResponse.getData();
			} else {
				throw new ApplicationException(
						null != pytResponse.getMsg() ? pytResponse.getMsg() : "remote server error");
			}
		} catch (IOException e) {
			throw new ApplicationException("json error", e);
		}
	}

	@Override
	public Set<String> getAuthorities(String token) {
		String url = PYT_HTTP_URL + AUTHORITIES_URL;
		HttpEntity<?> httpEntity = new HttpEntityBuilder(DES_KEY).token(token).build();
		log.info("getPytUser, url: {}, httpEntity: {}", url, httpEntity.toString());
		ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.POST, httpEntity, String.class);
		log.info("getPytUser, response: {}", responseEntity.toString());

		String body = responseEntity.getBody();
		try {
			Map<?, ?> bodyMap = mapper.readValue(body, Map.class);
			if (CODE_SUCCESS.equals(bodyMap.get("code"))) {
				Set<String> auths = new HashSet<>();
				Map<?, ?> authMap = (Map<?, ?>) bodyMap.get("data");
				for (Entry<?, ?> entry : authMap.entrySet()) {
					if (entry.getValue().equals(1)) {
						auths.add(String.valueOf(entry.getKey()));
					}
				}
				return auths;
			} else {
				throw new ApplicationException(
						null != bodyMap.get("msg") ? bodyMap.get("msg").toString() : "remote server error");
			}
		} catch (IOException e) {
			throw new ApplicationException("json error", e);
		}

	}
}
