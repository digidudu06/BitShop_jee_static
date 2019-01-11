<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
			<%
			String dest = request.getAttribute("dest")+"";
			if(dest.equals("join-form")){
				%><%@ include file="side-join.jsp" %><%
			}else{
				%><%@ include file="side-menu.jsp" %><%
			}
			%>
		</td>
		<td>
			<%
			switch(dest){
			case "NONE":
				break;
			case "join-form":
				%><%@ include file="join-form.jsp" %><%
				break;
			case "member-detail": 
				%><%@ include file="member-detail.jsp" %><%
				break;
			case "member-update": 
				%><%-- <%@ include file="member-update.jsp" %> --%><%
				break;
			} %>
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