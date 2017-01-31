package com.vivek.loginApp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LogInBean")
public class LogInBean {
	@Id
	private int id;	
	private String logInId;
	private String password;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLogInId() {
		return logInId;
	}
	public void setLogInId(String logInId) {
		this.logInId = logInId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}	

}
