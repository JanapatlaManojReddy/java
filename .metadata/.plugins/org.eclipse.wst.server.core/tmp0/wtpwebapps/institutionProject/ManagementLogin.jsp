<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>


</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="formValidation.js"> </script>
<body>
<form  name="myform" action="ManagerServlet" onsubmit="return validation()" method="post">
<fieldSet>
<legend>ManagementLogin</legend>
<div>
<lable for="username">USERNAME:</lable>
<input type="text" name="username">
<p id="user"></p>
<lable for="password">PASSWORD:</lable>
<input type="password" name="password">
<p id="pass"></p> 
<input type="submit" value="submit">
</div>
</fieldSet>
</form>

</body>
</html>