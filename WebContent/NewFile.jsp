<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Showing sent data</title>
</head>
<body>
	<span>Nume: </span></span><span><%=session.getAttribute("Nume")%></span><br/>
	<span>Prenume: </span><span><%=session.getAttribute("Prenume")%></span><br/>
	<span>Varsta: </span><span><%=session.getAttribute("Varsta")%></span><br/>
	<span>Adresa: </span><span><%=session.getAttribute("Adresa")%></span><br/>
	<%
	if (session.getAttribute("Telefon").equals("112")) {
	%>
	<span>Sa traiasca Politia Romana</span>
	<%
	} else {
	%>
	<%=session.getAttribute("Telefon") %>
	<% 
	}
	%>
	//<button onclick="window.location.href=''">Pagina Principala</button>
</body>
</html>