package com.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="newenquiryform")
public class NewEnquiry {
	@Id
private int id;
private String firstname;
private String lastname;
private String password;
private String email;
private long mobileno;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getMobileno() {
	return mobileno;
}
public void setMobileno(long mobileno) {
	this.mobileno = mobileno;
}
@Override
public String toString() {
	return "NewEnquiry [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", password=" + password
			+ ", email=" + email + ", mobileno=" + mobileno + "]";
}
public NewEnquiry(int id, String firstname, String lastname, String password, String email, long mobileno) {
	super();
	this.id = id;
	this.firstname = firstname;
	this.lastname = lastname;
	this.password = password;
	this.email = email;
	this.mobileno = mobileno;
}
public NewEnquiry() {
	super();
	// TODO Auto-generated constructor stub
}


}
