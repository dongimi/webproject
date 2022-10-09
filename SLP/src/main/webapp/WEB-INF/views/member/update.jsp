<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>${message}</p>
	<form method="post">
		<p>아이디 : <input type="text" name="id" value="${data.id}" disabled="disabled">
		<p>패스워드 : <input type="password" name="passwd">
		<p>이름 : <input type="text" name="name" value="${data.name }">
		<p>등록및수정날자 : <input type="text" name="regist_day" value="${data.regist_day}" disabled="disabled">
		<p><input type="submit" value="수정">
	</form>
</body>
</html>