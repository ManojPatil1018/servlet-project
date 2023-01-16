package com.jsp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;
@WebServlet("/updatename")
public class UpdateStudentName extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("id");
		int id2=Integer.parseInt(id);
	    String name=req.getParameter("name");
		
	
		
		StudentService studentService=new StudentService();
		studentService.updateStudentNameById(id2, name);
	}
}
