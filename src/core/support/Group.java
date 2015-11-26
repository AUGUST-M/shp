package core.support;

import java.util.Map;

/**
 * Copyright (C) 2015 - 2020 SHP快易全栈应用开发平台
 */
public class Group {

	private String name;
	private Map<String, Item> items;

	public Group(String name, Map<String, Item> items) {
		super();
		this.name = name;
		this.items = items;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, Item> getItems() {
		return items;
	}

	public void setItems(Map<String, Item> items) {
		this.items = items;
	}

}
