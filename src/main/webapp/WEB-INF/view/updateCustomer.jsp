<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="webjars/bootstrap/css/bootstrap.min.css"
        rel="stylesheet">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script src="/webjars/jquery/jquery.min.js"></script>
<title>Update a Customer</title>
</head>
<body>
	<div class="container">
		<form:form action="/confirm-update-customer" method="GET" modelAttribute="customer">
			<form:input type="hidden" path="id" />
			<div class="form-group">
				<form:label path="firstName">Firstname</form:label>
				<form:input type="text" path="firstName" class="form-control"/>
				<form:errors path="firstName" class="text-danger"/>
			</div>
			<div class="form-group">
				<form:label path="lastName">Lastname</form:label>
				<form:input type="text" path="lastName" class="form-control"/>
				<form:errors path="lastName" class="text-danger"/>
			</div>
			<div class="form-group">
				<form:label path="email">Email</form:label>
				<form:input type="email" path="email" class="form-control"/>
				<form:errors path="email" class="text-danger"/>
			</div>
			<input type="submit" class="btn btn-primary" value="Confirme"/>
		</form:form>
	</div>
</body>
</html>