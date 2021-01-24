package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoConfig.xml");
		
		student bean = context.getBean("object",student.class); //By default bean name is camel case of our bean name
	                                                             //but we can change see bean class student  	
  		System.out.println(bean);                
	}

}
