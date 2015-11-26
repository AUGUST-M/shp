package com.shp.core;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.shp.model.sys.SysUser;

import core.controller.ExtJSBaseController;
import core.support.ExtJSBaseParameter;

/**
 * Copyright (C) 2015 - 2020 SHP快易全栈应用开发平台
 */
public abstract class JavaEEFrameworkBaseController<E extends ExtJSBaseParameter> extends ExtJSBaseController<E> implements Constant {

	public SysUser getCurrentSysUser() {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		return (SysUser) request.getSession().getAttribute(SESSION_SYS_USER);
	}

}
