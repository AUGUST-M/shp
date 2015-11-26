package com.shp.service.sys;

import java.util.List;

import com.shp.model.sys.Attachment;

import core.service.Service;

/**
 * 附件的业务逻辑层的接口
 * Copyright (C) 2015 - 2020 SHP快易全栈应用开发平台
 */
public interface AttachmentService extends Service<Attachment> {

	List<Object[]> queryFlowerList(String epcId);

	void deleteAttachmentByForestryTypeId(Long umTypeId);

	List<Object[]> querySensorList();

}
