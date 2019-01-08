<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="domain.MemberBean" %>
<div id="myPage">
	<h1>마이페이지</h1>
	<%
	MemberBean member = (MemberBean)request.getAttribute("member");
	%>
	<table>
		<tr>
			<th>\</th>
			<th>내용</th>
		</tr>
		<tr>
			<td>ID</td>
			<td><%= member.getId() %></td>
		</tr>
		<tr>
			<td>PASS</td>
			<td><%= member.getPass() %></td>
		</tr>
		<tr>
			<td>NAME</td>
			<td><%= member.getName() %></td>
		</tr>
		<tr>
			<td>SSN</td>
			<td><%= member.getSsn() %></td>
		</tr>
	</table>
</div>