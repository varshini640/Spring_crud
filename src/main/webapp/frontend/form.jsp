<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form</title>
<style>

div{
height:400px;
width:300px;
margin-top:200px;
margin-left:550px;
border:2px solid black;
background-color:rgba(220,0,0,0.5);
}

form{

margin-top:20px;
margin:left:20px;
}

button{
width:100px;
height:50px;
font-size:large;
font-weight:bold;
border-radius:12%;
}

button:hover{
color:white;
background-color:maroon;
}
label{
font-size:medium;
font-weight:bold;
}



</style>
</head>
<body>
<div align="center">
<form action="add-student" method="post">
<h2>Form</h2>


<label for="name">Name:</label>
<input type="text" id="name" name="name" ><br><br>

<label for="mobile">Mobile:</label>
<input type="tel"  pattern="[0-9]{10}" id="mobile" name="mobile" ><br><br>

<label for="age">Age:</label>
<input type="number" id="age" name="age" ><br><br>

<label >Gender:</label>
<br><input type="radio" name="gender" value="male">Male<br>

      <input type="radio" name="gender" value="female">Female<br>
<label for="address">Address:</label>
<input type="text" id="address" name="address"><br><br><br>

<button>Save</button>

</form>
</div>
</body>
</html>