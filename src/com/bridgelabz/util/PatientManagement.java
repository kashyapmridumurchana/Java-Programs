package com.bridgelabz.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.oopsprograms.CliniqueManagement;

public class PatientManagement {
	static List<Patient> patList = new ArrayList<Patient>();

	Patient patient = null;
	static String patFile = "/home/admin1/eclipse-workspace/Java-Programs/Patient.json";
	ObjectMapper obj = new ObjectMapper();

	public static List<Patient> getPatList() {
		return patList;
	}

	public static void setPatList(List<Patient> patList) {
		PatientManagement.patList = patList;
	}

	public List<Patient> addPatient() throws JsonGenerationException, JsonMappingException, IOException {
		String string = OopsUtility.readFile(patFile);
		try {
			patList = obj.readValue(string, new TypeReference<List<Patient>>() {
			});
			System.out.println("File is not empty!");

		} catch (IOException e) {
			System.out.println("File is empty!");
		}

		patient = new Patient();
		System.out.println("Setting the id for the Patient");
		patient.setId(patList.size() + 1);
		System.out.println("Done! Id of the Patient is " + patList.size() + 1);
		System.out.println("Enter the name of the Patient");
		patient.setName(OopsUtility.userString());
		System.out.println("Enter the age of the patient");
		patient.setAge(OopsUtility.userInteger());
		System.out.println("Enter the Phone number of the patient");
		patient.setPhNo(OopsUtility.userLong());
		patList.add(patient);

		String json = obj.writeValueAsString(patList);
		OopsUtility.write11(json, patFile);

		System.out.println("Patient added");
		return patList;

	}

	public void searchPatient() throws JsonGenerationException, JsonMappingException, IOException {
		boolean run = true;
		while (run) {
			System.out.println("Enter your choice");
			System.out.println("1.search by Patient's id\n 2.search by Patient's Phone number\n 3.Quit");
			int ch = OopsUtility.userInteger();
			switch (ch) {
			case 1:
				patById();
				run = true;
				break;
			case 2:
				patByPhNo();
				run = true;
				break;
			case 3:
				CliniqueManagement.main(null);
				break;
			default:
				System.exit(0);

			}
		}
	}

	public void patById() throws JsonGenerationException, JsonMappingException, IOException {
		String string = OopsUtility.readFile(patFile);
		try {
			patList = obj.readValue(string, new TypeReference<List<Patient>>() {
			});

		} catch (Exception e) {
			System.out.println("File is empty!");
		}

		System.out.println("Enter the Id of Patient to be searched");
		int patId = OopsUtility.userInteger();
		for (Patient pat : patList) {
			Integer ii = pat.getId();
			if (ii.equals(patId)) {
				System.out.println("Patient with " + patId + " is present with contact number " + pat.getPhNo());
			} else
				System.out.println("Patient not present");
			searchPatient();

		}

	}

	public void patByPhNo() throws JsonGenerationException, JsonMappingException, IOException {
		String string = OopsUtility.readFile(patFile);
		try {
			patList = obj.readValue(string, new TypeReference<List<Patient>>() {
			});

		} catch (Exception e) {
			System.out.println("File is empty!");
		}

		System.out.println("Enter the Phone Number of Patient to be searched");
		long pno = OopsUtility.userLong();
		for (Patient pat : patList) {
			Long ii = pat.getPhNo();
			if (ii.equals(pno)) {
				System.out.println("Patient with " + pno + " is present with the name " + pat.getName());
			} else
				System.out.println("Patient with " + pno + " is not present ");
			searchPatient();
		}
	}
	
	
	
	
	static List<Patient> takeAppointment() throws IOException 
	{
		 List<Patient> patList1=new ArrayList<Patient>();
		//List<Patient> patter=new ArrayList<Patient>();
		ObjectMapper obj=new ObjectMapper();
		String appFile="/home/admin1/eclipse-workspace/Java-Programs/Appointment.json";
		
//		
//		for(int i=0;i<patList.size();i++)
//		{
//			patter.add(PatientManagement.patList.get(i));
//			System.out.println(patter);
//		}
		
		System.out.println("Press 1 to take appointment with the doctor ");
		int ch=OopsUtility.userInteger();
		if(ch==1)
		{
			System.out.println("Enter Patient's phone number");
			long phNo=OopsUtility.userLong();
			
			for(Patient pat:patList)
			{
			Long ii=pat.getPhNo();
			System.out.println(ii);
			if(ii==phNo)
			{
				System.out.println("Patient details are in database");
				System.out.println("Patient name is " +pat.getName()+ " and id of the patient is "+pat.getId());
				Patient per=new Patient();
				per.setId(pat.getId());
				per.setAge(pat.getAge());
				per.setName(pat.getName());
				per.setPhNo(pat.getPhNo());
				patList1.add(per);
				
				String string=OopsUtility.readFile(appFile);
				try {
					patList1=obj.readValue(string, new TypeReference<List<Patient>>() {
					});
					
				}catch(Exception e) {
					System.out.println("File is empty!");
				}
				
				String json = obj.writeValueAsString(patList1);
				OopsUtility.write11(json, appFile);
				
			}
			else
				System.out.println("Patient details are not in database");
			
			
				
		}
		}
		return patList1;

	}

	
	
	
	
	
	
	
	
	

}
