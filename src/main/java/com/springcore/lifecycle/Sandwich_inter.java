package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Sandwich_inter implements InitializingBean,DisposableBean {
    
	private int sPrice;
	private String sBrand;
	public int getsPrice() {
		return sPrice;
	}
	public void setsPrice(int sPrice) {
		this.sPrice = sPrice;
	}
	public String getsBrand() {
		return sBrand;
	}
	public void setsBrand(String sBrand) {
		this.sBrand = sBrand;
	}
	@Override
	public String toString() {
		return "Sandwich_inter [sPrice=" + sPrice + ", sBrand=" + sBrand + "]";
	}
	public Sandwich_inter() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void afterPropertiesSet() throws Exception {
		//init
		System.out.println("inside init");
	}
	
	public void destroy() {
		//destroy
		System.out.println("inside destroy");
	}
}
