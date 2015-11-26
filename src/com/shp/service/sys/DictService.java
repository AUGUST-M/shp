package com.shp.service.sys;

import java.util.List;

import com.shp.model.sys.Dict;

import core.service.Service;

/**
 * 字典的业务逻辑层的接口
 * Copyright (C) 2015 - 2020 SHP快易全栈应用开发平台
 */
public interface DictService extends Service<Dict> {

	List<Dict> queryDictWithSubList(List<Dict> resultList);

}
