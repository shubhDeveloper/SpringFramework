package com.springjdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.entity.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	public int insert(Student stdStudent) {

		String query = "insert into student(stdId,stdName,stdCity,stdRoll) values(?,?,?,?)";
		int update = jdbcTemplate.update(query, stdStudent.getStdId(), stdStudent.getStdName(), stdStudent.getStdCity(),
				stdStudent.getStdRoll());

		return update;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
