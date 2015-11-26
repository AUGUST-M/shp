package com.shp.dao.sys;

import java.util.List;

import com.shp.model.sys.Attachment;

import core.dao.Dao;

/**
 * 附件的数据持久层的接口
 * Copyright (C) 2015 - 2020 SHP快易全栈应用开发平台
 */
public interface AttachmentDao extends Dao<Attachment> {

	List<Object[]> queryFlowerList(String epcId);

	void deleteAttachmentByForestryTypeId(Long umTypeId);

	List<Object[]> querySensorList();

}
