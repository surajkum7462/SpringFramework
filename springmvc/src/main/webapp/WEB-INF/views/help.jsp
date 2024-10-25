<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.time.LocalDateTime;"%>
	<%@page isELIgnored="false" %>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help</title>
</head>
<body>

	<h1>This is help page</h1>

	<%
	/* String name = (String) request.getAttribute("name");
	Integer roll = (Integer) request.getAttribute("roll");
	LocalDateTime time = (LocalDateTime) request.getAttribute("time"); */
	%>


	<h1>
		<%-- My name is:<%=name%> --%>
		<!-- jsp expression language -->
		My name is:${name }


	</h1>
	<h1>
		<%-- Roll no. is:<%=roll%> --%>
		My roll number is:${roll }

	</h1>

	<h1>
		<%-- Date and Time is:<%=time%> --%>
         date is:${time }
	</h1>
	
	<hr>
	
	
	<!-- // if we traverse list of data in 
	jstl then we have to add jstl dependencies 
	then add taglib page in above-->
	
	
	<c:forEach var="item" items="${marks }">
	
	  <%-- <h1>${item }</h1> --%>
	<!--   another method -->
	<h1><c:out value="${item }"></c:out></h1>
	
	
	
	
	</c:forEach>
	
	
	
	
	
	
	
	
	
	
	
	


</body>
</html>