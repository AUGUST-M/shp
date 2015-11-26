package com.shp.dao.sys.impl;

import org.springframework.stereotype.Repository;

import com.shp.dao.sys.DictDao;
import com.shp.model.sys.Dict;

import core.dao.BaseDao;

/**
 * 字典的数据持久层的实现类
 * Copyright (C) 2015 - 2020 SHP快易全栈应用开发平台
 */
@Repository
public class DictDaoImpl extends BaseDao<Dict> implements DictDao {

	public DictDaoImpl() {
		super(Dict.class);
	}

}
