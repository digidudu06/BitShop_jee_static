<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<img src="<%= request.getContextPath() %>/resources/img/2019-new-year.gif" alt="" />
	</div>
	<h1>메  뉴</h1>
	<a href="member/main.jsp">회원 관리</a>
	<a href="account/main.jsp">계좌 관리</a>
	<a href="article/main.jsp">게시판</a>
	<a href="">관리자</a>
</body>
</html>