/**
 * 
 */
package com.puyitou.fundmanager.hedge.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.puyitou.fundmanager.hedge.dto.PageRequest;
import com.puyitou.fundmanager.hedge.service.product.ProductService;
import com.puyitou.fundmanager.hedge.system.response.RestResponseBody;

/**
 * 产品发行
 * @author zhangkaihua
 * 2018-11-7
 */ 

@RestController
@RequestMapping(path = "/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	
	/**
	 * 查询产品发行列表
	 * @param map
	 * @param pageRequest
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="productList",method = RequestMethod.POST)
	public RestResponseBody<?> queryProductList(@RequestParam Map<String, Object> map,PageRequest pageRequest) throws Exception{
		
		PageInfo<Map<String,Object>> productList = productService.queryPageProductList(map, pageRequest);
		
		return new RestResponseBody<>(RestResponseBody.SUCCESS, productList);
		
	}
	
	
	
}
