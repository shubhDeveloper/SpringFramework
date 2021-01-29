package com.springorm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springorm.entity.Student;

public class StudentDao {

	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	// insert student data
	@Transactional
	public int insert(Student student) {

		Integer insert = (Integer) hibernateTemplate.save(student);
		return insert;
	}

	// get the single data
	public Student getStudent(int id) {
		Student student = hibernateTemplate.get(Student.class, id);
		return student;
	}

	// get all student data
	public List<Student> getAllStudents() {
		List<Student> loadAll = this.hibernateTemplate.loadAll(Student.class);
		return loadAll;
	}

	// delete student
	@Transactional
	public void deleteStudent(int id) {
		Student student = this.hibernateTemplate.get(Student.class, id);
		this.hibernateTemplate.delete(student);
	}

	// update student
	@Transactional
	public void update(Student std) {
		this.hibernateTemplate.update(std);
	}
}
