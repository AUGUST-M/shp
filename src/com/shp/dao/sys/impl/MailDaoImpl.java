package com.shp.dao.sys.impl;

import org.springframework.stereotype.Repository;

import com.shp.dao.sys.MailDao;
import com.shp.model.sys.Mail;

import core.dao.BaseDao;

/**
 * 邮件的数据持久层的实现类
 * Copyright (C) 2015 - 2020 SHP快易全栈应用开发平台
 */
@Repository
public class MailDaoImpl extends BaseDao<Mail> implements MailDao {

	public MailDaoImpl() {
		super(Mail.class);
	}

}
