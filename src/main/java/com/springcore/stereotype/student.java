package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("object") //change bean name
//@Component          //bean name is camel case of Student class 
public class student {
	
	@Value("Rahul")
	private String stdName;
	
	@Value("Shujalpur")
	private String stdCity;
	
	@Value("#{temp}")
	private List<String> cities;
	
	public List<String> getCities() {
		return cities;
	}
	public void setCities(List<String> cities) {
		this.cities = cities;
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
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "student [stdName=" + stdName + ", stdCity=" + stdCity + ", cities=" + cities + "]";
	}
	
	

}
