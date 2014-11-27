<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="SumOfTwoIntegers.jsp" method="GET">
	<label for="num1">Number 1</label>
	<input type="text" name="num1" id="num1">
	<label for="num2">Number 2</label>
	<input type="text" name="num2" id="num2">
	<input type="submit" value="Calculate">
	</form>	
	<%
	if (request.getParameter("num1")!= null && request.getParameter("num2")!= null) {
	if(isInteger(request.getParameter("num1")) && isInteger(request.getParameter("num2"))){ 
	%>
    <h3>The sum of the two integers is: <%= (Integer.parseInt(request.getParameter("num1"))+Integer.parseInt(request.getParameter("num2"))) %></h3>
	<% } else { %>
	<h3>Please enter a valid integers!</h3>
	<%}} %>
	
	<%!
	public static boolean isInteger(String str)  
	{  
	  try  
	  {  
	    int d = Integer.parseInt(str);  
	  }  
	  catch(NumberFormatException nfe)  
	  {  
	    return false;  
	  }
	  
	  return true;  
	}
	%>
</body>
</html>