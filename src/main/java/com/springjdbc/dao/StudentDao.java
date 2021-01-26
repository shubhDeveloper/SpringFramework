package com.springjdbc.dao;

import java.util.List;

import com.springjdbc.entity.Student;

public interface StudentDao {
	
	//insert
	public int insert(Student stdStudent);
    
	//update
	public int change(Student stdStudent);

	//delete
	public int delete(int studentId);
	
	//fetch data through id
	public Student getStudent(int studentId);
	
	//fetch all data in table
	public List<Student> getAllStudent();
}
