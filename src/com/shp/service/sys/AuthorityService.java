package com.shp.service.sys;

import java.util.List;

import com.shp.model.sys.Authority;

import core.service.Service;

/**
 * 菜单的业务逻辑层的接口
 * Copyright (C) 2015 - 2020 SHP快易全栈应用开发平台
 */
public interface AuthorityService extends Service<Authority> {

	// 获取多级菜单
	List<Authority> queryAllMenuList(String globalRoleKey);

	// 获取按钮权限数据
	String getAuthorityButtonList(String menuCode);

	// 保存角色权限
	void saveAuthorityButtonList(String checkboxList, String menuCode);

}
