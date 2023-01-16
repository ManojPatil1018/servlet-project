<%@page import="com.jsp.dto.Staff"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.service.StaffService"%>
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
<h1>All Staffs Information</h1>
	<table class="table">
		<thead>
			<tr>
				<th scope="col">Staffs ID</th>
				<th scope="col">Staffs Name</th>
				<th scope="col">Staffs Email</th>
				<th scope="col">Staffs Job</th>
			</tr>
		</thead>
		<%
  StaffService staffService=new StaffService();
  List<Staff> s=staffService.getAllstaff();
	%>
		<%for (Staff s1 : s) {
		%>
		<tbody>
			<tr>
				<td><%=s1.getId()%></td>
				<td><%=s1.getName()%></td>
				<td><%=s1.getEmail()%></td>
				<td><%=s1.getJob()%></td>
			</tr>
			<%
		}
		%>
		</tbody>
	</table>
</body>
</html>