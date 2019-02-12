package com.puyitou.fundmanager.hedge.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.puyitou.fundmanager.hedge.dto.PageRequest;
import com.puyitou.fundmanager.hedge.service.manager.ManagePersonService;
import com.puyitou.fundmanager.hedge.system.exception.ApplicationException;
import com.puyitou.fundmanager.hedge.system.response.RestResponseBody;
/** 私募2.0
 * @author zby
 * @Description: TODO
 * @date: 2018年11月2日 上午15:04:05
 */

@RestController
@RequestMapping(path = "/managePerson")
public class ManagePersonController {
	@Autowired
	private ManagePersonService managePersonService;
	
	//按管理人ID查询管理人详情
	@RequestMapping(value = "/queryById", method = RequestMethod.POST)
	public RestResponseBody<?> queryById(@RequestBody Map<String,Object> paramMap){
		 Map<String, Object> returnMap=new HashMap<>();
		if(paramMap.get("id")==null||"".equals(paramMap.get("id"))){
			throw new ApplicationException("管理人ID不能为空");
		}
		returnMap=managePersonService.queryById(paramMap);
		if(returnMap==null){
			throw new ApplicationException("管理人不存在");
		}
		return new RestResponseBody<>(RestResponseBody.SUCCESS, returnMap);
		
	}
	
	//按管理人ID查询附件详情
	@RequestMapping(value = "/queryFileStorageById", method = RequestMethod.POST)
	public RestResponseBody<?> queryAttachmentById(@RequestBody Map<String,Object> paramMap){
		 List<Map<String, Object>> returnList=new ArrayList<>();
		if(paramMap.get("id")==null||"".equals(paramMap.get("id"))){
			throw new ApplicationException("管理人ID不能为空");
		}
		returnList=managePersonService.queryAttachmentById(paramMap);
		if(returnList==null){
			throw new ApplicationException("没有可查看的附件");
		}
		return new RestResponseBody<>(RestResponseBody.SUCCESS, returnList);
		
	}
	
	//(按姓名)模糊查询管理人列表
	@RequestMapping(value = "/managePersonList", method = RequestMethod.POST)
	public RestResponseBody<?> managePersonList(@RequestBody(required = false) Map<String,Object> paramMap, PageRequest pageRequest){
		if (null == paramMap) {
			paramMap = new HashMap<>();
		}
		PageInfo<Map<String,Object>> pageInfo =managePersonService.managePersonList(paramMap, pageRequest);
		
		if(pageInfo==null){
			throw new ApplicationException("管理人列表为空");
		}
		return new RestResponseBody<>(RestResponseBody.SUCCESS, pageInfo);
		
	}
	
}
