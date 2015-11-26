package com.shp.app.logic;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shp.app.bean.BaseResponseBean;

/**
 * APP接口的协议传输接口
 * Copyright (C) 2015 - 2020 SHP快易全栈应用开发平台
 */
public interface ITransmission {

	public String resv(HttpServletRequest request);

	public void resp(HttpServletResponse response, BaseResponseBean brb);

}
