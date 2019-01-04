<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
<table id="wrapper">
	<tr>
		<td colspan="2">
			<h1 style="text-align: center">비트 쇼핑몰</h1>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<%@ include file="../home/navi-bar.jsp" %>
		</td>
	</tr>
	<tr  style="height: 300px">
		<td id="side-menu">
			<%@ %>
		</td>
		<td>
			<div>
			<h2>성공적으로 개설 되었습니다</h2>
			<h4>계좌번호 : </h4>
			<h4>잔액 : <%= request.getParameter("money") %>원</h4>
			</div>
		</td>
	</tr>
</table>
</body>
</html>