<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mobile App</title>
</head>
<body>
	<h1>Welcome to Spring MVC</h1>
	<h2>${display}</h2>
	<div>
		<form action="mobile.do" method="post">
			<pre>
MobileName:<input type="text" name="name"><br>
MobileBrand:<input type="text" name="brand"><br>
MobileRam:<input type="text" name="ram"><br>
MobilePrice<input type="text" name="price"><br>
<input type="submit" value="submit">
</pre>
		</form>
	</div>
</body>
</html>