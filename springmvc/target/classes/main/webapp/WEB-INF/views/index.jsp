<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import= "java.util.*; "%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
   <h1>This is home page</h1>
   <h1>Called by home controller</h1>
  
  
  <%
  
    String name=(String)request.getAttribute("name");
  Integer id=(Integer)request.getAttribute("id");
  List<String> list=(List<String>)request.getAttribute("relate");
  
  
  %>
  <h1>Name is: <%=name %></h1>
  <h1>id is:<%=id %></h1>
  
  <%
    for(String s:list){
  
  %>
  
  <h1><%= s %></h1>
  
  <%
    }
  
  %>

</body>
</html>