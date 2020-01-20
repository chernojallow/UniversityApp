
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Career Service</title>
</head>
<body>

	<h1>Enter Career Service</h1>
	<fieldset>
		<legend>Career Service</legend>
		<form:form
			action="${pageContext.request.contextPath}/addCareerService"
			method="post" modelAttribute="career">
			<div>
				<label for="name">Name:</label>
				<div>
					<form:input path="name" />
					<p style="color: red;">
						<form:errors path="name" class="error" />
					</p>
				</div>
			</div>
			<div>
				<label for="description">Description:</label>
				<div>
					<form:input path="description" />
					<p style="color: red;">
						<form:errors path="description" class="error" />
					</p>
				</div>
			</div>


			<div>
				<label for="location">Location:</label>
				<div>
					<form:input path="location" />
					<p style="color: red;">
						<form:errors path="location" class="error" />
					</p>
				</div>
			</div>

			<div>
				<label for="dateTime">Date_Time:</label>
				<div>
					<form:input path="dateTime" type="datetime-local" />
					<p style="color: red;">
						<form:errors path="dateTime" class="error" />
					</p>
				</div>
			</div>

			<input type="submit" value="CareerService" />
		</form:form>
	</fieldset>

	</br>

	<a href="${pageContext.request.contextPath}/">Back to Login Page</a>

</body>
</html>
