package com.puyitou.fundmanager.hedge.dto;

import com.github.pagehelper.IPage;

public class PageRequest implements IPage {

	private Integer pageNum = 1;
	
	private Integer pageSize = 20;
	
	private String orderBy;
	
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	@Override
	public Integer getPageNum() {
		return pageNum;
	}

	@Override
	public Integer getPageSize() {
		return pageSize;
	}

	@Override
	public String getOrderBy() {
		return orderBy;
	}
	
}
