package com.springcore.autowire;

public class Address_Bean {

	String street;
	String city;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Address_Bean() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Address_Bean [street=" + street + ", city=" + city + "]";
	}

}
