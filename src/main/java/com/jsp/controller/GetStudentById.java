package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;
@WebServlet("/getStudentbyId")
public class GetStudentById extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int id=Integer.parseInt(req.getParameter("id"));
		
		StudentService studentService=new StudentService();
		Student student = studentService.getstudentById(id);
		
		if (student != null) {
			PrintWriter printWriter = resp.getWriter();
			printWriter.print("<html><body><h1>" +"Id : "+ student.getId()+"</html></body></h1>");
			printWriter.print("<html><body><h1>" +"Name : "+ student.getName()+"</html></body></h1>");
			printWriter.print("<html><body><h1>" +"Email : "+ student.getEmail()+"</html></body></h1>");
			printWriter.print("<html><body><h1>" +"Dob : "+ student.getDob()+"</html></body></h1>");
		} else {
			RequestDispatcher rd = req.getRequestDispatcher("/Invalid.jsp");
			rd.forward(req, resp);
		}
	}
}
	


