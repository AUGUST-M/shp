package core.support;

import java.util.List;

/**
 * Copyright (C) 2015 - 2020 SHP快易全栈应用开发平台
 */
public class QueryResult<E> {

	private List<E> resultList;
	private Long totalCount;

	public List<E> getResultList() {
		return resultList;
	}

	public void setResultList(List<E> resultList) {
		this.resultList = resultList;
	}

	public Long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

}
