package com.vivek.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {
public static void main(String[] args) {
	
	//creating configuration object
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file
	
	//creating session factory object
	@SuppressWarnings("deprecation")
	SessionFactory factory=cfg.buildSessionFactory();
	
	//creating session object
	Session session=factory.openSession();
	
	//creating transaction object
	Transaction t=session.beginTransaction();
		
	Employee e1=new Employee();
	e1.setId(122);
	e1.setFirstName("Raju");
	e1.setLastName("Rai");
	
	Student student = new Student();
	student.setRollNo(102);
	student.setName("Vithal");
	student.setQualification("Bhai");
	
	session.persist(e1);//persisting the object
	//session.persist(student);
	
	t.commit();//transaction is commited
	session.close();
	
	System.out.println("successfully saved");
	
}
}
