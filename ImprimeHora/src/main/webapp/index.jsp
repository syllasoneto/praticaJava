<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ page import="classes.HoraMinuto" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%

HoraMinuto hm = new HoraMinuto();

%>
<body>
<h1><%=hm.getHoraMinuto() %></h1>
</body>
</html>