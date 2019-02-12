package com.puyitou.fundmanager.hedge.service.manager;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.puyitou.fundmanager.hedge.dto.ManagerDTO;
import com.puyitou.fundmanager.hedge.dto.ManagerQueryDTO;
import com.puyitou.fundmanager.hedge.dto.PageRequest;
import com.puyitou.fundmanager.hedge.model.manager.Manager;

public interface ManagerService {

	int insert(ManagerDTO record);

	int delete(String id);
	
	int updateById(String id, ManagerDTO record);

	Manager findById(String id);

	List<Manager> list(ManagerQueryDTO managerQueryDTO);

	PageInfo<Manager> page(ManagerQueryDTO managerQueryDTO, PageRequest pageInfo);

}
