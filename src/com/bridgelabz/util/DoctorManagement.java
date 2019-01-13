package com.bridgelabz.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.oopsprograms.CliniqueManagement;

public class DoctorManagement 
{

static List<Doctor> docList=new ArrayList<Doctor>();
Doctor doctor=null;
static String docFile="/home/admin1/eclipse-workspace/Java-Programs/Doctor.json";
ObjectMapper obj=new ObjectMapper();


public List<Doctor> addDoctor() throws JsonGenerationException, JsonMappingException, IOException
{
	String string=OopsUtility.readFile(docFile);
	try {
		docList=OopsUtility.userReadValue(string,docList);
		
		
		System.out.println("File is not empty!");
	}catch(Exception e) {
		System.out.println("File is empty!");
	}
	doctor=new Doctor();
	System.out.println("Setting Id for the doctor");
	doctor.setId(docList.size()+1);
	System.out.println("Done! Id of the doctor is " + docList.size()+1);
	System.out.println("Enter the name of the doctor");
	doctor.setName(OopsUtility.userString());
	System.out.println("Enter the specialization of the doctor");
	doctor.setSpecialization(OopsUtility.userString());
	System.out.println("Enter the availability of the doctor");
	doctor.setAvail(OopsUtility.userString());
	docList.add(doctor);
	
	String json=OopsUtility.userWriteValueAsString(docList);
	OopsUtility.write11(json, docFile);
	System.out.println("Doctor added");
	return docList;
}

public void searchDoctor() throws JsonGenerationException, JsonMappingException, IOException
{
	
	boolean run=true;
	while(run)
	{
		System.out.println("Enter your choice");
		System.out.println("1.search by Doctor's id\n 2.search by Doctor's Name\n 3.Search by Doctor's Specialization\n 4.Search by Availablity of Doctor\n 5.Quit");
		int ch=OopsUtility.userInteger();
		switch(ch)
		{
		case 1: docById();
		        run=true;
		        break;
		case 2: docByName();
		        run=true;
		        break;
		case 3: docBySpec();
		        run=true;
		       break;
		case 4: docByAvail();
		        run=true;
		        break;
		case 5: CliniqueManagement.main(null);
		       break;
		default :System.exit(0);
		 
		}
	}	
}
public void docById() throws JsonGenerationException, JsonMappingException, IOException
{
	
	String string=OopsUtility.readFile(docFile);
	try {
		docList=obj.readValue(string, new TypeReference<List<Doctor>>() {
		});
		
	}catch(Exception e) {
		System.out.println("File is empty!");
	}
	
	System.out.println("Enter the Id of Doctor to be searched");
	int docId=OopsUtility.userInteger();
	for(Doctor docc1:docList)
	{
		int val=docc1.getId();
		if(docId==val)
		{
			System.out.println("Doctor with " +docId+ " is present!\nDoctor details are\nName is " + docc1.getName()
			+ " ,specialist in " +docc1.getSpecialization());
		   PatientManagement.takeAppointment();//to take appointments
		}
		else 
			System.out.println("Doctor with " +docId+ " is not present ");
		    searchDoctor();
	}
}


	
	
	
	
















public void docByName() throws JsonGenerationException, JsonMappingException, IOException
{
	String string=OopsUtility.readFile(docFile);
	try {
		docList=obj.readValue(string, new TypeReference<List<Doctor>>() {
		});
		
	}catch(Exception e) {
		System.out.println("File is empty!");
	}
	
	System.out.println("Enter the name of Doctor to be searched");
	String docName=OopsUtility.userString();
	for(Doctor docc1:docList)
	{
		String ii=docc1.getName();
		if(ii.equalsIgnoreCase(docName))
		{
			System.out.println("Doctor with " +docName+ " is present,Doctor details are\n Id is " + docc1.getId()
			+" specialist in " +docc1.getSpecialization());
		}
		else 
			System.out.println("Doctor with " +docName+ " is not present ");
		searchDoctor();
	}
}


public void docBySpec() throws JsonGenerationException, JsonMappingException, IOException
{
	String string=OopsUtility.readFile(docFile);
	try {
		docList=obj.readValue(string, new TypeReference<List<Doctor>>() {
		});
		
	}catch(Exception e) {
		System.out.println("File is empty!");
	}
	
	
	System.out.println("Enter the specialization of Doctor to be searched");
	String docSpec=OopsUtility.userString();
	for(Doctor docc:docList)
	{
		String ii=docc.getSpecialization();
		if(ii.equalsIgnoreCase(docSpec))
		{
			System.out.println( docSpec+ " specialist is present,with name as " + docc.getName());
		}
		else 
			System.out.println(docSpec+ " specialist is not present ");
		searchDoctor();
	}
}

public void docByAvail() throws JsonGenerationException, JsonMappingException, IOException
{
	String string=OopsUtility.readFile(docFile);
	try {
		docList=obj.readValue(string, new TypeReference<List<Doctor>>() {
		});
		
	}catch(Exception e) {
		System.out.println("File is empty!");
	}
System.out.println("Enter when you need the doctor (eg: am or pm)");
String docAvail=OopsUtility.userString();
for(Doctor docc:docList)
{
	if(docAvail.equalsIgnoreCase(docc.getAvail()))
	{
		System.out.println(docc.getName()+ " with " +docc.getId() + " Id is available for this time");
	}
	else
		System.out.println("Doctor not available");
	searchDoctor();
}
}
public void famousDoctor()
{
	
}

public void famousSpecialist()
{
	
}






}
