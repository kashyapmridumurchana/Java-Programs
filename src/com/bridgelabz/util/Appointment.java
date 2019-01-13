package com.bridgelabz.util;


import java.io.IOException;
import java.util.ArrayList;
import com.bridgelabz.util.PatientManagement;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class Appointment
{
private String doctorName;
static List<Patient> patList1=new ArrayList<Patient>();


public String getDoctorName() {
	return doctorName;
}
public void setDoctorName(String doctorName) {
	this.doctorName = doctorName;
}
public List<Patient> getPatList() {
	return patList1;
}
public void setPatList(List<Patient> patList) {
	this.patList1 = patList;
}







}



