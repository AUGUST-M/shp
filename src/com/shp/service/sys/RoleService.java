package com.shp.service.sys;

import com.shp.model.sys.Role;

import core.service.Service;

/**
 * 角色的业务逻辑层的接口
 * Copyright (C) 2015 - 2020 SHP快易全栈应用开发平台
 */
public interface RoleService extends Service<Role> {

	// 删除角色
	void deleteSysUserAndRoleByRoleId(Long roleId);

}
