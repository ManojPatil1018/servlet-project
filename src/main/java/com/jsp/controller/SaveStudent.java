package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;
@WebServlet("/save")
public class SaveStudent extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String dob=req.getParameter("dob");
		
		Student student=new Student();
		student.setName(name);
		student.setEmail(email);
		student.setDob(dob);
		
		StudentService studentService=new StudentService();
		Student s=studentService.saveStudent(student);
		if(s != null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("SaveMessage.jsp");
			requestDispatcher.forward(req, resp);
		}
		
		
		
	}
}
