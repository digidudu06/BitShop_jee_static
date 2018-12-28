<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원관리</h1>
	<p>회원 가입</p>
	<form action="join-result.jsp">
		ID 	<input type="text" name="id" /><br />
		이름 	<input type="text" name="name" /><br />
		비밀번호 <input type="text" name="pass" /><br />
		주민번호 <input type="text" name="ssn" /><br />
		<input type="submit" id="btn" value="JOIN" />
	</form>
</body>
</html>