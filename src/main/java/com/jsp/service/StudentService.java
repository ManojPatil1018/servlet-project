package com.jsp.service;

import java.util.List;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class StudentService {
	StudentDao studentDao=new StudentDao();
	
		public Student saveStudent(Student student) {
			return studentDao.saveStudent(student);
	   	}
		     
		public Student getstudentById(int id) {
			return studentDao.getStudentById(id);
		}
		
		public List<Student> getAllstudent() {
			return studentDao.getAllStudent();
		}
		
		public Student deleteStudentById(int id) {
			return studentDao.deleteStudentById(id);
		}
		
		public Student  updateStaffEmailById(int id, String email) {
			return studentDao.updateStudentEmailById(id, email);
		}
		
		public Student  updateStudentDobById(int id, String dob) {
			return studentDao.updateStudentDobById(id, dob);
		}
		public Student  updateStudentNameById(int id, String name) {
			return studentDao.updateStudentNameById(id, name);
		}
}
