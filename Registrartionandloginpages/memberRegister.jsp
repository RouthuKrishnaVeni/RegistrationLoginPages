<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align=center>
		<form action="Register" method="post">
			<table>
				<tr>
					<td>User Name</td>
					<td><input type="text" name="uname"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="text" name="email"></td>
				</tr>
				<tr>
					<td>Phone</td>
					<td><input type="text" name="phone"></td>
				</tr>
				<tr>
					<td>Submit</td>
					<td><input type="submit" value="register"></td>
				</tr>
			</table>
		</form>
		<div>
			<p>
				Already have an account? <a href="login.jsp"> click here to LOGIN </a>
			</p>
		</div>
	</div>


</body>
</html>