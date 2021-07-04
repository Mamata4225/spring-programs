<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to MVC Servlet Login Page</title>
</head>
<body>
	<h1>Welcome to your Library choose your Books</h1>
	<form action="book.do">
		<pre>
   <label>BookName</label><input type="text" name="BookName">
   <label>AuthorName</label><input type="text" name="AuthorName">
   <label>Edition</label><input type="number" name="edition">
   <label>Cost</label><input type="number" name="cost">
   </pre>
		<input type="submit" value="submit the form">
	</form>
	<h2>${ResponseMessage}</h2>
</body>
</html>