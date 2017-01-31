package com.vivek.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vivek.loginApp.MailService;

public class TestMail {
	
public static void main(String arg[]){
		
		ApplicationContext appCntxt = new ClassPathXmlApplicationContext("SpringMailService.xml");
		
		MailService mailService = (MailService) appCntxt.getBean("mailService");
		
		mailService.sendMail("vivekseth09@gmail.com","vivekseth0944@gmail.com", "Testing", "Hello World !");	
		
		
	}

}
