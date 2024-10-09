<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="crud.dao.Student"%>
<%@page import="java.util.List"%>

<%@page import="java.lang.classfile.attribute.ModuleTargetAttribute"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>fetchAll</title>
<style>
div{
margin-top:100px;
margin-left:500px;
}
button{
width:60px;
height:30px;

}

button:hover{
color:white;
background-color:maroon;
font-weight:bold;
}
h1{
color:green;
}

</style>

</head>
<body>

<div>
<h1>${edit}</h1>
<h1>${delete}</h1>
<table border="1">
<tr>
<th>Name </th>
<th>Mobile </th>
<th>Gender </th>
<th>Age </th>
<th>Address</th>
</tr>
<c:forEach var="s" items="${values}">

<tr>
<td>${s.name}</td>
<td>${s.mobile}</td>
<td>${s.gender}</td>
<td>${s.age}</td>
<td>${s.address}</td>

 <td><a href="edit?id=${s.regNo}"><button>Edit</button></a></td>
<td><a href="delete?id=${s.regNo}"><button>delete</button></a></td>
</tr> 
</c:forEach>
</table>
</div>









<%-- <% List<Student> stud=(List<Student>)request.getAttribute("values"); %>

<div>

<table border=1 cellspacing="4px" cellpadding="5px">
<h1>Student Details</h1>
<tr>
<th>Register Number </th>
<th>Name </th>
<th>Mobile </th>
<th>Gender </th>
<th>Age </th>
<th>Address</th>
</tr>

<%for(Student s:stud){ %>
<tr>
<td><%=s.getRegNo() %> </td>
<td><%=s.getName()%> </td>
<td><%=s.getMobile()%> </td>
<td><%=s.getGender()%> </td>
<td><%=s.getAge()%> </td>
<td><%=s.getAddress()%> </td>
<td><a href="edit?id=<%=s.getRegNo() %>"> <button>Edit</button></a></td>
<td><a href="delete?id=<%=s.getRegNo() %>"><button>Delete</button> </a></td>
<%} %>
</tr>



</table>
</div> --%>
</body>
</html>