package com.puyitou.fundmanager.fundCommon.service;

import java.util.List;

import com.puyitou.fundmanager.fundCommon.model.AgencyInfo;
import com.puyitou.fundmanager.fundCommon.model.SubAgencyInfo;

public interface AgencyService {

	List<AgencyInfo> listAgency();

	List<SubAgencyInfo> listSubAgency(String agencyId);

}
