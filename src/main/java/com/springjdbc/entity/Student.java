package com.springjdbc.entity;

public class Student {

	private int stdId;
	private String stdName;
	private String stdCity;
	private int stdRoll;

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getStdCity() {
		return stdCity;
	}

	public void setStdCity(String stdCity) {
		this.stdCity = stdCity;
	}

	public int getStdRoll() {
		return stdRoll;
	}

	public void setStdRoll(int stdRoll) {
		this.stdRoll = stdRoll;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdCity=" + stdCity + ", stdRoll=" + stdRoll
				+ "]";
	}

}
