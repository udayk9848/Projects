<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<style type="text/css">
   table, th, td {
    border: 1px solid green;
    
}
th {
    background-color: green;
    color: white;
}

</style>
</head>
<body bgcolor=#F0E0B2>
<br></br>
<body>
<body>
   <jsp:include page="student.jsp" />
    <br>
   
 <c:if  test="${!empty contactList}">  
  <table style="width:100%">
  
  <tr>
    <th>ID</th>
    <th>NAME</th>		
    <th>AGE</th>
    <th>MAIL</th>
    <th>PHNO</th>
    <th>&nbsp;</th>
    <th>&nbsp;</th>
  </tr>
  <c:forEach items="${contactList}" var="command">
  <tr>
    <td>${command.id}</td>
    <td>${command.name}</td>		
    <td>${command.age}</td>
    <td>${command.mail}</td>
    <td>${command.phone}</td>	
    <td><a href="edit/${command.id}">edit</a></td>	  
    <td><a href="delete/${command.id}">delete</a></td>	  
  </tr>
  </c:forEach>
</table>
</c:if>
</body>
</html>


