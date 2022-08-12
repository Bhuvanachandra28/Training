<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register student</title>
</head>
<body>
<h1> Addition of two numbers </h1>
<form action="${pageContext.request.contextPath }/SaveDataInDB" method="post"> 
     Enter enter student id : <input type = "text" name="sid"/><br>
     Enter enter student name : <input type = "text" name="sname"/><br>
     Enter enter student age : <input type = "text" name="sage"/><br>
     <input type = "submit" value = "Register" />
  </form>

</body>
</html>