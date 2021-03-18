<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Info Form </title>
</head>
<body>

<h1>Enter the student details</h1>

<form action="student_form" method="POST">
	Student Name: <input type="text" name="name"><br><br>
	Student Address: <input type="text" name="address"> <br><br>
	Student email: <input type="text" name="email"> <br><br>
	Student Father Name: <input type="text" name="fname"><br><br>
	Student Age: <input type="text" name="age"><br><br>
	
	<input type="submit" value="Submit">
</form>

</body>
</html>