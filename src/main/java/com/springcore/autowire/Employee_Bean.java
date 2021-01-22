package com.springcore.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee_Bean {

	@Autowired
	private Address_Bean address;

	public Address_Bean getAddress() {
		return address;
	}

	public void setAddress(Address_Bean address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee_Bean [address=" + address + "]";
	}

	public Employee_Bean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee_Bean(Address_Bean address) {
		super();
		System.out.println("inside constructor");
		this.address = address;
	}

}
