<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import= " java.util.Date" %>
    <%@page import= "java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> HELLO WORLD</h1>
<h3> Today = <%= new Date() %> </h3>
<% 
   out.println("output form scriplets in jsp");
%>
<%
   ArrayList<Integer> Arraylist = new ArrayList<Integer>();
Arraylist.add(456);
Arraylist.add(567);
for(int i=0;i<Arraylist.size();i++)
{
	out.println(Arraylist.get(i));
}
%>
</body>
</html>