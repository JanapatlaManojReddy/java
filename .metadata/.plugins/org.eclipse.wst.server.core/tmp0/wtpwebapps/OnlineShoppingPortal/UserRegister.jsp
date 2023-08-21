<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
<style>
body{background-color:lightblue;
margin:250px;

background-size:cover;
}
</style>
</head>
<body style="background-image:url('bgimage.jpeg');">
<form action ="UserRegister" method="post">
<table align="center" cellpadding="5px" cellspacing="5px" border="1px">
<tr>
<th>FULL NAME :</th>
<td><input type="text" name="fullName" required></td>
</tr>
<tr>
<th>USER NAME :</th>
<td><input type="text" name="userName" required></td>
</tr>
<tr>
<th>PASSWORD :</th>
<td><input type="password" name="passWord" required></td>
</tr>

<tr>
<th>PHONE NUMBER :</th>
<td><input type="tel" name="phoneNumber" required></td>
</tr>
<tr>
<th>EMAIL ID :</th>
<td><input type="email" name="emailId" required></td>
</tr>
<tr>

<td><input type="submit" value="Register"></td>
<td><input type="reset" value="reset"></td>
<td> <a href="UserLogin.jsp"><input type="button" value="login"></a></td>


</tr>

</table>


</form>


</body>
</html>