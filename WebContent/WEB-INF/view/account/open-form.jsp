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
		<form action="account.do">
			<h1>계좌개설</h1>
			예치금 <input type="text" name="money" /> 
			<input type="hidden" name="cmd" value="open-account" />
			<input type="hidden" name="page" value="open-result" /> 
			<input type="submit" id="btn" value="확 인" />
		</form>
	</div>
</body>
</html>