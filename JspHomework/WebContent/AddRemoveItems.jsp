<%@page import="java.util.LinkedList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Remove Items</title>
</head>
<body>
	<form action="AddRemoveItems.jsp" method="GET">
	<label for="addItem">Add item</label>
	<input type="text" name="addItem" id="addItem">
	<input type="submit" value="Add">
	</form>
	<form action="AddRemoveItems.jsp" method="GET">
	<label for="removeItem">Add item</label>
	<input type="text" name="removeItem" id="removeItem">
	<input type="submit" value="Remove">
	</form>
	<form action="AddRemoveItems.jsp" method="GET">
	<input type="radio" name="invalidate" value="invalidate">Invalidate<br>
    <input type="submit" value="Invalidate" />
	</form>
	
	<%
	if(request.getParameter("invalidate") != null && ((String)request.getParameter("invalidate")).equals("invalidate")){
		request.getSession().invalidate();
	} 
	if (request.getParameter("addItem")!= null) {
		request.getSession();
		if(session.getAttribute("ITEMS") == null){
			session.setAttribute("ITEMS", new LinkedList<String>());			
		}
		LinkedList<String> items = (LinkedList<String>) session.getAttribute("ITEMS");
		items.add(htmlEscape(request.getParameter("addItem")));
		for(String item : items){
	%>
			<h4><%= item %></h4>
	<%
		}
	}
	
	if (request.getParameter("removeItem")!= null) {
		request.getSession();
		if(session.getAttribute("ITEMS") == null){
			session.setAttribute("ITEMS", new LinkedList<String>());			
		}
		LinkedList<String> items = (LinkedList<String>) session.getAttribute("ITEMS");
		if(items.contains(htmlEscape(request.getParameter("removeItem")))){
			items.remove(htmlEscape(request.getParameter("removeItem")));
		} else {
	%>
			<h4><%= "No such element exist" %></h4>
	<%
		}
		for(String item : items){
			%>
			<h4><%= item %></h4>
			<%
		}
	}
	%>
	
	<%!
	public static String htmlEscape(String text) {
		StringBuilder escapedText = new StringBuilder();
		
	  	for (int i=0; i<text.length(); i++) {
		    char ch = text.charAt(i);
		    if (ch == '<') {
		        escapedText.append("&lt;");
		    } else if (ch == '>') {
		        escapedText.append("&gt;");
		    }  else if (ch == '&') {
		        escapedText.append("&amp;");
	  		}  else if (ch == '\"') {
		        escapedText.append("&quot;");
			}  else {
		        escapedText.append(ch);
			}
	    }
	    String result = escapedText.toString();
	    
	    return result;
	}
	%>
</body>
</html>