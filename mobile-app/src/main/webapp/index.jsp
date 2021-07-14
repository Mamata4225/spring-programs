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

          <label>Name</label><input type="text" name="name"><h6>${mobileNameErrorMessage}</h6>
          <label>Brand</label><input type="text" name="brand"><h6>${mobileBrandErrorMessage}</h6>
          <label>Ram</label><input type="text" name="ram"><h6>${mobileRamErrorMessage}</h6>
          <label>Cost<label><input type="text"name="cost"><h6>${mobileCostErrorMessage}</h6>

		
		
		</pre>
		<input type="submit" value="submit">

	</form>

</body>
</html>