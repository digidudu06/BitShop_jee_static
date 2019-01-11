<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="domain.MemberBean" %>
<div id="member-detail">
	<h1>마이페이지</h1>
	<%
	MemberBean user = (MemberBean)session.getAttribute("user");
	%>
	<table>
		<tr>
			<th>\</th>
			<th>내용</th>
		</tr>
		<tr>
			<td>ID</td>
			<td><%= user.getId() %></td>
		</tr>
		<tr>
			<td>PASS</td>
			<td><%= user.getPass() %></td>
		</tr>
		<tr>
			<td>NAME</td>
			<td><%= user.getName() %></td>
		</tr>
		<tr>
			<td>SSN</td>
			<td><%= user.getSsn() %></td>
		</tr>
	</table>
</div>