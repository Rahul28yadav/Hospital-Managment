package com.hospitalmanagment.java.pojo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Login implements Serializable {
	
	@Id
	private String emailid;
	@Column
	private String password;
	@Column
	private String role;
	
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public Login(String emailid, String password, String role) {
		super();
		this.emailid = emailid;
		this.password = password;
		this.role = role;
	}
	public Login() {
		super();
	}
	@Override
	public String toString() {
		return "Login [emailid=" + emailid + ", password=" + password + ", role=" + role + "]";
	}

}