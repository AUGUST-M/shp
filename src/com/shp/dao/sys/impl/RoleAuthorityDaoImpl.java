package com.shp.dao.sys.impl;

import org.springframework.stereotype.Repository;

import com.shp.dao.sys.RoleAuthorityDao;
import com.shp.model.sys.RoleAuthority;

import core.dao.BaseDao;

/**
 * 角色权限的数据持久层的实现类
 * Copyright (C) 2015 - 2020 SHP快易全栈应用开发平台
 */
@Repository
public class RoleAuthorityDaoImpl extends BaseDao<RoleAuthority> implements RoleAuthorityDao {

	public RoleAuthorityDaoImpl() {
		super(RoleAuthority.class);
	}

}
