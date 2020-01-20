<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>

<style>
body {
	margin: 0;
}

ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	width: 25%;
	background-color: #f1f1f1;
	position: fixed;
	height: 100%;
	overflow: auto;
}

li a:hover:not(.active)
{
background-color:#555;
color:white;
}


li a {
	display: block;
	color: #000;
	padding: 8px 16px;
	text-decoration: none;
}

li a.active {
	background-color: #4CAF50;
	color: white;
}
</style>

</head>
<body>

	<ul>
		<li><a class="active" href="${pageContext.request.contextPath}/showHome">Home</a></li>
		<li><a href="${pageContext.request.contextPath}/allCourses">Course</a></li>
		<li><a href="${pageContext.request.contextPath}/contact">Contact</a></li>
		<li><a href="${pageContext.request.contextPath}/showProfile">Profile</a></li>
		<li><a href="${pageContext.request.contextPath}/allCareerServices">Career Service</a></li>
		<li><a href ="${pageContext.request.contextPath}/showAttendance">Attendance</a>
		<li><a href="${pageContext.request.contextPath}/showEvalution">Evaluation</a></li>
		<li><a href="${pageContext.request.contextPath}/showGrades">Grades</a></li>
		<li><a href="#about">Support</a></li>
		<li><a href="${pageContext.request.contextPath}/logout">Logout</a></li>


	</ul>

	<div style="margin-left: 25%; padding: 1px 16px; height: 1000px;">

      <h1>Student Attendance</h1>
	<h4>Days present: ${student.present}</h4>
	<h4>Days absent: ${student.absent}</h4>
	
  

	</div>
</body>
</html>