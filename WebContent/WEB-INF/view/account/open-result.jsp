<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="domain.*" %>
<%@ include file="../home/head.jsp" %>
<body>
<table id="wrapper">
	<tr>
		<td colspan="2">
			<%@ include file="../home/header.jsp" %>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<%@ include file="../home/navi-bar.jsp" %>
		</td>
	</tr>
	<tr  style="height: 300px">
		<td id="side-menu">
			<%@ include file="side-menu.jsp" %>
		</td>
		<td>
			<div>
			<%
			AccountBean openAccount = (AccountBean)request.getAttribute("openAccount");
			String accNum = openAccount.getAccountNum();
			String money = Integer.toString(openAccount.getMoney());
			String today = openAccount.getToday();
			%>
			<h2>성공적으로 개설 되었습니다</h2>
			<h4>계좌번호 : <%= accNum %></h4>
			<h4>잔      액 : <%= money %>원</h4>
			<h4>개 설 일 : <%= today %></h4>
			</div>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<%@ include file="../home/footer.jsp" %>
		</td>
	</tr>
</table>
</body>
</html>