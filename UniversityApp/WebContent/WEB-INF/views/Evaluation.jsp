<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
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

      <h1>Evaluation Result</h1>
	<h4>Question-01: ${student.score}</h4>
	<h4>Question-02: ${student.letter}</h4>
	<h4>Question-03: ${student.score}</h4>
	<h4>Question-04: ${student.letter}</h4>

	</div>
	
	
		<a href="${pageContext.request.contextPath}/createEvaluation">Evaluation</a>
	
	
</body>
</html>

 --%>
 
 
 
 
 
 
 
 
 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Success Page</title>
</head>
<body>
	<h1>Congratulations! You're completed the evaluation.</h1>
<%-- 	<%@ include file="Header.jsp" %> --%>
	<p id="success_userName">Name: ${allParams.get("name")}</p>
	<p id="success_email">Email: ${allParams.get("email")}</p>
	<p id="success_location">Location: ${allParams.get("location") }</p>
	<p id="success_course">Course: ${allParams.get("course") }</p>
	<label>Languages: </label>
	<p id="success_languages1">${allParams.get("languages1")}</p>
	<p id="success_languages2">${allParams.get("languages2")}</p>
	<p id="success_languages3">${allParams.get("languages3")}</p>
	<p id="success_languages4">${allParams.get("languages4")}</p>
	<p id="success_startDate">Start Date: ${allParams.get("startDate")}</p>
	
		
		
<!-- 	<a href="/qeb_selenium_lesson/">Back to Sign-up Page</a>
	<a href="/qeb_selenium_lesson/bookstore">Buy Books</a> -->
	
	
	    	<a href="${pageContext.request.contextPath}/createEvaluation">Create Evaluation</a>
</body>
</html>

