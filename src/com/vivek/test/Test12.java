package com.vivek.test;

import org.apache.commons.validator.routines.UrlValidator;

public class Test12 {

	/*public static void main(String arg[]){
		String[] schemes = {"http","https","ftp"}; // DEFAULT schemes = "http", "https", "ftp"
		UrlValidator urlValidator = new UrlValidator(schemes);
		if (urlValidator.isValid("https://www.ang.nic.in")) {
			System.out.println("url is valid");
		} else {	
			System.out.println("url is invalid");
		}
	}*/
	
	public static void main(String arg[]){
		
		int i = 1 ;
		
		System.out.println(Integer.SIZE);
		System.out.println(Character.SIZE);
	}

	/*public static void main(String arg[]){
		String regex2 = "/((([A-Za-z]{3,9}:(?:\/\/)?)(?:[-;:&=\+\$,\w]+@)?[A-Za-z0-9.-]+|(?:www.|[-;:&=\+\$,\w]+@)[A-Za-z0-9.-]+)((?:\/[\+~%\/.\w-_]*)?\??(?:[-\+=&;%@.\w_]*)#?(?:[\w]*))?)/";
		String regex1 = "(@)?(href=')?(HREF=')?(HREF=\")?(href=\")?(http://)?[a-zA-Z_0-9\\-]+(\\.\\w[a-zA-Z_0-9\\-]+)+(/[#&\\n\\-=?\\+\\%/\\.\\w]+)?";
		String regex = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
		String text = "http://ang.google";
		System.out.println(IsMatch(text,regex1));
	}

	private static boolean IsMatch(String s, String pattern) {
		try {
			Pattern patt = Pattern.compile(pattern);
			Matcher matcher = patt.matcher(s);
			return matcher.matches();
		} catch (RuntimeException e) {
			return false;
		}  

	}*/
}
