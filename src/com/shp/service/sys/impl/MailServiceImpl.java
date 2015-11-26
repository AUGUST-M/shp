package com.shp.service.sys.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shp.dao.sys.MailDao;
import com.shp.model.sys.Mail;
import com.shp.service.sys.MailService;

import core.service.BaseService;

/**
 * 邮件的业务逻辑层的实现
 * Copyright (C) 2015 - 2020 SHP快易全栈应用开发平台
 */
@Service
public class MailServiceImpl extends BaseService<Mail> implements MailService {

	private MailDao mailDao;

	@Resource
	public void setMailDao(MailDao mailDao) {
		this.mailDao = mailDao;
		this.dao = mailDao;
	}

}
