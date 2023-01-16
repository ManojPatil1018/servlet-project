<%@page import="com.jsp.dto.Teacher"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.service.TeacherService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>All Teachers Information</h1>
	<table class="table">
		<thead>
			<tr>
				<th scope="col">Teachers ID</th>
				<th scope="col">Teachers Name</th>
				<th scope="col">Teachers Contact</th>
				<th scope="col">Teachers Subject</th>
			</tr>
		</thead>
		<%
		TeacherService teacherService = new TeacherService();
		List<Teacher> t=teacherService.getAllTeacher();
		%>
		<%
		for (Teacher s1 : t) {
		%>
		<tbody>
			<tr>
				<td><%=s1.getId()%></td>
				<td><%=s1.getName()%></td>
				<td><%=s1.getCno()%></td>
				<td><%=s1.getSubject()%></td>
			</tr>
			<%
			}
			%>
		</tbody>
	</table>
</body>
</html>