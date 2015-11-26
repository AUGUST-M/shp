package com.shp.dao.sys;

import com.shp.model.sys.SysUser;

import core.dao.Dao;

/**
 * 用户的数据持久层的接口
 * Copyright (C) 2015 - 2020 SHP快易全栈应用开发平台
 */
public interface SysUserDao extends Dao<SysUser> {

	String getRoleValueBySysUserId(Long sysUserId);

}
