<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="UserLogin" name="myform" method="get">
<h4 align="center">User login</h4>
<table align="center" cellpadding="5px" border =1>
<tr>
<th>USER NAME :</th>
<td><input type="text" name="userName" required></td>
</tr>
<tr>
<th>PASSWORD :</th>
<td><input type="password" name="passWord" required></td>
</tr>
<tr>
<td><input style="align:center" type="submit" value="login" ></td>
<td><input type="reset" value="cancel"></td>

</tr>
<tr>
<th> not yet registered? </th>
<th><a style="text-align:center"href="UserRegister.jsp"><input type="button" value="Register"></a></th>
</tr>
<tr>
<td><a href="AdminLogin.jsp"><input type="button" value="Admin"></a></td>
<td><a href="SellerLogin.jsp"><input type="button" value="Seller"></a></td>

</tr>


</table>
</form>

</body>
</html>