<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>List of Books</h1>
	<table>
		<tr>
			<th>Book ID</th>
			<th>Title</th>
			<th>Author</th>
		</tr>
		<tr>
			<c:forEach items="${books}" var="book">
				<tr>
					<td>${book.bid}</td>
					<td>${book.title}</td>
					<td>${book.author}</td>
				</tr>
			</c:forEach>
		</tr>
	</table>
</body>
</html>