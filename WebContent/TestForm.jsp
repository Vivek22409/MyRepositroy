

<html>
<head>
<title>Form Validation:Demo Preview</title>
<meta name="robots" content="noindex, nofollow">

<link rel="stylesheet" type="text/css" href="css/formValid.css">
<script src="javascript/formValid.js"></script>

<script type="text/javascript">//<![CDATA[
        /* // Google Analytics for WordPress by Yoast v4.3.5 |http://yoast.com/wordpress/google-analytics/
            var _gaq = _gaq || [];
            _gaq.push(['_setAccount', 'UA-43981329-1']);
            _gaq.push(['_trackPageview']);
            (function () {
                var ga = document.createElement('script');
                ga.type = 'text/javascript';
                ga.async = true;
                ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';

                var s = document.getElementsByTagName('script')[0];
                s.parentNode.insertBefore(ga, s);
            })();
        //]]> */</script>
</head>
<body>
	<div id="fixedheader">Top div content</div>
	<div id="main">

		<div id="form_layout">
			<h2>JavaScript Form Validation</h2>

			<!-- Form starts from here-->
			<form onsubmit='return formValidation()'>
				<br>
				<p id="head"></p>
				<br> <label>Full Name:</label> <input type='text'
					id='firstname' /><br />
				<p id="p1"></p>
				<!--This segment displays the validation rule for name-->

				<label>Username(6-8 characters):</label> <input type='text'
					id='username' /><br />
				<p id="p2"></p>
				<!--This segment displays the validation rule for user name-->

				<label>Email:</label> <input type='text' id='email' /><br />
				<p id="p3"></p>
				<!--This segment displays the validation rule for email-->

				<label>State:</label> <select id='state'>
					<option>Please Choose</option>
					<option>America</option>
					<option>Australia</option>
					<option>Sweden</option>
					<option>Africa</option>
				</select><br />
				<p id="p4"></p>
				<!--This segment displays the validation rule for selection-->

				<label>Address:</label> <input type='text' id='addr' /><br />
				<p id="p5"></p>
				<!--This segment displays the validation rule for address-->

				<label>Zip Code: </label> <input type='text' id='zip' /><br />
				<p id="p6"></p>
				<!--This segment displays the validation rule for zip-->

				<input type='submit' id="submit" value='Check Form' /><br />
			</form>

		</div>
		<!-- Right side div -->
		<div id="formget">
			<a href=http://www.formget.com/app><img src="images/formGetadv-1.jpg"
				alt="Online Form Builder" /></a>
		</div>


	</div>
	<div id="fixedfooter">Bottom div content</div>
</body>
</html>
