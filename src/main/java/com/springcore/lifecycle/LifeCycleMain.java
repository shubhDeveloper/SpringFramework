package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleMain {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/lifecycle/lifecycleConfig.xml");
//		Burger bean = (Burger) context.getBean("burger");
//		System.out.println(bean);
		// registering shutdown hook
//		context.registerShutdownHook();
		
//		-------------------------------------------------------------
		
		//Using interface
//		Sandwich_inter sandwich_inter = (Sandwich_inter) context.getBean("sandwich");
//		System.out.println(sandwich_inter);
//		context.registerShutdownHook();
		
//		-------------------------------------------------------------
		
//		Using Annotation
		Pepsi_Annota bean = (Pepsi_Annota) context.getBean("pepsi");
		
		System.out.println(bean);
		context.registerShutdownHook();
	}

}
