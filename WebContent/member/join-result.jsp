<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String id = request.getParameter("id");
String name = request.getParameter("name");
String pass= request.getParameter("pass");
String ssn = request.getParameter("ssn");

String[] ssnArr = ssn.split("");
String year = ssnArr[0] + ssnArr[1];
String month = ssnArr[2] + ssnArr[3];
String day = ssnArr[4] + ssnArr[5];

String gender = request.getParameter("gender");
switch(ssnArr[7]){
	case "1": case"3":
		gender = "남자";
		break;
	case "2": case"4":
		gender = "여자";
		break;
	case "5": case "6":
		gender = "외국인";
		break;
	default:
		gender = "다시 입력하세요";
		break;
}

String bmiResult = request.getParameter("bmiResult");
double height = Double.parseDouble(request.getParameter("height"));
double weight = Double.parseDouble(request.getParameter("weight"));
double bmi = 0.0;
bmi = weight/(height*height*0.0001);
if(bmi>=40){
	bmiResult = "고도 비만";
}else if(bmi>=35){
	bmiResult = "중등도 비만";
}else if(bmi>=30){
	bmiResult = "경도 비만";
}else if(bmi>=25){
	bmiResult = "과체중";
}else if(bmi>=18.5){
	bmiResult = "정상";
}else{
	bmiResult = "저체중";
}

%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="login-result">
	<h3>가입한 ID : <%= id %></h3><br />
	<h3>이름 : <%= name %></h3><br />
	<h3>가입한 pass : *******</h3><br />
	<h3>생년월일 : <%= year %>년 <%=month %>월 <%= day %>일생</h3><br />
	<h3>성별 : <%= gender %></h3><br />
	<h3>BMI : <%= bmiResult %></h3>
	<a href="login-form.jsp">로그인으로 이동</a>
	<a href="../index.jsp">홈으로 이동</a>
	</form>
</body>
</html>