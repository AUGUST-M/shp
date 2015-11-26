package com.shp.app.logic;

import org.springframework.web.context.WebApplicationContext;

/**
 * APP接口的业务处理逻辑封装接口
 * Copyright (C) 2015 - 2020 SHP快易全栈应用开发平台
 */
public interface ILogicFace<BaseRequestBean, BaseResponseBean> {

	public BaseResponseBean logic(WebApplicationContext wac, BaseRequestBean brb);

}
