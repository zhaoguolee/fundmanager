package com.puyitou.fundmanager.hedge.service.product;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.puyitou.fundmanager.hedge.dto.PageRequest;
import com.puyitou.fundmanager.hedge.mapper.ProductMapper;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductMapper productMapper;

	
	/**
	 * 查询产品发行列表
	 */
	public PageInfo<Map<String, Object>> queryPageProductList(Map<String, Object> map,PageRequest pageRequest) throws Exception {
		
		PageHelper.startPage(pageRequest);		
		List<Map<String, Object>> productList = productMapper.queryPageProductList(map);
		for(Map<String, Object> promap : productList){
			
			String lockTime = promap.get("period_lock_up_time").toString();
			String lockType = promap.get("lockName").toString();
			String floatTime = promap.get("period_float_time").toString();
			String floatType = promap.get("floatName").toString();			
			String lockPeriod = lockTime+lockType; //锁定期
			String floatPeriod = floatTime+floatType; //浮动期
			
			String maxline = promap.get("maxBaseline").toString();
			String minline = promap.get("minBaseline").toString();
			String baseLine = minline +"~"+maxline; //业绩比较基准
			
			promap.put("lockPeriod", lockPeriod);
			promap.put("floatPeriod", floatPeriod);
			promap.put("baseLine", baseLine);
			
		}
			
		return PageInfo.of(productList);
	}

}
