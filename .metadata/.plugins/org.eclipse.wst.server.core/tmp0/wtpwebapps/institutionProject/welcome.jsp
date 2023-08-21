<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width,initial-scale=1.0">
<title>welcome to coding hub </title>
<style>

.container {
background:rgb(253,223,221,0.5)  no-repeat fixed;

}
.container2{

background-image: url("C:\java programs\institutionProject\src\main\webapp\tree-736885_640.jpg");
}
#id1{
text-color:green;
background-color:yellow;
}

ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

li {
  float: left;
}

li a {
  display: inline-block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover {
  background-color: #111;
}

.active {
  background-color: lightblue;
}
</style>

</head>
<body >
<ul>
  <li><a href="#home" class="active">Home</a></li>
  <li><a href="#news">News</a></li>
  <li><a href="#contact">Contact</a></li>
  <li><a href="#about">About</a></li>
</ul>

<div class="container">

<form>
<fieldSet align="center">
<legend><h1>courser Offered</h1></legend>
<div class ="container2">
<table align="center" cellspacing="5" cellpadding="5">
<tr>
<th>Course </th>
<th>Duration</th>
<th>Fees</th>
</tr>
<tr>
<td>Angular/js/react</td>
<td>3 months</td>
<td>25000</td>

</tr>
<tr>
<td>JavaFullStack</td>
<td>5 months</td>
<td>45000</td>

</tr>
<tr>
<td>PythonFullStack</td>
<td>4 months</td>
<td>35000</td>

</tr>
<tr>
<td>Java</td>
<td>2 months</td>
<td>15000</td>

</tr>
<tr>
<td>html/css</td>
<td>45 days</td>
<td>10000</td>

</tr>
<tr>
<div id="id1">
<td><a href="StudentRegistration.jsp"><button>enroll</a></button></td>
<td>
</div>
</td>
<td><a href="ManagementLogin.jsp"><button>AdminLogin</a></button></td>
</tr>
</table>
</div>

</feildSet>
</form>

</div>

</body>
</html>