package com.puyitou.fundmanager.hedge.service.product;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageInfo;
import com.puyitou.fundmanager.hedge.dto.PageRequest;

/**
 * 产品发行
 * @author zhangkaihua
 * 2018-11-07
 */

public interface ProductService {
	
	/**
	 * 查询产品发行列表
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public PageInfo<Map<String, Object>> queryPageProductList(Map<String,Object> map,PageRequest pageRequest) throws Exception;
	

}
