<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home</title>
<style>

div{
height:300px;
width:300px;
margin-top:200px;
margin-left:550px;
border:2px solid black;
background-color:rgba(220,0,0,0.5);

}
button{
width:110px;
height:70px;
border-radius:13%;
font-size:large;
font-weight:bold;
}

button:hover{
color:white;
background-color:maroon;

}
h1{
color:green;

}
</style>
</head>
<body>
<h1 align="center">${msg}</h1>

<div align="center">
<h2>Student Portel</h2>
<br>
<a href="add-student"><button>Add Record</button></a><br><br>
<a href="fetch-all"><button>Fetch Record</button></a>


</div>
</body>
</html>