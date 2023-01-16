package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Teacher;
import com.jsp.service.TeacherService;
@WebServlet("/saveTeacher")
public class SaveTeacher extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String cno = req.getParameter("cno");
		String email= req.getParameter("email");
		String subject = req.getParameter("subject");

		Teacher teacher = new Teacher();
		teacher.setName(name);
		teacher.setCno(cno);
		teacher.setEmail(email);
		teacher.setSubject(subject);

		TeacherService teacherService = new TeacherService();
		Teacher t=teacherService.saveTeacher(teacher);
		if(t != null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("SaveMessage.jsp");
			requestDispatcher.forward(req, resp);
		}
	}
	
}
