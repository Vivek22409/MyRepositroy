<%@page import="com.vivek.loginApp.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="com.vivek.loginApp.EmployeeDAO"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="emp" class="com.vivek.loginApp.Employee">
		<jsp:setProperty name="emp" property="*" />
	</jsp:useBean>
	<%
		/* EmployeeEntity myEmpEntity = new EmployeeEntity();
		Employee empl = new Employee();
		myEmpEntity.setName((String) request.getParameter("name"));		
		myEmpEntity.setDepartment(request.getParameter("department"));
		myEmpEntity.setMailId(request.getParameter("mailId"));
		session.setAttribute("myEmpEntity", myEmpEntity); */
		
		session.setAttribute("emp", emp);
		
	%>
	<%	
		EmployeeDAO empDAO = new EmployeeDAO();
		int i = empDAO.persistEmployee(emp);
		if (i > 0) {
	%>
	<center>
		<h2>Hello
		<!-- Using above mentioned bean to get property -->
		<jsp:getProperty name="emp" property="name" /> 
		! Your registration is successful.</h2>
		<br/>
		A mail has been sent to your mail Id !
	</center>
	<%
		} else {
	%>
	Registration failed !
	<%
		}
	%>


</body>
</html>