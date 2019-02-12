package com.puyitou.fundmanager.hedge.service.manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.puyitou.fundmanager.hedge.dto.PageRequest;
import com.puyitou.fundmanager.hedge.mapper.ManagePersonMapper;
import com.puyitou.fundmanager.hedge.system.aspect.OperationLog;
import com.puyitou.fundmanager.hedge.system.event.EventDispatcher;

@Service
public class ManagePersonServiceImpl implements ManagePersonService {
	
	@Autowired
	private EventDispatcher eventDispatcher;
	
	@Autowired
	private ManagePersonMapper managePersonMapper;
	
	@Override
	@OperationLog(description = "查询管理人列表")
	@Transactional(rollbackFor = Exception.class)
	public PageInfo<Map<String, Object>> managePersonList(Map<String, Object> paramMap,PageRequest pageRequest) {
		
		PageHelper.startPage(pageRequest);
		List<Map<String, Object>> returnList=managePersonMapper.selectListByName(paramMap);
		return PageInfo.of(returnList) ;
	}

	
	
	@Override
	@OperationLog(description = "按管理人ID查询管理人详情")
	@Transactional(rollbackFor = Exception.class)
	public Map<String, Object> queryById(Map<String, Object> paramMap) {
		Map<String, Object> returnMap=new HashMap<>();
		if(paramMap.get("id")!=null && !"".equals(paramMap.get("id"))){
			returnMap=managePersonMapper.selectInfoById(paramMap);
		}
		
		return returnMap;
	}



	@Override
	@OperationLog(description = "按管理人ID查询附件详情")
	@Transactional(rollbackFor = Exception.class)
	public List<Map<String,Object>> queryAttachmentById(Map<String, Object> paramMap) {
		List<Map<String,Object>> returnList=new ArrayList<>();
		if(paramMap.get("id")!=null && !"".equals(paramMap.get("id"))){
			returnList=managePersonMapper.selectAttachmentInfoById(paramMap);
		}
		
		return returnList;
		
	}

}
