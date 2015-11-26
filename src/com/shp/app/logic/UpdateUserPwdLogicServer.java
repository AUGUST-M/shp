package com.shp.app.logic;

import org.springframework.web.context.WebApplicationContext;

import com.shp.app.bean.UpdateUserPwdRequestBean;
import com.shp.app.bean.UpdateUserPwdResponseBean;
import com.shp.service.sys.SysUserService;

/**
 * APP接口的业务处理逻辑封装接口的实现类（根据用户名更改密码）
 * Copyright (C) 2015 - 2020 SHP快易全栈应用开发平台
 */
public class UpdateUserPwdLogicServer implements ILogicFace<UpdateUserPwdRequestBean, UpdateUserPwdResponseBean> {

	public UpdateUserPwdResponseBean logic(WebApplicationContext wac, UpdateUserPwdRequestBean brb) {
		SysUserService userService = (SysUserService) wac.getBean("sysUserServiceImpl");
		UpdateUserPwdResponseBean updateUserResponseBean = new UpdateUserPwdResponseBean();
		updateUserResponseBean.setResult(userService.updateSysUser(brb));
		return updateUserResponseBean;
	}

}
