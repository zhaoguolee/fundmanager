package com.puyitou.fundmanager.fundCommon.vo;

public class PageInfo {

	private Integer page = 1;
	
	private Integer size = 20;

	public static PageInfo of(Integer page, Integer size) {
		return new PageInfo(page, size);
	}
	
	private PageInfo() {
	}
	
	private PageInfo(Integer page, Integer size) {
		this.setPage(page);
		this.setSize(size);
	}
	
	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}
	
}
