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
	<form action="FiveNumbers.jsp" method="GET">
	<label for="num">Add item</label>
	<input type="text" name="num" id="num">
	<input type="submit" value="Add">
	</form>
	
	<%
	if (request.getParameter("num") != null && isInteger(request.getParameter("num"))) {
		request.getSession();
		if(session.getAttribute("numbers") == null){
			session.setAttribute("numbers", new ArrayList<Integer>());			
		}
		ArrayList<Integer> numbers = (ArrayList<Integer>) session.getAttribute("numbers");
		numbers.add(Integer.parseInt(request.getParameter("num")));
		++counter;
		out.println(5 - counter + " more numbers to enter");
		if(counter == 5){
			counter = 0;
			response.sendRedirect("SumOfFiveNums.jsp");
		}
	} else if (request.getParameter("num") == null) {		
	} else {
		out.println("Invalid number");
	}
	%>
	
	<%! static int counter = 0; %>
	
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