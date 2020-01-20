<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


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
		<li><a href ="">Attendance</a>
		<li><a href="${pageContext.request.contextPath}/showEvaluation">Evaluation</a></li>
		<li><a href="${pageContext.request.contextPath}/showGrades">Grades</a></li>
		<li><a href="#about">Support</a></li>
		<li><a href="${pageContext.request.contextPath}/logout">Logout</a></li>


	</ul>

	<div style="margin-left: 25%; padding: 1px 16px; height: 1000px;">
	  <h2>  WELCOME TO PLATFORM BY PER SCHOLAS DALLAS</h2>
  <h3>Platform by Per Scholars offers customized training designed to connect local talent with cutting-edge technology employers.</h3>
  <h3>Check out our course offerings below: </h3>
  
  <h4>Application Developer..</h4>
  <h4>Data Engineering</h4>
  <h4>Quality Engineering </h4>
  <h4>Technology changes fast. We will train you faster.</h4>

  

	</div>
</body>
</html>

