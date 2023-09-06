
<%@ page language="java" import="com.masti.orm.model.*"; contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form  action="added" method="POST">
 <label for="name">Name:</label>
 <input type="text"  name="eName" required> <br><br>
        
  <label for="name">id:</label>
 <input type="text"  name="empNo" required> <br><br>
 
 <label for="name">dept:</label>
 <input type="text"  name="deptNo" required> <br><br>
 
 <label for="name">JOB:</label>
 <input type="text"  name="job" required> <br><br>
       
 <label for="name">salary:</label>
 <input type="text"  name="salary" required> <br><br> 
  
  <input type="submit" value="Submit">
 
</form>
</body>
</html>