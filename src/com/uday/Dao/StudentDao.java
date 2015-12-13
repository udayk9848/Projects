package com.uday.Dao;

import java.util.List;

import com.uday.Student;

public interface StudentDao {
	 public void addStudent(Student s);
	public List<Student> listStudent();
	public void removeStudent(Integer id);
	public Student getStudent(Integer id);
	public void updateStudent(Student student);
}
