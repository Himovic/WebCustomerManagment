<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Custom Login Page</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- Reference Bootstrap files -->
	<link rel="stylesheet"
		 href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
	
	<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	
	<div>
		
		<div id="loginbox" style="margin-top: 50px;"
			class="mainbox col-md-3 col-md-offset-2 col-sm-6 col-sm-offset-2">
			
			<div class="panel panel-info">

				<div class="panel-heading">
					<div class="panel-title">Register</div>
				</div>

				<div style="padding-top: 30px" class="panel-body">
	
	<form:form method="POST" class="form-horizontal" modelAttribute="user" action="${pageContext.request.contextPath}/registerTheUser">

		<!-- Place for messages: error, alert etc ... -->
					    <div class="form-group">
					        <div class="col-xs-15">
					            <div>
									
									<c:if test="${param.error != null }">		            
									<div class="alert alert-danger col-xs-offset-1 col-xs-10">
										Invalid username and password.
									</div>
									</c:if>
									
									<c:if test="${param.logout != null }">		            
									<div class="alert alert-success col-xs-offset-1 col-xs-10">
										You have been logged out.
									</div>
								    </c:if>

					            </div>
					        </div>
					    </div>
					    
						<!-- Firstname -->
						<div style="margin-bottom: 25px" class="input-group">
							<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span> 
							
							<form:input type="text" path="firstname"  name="firstname" placeholder="firstname" class="form-control"/>
							<form:errors path="firstname" class="alert alert-danger col-xs-offset-1 col-xs-10"/>
						</div>
						<!-- Lastname -->
						<div style="margin-bottom: 25px" class="input-group">
							<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span> 
							
							<form:input type="text" path="lastname" name="lastname" placeholder="lastname" class="form-control"/>
							<form:errors path="lastname" class="alert alert-dange col-xs-offset-1 col-xs-10r"/>
						</div>
						<!-- Email -->
						<div style="margin-bottom: 25px" class="input-group">
							<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span> 
							
							<form:input type="email" path="email" name="email" placeholder="email" class="form-control"/>
							<form:errors path="email" class="alert alert-danger col-xs-offset-1 col-xs-10"/>
						</div>
						<!-- User name -->
						<div style="margin-bottom: 25px" class="input-group">
							<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span> 
							
							<form:input type="text" path="username" name="username" placeholder="username" class="form-control"/>
							<form:errors path="username" class="alert alert-danger col-xs-offset-1 col-xs-10"/>
						</div>

						<!-- Password -->
						<div style="margin-bottom: 25px" class="input-group">
							<span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span> 
							
							<form:input type="password" path="password" name="password" placeholder="password" class="form-control" />
							<form:errors path="password" class="alert alert-danger col-xs-offset-1 col-xs-10"/>
						</div>
						
						<!-- Role -->
						<form:select path="role">
							<form:option value="EMPLOYE">EMPLOYE</form:option>
							<form:option value="ADMIN">ADMIN</form:option>
							<form:option value="DIRECTOR">DIRECTOR</form:option>
						</form:select>
						<!-- Register/Submit Button -->
						<div style="margin-top: 10px" class="form-group">						
							<div class="col-sm-6 controls">
								<button type="submit" class="btn btn-success">Confirme</button>
							</div>
						</div>
	</form:form>
					</div>
			</div>

		</div>

	</div>
</body>
</html>