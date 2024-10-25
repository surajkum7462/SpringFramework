<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



  <%--  <h1>Email is:${email}</h1>
   <h1>User Name is:${name }</h1>
   <h1>Password is:${password }</h1> --%>
   <h1>${header }</h1>
   <p>${Desc }</p>
   
   <h1 style="color: green">${msg }</h1>
   <h1>Email is:${user.email}</h1>
   <h1>User Name is:${user.username }</h1>
   <h1>Password is:${user.password }</h1> 
   
    
    
    
    
</body>
</html>