<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- <link rel="stylesheet" type="text/css" href="../css/loginStyle.css"> -->
<link rel="stylesheet" type="text/css" href="css/loginStyle.css">
<!-- <link rel="stylesheet" type="text/css" href="css/formValid.css"> -->
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
						<tr>
							<td>Password:</td>
							<td><input type="text" name="password" /></td>
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
	
	<!-- <div id="fixedheader"></div>
	<div id="main">

		<div id="form_layout">
			<h2>Registration Form:</h2>

			Form starts from here
			<form id="form_login" action="registrationProcess.jsp" method="post" onsubmit='return formValidation()'>
				<br>
				<p id="head"></p>
				<br> <label>Name:</label> <input type="text" name="name" onblur="validate();"/><br />
				<p id="p1"></p>
				This segment displays the validation rule for name

				<label>Department:</label> <input type="text" name="department" /><br />
				<p id="p2"></p>
				
				<label>EmailId:</label> <input type="text" name="mailId" /><br />
				<p id="p2"></p>
				
				<label>Password:</label> <input type="text" name="password" /><br />
				<p id="p2"></p>
				This segment displays the validation rule for user name

				<label>Email:</label> <input type='text' id='email' /><br />
				<p id="p3"></p>
				This segment displays the validation rule for email

				<label>State:</label> <select id='state'>
					<option>Please Choose</option>
					<option>America</option>
					<option>Australia</option>
					<option>Sweden</option>
					<option>Africa</option>
				</select><br />
				<p id="p4"></p>
				This segment displays the validation rule for selection

				<label>Address:</label> <input type='text' id='addr' /><br />
				<p id="p5"></p>
				This segment displays the validation rule for address

				<label>Zip Code: </label> <input type='text' id='zip' /><br />
				<p id="p6"></p>
				This segment displays the validation rule for zip
	
				<br /><input type="submit" name="submit" /> <br />
				<br /> If Not Registered User ! <a href="registration.jsp"> Click here</a>
			</form>

		</div>
		Right side div
		<div id="formget">
			<a href=http://www.formget.com/app><img src="images/formGetadv-1.jpg"
				alt="Online Form Builder" /></a>
		</div> 


	</div>
	<div id="fixedfooter"></div> -->
</body>
</html>