package com.springcore.ci;

public class StateBean {

	private String state;
	private String country;

	public StateBean(String state, String country) {
		super();
		this.state = state;
		this.country = country;
	}

	@Override
	public String toString() {
		return "StateBean [state=" + state + ", country=" + country + "]";
	}

}
