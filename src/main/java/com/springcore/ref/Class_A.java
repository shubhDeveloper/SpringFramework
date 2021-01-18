package com.springcore.ref;

public class Class_A {

	private int id;
	private Class_B b;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Class_B getB() {
		return b;
	}

	public void setB(Class_B b) {
		this.b = b;
	}

	public Class_A() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Class_A [id=" + id + ", b=" + b + "]";
	}

}
