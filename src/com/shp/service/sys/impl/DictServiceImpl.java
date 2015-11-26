package com.shp.service.sys.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shp.dao.sys.DictDao;
import com.shp.model.sys.Dict;
import com.shp.service.sys.DictService;

import core.service.BaseService;

/**
 * 字典的业务逻辑层的实现
 * Copyright (C) 2015 - 2020 SHP快易全栈应用开发平台
 */
@Service
public class DictServiceImpl extends BaseService<Dict> implements DictService {

	private DictDao dictDao;

	@Resource
	public void setDictDao(DictDao dictDao) {
		this.dictDao = dictDao;
		this.dao = dictDao;
	}

	public List<Dict> queryDictWithSubList(List<Dict> resultList) {
		List<Dict> dictList = new ArrayList<Dict>();
		for (Dict entity : resultList) {
			Dict dict = new Dict();
			dict.setId(entity.getId());
			dict.setDictKey(entity.getDictKey());
			dict.setDictValue(entity.getDictValue());
			dict.setSequence(entity.getSequence());
			dict.setParentDictkey(entity.getParentDictkey());
			dictList.add(dict);
		}
		return dictList;
	}

}
