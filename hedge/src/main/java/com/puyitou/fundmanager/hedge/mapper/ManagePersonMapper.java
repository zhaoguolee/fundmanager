package com.puyitou.fundmanager.hedge.mapper;

import java.util.List;
import java.util.Map;

public interface ManagePersonMapper {
	
public List<Map<String,Object>> selectListByName(Map<String,Object> paramMap);

public Map<String,Object> selectInfoById(Map<String,Object> paramMap);

public List<Map<String,Object>> selectAttachmentInfoById(Map<String,Object> paramMap);

}
