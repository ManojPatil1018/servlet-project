package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Student;

public class StudentDao {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("manoj");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();

	
	public Student saveStudent(Student student) {
		
		if (student!=null) {
			entityTransaction.begin();
			entityManager.persist(student);
			entityTransaction.commit();
		}
		return student;
	}
	
	public Student deleteStudentById(int id) {
		
		Student student=entityManager.find(Student.class,id);
		
		if(student!=null) {
			entityTransaction.begin();
			entityManager.remove(student);
			entityTransaction.commit();
			System.out.println(student.getName()+" Deleted Succesfully ");
		}else {
			System.out.println(" Student not found ");
		}
		return student;
	}
	
	public Student updateStudentEmailById(int id, String email) {
		Student student = entityManager.find(Student.class, email);
		if(student!=null) {
		student.setEmail(email);;
		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();
		System.out.println("Student Email Updated");
		}else {
			System.out.println("Student not found");
		}
		return student;
	}
	
	
	public Student updateStudentDobById(int id, String dob) {
		Student student = entityManager.find(Student.class, dob);
		if(student!=null) {
		student.setDob(dob);
		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();
		System.out.println("Student Email Updated");
		}else {
			System.out.println("Student not found");
		}
		return student;
	}
	
	
	public Student updateStudentNameById(int id, String name) {
		Student student = entityManager.find(Student.class, id);
		if(student!=null) {
		student.setName(name);
		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();
		System.out.println("Student Name Updated");
		}else {
			System.out.println("Student not found");
		}
		return student;
	}
	
	
	 public Student getStudentById(int id) {
			
		 Student student = entityManager.find(Student.class, id);
			return student;
		}
	    

		
	    public 	List<Student> getAllStudent() {
			
			
			String sql = "Select s FROM Student s";
			
			Query query = entityManager.createQuery(sql);
			List<Student> students = query.getResultList();
			
			return students;
		}
}
