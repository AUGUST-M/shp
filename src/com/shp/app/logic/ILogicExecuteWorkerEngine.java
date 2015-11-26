package com.shp.app.logic;

import java.util.Map;

import com.shp.app.bean.BaseRequestBean;

/**
 * APP接口的业务逻辑执行引擎接口
 * Copyright (C) 2015 - 2020 SHP快易全栈应用开发平台
 */
public interface ILogicExecuteWorkerEngine {

	/**
	 * 根据actionCode获取对应的ILogicFace对象
	 * @param actionCode
	 * @return ILogicFace
	 */
	public ILogicFace getILogicFaceByActionCode(String actionCode);

	/**
	 * 设置LogicPool
	 * @param logicPool
	 */
	public void setLogicPool(Map<String, ILogicFace> logicPool);

	/**
	 * 设置RequestBean信息解析配置
	 * @param classMap
	 */
	public void setRequestBeanTrans(Map<String, String> classMap);

	/**
	 * 根据JSON解析出BaseRequestBean
	 * @param json
	 * @return BaseRequestBean
	 */
	public BaseRequestBean trans(String json);

}
