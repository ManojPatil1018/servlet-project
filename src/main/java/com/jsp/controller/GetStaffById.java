package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Staff;
import com.jsp.service.StaffService;
@WebServlet("/getStaff")
public class GetStaffById extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int id = Integer.parseInt(req.getParameter("id"));

	StaffService staffService = new StaffService();
	Staff staff = staffService.getstaffById(id);

	if(staff !=null) {
	PrintWriter printWriter = resp.getWriter();
	printWriter.print("<html><body><h1>" +"Id : "+ staff.getId()+"</html></body></h1>");
	printWriter.print("<html><body><h1>" +"Name : "+ staff.getName()+"</html></body></h1>");
	printWriter.print("<html><body><h1>" +"Email : "+ staff.getEmail()+"</html></body></h1>");
	printWriter.print("<html><body><h1>" +"Job : "+ staff.getJob()+"</html></body></h1>");
	}else {
		RequestDispatcher rd = req.getRequestDispatcher("/Invalid.jsp");
		rd.forward(req, resp);
	}
  }
}
