<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="domain.*" %>

<div id="open-result">
	<%
	AccountBean account = (AccountBean)request.getAttribute("account");
	String accNum = account.getAccountNum();
	String money = Integer.toString(account.getMoney());
	String today = account.getToday();
	%>
	<h2>성공적으로 개설 되었습니다</h2>
	<h4>계좌번호 : <%= accNum %></h4>
	<h4>잔      액 : <%= money %>원</h4>
	<h4>개설일시 : <%= today %></h4>
</div>
