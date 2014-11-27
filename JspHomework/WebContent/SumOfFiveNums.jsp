<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>The numbers you've entered are: </h3>
	<%
	HttpSession ses = request.getSession();
	ArrayList<Integer> nums = (ArrayList<Integer>) ses.getAttribute("numbers");
	int sum = 0;
	out.println("<h3>");
	for(Integer num : nums){
		sum += num;
	%>
		<%= num + " "%>
	<%
	}
	out.println("</h3>");
	request.getSession().invalidate();
	%>
	
	<h3>The sum of these numbers is: <%= sum %></h3>
</body>
</html>