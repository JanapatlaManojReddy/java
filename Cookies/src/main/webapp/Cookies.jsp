<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
#abc{
margin:0 auto 0 auto;
}
</style>
</head>
<body>
<form action ="servlet1" method="post">
<table id ="abc" cellpadding ="5" cellspacing="5">
<tr>
<td>
USER NAME</td>
<td> <input type = "text" name="username" ></td>
</tr>
<tr>
<td>PASSWORD </td> <td><input type="text" name="password"></td>
</tr>
<tr><td><input type ="submit" value = "submit"></td></tr>

</table>
</form>

</body>
</html>