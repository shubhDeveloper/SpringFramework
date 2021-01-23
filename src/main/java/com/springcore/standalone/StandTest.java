package com.springcore.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StandTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/standConfig.xml");
		Person bean = context.getBean("friendsList", Person.class);
		Person bean1 = context.getBean("namesSet", Person.class);
		Person bean2 = context.getBean("courseMap1", Person.class);
		Person bean3 = context.getBean("props", Person.class);

		System.out.println(bean.getFriendsList().getClass()); // class name
		System.out.println(bean + "\n");

		System.out.println(bean1.getNamesSet().getClass()); // class name
		System.out.println(bean1 + "\n");

		System.out.println(bean2.getCourseMap().getClass()); // class name
		System.out.println(bean2 + "\n");

		System.out.println(bean3.getProperties().getClass()); // class name
		System.out.println(bean3);
	}

}
