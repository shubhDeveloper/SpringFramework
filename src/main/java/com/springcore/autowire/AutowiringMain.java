package com.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire/autowireConfig.xml");
        Employee_Bean bean = context.getBean("emp4",Employee_Bean.class);
        
        System.out.println(bean);
	}

}
