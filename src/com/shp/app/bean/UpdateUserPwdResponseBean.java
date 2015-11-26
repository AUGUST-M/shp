package com.shp.app.bean;

/**
 * APP接口的实体Bean的响应端（根据用户名更新密码）
 * Copyright (C) 2015 - 2020 SHP快易全栈应用开发平台
 */
public class UpdateUserPwdResponseBean extends BaseResponseBean {

	private String result; // 返回结果

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}
