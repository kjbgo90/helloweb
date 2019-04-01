<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int tmpDan = Integer.parseInt(request.getParameter("dan"));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<% for(int i = 0; i < 9; i++) {%>
			<tr>
				<td><%= tmpDan %></td>
				<td><%= i + 1%></td>
				<td><%= tmpDan*(i + 1)%></td>
			</tr>
		<% } %>
	</table>
</body>
</html>