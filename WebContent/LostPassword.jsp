<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Showing sent data</title>
</head>
<body>
	<span>Parola noua: </span></span><span><%=session.getAttribute("Parola noua")%></span><br/>
	<span>Parola veche: </span><span><%=session.getAttribute("Parola veche")%></span><br/>
	<%
	if (session.getAttribute("Parola noua").equals(session.getAttribute("Parola veche"))) {
	%>
	<span>Parola veche este la fel cu cea noua! Introdu din nou</span>
	<%
	} else {
	%>
    <span>Parola schimbata cu succes! </span> 

	<%=session.getAttribute("Parola") %>
	<% 
	}
	%>
</body>
</html>