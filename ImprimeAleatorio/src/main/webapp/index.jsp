<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="classes.Aleatorio" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

Aleatorio a = new Aleatorio();
String code = new String();

code = a.getvAleatorio();

%>
<h1><%=code %></h1>
</body>
</html>