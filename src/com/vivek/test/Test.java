package com.vivek.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Student implements Serializable{
	
	int id = 0;
	String name = null;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}		
	
	/*public String toString(){
		return id +" "+name;
	}*/
}

public class Test  {

	public static void main(String arg[]) throws IOException, ClassNotFoundException{
		/*Student s =  new Student();
		s.setId(100);
		s.setName("vivek");
		FileOutputStream fs = new FileOutputStream("C:/Users/Vivek/Desktop/D.txt");
		ObjectOutputStream os = new ObjectOutputStream(fs);
		
		os.writeObject(s);
		
		os.close();
		System.out.println("Object write successfully...");*/
		
		Student s =  new Student();
			
		FileInputStream fs = new FileInputStream("C:/Users/Vivek/Desktop/D.txt");
		ObjectInputStream os = new ObjectInputStream(fs);
		
		s = (Student)os.readObject();
		
		System.out.println(s.getId()+" "+s.getName());
		os.close();
		
	}
}
