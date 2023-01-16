package com.jsp.service;

import java.util.List;

import com.jsp.dao.TeacherDao;
import com.jsp.dto.Teacher;


public class TeacherService {
	TeacherDao teacherDao=new TeacherDao();
	
	public Teacher saveTeacher(Teacher teacher) {
		return teacherDao.saveTeacher(teacher);
   	}
	     
	public Teacher getTeachertById(int id) {
		return teacherDao.getTeacher(id);
	}
	
	public List<Teacher> getAllTeacher() {
		return teacherDao.getAllTeachers();
	}
	
	public Teacher deleteTeacherById(int id) {
		return teacherDao.deleteTeacher(id);
	}
	
	public Teacher  updateTeachersubjectById(int id, String subject) {
		return teacherDao.updateTeacherSubject(id, subject);
	}
	
	public Teacher  updateTeacherCnoById(int id, String cno) {
		return teacherDao.updateTeacherCno(id, cno);
	}
	
	public Teacher  updateTeacherNameById(int id, String name) {
		return teacherDao.updateTeacherName(id, name);
	}
}
