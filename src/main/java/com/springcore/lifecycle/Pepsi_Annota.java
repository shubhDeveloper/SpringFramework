package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Pepsi_Annota {

	int pepPrice;
	String pepBrand;

	public int getPepPrice() {
		return pepPrice;
	}

	public void setPepPrice(int pepPrice) {
		this.pepPrice = pepPrice;
	}

	public String getPepBrand() {
		return pepBrand;
	}

	public void setPepBrand(String pepBrand) {
		this.pepBrand = pepBrand;
	}

	public Pepsi_Annota() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi_Annota [pepPrice=" + pepPrice + ", pepBrand=" + pepBrand + "]";
	}
	
	@PostConstruct
	void init() {
    	System.out.println("inside init");
	}
    
	@PreDestroy
	void destroy() {
		System.out.println("inside destroy");
	}
}
