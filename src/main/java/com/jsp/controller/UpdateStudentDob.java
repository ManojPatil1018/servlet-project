package com.jsp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.service.StudentService;
@WebServlet("/updatedob")
public class UpdateStudentDob extends HttpServlet{

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("id");
		int id2=Integer.parseInt(id);
	    String dob=req.getParameter("dob");
		
		StudentService studentService=new StudentService();
		studentService.updateStudentDobById(id2, dob);
	}
	
	
	}
