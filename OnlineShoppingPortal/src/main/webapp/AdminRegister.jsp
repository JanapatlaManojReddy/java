<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Registration</title>
</head>
<body>
<form action ="user" method="post">
<table align="center" cellpadding="5px" cellspacing="5px" border="1px">
<tr>
<th>EMP NAME :</th>
<td><input type="text" name="fullName"></td>
</tr>
<tr>
<th>EMP ID :</th>
<td><input type="text" name="userName"></td>
</tr>
<tr>
<th>PASSWORD :</th>
<td><input type="password" name="passWord"></td>
</tr>

<tr>
<th>PHONE NUMBER :</th>
<td><input type="tel" name="phoneNumber"></td>
</tr>
<tr>
<th>EMAIL ID :</th>
<td><input type="email" name="emailId"></td>
</tr>
<tr>

<td><input type="submit" value="Register"></td>
<td><input type="reset" value="reset"></td>
<td> <a href="AdminLogin."><input type="button" value="login"></a></td>


</tr>

</table>


</form>


</body>
</html>