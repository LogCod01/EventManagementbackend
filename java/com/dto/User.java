package com.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
//	private int userId;
	private String userName;
//	private String firstName;
//	private String lastName;
//	private String gender;
//	private String dob;
	private String emailId;
	private String mobileNumber;
	private String password;
	public User() {
		super();
	}
//	public String userName(){
//		return "lastName" + "firstName";
//	}
	public User(String userName, String emailId, String mobileNumber, String password) {
		super();
//		this.userId = userId;
		this.userName = userName;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.password = password;
	}
//	public int getUserId() {
//		return userId;
//	}
//	public void setUserId(int userId) {
//		this.userId = userId;
//	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", emailId=" + emailId + ", mobileNumber=" + mobileNumber + ", password="
				+ password + "]";
	}
}