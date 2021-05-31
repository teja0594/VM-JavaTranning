package com.vm.tranning.java.IO.serialization;

import java.io.Serializable;

public class AEmployee implements Serializable {

	private static final long serialVersionUID = 1L;
	transient private int id;
	private String name;
	public AEmployee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "AEmployee [id=" + id + ", name=" + name + "]";
	}
	
}
