package com.springorm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.dao.StudentDao;
import com.springorm.entity.Student;

public class App {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springorm/ormConfig.xml");
		StudentDao bean = context.getBean("studentDao", StudentDao.class);
		
		//Create Studnet Object
		Student std = new Student();
		std.setId(123);
		std.setName("Shubham");
		std.setCity("indore");
		
		//insert student data
		int insert = bean.insert(std);
		System.out.println (insert);
	}
}
