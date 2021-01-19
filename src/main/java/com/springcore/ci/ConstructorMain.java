package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ci/ciConfig.xml");
		School bean = (School) context.getBean("school1");
	    Addition bean2 = (Addition) context.getBean("add");
		
	    bean2.sum();
		System.out.println(bean);

	}

}
