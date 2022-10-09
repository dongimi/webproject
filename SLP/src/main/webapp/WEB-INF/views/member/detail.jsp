<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세</title>
</head>
<body>
<h1>맴버 상세</h1>
<p> 아이디 : ${data.id}</p>
<p> 이름 : ${data.name}</p>
<p> gender : ${data.gender}</p>
<p> regist_day : ${data.regist_day}</p>
	<p>
		<a href = 'update?id=${data.id}'>수정</a>
	</p>
<form action="/delete" method="post">
	<input type="hidden" name="id" value="${data.id}">
	<input type="submit" value="삭제">
</form>	
	<p>
		<a href = '/list'>목록</a>
	</p>
</body>
</html>