package com.vivek.test;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyDemo {
	
	public static void main(String arg[]) throws IOException{
		
		FileReader fr =  new FileReader("C:/Users/Vivek/Desktop/MyWorkspace/MySpringProject/src/config.properties");
		
		Properties p =  new Properties();
		p.load(fr);
		
		System.out.println(p.getProperty("hello"));
		
	}
}
