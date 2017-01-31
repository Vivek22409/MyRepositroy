package com.vivek.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTestClass {
	
	public static void main(String[] args){
		
		ApplicationContext myAppCntxt = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Student myStudent = ( Student ) myAppCntxt.getBean("studentbean") ;
		
		System.out.println(myStudent.getName());
	}
}
