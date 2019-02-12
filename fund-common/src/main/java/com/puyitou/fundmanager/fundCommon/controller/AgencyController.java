package com.puyitou.fundmanager.fundCommon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.puyitou.fundmanager.fundCommon.model.AgencyInfo;
import com.puyitou.fundmanager.fundCommon.model.SubAgencyInfo;
import com.puyitou.fundmanager.fundCommon.service.AgencyService;
import com.puyitou.fundmanager.fundCommon.system.response.RestResponseBody;

@RestController
@RequestMapping(path = "/agency")
public class AgencyController {

	@Autowired
	private AgencyService agencyService;
	
	@RequestMapping(value = "/listAgency", method = RequestMethod.GET)
	public RestResponseBody<?> listAgency() {
		List<AgencyInfo> listAgency = agencyService.listAgency();
		return new RestResponseBody<>(RestResponseBody.SUCCESS, listAgency);
	}
	
	@RequestMapping(value = "/listSubAgency/{agencyId}", method = RequestMethod.GET)
	public RestResponseBody<?> listSubAgency(@PathVariable String agencyId) {
		List<SubAgencyInfo> listSubAgency = agencyService.listSubAgency(agencyId);
		return new RestResponseBody<>(RestResponseBody.SUCCESS, listSubAgency);
	}
	
}
