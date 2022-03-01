package com.hackerrank.sample.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SampleEntity{
  
@Id
@GeneratedValue
private Integer id;
private String firstName;
private String lastName;
private String date;
private long phoneNumber;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public long getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(long phoneNumber) {
	this.phoneNumber = phoneNumber;
}




}