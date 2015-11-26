package com.shp.service.sys;

import java.util.List;

import com.shp.model.sys.Department;

import core.service.Service;

/**
 * 部门的业务逻辑层的接口
 * Copyright (C) 2015 - 2020 SHP快易全栈应用开发平台
 */
public interface DepartmentService extends Service<Department> {

	// 获取包含部门中文名称的列表
	List<Department> queryDepartmentCnList(List<Department> resultList);

}
