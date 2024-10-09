<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>create account</title>
<style>
div{
height:300px;
width:300px;
margin-top:200px;
margin-left:550px;
border:2px solid red;
background-color:rgba(200,0,0,0.7);
}
button{
width:90px;
height:50px;
border-radius:13%;
font-size:large;
font-weight:bold;
}

button:hover{
color:white;
background-color:maroon;

}
.m1{
color:green;
}


</style>
</head>
<body>
<div align="center">
<h1 align="center">${create}</h1>
<h1 align="center"> Create Account</h1>
<form action="createAccount" method="post" >
UserName:<input type="text" required name="username">
<br><br>
Password:<input type="password" name="password">
<br><br>
<button>create</button>

</form>


</div>
</body>
</html>