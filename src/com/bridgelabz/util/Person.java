package com.bridgelabz.util;

public class Person
{
private String firstName;
private String lastName;
private Address addr=new Address();
private long phoneNumber;


public Person()
{
firstName=null;
lastName=null;
addr=null;
phoneNumber=0;
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


public Address getAddr() {
	return addr;
}


public void setAddr(Address addr) {
	this.addr = addr;
}


public long getPhoneNumber() {
	return phoneNumber;
}


public void setPhoneNumber(long phoneNumber) {
	this.phoneNumber = phoneNumber;
}







}