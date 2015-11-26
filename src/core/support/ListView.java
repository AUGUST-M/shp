package core.support;

import java.util.List;

/**
 * Copyright (C) 2015 - 2020 SHP快易全栈应用开发平台
 */
public class ListView<E> {

	private Long totalRecord;
	private List<E> data;

	public Long getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(Long totalRecord) {
		this.totalRecord = totalRecord;
	}

	public List<E> getData() {
		return data;
	}

	public void setData(List<E> data) {
		this.data = data;
	}

}
