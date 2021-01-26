package com.springjdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.entity.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
//Insert data into table
	public int insert(Student stdStudent) {

		String query = "insert into student(stdId,stdName,stdCity,stdRoll) values(?,?,?,?)";
		int update = jdbcTemplate.update(query, stdStudent.getStdId(), stdStudent.getStdName(), stdStudent.getStdCity(),
				stdStudent.getStdRoll());

		return update;
	}
	
//Updata data through id
	public int change(Student stdStudent) {

		String query = "update student set stdName=? ,stdCity=? ,stdRoll=? where stdId=?";
		int update = jdbcTemplate.update(query, stdStudent.getStdName(), stdStudent.getStdCity(),
				stdStudent.getStdRoll(), stdStudent.getStdId());

		return update;
	}

//Delete Data through id
	public int delete(int studentId) {
		String query = "delete from student where stdId=?";
		int delete = jdbcTemplate.update(query,studentId);
		return delete;
	}

}
