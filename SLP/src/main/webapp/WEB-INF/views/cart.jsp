<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>장바구니</h1>
	<table>
		<td>상품</td>
		<td>상품명</td>
		<td>가격</td>
		<td>수량</td>
		<td>삭제</td>
		<c:forEach items="${cartlist}" var="data">
			<tr>
				<td><img alt="" src="" style="width: 100%"></td>
				<%-- 			<td><img alt="" src="./resources/images/${data.image}" style="width: 100%"></td> --%>
				<td>${data.cartId}</td>
				<td>${data.memberId}</td>
				<td><form action="/cartUpdate" type="post">
					<input type="number" name="quantity" value="${data.quantity}">
					<br><input type="submit" value="수정">
				</form></td>
				<td><form action="/cartDelete" method="post">
						<input type="hidden" name="cartId" value="${data.cartId}">
						<input type="submit" value="삭제">
					</form></td>
			</tr>
		</c:forEach>
		</form>
	</table>
</body>
</html>