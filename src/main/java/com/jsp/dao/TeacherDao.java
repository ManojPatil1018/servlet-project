package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Teacher;

public class TeacherDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("manoj");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Teacher saveTeacher(Teacher teacher) {
		entityTransaction.begin();
		entityManager.persist(teacher);
		entityTransaction.commit();
		System.out.println("Save successfully");
		return teacher;
	}

	public Teacher deleteTeacher(int id) {
		Teacher teacher = entityManager.find(Teacher.class, id);
		if (teacher != null) {
			entityTransaction.begin();
			entityManager.remove(teacher);
			entityTransaction.commit();
			System.out.println("Delete successfully");
		} else {
			System.out.println("teacher not exist");
		}
		return teacher;
	}

	public Teacher updateTeacherName(int id, String name) {
		Teacher teacher = entityManager.find(Teacher.class, id);
		if (teacher != null) {
			teacher.setName(name);
			entityTransaction.begin();
			entityManager.merge(teacher);
			entityTransaction.commit();
			System.out.println("Name updated successfully");
		} else {
			System.out.println("Teacher not exist");
		}
		return teacher;
	}

	public Teacher updateTeacherSubject(int id, String subject) {
		Teacher teacher = entityManager.find(Teacher.class, id);
		if (teacher != null) {
			teacher.setSubject(subject);
			entityTransaction.begin();
			entityManager.merge(teacher);
			entityTransaction.commit();
			System.out.println("Subject updated successfully");
		} else {
			System.out.println("Teacher not exist");
		}
		return teacher;
	}

	public Teacher updateTeacherCno(int id, String cno) {
		Teacher teacher = entityManager.find(Teacher.class, id);
		if (teacher != null) {
			teacher.setCno(cno);
			entityTransaction.begin();
			entityManager.merge(teacher);
			entityTransaction.commit();
			System.out.println("Contact updated successfully");
		} else {
			System.out.println("Teacher not exist");
		}
		return teacher;
	}

	public Teacher getTeacher(int id) {
		Teacher teacher = entityManager.find(Teacher.class, id);
		if (teacher != null) {
			return teacher;
		} else {
			System.out.println("teacher not exist");
		}
		return null;
	}

	public List<Teacher> getAllTeachers() {
		String sql = "Select s FROM Teacher s";
		
		Query query = entityManager.createQuery(sql);
		List<Teacher> teacher = query.getResultList();
		
		return teacher;
	}
}
