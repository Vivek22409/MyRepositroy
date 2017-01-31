<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../css/loginStyle.css">
<script type="text/javascript">
	
</script>
</head>
<body>
	<div id="tableContainer-1">
		<div id="tableContainer-2">
			<h2 id="header_text">Registration Form:</h2>
			<div id="parent">
				<form id="form_login" action="registrationProcess.jsp" method="post">
					<table id="myTable" border="0">
						<tr>
							<td>Name:</td>
							<td><input type="text" name="name" /></td>
						</tr>
						<tr>
							<td>Department:</td>
							<td><input type="text" name="department" /></td>
						</tr>
						<tr>
							<td>EmailId:</td>
							<td><input type="text" name="mailId" /></td>
						</tr>
					</table>
					<br />
					&nbsp;&nbsp;&nbsp;
					<input type="button" value="Back" onclick="window.location='LogIn.html'" />
					&nbsp;&nbsp;&nbsp;&nbsp;
					<input type="submit" name="submit" />
				</form>
			</div>
		</div>
	</div>
</body>
</html>