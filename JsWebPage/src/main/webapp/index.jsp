<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration form</title>
</head>
<body>

<h1> Register Form</h1>
<form action="" method="post"  name="myform">
			<table style="width: 50%">
				<tr>
					<td>First Name</td>
					<td><input type="text" name="first_name" class="form-control"  required/></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="last_name" class="form-control" required/></td>
				</tr>
				<tr>
					<td>Age</td>
					<td><input type="text" name="age" class="form-control" required /></td>
				</tr>
					<tr>
					<td>Gender</td>
					<td><input type="radio" name="male" value="1" class="form-control" /> Male
					<input type="radio" name="female" value="0" class="form-control" /> Female</td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" name="address" class="form-control" /></td>
				</tr>
				<tr>
					<td>City</td>
					<td><input type="text" name="city" class="form-control"/></td>
				</tr></table>
			<input type="submit" value="Submit" class="form-control" /></form>
			<script>  
function validateform(){  
var fname=document.myform.first_name.value;  
 
  alert(fname);
if(fname.length<2){  
  alert("fname must be at least 2 characters long.");  
  return false;  
  } 
if(document.getElementById('male').checked == false) {   
    document.write("Summer radio button is selected");   
} else {  
    document.write("Summer radio button is not selected");   
}   
}  
</script>
</body>
</html>