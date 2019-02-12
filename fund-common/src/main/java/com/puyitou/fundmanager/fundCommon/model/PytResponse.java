package com.puyitou.fundmanager.fundCommon.model;

public class PytResponse<T> {

	private String code;
	
	private T data;
	
	private String msg;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "PytResponse [code=" + code + ", data=" + data + ", msg=" + msg + "]";
	}
	
}
