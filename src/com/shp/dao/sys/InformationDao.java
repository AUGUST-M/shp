package com.shp.dao.sys;

import java.util.List;

import com.shp.model.sys.Information;

import core.dao.Dao;

/**
 * 信息发布的数据持久层的接口
 * Copyright (C) 2015 - 2020 SHP快易全栈应用开发平台
 */
public interface InformationDao extends Dao<Information> {

	// 生成信息的索引
	void indexingInformation();

	// 全文检索信息
	List<Information> queryByInformationName(String name);

}
