package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static <List_Set_Map_Bean> void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/Config.xml");
		EmployeeBean employee = (EmployeeBean)context.getBean("employee1");
		StudentBean student = (StudentBean)context.getBean("student1");
               
		System.out.println(employee);
		System.out.println(student);
	}

}
