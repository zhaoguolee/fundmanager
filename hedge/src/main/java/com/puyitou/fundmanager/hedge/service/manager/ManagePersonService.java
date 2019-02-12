package com.puyitou.fundmanager.hedge.service.manager;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageInfo;
import com.puyitou.fundmanager.hedge.dto.PageRequest;

/** 私募2.0
 * @author zby
 * @Description: TODO
 * @date: 2018年11月2日 上午10:18:05
 */
public interface ManagePersonService {

	public PageInfo<Map<String, Object>> managePersonList(Map<String, Object> paramMap,PageRequest pageRequest);
	
	public Map<String,Object> queryById(Map<String, Object> paramMap);
	
	public List<Map<String,Object>> queryAttachmentById(Map<String, Object> paramMap);
	
}
