<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="classes.Departamento" %>
<%@ page import="classes.ManipulaBD" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<%

ManipulaBD mbd = new ManipulaBD();
Departamento d = mbd.retornaDepartamento();

%>

<body>
<h1><%=d.getCodigo() %></h1>
<h1><%=d.getNome() %></h1>
<h1><%=d.getLocalizacao() %></h1>
<h1><%=d.getCodigoFuncionarioGerente() %></h1>
</body>
</html>