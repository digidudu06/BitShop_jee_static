<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String name = request.getAttribute("name") + "";
	if (name.equals("Park")) {
		%><%=name%>님 로그인!!<%
	}
%>