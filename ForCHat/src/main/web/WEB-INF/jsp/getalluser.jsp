<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="../js/jquery-1.7.1.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function del(id){
		$.get("/ForCHat/user/deleteUser?id=" + id,function(data){
			alert(data.result);
			if("success" == data.result){
				alert("删除成功!");
				window.location.reload(); 
			}else{
				alert("删除失败!")
			}
		});
	}

</script>
</head>
<body>
	
	<table border="1">
		<tbody>
			<tr>
				<th>名</th>
				<th>姓</th>
				<th>年龄</th>
				<th>性别</th>
				<th>描述</th>
				<th>编辑</th>
			</tr>
			<c:if test="${!empty user }">
			<c:forEach items="${user }" var="u">
			<tr>
				<td>${u.firstName }</td>
				<td>${u.lastName  }</td>
				<td>${u.age }</td>
				<td>${u.gender }</td>
				<td>${u.description }</td>
				<td>
					<a href="/ForCHat/user/getUser?id=${u.id }">编辑</a>
					<a href="javascript:del('${u.id }')">删除</a>
				</td>
			</tr>
			</c:forEach>
			</c:if>
		</tbody>
	</table>
	<h4>删除功能缺陷。。。不知道是不是少jar包的原因，单独请求就可以删除</h4>
</body>
</html>