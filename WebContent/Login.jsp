<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Showing sent data</title>
</head>
<body>
	<span>Utilizator: </span></span><span><%=session.getAttribute("Utilizator")%></span><br/>
	<span>Parola: </span><span><%=session.getAttribute("Parola")%></span><br/>
	<%
	if (session.getAttribute("Parola").equals("parola")) {
	%>
	<span>Login successfull!</span>
	<%
	} else {
	%>
    <span>Parola Gresita! </span> <br/>
    <button ONCLICK="window.location.href='http://localhost:8080/Curs-5/HTML4.html'">AM UITAT PAROLA!</button>
	<% 
	}
	%>
</body>
</html>