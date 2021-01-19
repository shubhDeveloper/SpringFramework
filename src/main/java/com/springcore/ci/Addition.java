package com.springcore.ci;
//ambiguity problem
public class Addition {
	
	int a,b;
	
	public Addition(int a , int b) {
		System.out.println("This is int int constructor");
		this.a=a;
		this.b=b;
	}
	
	public Addition(double a,double b) {
		System.out.println("This is double double constructor");
		this.a = (int)a;
		this.b = (int)b;
	}
	
    public Addition(String a,String b) {
	    System.out.println("This is string string constructor");
	}	
	
    void sum()
    {
    	System.out.println("sum is = "+(this.a+this.b));
    }

}
