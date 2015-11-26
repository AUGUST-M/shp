package com.shp.model.sys.param;

import core.support.ExtJSBaseParameter;

/**
 * 信息发布的参数类
 * Copyright (C) 2015 - 2020 SHP快易全栈应用开发平台
 */
public class InformationParameter extends ExtJSBaseParameter {

	private String $like_title;
	private String contentNoHTML;

	public String get$like_title() {
		return $like_title;
	}

	public void set$like_title(String $like_title) {
		this.$like_title = $like_title;
	}

	public String getContentNoHTML() {
		return contentNoHTML;
	}

	public void setContentNoHTML(String contentNoHTML) {
		this.contentNoHTML = contentNoHTML;
	}

}
