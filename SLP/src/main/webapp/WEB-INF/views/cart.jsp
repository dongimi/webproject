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
	<h1>��ٱ���</h1>
	<table>
		<td>��ǰ</td>
		<td>��ǰ��</td>
		<td>����</td>
		<td>����</td>
		<td>����</td>
		<c:forEach items="${cartlist}" var="data">
			<tr>
				<td><img alt="" src="" style="width: 100%"></td>
				<%-- 			<td><img alt="" src="./resources/images/${data.image}" style="width: 100%"></td> --%>
				<td>${data.cartId}</td>
				<td>${data.memberId}</td>
				<td><form action="/cartUpdate" type="post">
					<input type="number" name="quantity" value="${data.quantity}">
					<br><input type="submit" value="����">
				</form></td>
				<td><form action="/cartDelete" method="post">
						<input type="hidden" name="cartId" value="${data.cartId}">
						<input type="submit" value="����">
					</form></td>
			</tr>
		</c:forEach>
		</form>
	</table>
</body>
</html>