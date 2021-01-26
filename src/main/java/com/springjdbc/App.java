package com.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mysql.cj.x.protobuf.MysqlxCrud.Delete;
import com.mysql.cj.x.protobuf.MysqlxCrud.Insert;
import com.springjdbc.dao.StudentDaoImpl;
import com.springjdbc.entity.Student;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springjdbc/jdbcConfig.xml");
		StudentDaoImpl studentDao = context.getBean("studentDaoImpl", StudentDaoImpl.class);

//**********Insert data*************	  
		/*
		
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
		
		*/
		
//**********Update Data*************
		/*

        //Create Student object for update values
		Student std = new Student();
		std.setStdId(123);
		std.setStdName("harry mishra");
		std.setStdCity("bangluru");
		std.setStdRoll(11223344);
		
		//Update
		int change = studentDao.change(std);
		//See data Update or not
		System.out.println(change);
		
		*/
		
//**********Delete Data*************
		
		int delete = studentDao.delete(123);
		System.out.println(delete+" row deleted");
		
	}
}
