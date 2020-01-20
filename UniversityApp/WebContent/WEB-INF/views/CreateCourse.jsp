<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Course</title>
</head>
<body>

	<h1>Enter Course</h1>
	<fieldset>
		<legend>Course</legend>
		<form:form
			action="${pageContext.request.contextPath}/addCourse"
			method="post" modelAttribute="course">
			<div>
				<label for="courseName">CourseName:</label>
				<div>
					<form:input path="courseName" />
					<p style="color: red;">
						<form:errors path="courseName" class="error" />
					</p>
				</div>
			</div>
			<div>
				<label for="roomNumber">Room Number:</label>
				<div>
					<form:input path="roomNumber" />
					<p style="color: red;">
						<form:errors path="roomNumber" class="error" />
					</p>
				</div>
			</div>


			<div>
				<label for="building">Building:</label>
				<div>
					<form:input path="building" />
					<p style="color: red;">
						<form:errors path="building" class="error" />
					</p>
				</div>
			</div>

<%-- 			<div>
				<label for="dateTime">Date_Time:</label>
				<div>
					<form:input path="dateTime" />
					<p style="color: red;">
						<form:errors path="dateTime" class="error" />
					</p>
				</div>
			</div> --%>

			<input type="submit" value="Course" />
		</form:form>
	</fieldset>

	</br>

	<a href="${pageContext.request.contextPath}/course">Back to course</a>

</body>
</html>