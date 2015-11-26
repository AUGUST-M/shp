package com.shp.model.sys.param;

import core.support.ExtJSBaseParameter;

/**
 * 邮件的参数类
 * Copyright (C) 2015 - 2020 SHP快易全栈应用开发平台
 */
public class MailParameter extends ExtJSBaseParameter {

	private String $like_subject;

	public String get$like_subject() {
		return $like_subject;
	}

	public void set$like_subject(String $like_subject) {
		this.$like_subject = $like_subject;
	}

}
