<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<t:wrapper>
	<body>
		<form method="get">
			<h1>
				<c:out value="${all}" />
			</h1>
			<div class="row justify-content-center">
				<div class="col-auto">
					<table class="table table-responsive">
						<thead class="thead-light">
							<tr>
								<th>Username</th>
								<th>Email</th>
								<th>First name</th>
								<th>Last name</th>
								<th>Actions</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="user" items="${show}">
								<tr>
									<td>${user.getUsername()}</td>
									<td>${user.getEmail()}</td>
									<td>${user.getFirstName()}</td>
									<td>${user.getLastName()}</td>
									<td><a
										href="${pageContext.request.contextPath}/users/${user.getUsername()}"
										onclick="return confirm('Are you sure?')">Delete</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
		<a class="btn btn-lg btn-secondary" href="/commercialSite">Back</a>

				</div>
			</div>
		</form>
	</body>
</t:wrapper>