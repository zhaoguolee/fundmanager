package com.puyitou.fundmanager.fundCommon.util;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

public class PytHttpEntityBuilder {

	private Map<String, String> requestBody;
	
	private MultiValueMap<String, String> headers;
	
	private String token;
	
	private String desKey;
	
	public PytHttpEntityBuilder(String desKey) {
		this.requestBody = new HashMap<>();
		this.headers = new LinkedMultiValueMap<>();
		this.desKey = desKey;
		this.headers.add("Content-Type", "application/json;charset=UTF-8");
	}
	
	public PytHttpEntityBuilder token(String token) {
		this.token = token;
		return this;
	}
	
	public PytHttpEntityBuilder addHeader(String key, String value) {
		headers.add(key, value);
		return this;
	}
	
	public PytHttpEntityBuilder addParam(String key, String value) {
		requestBody.put(key, value);
		return this;
	}
	
	public HttpEntity<Map<String, String>> build() {
		if (null != token) {
			long timeStamp = System.currentTimeMillis();
			String sign = PytSignature.md5Signature(this.requestBody, timeStamp, desKey, token);
			headers.add("timeStamp", String.valueOf(timeStamp));
			headers.add("token", token);
			headers.add("sign", sign);
		}
		return new HttpEntity<>(requestBody, headers);
	}
	
}
