package com.springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.entity.Student;

public class RowMapperImpl implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student std = new Student();
		std.setStdId(rs.getInt(1));
		std.setStdName(rs.getString(2));
		std.setStdCity(rs.getString(3));
		std.setStdRoll(rs.getInt(4));
		return std;
	}

	
	
}
