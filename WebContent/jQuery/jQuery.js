//function to validate characters
function validate(){
	var charactersOnly = document.getElementById("form_login").elements["id"].value;
	if (!(charactersOnly.search(/[^a-zA-Z]+/) === -1)) {
		  alert("Enter Only characters");
		}
	
}


