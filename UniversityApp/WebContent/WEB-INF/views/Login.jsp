
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

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
}


</style>

</head>
<body>

	<ul> 

<!--     image holder -->

 	</ul>
 
	<div style="margin-left: 25%; padding: 1px 16px; height: 1000px;">

   
    <p style="color: red;">${errorMessage}</p>

	<div class="container">
		<div class="row">
			<div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
				<div class="card card-signin my-5">
					<div class="card-body">
						<div class="panel-body ">

							<h2 class="card-title text-center">Sign In</h2>
							<form id="form-signin"
								action="${pageContext.request.contextPath}/loginUser"
								method="post">
								<div class="form-label-group">
									<input name="username" id="inputUsername" class="form-control"
										placeholder="Username" required autofocus> <label
										for="inputEmail">Username</label>
								</div>

								<div class="form-label-group">
									<input name="password" id="inputPassword" class="form-control"
										placeholder="Password" required> <label
										for="inputPassword">Password</label>
								</div>

							<!-- 	<div class="custom-control custom-checkbox mb-3"></div> -->
							  <div>
								<button class="btn btn-lg btn-primary btn-block text-uppercase"
									type="submit">Sign in</button>
                             </div>

								<hr class="my-4">
							</form>
							<h4 class="card-title text-center">Not yet a User yet please
								Register</h4>
							<a href="${pageContext.request.contextPath}/showRegisterPage"
								class="btn btn-lg btn-primary btn-block text-uppercase">Register</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
   
   
   

	</div>
</body>
</html>



















