package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class EmployeeBean {

	String empName;

	List<String> empPhones;
	Set<String> empAddress;
	Map<String, String> empCource;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public List<String> getEmpPhones() {
		return empPhones;
	}

	public void setEmpPhones(List<String> empPhones) {
		this.empPhones = empPhones;
	}

	public Set<String> getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(Set<String> empAddress) {
		this.empAddress = empAddress;
	}

	public Map<String, String> getEmpCource() {
		return empCource;
	}

	public void setEmpCource(Map<String, String> empCource) {
		this.empCource = empCource;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empPhones=" + empPhones + ", empAddress=" + empAddress
				+ ", empCource=" + empCource + "]";
	}

	public EmployeeBean() {
		super();
		// TODO Auto-generated constructor stub
	}

}
