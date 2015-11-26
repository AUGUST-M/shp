package com.shp.dao.sys.impl;

import org.springframework.stereotype.Repository;

import com.shp.dao.sys.DepartmentDao;
import com.shp.model.sys.Department;

import core.dao.BaseDao;

/**
 * 部门的数据持久层的实现类
 * Copyright (C) 2015 - 2020 SHP快易全栈应用开发平台
 */
@Repository
public class DepartmentDaoImpl extends BaseDao<Department> implements DepartmentDao {

	public DepartmentDaoImpl() {
		super(Department.class);
	}

}
