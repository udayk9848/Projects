package com.uday.Dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uday.Student;



@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addStudent(Student s) {
		Session session = this.sessionFactory.getCurrentSession();
        session.save(s);
		// TODO Auto-generated method stub
		
	}

	
	public List<Student> listStudent() {
		return sessionFactory.getCurrentSession().createQuery("from Student").list();
	}


	
	public void removeStudent(Integer id) {
		// TODO Auto-generated method stub
		Student student = (Student) sessionFactory.getCurrentSession().load(Student.class, id);
		if (null != student) {
			sessionFactory.getCurrentSession().delete(student);
		}
		
	}


	
	public Student getStudent(Integer id) {
		Student student = (Student) sessionFactory.getCurrentSession().load(Student.class, id);
		return student;
	}


	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(student);
		
	}

}
