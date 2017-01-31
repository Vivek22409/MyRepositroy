package com.vivek.loginApp;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeDAO {

	/*public static Session getSession(){
		//creating configuration object
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file

		Session session=new Configuration().configure().buildSessionFactory().openSession();	
		
		return session;
	}*/
	
	public  MailService getEmailService(){
		ApplicationContext appCntxt = new ClassPathXmlApplicationContext("SpringMailService.xml");
		MailService mailService = (MailService) appCntxt.getBean("mailService");
		return mailService;
	}
	
	public int persistLogInDetails(LogInBean logInBean){

		int i = 0;
		
		Configuration cfg=new Configuration();
		//populates the data of the configuration file
		cfg.configure("hibernate.cfg.xml");

		Session session=new Configuration().configure().buildSessionFactory().openSession();		
		
		Transaction t = session.beginTransaction();
		session.persist(logInBean);		
		t.commit();		
		
		session.close();
		
		return ++i;			
	}

	public int persistEmployee(Employee emp){

		int i = 0;
		
		Configuration cfg=new Configuration();
		//populates the data of the configuration file
		cfg.configure("hibernate.cfg.xml");

		Session session=new Configuration().configure().buildSessionFactory().openSession();
		
		EmployeeEntity myEmpEnt =  new EmployeeEntity();
		myEmpEnt.setName(emp.getName());
		myEmpEnt.setDepartment(emp.getDepartment());
		myEmpEnt.setMailId(emp.getMailId());
		myEmpEnt.setPassword(emp.getPassword());
		
		Transaction t = session.beginTransaction();
		session.persist(myEmpEnt);		
		t.commit();
		
		session.close();		

		getEmailService().sendMail("vivekseth09@gmail.com", emp.getMailId(), "Registration", "Hello " +emp.getName()+"! Thanks for registration");
		return ++i;			
	}

	@SuppressWarnings("unchecked")
	public List<EmployeeEntity> fetchData(){
		List<EmployeeEntity> empList = null;
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file

		Session session=new Configuration().configure().buildSessionFactory().openSession();
		
		Transaction t = session.beginTransaction();		
		Query query = session.createQuery("from EmployeeEntity");
		empList =  query.list();		
		t.commit();
		session.close();
		
		return empList;		 
	}
	
	/*public static void main(String arg[]){
		List<EmployeeEntity> empList = fetchData();
		for(int i = 0;i < empList.size();i++){
			if("vivek".equalsIgnoreCase(empList.get(i).getName())){
				
			}
		}
		Employee myEmpEnt =  new Employee();
		myEmpEnt.setName("Vivek");
		myEmpEnt.setDepartment("IT");
		myEmpEnt.setMailId("vivekkumar0888@yahoo.com");
		
		new EmployeeDAO().persistEmployee(myEmpEnt);
	}*/
}
