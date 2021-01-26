package com.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.springjdbc.dao.StudentDaoImpl;
import com.springjdbc.entity.Student;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springjdbc/jdbcConfig.xml");
		StudentDaoImpl studentDao = context.getBean("studentDaoImpl", StudentDaoImpl.class);

		// Create Student object for insert values
		Student std = new Student();
		std.setStdId(555);
		std.setStdName("mohan");
		std.setStdCity("kanpur");
		std.setStdRoll(112233);

		// insert
		int insert = studentDao.insert(std);

		// see record inserted or not
		System.out.println(insert + " record inserted");
	}
}
