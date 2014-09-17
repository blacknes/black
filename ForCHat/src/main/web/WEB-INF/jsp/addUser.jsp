<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="../../js/jquery-1.7.1.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function addUser(){
		var form = document.forms[0];
		form.action="/ForCHat/user/addUser";
		form.method="post";
		form.submit();
	}
</script>
</head>
<body>
	<h>添加用户</h>
	<form name="userForm" action="">
		firstName:<input type="text" name="firstName"></br>
		lastName:<input type="text" name="lastName"></br>
		age:<input type="text" name="age"></br>
		desc:<input type="text" name="description"></br>
		gender:<input type="radio" name="gender" value="male">male
				<input type="radio" name="gender" value="Female">Female
	
		<input type="button" value="添加" onclick="addUser()">
		
		
	
	</form>
	
	
	
</body>
</html>