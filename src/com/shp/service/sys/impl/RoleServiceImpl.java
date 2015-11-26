package com.shp.service.sys.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shp.dao.sys.RoleDao;
import com.shp.model.sys.Role;
import com.shp.service.sys.RoleService;

import core.service.BaseService;

/**
 * 角色的业务逻辑层的实现
 * Copyright (C) 2015 - 2020 SHP快易全栈应用开发平台
 */
@Service
public class RoleServiceImpl extends BaseService<Role> implements RoleService {

	private RoleDao roleDao;

	@Resource
	public void setRoleDao(RoleDao roleDao) {
		this.roleDao = roleDao;
		this.dao = roleDao;
	}

	public void deleteSysUserAndRoleByRoleId(Long roleId) {
		roleDao.deleteSysUserAndRoleByRoleId(roleId);
	}

}
