package com.springcore;

public class EmployeeBean {
	int empId;
	String empName;
	String empCompany;
	String empCity;
	String empState;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpCompany() {
		return empCompany;
	}

	public void setEmpCompany(String empCompany) {
		this.empCompany = empCompany;
	}

	public String getEmpCity() {
		return empCity;
	}

	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}

	public String getEmpState() {
		return empState;
	}

	public void setEmpState(String empState) {
		this.empState = empState;
	}

	public EmployeeBean(int empId, String empName, String empCompany, String empCity, String empState) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empCompany = empCompany;
		this.empCity = empCity;
		this.empState = empState;
	}

	public EmployeeBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "EmployeeBean [empId=" + empId + ", empName=" + empName + ", empCompany=" + empCompany + ", empCity="
				+ empCity + ", empState=" + empState + "]";
	}

}
