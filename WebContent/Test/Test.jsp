<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
	function print() {
		alert("hello");
		var x = document.getElementById("formName").elements[0].value;
		//var x = document.getElementById("form").elements["role"].value;
		alert(x);
	}
</script>
</head>
<body>
	<%
		List<String> roles = new ArrayList<String>();
		roles.add("Devloper");
		roles.add("Tester");
		roles.add("Analyst");
		roles.add("Manager");
		Collections.sort(roles);
		out.print(roles);

		session.setAttribute("roles", roles);
	%>

	<form id="formName" action="">
		Select box:<select id="rolel" name='role' onchange="print();">
			<option value="selected" selected>selected</option>
			<c:forEach items="${roles}" var="role">
				<c:if test="${role != selected}">
					<option value="${role}">${role}</option>
				</c:if>
			</c:forEach>
		</select>


	</form>
</body>
</html>