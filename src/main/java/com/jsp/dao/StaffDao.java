package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Staff;
import com.jsp.dto.Student;

public class StaffDao {
 
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("manoj");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public Staff saveStaff(Staff  staff) {
		
		if (staff!=null) {
			entityTransaction.begin();
			entityManager.persist(staff);
			entityTransaction.commit();
		}
		return staff;
	}
	       
	public Staff deleteStaffById(int id) {
		
		Staff staff=entityManager.find(Staff.class,id);
		
		if(staff!=null) {
			entityTransaction.begin();
			entityManager.remove(staff);
			entityTransaction.commit();
			System.out.println(staff.getName()+" Deleted Succesfully ");
		}else {
			System.out.println(" Staff not found ");
		}
		return staff;
	}
	
	public Staff updateStaffEmailById(int id, String email) {
		Staff staff = entityManager.find(Staff.class, email);
		if(staff!=null) {
		staff.setEmail(email);;
		entityTransaction.begin();
		entityManager.merge(staff);
		entityTransaction.commit();
		System.out.println("Staff Email Updated");
		}else {
			System.out.println("Staff not found");
		}
		return staff;
	}

	public Staff updateStaffNameById(int id, String name) {
		Staff staff = entityManager.find(Staff.class, id);
		if(staff!=null) {
		staff.setName(name);
		entityTransaction.begin();
		entityManager.merge(staff);
		entityTransaction.commit();
		System.out.println("Staff Name Updated");
		}else {
			System.out.println("Staff not found");
		}
		return staff;
	}
	
	public Staff updateStaffjobById(int id, String job) {
		Staff staff = entityManager.find(Staff.class, id);
		if(staff!=null) {
		staff.setJob(job);
		entityTransaction.begin();
		entityManager.merge(staff);
		entityTransaction.commit();
		System.out.println("Staff job Updated");
		}else {
			System.out.println("Staff not found");
		}
		return staff;
	}

	 public Staff getStaffById(int id) {
		 Staff staff = entityManager.find(Staff.class, id);
			return staff;
		}
	 
	    public 	List<Staff> getAllStaff() {
			String sql = "Select s FROM Student s";
			Query query = entityManager.createQuery(sql);
			List<Staff> staff= query.getResultList();
			return staff;
		}
}

