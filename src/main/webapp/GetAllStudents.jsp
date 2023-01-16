<%@page import="com.jsp.dto.Student"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.service.StudentService"%>
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
<h1>All Students Information</h1>
	<table class="table">
		<thead>
			<tr>
				<th scope="col">Students ID</th>
				<th scope="col">Students Name</th>
				<th scope="col">Students Email</th>
				<th scope="col">Students Dob</th>
			</tr>
		</thead>
		<%
  	StudentService st=new StudentService();
	List<Student> s=st.getAllstudent();
	%>
		<%for (Student s1 : s) {
		%>
		<tbody>
			<tr>
				<td><%=s1.getId()%></td>
				<td><%=s1.getName()%></td>
				<td><%=s1.getEmail()%></td>
				<td><%=s1.getDob()%></td>
			</tr>
			<%
		}
		%>
		</tbody>
	</table>
</body>
</html>