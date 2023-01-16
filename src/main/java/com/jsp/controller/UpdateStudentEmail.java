package com.jsp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.service.StudentService;
@WebServlet("/updateemail")
public class UpdateStudentEmail extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("id");
		int id2=Integer.parseInt(id);
	    String email=req.getParameter("email");
		
	
		
		StudentService studentService=new StudentService();
		studentService.updateStaffEmailById(id2, email);
	}
	
	
}
