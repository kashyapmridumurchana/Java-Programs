/*******************************************************************************
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   19.12.2018															*
 *  **************************************************************************/
package com.bridgelabz.util;
public class Doctor
{
private int id;
private String name;
private String specialization;
private String avail;

public Doctor()
{
	id=0;
	name=null;
	specialization=null;
	avail=null;
}

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

public String getSpecialization() {
	return specialization;
}

public void setSpecialization(String specialization) {
	this.specialization = specialization;
}

public String getAvail() {
	return avail;
}

public void setAvail(String avail) {
	this.avail = avail;
}





















}
