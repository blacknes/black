<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<script type="text/javascript" src="../js/jquery-1.7.1.min.js">
</script>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
		<script type="text/javascript">

</script>
	</head>
	<body>
		<h1>添加用户</h1>

		<form name="userForm" action="/ForCHat/user/updateUser" method="post">
			<input type="hidden" name="id" value="${user.id }">
			名：
			<input type="text" name="firstName" value="${user.firstName}">
			姓：
			<input type="text" name="lastName" value="${user.lastName}">
			年龄：
			<input type="text" name="age" value="${user.age }">
			gender：
			<input type="text" name="gender" value="${user.gender }">
			desc：
			<input type="text" name="description" value="${user.description }">
			<input type="submit" value="编辑">

		</form>

	</body>
</html>