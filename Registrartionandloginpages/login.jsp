<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <div align = center>
  <h1>User Login</h1>
  </div>
  <div align = center>
  <form action="LoginServlet" method="post">
   <table>
   <tr><td>Enter Username:</td><td><input type ="text" name ="uname"></td> </tr>
   <tr><td>Enter Password:</td><td><input type ="password" name ="password"></td> </tr>
   <tr><td><input type ="submit" value =Login></td><td><input type ="reset"></td></tr>   
   </table>
  </form>
   <div>
  <p>Don't have an account??
  <a href="memberRegister.jsp"> Click here to Register</a>
  </p>
  </div>
  </div>
  
</body>
</html>