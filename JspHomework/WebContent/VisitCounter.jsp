<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Visit Counter</title>
</head>
<body>
	<%
		Integer visitCounter = (Integer) application
				.getAttribute("visitCounter");
		if (visitCounter == null || visitCounter == 0) {
			visitCounter = 1;
		} else {
			visitCounter += 1;
		}
		application.setAttribute("visitCounter", visitCounter);
	%>
	<center>
		<p><h3>Total number of visits:<%=visitCounter%></h3></p>
	</center>
</body>
</html>