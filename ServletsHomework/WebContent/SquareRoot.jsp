<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Square root</title>
<style>
table, tr, td, thead {
	border: solid;
	border-width: 1px;
}
</style>
</head>
<body>
	<%
		int num = 1;
	%>

	<table>
		<thead>
			<tr>
				<th>Number</th>
				<th>Square Root</th>
			</tr>
		</thead>
		<%
			for (int i = 1; i <= 1000; i++) {
		%>
		<tr>
			<td><%=i%></td>
			<td><%=String.format("%.2f", Math.sqrt((double) i))%></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>