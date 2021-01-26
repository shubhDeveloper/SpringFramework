package com.springjdbc.dao;

import com.springjdbc.entity.Student;

public interface StudentDao {
	
	//insert
	public int insert(Student stdStudent);
    
	//update
	public int change(Student stdStudent);

	//delete
	public int delete(int studentId);
}
