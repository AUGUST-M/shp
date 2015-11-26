package com.shp.app.bean;

/**
 * APP接口的实体Bean的请求端的父类
 * Copyright (C) 2015 - 2020 SHP快易全栈应用开发平台
 */
public class BaseRequestBean {

	private String actionCode; // Key（唯一）

	public String getActionCode() {
		return actionCode;
	}

	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}

}
