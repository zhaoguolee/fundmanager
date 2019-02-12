package com.puyitou.fundmanager.fundCommon.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
import com.puyitou.fundmanager.fundCommon.model.AgencyInfo;
import com.puyitou.fundmanager.fundCommon.model.SubAgencyInfo;
import com.puyitou.fundmanager.fundCommon.model.User;
import com.puyitou.fundmanager.fundCommon.system.exception.ApplicationException;
import com.puyitou.fundmanager.fundCommon.system.security.SecurityUserService;
import com.puyitou.fundmanager.fundCommon.util.PytHttpEntityBuilder;

@Service
public class AgencyServiceImpl implements AgencyService {

	private static final String CODE_SUCCESS = "SUCCESS";

	private final Logger log = LoggerFactory.getLogger(getClass());

	private static final String AGENCY_URL = "/manager/api/offsales/list/unit";

	private static final String SUB_AGENCY_URL = "/manager/api/offsales/list/citiesList";

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
	public List<AgencyInfo> listAgency() {
		User user = securityUserService.currentUser();

		String url = PYT_HTTP_URL + AGENCY_URL;
		HttpEntity<?> httpEntity = new PytHttpEntityBuilder(DES_KEY).token(user.getUserToken()).build();
		log.info("listAgency, url: {}, httpEntity: {}", url, httpEntity.toString());
		ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.POST, httpEntity, String.class);
		log.info("listAgency, response: {}", responseEntity.toString());

		String body = responseEntity.getBody();
		try {
			Map<?, ?> bodyMap = mapper.readValue(body, Map.class);
			if (CODE_SUCCESS.equals(bodyMap.get("code"))) {
				List<AgencyInfo> agencyInfos = new ArrayList<>();
				List<?> agencyList = (List<?>) bodyMap.get("data");
				for (Object agency : agencyList) {
					Map<?, ?> agencyMap = (Map<?, ?>) agency;
					AgencyInfo agencyInfo = new AgencyInfo();
					agencyInfo.setAgencyId(String.valueOf(agencyMap.get("unitId")));
					agencyInfo.setAgencyName(String.valueOf(agencyMap.get("unitName")));
					agencyInfos.add(agencyInfo);
				}
				return agencyInfos;
			} else {
				throw new ApplicationException(
						null != bodyMap.get("msg") ? bodyMap.get("msg").toString() : "remote server error");
			}
		} catch (IOException e) {
			throw new ApplicationException("json error", e);
		}
	}

	@Override
	public List<SubAgencyInfo> listSubAgency(String agencyId) {
		User user = securityUserService.currentUser();

		String url = PYT_HTTP_URL + SUB_AGENCY_URL;
		HttpEntity<?> httpEntity = new PytHttpEntityBuilder(DES_KEY).token(user.getUserToken()).addParam("unitId", agencyId).build();
		log.info("listSubAgency, url: {}, httpEntity: {}", url, httpEntity.toString());
		ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.POST, httpEntity, String.class);
		log.info("listSubAgency, response: {}", responseEntity.toString());

		String body = responseEntity.getBody();
		try {
			Map<?, ?> bodyMap = mapper.readValue(body, Map.class);
			if (CODE_SUCCESS.equals(bodyMap.get("code"))) {
				List<SubAgencyInfo> subAgencyInfos = new ArrayList<>();
				List<?> agencyList = (List<?>) bodyMap.get("data");
				for (Object agency : agencyList) {
					Map<?, ?> agencyMap = (Map<?, ?>) agency;
					SubAgencyInfo subAgencyInfo = new SubAgencyInfo();
					subAgencyInfo.setSubAgencyId(String.valueOf(agencyMap.get("id")));
					subAgencyInfo.setSubAgencyName(String.valueOf(agencyMap.get("areaName")));
					subAgencyInfos.add(subAgencyInfo);
				}
				return subAgencyInfos;
			} else {
				throw new ApplicationException(
						null != bodyMap.get("msg") ? bodyMap.get("msg").toString() : "remote server error");
			}
		} catch (IOException e) {
			throw new ApplicationException("json error", e);
		}
	}

}
