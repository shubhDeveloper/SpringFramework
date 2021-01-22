package com.springcore.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee_Bean {

	@Autowired
	@Qualifier("address1") //used to call a bean which we want
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
