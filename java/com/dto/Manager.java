package com.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Manager {
@Id@GeneratedValue

private int managerId;
private String managerName;
private String emailId;
private long mobileNumber;
private String password;

public Manager() {
	super();
	// TODO Auto-generated constructor stub
}

public Manager(int managerId, String managerName, String emailId, long mobileNumber, String password) {
	super();
	this.managerId = managerId;
	this.managerName = managerName;
	this.emailId = emailId;
	this.mobileNumber = mobileNumber;
	this.password = password;
}

public int getManagerId() {
	return managerId;
}

public void setManagerId(int managerId) {
	this.managerId = managerId;
}

public String getManagerName() {
	return managerName;
}

public void setManagerName(String managerName) {
	this.managerName = managerName;
}

public String getEmailId() {
	return emailId;
}

public void setEmailId(String emailId) {
	this.emailId = emailId;
}

public long getMobileNumber() {
	return mobileNumber;
}

public void setMobileNumber(long mobileNumber) {
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
	return "Manager [managerId=" + managerId + ", managerName=" + managerName + ", emailId=" + emailId + ", mobileNumber="
			+ mobileNumber + ", password=" + password + "]";
}


}