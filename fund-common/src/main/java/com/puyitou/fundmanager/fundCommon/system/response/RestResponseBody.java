package com.puyitou.fundmanager.fundCommon.system.response;

public class RestResponseBody<T extends Object> {

	public static final int SUCCESS = 1;
	
	public static final int ERROR = 0;
	
	private String code;
	
	private String message;
	
	private int status;
	
	private T data;

	public RestResponseBody(int status) {
		this.status = status;
	}

	public RestResponseBody(int status, T data) {
		this.status = status;
		this.data = data;
	}
	
	public String getCode() {
		return code;
	}

	public T getData() {
		return data;
	}

	public String getMessage() {
		return message;
	}

	public int getStatus() {
		return status;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setData(T data) {
		this.data = data;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
}
