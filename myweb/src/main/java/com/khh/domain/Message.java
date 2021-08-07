package com.khh.domain;

import java.io.Serializable;

//JavaBean 空參數建構子 封裝Attribute/setter and getter
//配合CDI(Component Dependency Injection)注入依賴物件
public class Message implements Serializable{
	//Attribute
	private String msg;
	private String status;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getStatus() { 
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}