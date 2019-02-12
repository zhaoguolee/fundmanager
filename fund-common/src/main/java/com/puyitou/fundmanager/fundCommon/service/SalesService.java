package com.puyitou.fundmanager.fundCommon.service;

import java.util.List;

import com.puyitou.fundmanager.fundCommon.model.Sales;
import com.puyitou.fundmanager.fundCommon.model.Signatory;

public interface SalesService {

	Sales findByIdCard(String salesIdCard);

	List<Signatory> listSignatory(String agencyId);

}
