package com.lucas.cursomc.resources.exception;

import java.io.Serializable;

public class StandardError implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private Integer status;
	private String msg;
	private Long timeStamp;
	
	public StandardError(Integer status, String msg, Long timeStampo) {
		super();
		this.status = status;
		this.msg = msg;
		this.timeStamp = timeStampo;
	}
	
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Long getTimeStampo() {
		return timeStamp;
	}
	public void setTimeStampo(Long timeStampo) {
		this.timeStamp = timeStampo;
	}
}
