<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="domain.MemberBean"%>

<%MemberBean user = (MemberBean)session.getAttribute("user");%>
<%= user.getName()%>님 로그인!!<br />
<a href="member.do?cmd=logout">로그아웃</a>