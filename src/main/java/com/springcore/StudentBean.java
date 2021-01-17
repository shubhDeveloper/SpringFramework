package com.springcore;

public class StudentBean {
	
	int id;
	String name;
	String city;
	String standerd;
	String state;
	
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStanderd() {
		return standerd;
	}
	public void setStanderd(String standerd) {
		this.standerd = standerd;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public StudentBean(int id, String name, String city, String standerd, String state) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.standerd = standerd;
		this.state = state;
	}
	
	
	
	public StudentBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", standerd=" + standerd + ", state=" + state
				+ "]";
	}
	
	
	

}
