package com.shp.dao.sys.impl;

import org.springframework.stereotype.Repository;

import com.shp.dao.sys.AuthorityDao;
import com.shp.model.sys.Authority;

import core.dao.BaseDao;

/**
 * 菜单的数据持久层的实现类
 * Copyright (C) 2015 - 2020 SHP快易全栈应用开发平台
 */
@Repository
public class AuthorityDaoImpl extends BaseDao<Authority> implements AuthorityDao {

	public AuthorityDaoImpl() {
		super(Authority.class);
	}

}
