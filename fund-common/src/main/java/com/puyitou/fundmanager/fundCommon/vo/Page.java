package com.puyitou.fundmanager.fundCommon.vo;

import java.util.ArrayList;
import java.util.List;

public class Page<T> {

	private long total = 0;
	
	private List<T> rows = new ArrayList<>();;

	public static <T> Page<T> empty() {
		return new Page<T>();
	}
	
	public static <T> Page<T> of(List<T> rows, long total) {
		return new Page<T>(rows, total);
	}
	
	private Page() {
	}
	
	private Page(List<T> rows, long total) {
		this.setTotal(total);
		this.getRows().addAll(rows);
	}
	
	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	
}
