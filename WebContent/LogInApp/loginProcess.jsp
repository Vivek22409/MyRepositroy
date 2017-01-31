<%@ page import="java.util.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.vivek.loginApp.*"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		EmployeeDAO empDAO = new EmployeeDAO();
		List<EmployeeEntity> empList = empDAO.fetchData();
		int flag = 0;
		String id = (String) request.getParameter("id");
		for (int i = 0; i < empList.size(); i++) {
			if (id.equalsIgnoreCase(empList.get(i).getName())) {
				flag = 1;
			}
		}
		if (flag == 1) {
	%>
	<center><h2>Welcome Mr.	<%=id%> !</h2></center>
	<% } else { 
		request.setAttribute("id", id);
		RequestDispatcher reqDis = request.getRequestDispatcher("error.jsp");
		reqDis.forward(request, response);
	}
	%>
</body>
</html>