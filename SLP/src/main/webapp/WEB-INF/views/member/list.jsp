<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>목록</title>
</head>
<body>
<h1>회원목록</h1>
<table>
	<td>아이디</td>
	<td>이름</td>
	<td>생성및업데이트 날자</td>	
	<c:forEach items="${memberlists}"  var="data">
		<tr>
			<td>${data.id}</td><td>${data.name }</td><td>${data.regist_day}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>