
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>


<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

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

.panel-body {
	border-radius: 5px;
	background-color: #f2f2f2;
	padding: 20px;
	margin-top: 40px;
    width: 700px;

</style>

</head>
<body>

	<ul> 
<!-- image holder -->

	</ul>

	<div style="margin-left: 25%; padding: 1px 16px; height: 1000px;">

	<p class="text-danger">&emsp;${errorMessage}</p>

	<div class="container">
		<div class="row">
			<div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
				<div class="card card-signin my-5">
					<div class="card-body">
						<div class="panel-body">

							<h2 class="card-title text-center">Registration Page</h2>
							<form:form
								action="${pageContext.request.contextPath}/registerUser"
								method="post" modelAttribute="user">


								<div class="form-lable-group">
									<div>
										<form:input path="firstName" id="inputFirstName"
											class="form-control" placeholder="firstname" />
										<!-- 									<label for="firstname">FirstName:</label> -->
										<p style="color: red;">
											<form:errors path="firstName" class="error" />
										</p>
									</div>
								</div>



								<div class="form-lable-group">
									<div>
										<form:input path="lastName" id="inputFirstName"
											class="form-control" placeholder="lastname" />
										<!-- 									<label for="lastname">LastName:</label> -->
										<p style="color: red;">
											<form:errors path="lastName" class="error" />
										</p>
									</div>
								</div>


								<div class="form-lable-group">
									<div>
										<form:input path="email" id="inputEmail" class="form-control"
											placeholder="email" />
										<p style="color: red;">
											<form:errors path="email" class="error" />
										</p>
									</div>
								</div>


								<div class="form-label-group">
									<div>
										<form:input path="phone" id="inputPhone" class="form-control"
											placeholder="phone" />
										<p style="color: red;">
											<form:errors path="phone" class="error" />
										</p>
									</div>
								</div>


								<div class="form-control-group">
									<div>
										<form:input path="gender" id="inputGender"
											class="form-control" placeholder="gender" />
										<p style="color: red;">
											<form:errors path="gender" class="error" />

										</p>
									</div>
								</div>

								<div class="form-control-group">
									<div>
										<form:input path="password" id="inputPassword"
											class="form-control" placeholder="password" />
										<!-- 							<label for="password">Password:</label> -->
										<p style="color: red;">
											<form:errors path="password" class="error" />
										</p>
									</div>
								</div>

								<div class="form-control-group">
									<div>
										<form:input path="confirmpassword" id="inputConfirmpassword"
											class="form-control" placeholder="confirmpassword" />
										<!-- 								<label for="confirmpassword">Password:</label> -->
										<p style="color: red;">
											<form:errors path="confirmpassword" class="error" />
										</p>
									</div>
								</div>


								<div class="form-control-group">
									<div>
										<form:input path="username" id="inputUsername"
											class="form-control" placeholder="username" />

										<p style="color: red;">
											<form:errors path="username" class="error" />

										</p>
									</div>
								</div>

								<button class="btn btn-lg btn-primary btn-block text-uppercase"
									type="submit">Register</button>
							</form:form>

						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

    
	</div>
</body>
</html>







