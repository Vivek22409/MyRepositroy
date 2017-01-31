package com.vivek.spring;

public class Address {

	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	public void info() {
		System.out.println("City: "+city);
	}

}
