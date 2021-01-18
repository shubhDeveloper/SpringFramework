package com.springcore.ci;

public class School {

	private int id;
	private String scName;
	private String scCity;
	private StateBean st;

	public School(int id, String scName, String scCity, StateBean st) {
		super();
		this.id = id;
		this.scName = scName;
		this.scCity = scCity;
		this.st = st;
	}

	@Override
	public String toString() {
		return "School [id=" + id + ", scName=" + scName + ", scCity=" + scCity + ", st=" + st + "]";
	}

}
