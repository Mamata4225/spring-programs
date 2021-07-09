<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset=ISO-8859-1">
<title>Landing Page</title>
</head>
<body>
	<h1>Welcome to Spring MVC</h1>
	<form action="mobile.do" method="post">
		<pre>

          <label>Name</label><input type="text" name="name">
          <label>Brand</label><input type="text" name="brand">
          <label>Ram</label><input type="text" name="ram">
          <label>Cost<label><input type="text" name="cost">

		
		</pre>
		<input type="submit" value="submit">

	</form>
	<div>
	<h2>${MobileResponse}</h2>

	</div>
</body>
</html>