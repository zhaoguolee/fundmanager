package com.puyitou.fundmanager.fundCommon.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.puyitou.fundmanager.fundCommon.model.Sales;
import com.puyitou.fundmanager.fundCommon.model.Signatory;
import com.puyitou.fundmanager.fundCommon.model.User;
import com.puyitou.fundmanager.fundCommon.system.security.SecurityUserService;
import com.puyitou.fundmanager.fundCommon.util.PytHttpEntityBuilder;

@Service
public class SalesServiceImpl implements SalesService {

	private static final String CODE_SUCCESS = "SUCCESS";

	private final Logger log = LoggerFactory.getLogger(getClass());
	
	private static final String SALES_URL = "/manager/api/offsales/finalInfo";
	
	private static final String SIGNATORY_URL = "/manager/api/offsales/list/contractor";
	
	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private SecurityUserService securityUserService;

	@Autowired
	private ObjectMapper mapper;

	@Value(value = "${pyt.des.key}")
	private String DES_KEY;

	@Value(value = "${pyt.http.url}")
	private String PYT_HTTP_URL;
	
	@Override
	public Sales findByIdCard(String salesIdCard) {
		User user = securityUserService.currentUser();

		String url = PYT_HTTP_URL + SALES_URL;
		HttpEntity<?> httpEntity = new PytHttpEntityBuilder(DES_KEY).token(user.getUserToken()).addParam("cardNo", salesIdCard).build();
		log.info("findByIdCard, url: {}, httpEntity: {}", url, httpEntity.toString());
		ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.POST, httpEntity, String.class);
		log.info("findByIdCard, response: {}", responseEntity.toString());

		String body = responseEntity.getBody();
		
		// TODO
		return null;
	}
	
	@Override
	public List<Signatory> listSignatory(String agencyId) {
		User user = securityUserService.currentUser();

		String url = PYT_HTTP_URL + SIGNATORY_URL;
		HttpEntity<?> httpEntity = new PytHttpEntityBuilder(DES_KEY).token(user.getUserToken()).addParam("unitId", agencyId).build();
		log.info("listSignatory, url: {}, httpEntity: {}", url, httpEntity.toString());
		ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.POST, httpEntity, String.class);
		log.info("listSignatory, response: {}", responseEntity.toString());

		String body = responseEntity.getBody();
		
		// TODO
		return null;
		
	}
}
