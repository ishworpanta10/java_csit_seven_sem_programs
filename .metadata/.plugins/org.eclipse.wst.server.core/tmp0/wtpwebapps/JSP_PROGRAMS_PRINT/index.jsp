<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Print TU 10 Times</title>
</head>
<body>

	<h2>Printing Tribhuwan University 10 Times</h2>

	<!--import tag directive tag  -->
	<%@page import="java.util.Scanner, java.util.Date"%>

	<%!/* Declaration Tag like we can declar i here also */
	/* int i; */%>

	<!--scriptlet Tag allow to run java code in jsp  -->

	<%-- <%= %> used to print expression tag  --%>
	<%="Print using java "%>
	
	<!--main code  -->
	<%
	Date date = new Date();
	out.print("<br/>");
	out.print(date);
	out.print("<br/>");
	String message = "Trivhuwan University";
	for (int i = 0; i < 10; i++) {
		out.print(message + "<br/>");
	}
	%>
</body>
</html>