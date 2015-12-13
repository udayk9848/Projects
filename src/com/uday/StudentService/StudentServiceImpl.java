package com.uday.StudentService;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uday.Student;
import com.uday.Dao.StudentDao;


@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
	@Transactional
	public void addStudent(Student s) {
		// TODO Auto-generated method stub
		System.out.println("in service impl");
		studentDao.addStudent(s);
	}
	@Transactional
	public List<Student> listStudent() {
		
		return studentDao.listStudent();
	}
	@Transactional
	public void removeStudent(Integer id) {
		// TODO Auto-generated method stub
		studentDao.removeStudent(id);
	}
	@Transactional
	public Student getStudent(Integer id) {
		// TODO Auto-generated method stub
		
		return studentDao.getStudent(id);
	}
	@Transactional
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		studentDao.updateStudent(student);
	}

}
