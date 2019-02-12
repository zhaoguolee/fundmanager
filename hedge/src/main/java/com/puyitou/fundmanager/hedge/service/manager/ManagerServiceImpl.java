package com.puyitou.fundmanager.hedge.service.manager;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.puyitou.fundmanager.hedge.dto.ManagerDTO;
import com.puyitou.fundmanager.hedge.dto.ManagerQueryDTO;
import com.puyitou.fundmanager.hedge.dto.PageRequest;
import com.puyitou.fundmanager.hedge.event.manager.ManagerCreateEvent;
import com.puyitou.fundmanager.hedge.event.manager.ManagerDeleteEvent;
import com.puyitou.fundmanager.hedge.event.manager.ManagerUpdateEvent;
import com.puyitou.fundmanager.hedge.mapper.ManagerMapper;
import com.puyitou.fundmanager.hedge.model.manager.Manager;
import com.puyitou.fundmanager.hedge.model.manager.ManagerExample;
import com.puyitou.fundmanager.hedge.system.aspect.OperationLog;
import com.puyitou.fundmanager.hedge.system.event.EventDispatcher;

@Service
public class ManagerServiceImpl implements ManagerService {

	@Autowired
	private EventDispatcher eventDispatcher;
	
	@Autowired
	private ManagerMapper managerMapper;
	
	@Override
	@OperationLog(description = "增加管理人")
	@Transactional(rollbackFor = Exception.class)
	public int insert(ManagerDTO record) {
    	long now = System.currentTimeMillis();
		Manager manager = record.convert(null);
		manager.setId(UUID.randomUUID().toString());
		manager.setCreateTime(now);
		int result = managerMapper.insertSelective(manager);
		
		eventDispatcher.dispatch(new ManagerCreateEvent(manager));
		
		return result;
	}
	
	@Override
	@OperationLog(description = "删除管理人")
	@Transactional(rollbackFor = Exception.class)
	public int delete(String id) {
		long now = System.currentTimeMillis();
		Manager manager = managerMapper.selectByPrimaryKey(id);
		if (null == manager) {
			return 0;
		}
		manager.setDeleteTime(now);
		int result = managerMapper.updateByPrimaryKeySelective(manager);
		
		eventDispatcher.dispatch(new ManagerDeleteEvent(manager));
		
		return result;
	}
	
	@Override
	@OperationLog(description = "更新管理人")
	@Transactional(rollbackFor = Exception.class)
	public int updateById(String id, ManagerDTO record) {
    	long now = System.currentTimeMillis();
    	Manager manager = managerMapper.selectByPrimaryKey(id);
    	if (null == manager) {
    		return 0;
    	}
		Manager updateManager = record.convert(manager);
		updateManager.setUpdateTime(now);
		int result = managerMapper.updateByPrimaryKey(updateManager);
		
		eventDispatcher.dispatch(new ManagerUpdateEvent(manager, updateManager));
		
		return result;
	}
	
	@Override
	public Manager findById(String id) {
		return managerMapper.selectByPrimaryKey(id);
	}
	
	@Override
	public List<Manager> list(ManagerQueryDTO managerQueryDTO) {
		ManagerExample example = new ManagerExample();
		if (StringUtils.hasLength(managerQueryDTO.getManagerName())) {
			example.createCriteria().andNameLike("%" + managerQueryDTO.getManagerName() + "%");
		}
		return managerMapper.selectByExample(example);
	}
	
	@Override
	public PageInfo<Manager> page(ManagerQueryDTO managerQueryDTO, PageRequest pageRequest) {
		ManagerExample example = new ManagerExample();
		if (StringUtils.hasLength(managerQueryDTO.getManagerName())) {
			example.createCriteria().andNameLike("%" + managerQueryDTO.getManagerName() + "%");
		}
		PageHelper.startPage(pageRequest);
		List<Manager> result = managerMapper.selectByExample(example);
		return PageInfo.of(result);
	}
	
}
