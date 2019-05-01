<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<link href="webjars/bootstrap/css/bootstrap.min.css"
        rel="stylesheet">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script src="/webjars/jquery/jquery.min.js"></script>
<meta charset="ISO-8859-1">
<title>Customer Lists</title>
</head>
<body>
	<div class="container">
		<table class="table table-striped">
			<caption>Customers</caption>
			<thead>
				<tr>
					<th>Nom</th>
					<th>Prénom</th>
					<th>Email</th>
					<th>Update Customer</th>
					<th>Delete Customer</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${allCustomers}" var="item">
					<tr>
					
						<td>${item.firstName}</td>
						<td>${item.lastName}</td>
						<td>${item.email}</td>
						<td><a class="btn btn-primary" href="/update-customer?id=${item.id }">Update</a></td>
                        <td><a class="btn btn-danger" href="/delete-customer?id=${item.id }">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div>
            <a class="btn btn-success" href="add-customer">Add a new customer</a>
        </div>
	</div>
</body>
</html>