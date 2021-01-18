package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/refConfig.xml");
        Class_A bean = (Class_A) context.getBean("aref");
        
        System.out.println(bean);
	}

}
