package com.shp.service.sys.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shp.dao.sys.RoleAuthorityDao;
import com.shp.model.sys.RoleAuthority;
import com.shp.service.sys.RoleAuthorityService;

import core.service.BaseService;

/**
 * 角色权限的业务逻辑层的实现
 * Copyright (C) 2015 - 2020 SHP快易全栈应用开发平台
 */
@Service
public class RoleAuthorityServiceImpl extends BaseService<RoleAuthority> implements RoleAuthorityService {

	private RoleAuthorityDao roleAuthorityDao;

	@Resource
	public void setRoleAuthorityDao(RoleAuthorityDao roleAuthorityDao) {
		this.roleAuthorityDao = roleAuthorityDao;
		this.dao = roleAuthorityDao;
	}

}
