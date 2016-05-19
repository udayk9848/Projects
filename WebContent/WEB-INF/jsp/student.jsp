<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Spring MVC Form Handling</title>
    <style type="text/css">
    table#sample {
border:none;
   border-collapse: collapse;

}
td#sample {
   border:none;
    border-collapse: collapse;

}
    </style>
</head>
<body bgcolor=#F0E0B2>

<h2>Student Information</h2>
<form:form method="POST" action="addStudent"  >
   <table id="sample">
    <tr>
        <td id="sample"><form:label path="name">Name</form:label></td>
        <td id="sample"><form:input path="name" /></td>
    </tr>
    <tr>
        <td id="sample"><form:label path="age">Age</form:label></td>
        <td id="sample"><form:input path="age" /></td>
    </tr>
      <tr>
        <td id="sample"><form:label path="mail">mail</form:label></td>
        <td id="sample"><form:input path="mail" /></td>
    </tr>
      <tr>
        <td id="sample"><form:label path="phone">Phno</form:label></td>
       <td id="sample"><form:input path="phone" /></td>
    </tr>
    <%-- <tr>
        <td><form:label path="id">id</form:label></td>
        <td><form:input path="id" /></td>
    </tr> --%>
    <tr>
        <td id="sample" colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table>  
</form:form>

   
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