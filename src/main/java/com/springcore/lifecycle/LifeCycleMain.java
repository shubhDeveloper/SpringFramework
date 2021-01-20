package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleMain {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/lifecycle/lifecycleConfig.xml");
		Burger bean = (Burger) context.getBean("burger");

		System.out.println(bean);
		// registering shutdown hook
		context.registerShutdownHook();

	}

}
