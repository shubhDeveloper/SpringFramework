package com.springcore.lifecycle;

public class Burger {

	private int burgerP;
	private String burgerBrand;

	public Burger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getBurgerP() {
		return burgerP;
	}

	public void setBurgerP(int burgerP) {
		this.burgerP = burgerP;
	}

	public String getBurgerBrand() {
		return burgerBrand;
	}

	public void setBurgerBrand(String burgerBrand) {
		this.burgerBrand = burgerBrand;
	}

	@Override
	public String toString() {
		return "Burger [burgerP=" + burgerP + ", burgerBrand=" + burgerBrand + "]";
	}

	void init() {
		System.out.println("This is init method");
	}

	void destroy() {
		System.out.println("this is destroy method");
	}

}
