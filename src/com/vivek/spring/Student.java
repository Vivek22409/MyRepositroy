package com.vivek.spring;

public class Student {
	private String name;
	private int rollNo;
	private Address address;
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	/*public Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}*/

	public String getName() {
		return name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void displayInfo(){
		System.out.println("Hello: "+name+"  "+"Roll No: "+rollNo+"  "+"Address: "+address.getCity());
	}
}

