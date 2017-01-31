package com.vivek.loginApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service("mailService")
public class MailService {
	@Autowired		
	private MailSender mailSender;
	@Autowired		
	private SimpleMailMessage alertMailMessage;	
	
	public void sendMail(String from, String to, String subject, String body){			
		
		SimpleMailMessage smpMsg = new SimpleMailMessage();
		
		smpMsg.setFrom(from);
		smpMsg.setTo(to);
		smpMsg.setSubject(subject);
		smpMsg.setText(body);
		
		mailSender.send(smpMsg);
	}
	
	public void sendAlertMail(String alert){
		
		SimpleMailMessage msg = new SimpleMailMessage(alertMailMessage);
		
		msg.setText(alert);
		
		mailSender.send(msg);
	}
}
