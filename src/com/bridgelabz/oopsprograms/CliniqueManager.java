/********************************************************************** *********
 *   Compilation:  javac -d bin ClinicManager.java							    *
 *  Execution:    java -cp bin com.bridgelabz.oopsprograms.ClinicManager        *
 *                                                                  			*
 *  Purpose: Clinic Management
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   9.1.2018															*
 *  **************************************************************************/
package com.bridgelabz.oopsprograms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.util.Appointment;
import com.bridgelabz.util.Doctor;
import com.bridgelabz.util.OopsUtility;
import com.bridgelabz.util.Patient;

public class CliniqueManager
{
	static List<Doctor> listOfDoctor = new ArrayList<Doctor>();
	static String doctorFile = "/home/admin1/eclipse-workspace/Java-Programs/Doctor.json";
	static List<Patient> listOfPatients = new ArrayList<Patient>();
	static String patientFile = "/home/admin1/eclipse-workspace/Java-Programs/Patient.json";
	static List<Appointment> listOfAppointments = new ArrayList<>();
	static String appointmentFile = "/home/admin1/eclipse-workspace/Java-Programs/Appointment.json";


	//Adding doctor and patient
	/**
	 * @throws IOException
	 */
	public static void add() throws IOException {
		System.out.println("choose among the choices:\n1:To Add Doctor\n2:To Add Patient");
		int choice = OopsUtility.userInteger();
		switch (choice) {
		case 1:
			addDoctor();
			break;
		case 2:
			addPatient();
			break;
		}
	}



	//add a doctor
	/**
	 * @throws IOException
	 */
	public static void addDoctor() throws IOException {
		String string = OopsUtility.readFile(doctorFile);
		try {
			listOfDoctor = OopsUtility.userReadValue(string, Doctor.class);
			System.out.println("File is not empty!");
		} catch (Exception e) {
			System.out.println("File is empty!");
		}
		Doctor doctor = new Doctor();
		System.out.println("Setting Id for the new Doctor\nDone!");
		doctor.setId(listOfDoctor.size() + 1);

		System.out.println("Enter the doctor's name");
		doctor.setName(OopsUtility.userString());
		System.out.println("Enter the specialization");
		doctor.setSpecialization(OopsUtility.userString());
		System.out.println("Enter the availability");
		doctor.setAvail(OopsUtility.userString());
		listOfDoctor.add(doctor);
		System.out.println("Doctor added successfully");
		String json = OopsUtility.userWriteValueAsString(listOfDoctor);
		OopsUtility.write11(json, doctorFile);
	}



	//Add a patient
	/**
	 * @throws IOException
	 */
	public static void addPatient() throws IOException {
		String string = OopsUtility.readFile(patientFile);
		try {
			listOfPatients = OopsUtility.userReadValue(string, Patient.class);
			System.out.println("File is not empty!");
		} catch (Exception e) {
			System.out.println("File is empty!");
		}
		Patient patient = new Patient();
		System.out.println("Setting id for the Patient,\nDone!");
		patient.setId(listOfPatients.size() + 1);
		System.out.println("Enter the patient's name");
		patient.setName(OopsUtility.userString());
		System.out.println("Enter the age");
		patient.setAge(OopsUtility.userInteger());
		System.out.println("Enter the phone number");
		patient.setPhNo(OopsUtility.userLong());
		listOfPatients.add(patient);
		System.out.println("Patient added successfully");
		String json = OopsUtility.userWriteValueAsString(listOfPatients);
		OopsUtility.write11(json, patientFile);
	}


	//Search a doctor
	/**
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	public static void searchDoctor() throws JsonParseException, JsonMappingException, IOException {
		System.out.println("Enter among the choices");
		System.out.println("1:Search by ID\n2:Search By Name\n3:Search By Specialization\n4:Search By Availability");
		int choice = OopsUtility.userInteger();
		switch (choice) {
		case 1:
			System.out.println("Searching by id");
			List<Doctor> doctor1 = Search.searchById();
			if (!doctor1.isEmpty())
				System.out.println("Doctor is present");
			else
				System.out.println("Doctor is not present");
			break;

		case 2:
			System.out.println("Searching by name");
			List<Doctor> doctor2 = Search.searchByName();
			if (!doctor2.isEmpty())
				System.out.println("Doctor is present");
			else
				System.out.println("Doctor is not present");
			break;
		case 3:
			List<Doctor> doctor3 = Search.searchBySpecialization();
			if (!doctor3.isEmpty())
				System.out.println("Doctor is present");
			else
				System.out.println("Doctor is not present");
			break;
		case 4:
			List<Doctor> doctor4 = Search.searchBySpecialization();
			if (!doctor4.isEmpty())
				System.out.println("Doctor is present");
			else
				System.out.println("Doctor is not present");
			break;

		}
	}


	//Search a patient
	/**
	 * @throws IOException
	 */
	public static void searchPatient() throws IOException {
		System.out.println("Enter your choice ");
		System.out.println("1:Search by ID\n2:Search By Phone Number");
		int choice = OopsUtility.userInteger();
		switch (choice) {
		case 1:

			Patient patient1 = Search.searchByPatientId();
			System.out.println("Searching completed");
			if (patient1 != null)
				System.out.println("Patient is present");
			else
				System.out.println("Patient is not present");
			break;
		case 2:

			Patient patient2 = Search.searchByPhoneNo();
			System.out.println("Searching completed");
			if (patient2 != null)
				System.out.println("Patient is present");
			else
				System.out.println("Patient is not present");
			break;
		}
	}


	//search
	/**
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	public static void search() throws JsonParseException, JsonMappingException, IOException {
		System.out.println("Enter choice:\n1:Search a Doctor\n2:Search a Patient");
		int choice = OopsUtility.userInteger();
		switch (choice) {
		case 1:
			searchDoctor();
			break;
		case 2:
			searchPatient();
			break;
		}
	}


	//take appointment with a specific doctor
	/**
	 * @throws IOException
	 */
	public static void takeAppointment() throws IOException {
		String string = OopsUtility.readFile(appointmentFile);
		try {
			listOfAppointments = OopsUtility.userReadValue(string, Appointment.class);
			System.out.println("File is not empty");

		} catch (Exception e) {
			System.out.println("File is empty");
		}
		Patient patient = Search.searchByPhoneNo();
		if (patient != null) {
			operation(patient);
		} else {
			CliniqueManager.addPatient();
			Patient patient2 = Search.searchByPhoneNo();
			operation(patient2);
		}
		String json = OopsUtility.userWriteValueAsString(listOfAppointments);
		OopsUtility.write11(json, appointmentFile);

	}

	//display doctor's list
	/**
	 * @param docList contains list of doctors
	 */
	public static void displayList(List<Doctor> docList) {
		for (Doctor doctor : docList) {
			System.out.println("Doctor's ID is " + doctor.getId());
			System.out.println("Doctor's name is " + doctor.getName());
			System.out.println("Specialist in " + doctor.getSpecialization());
			System.out.println("Available at " + doctor.getAvail());
		}
	}


	//take appointment continued
	/**
	 * @param doctorList contains list of doctors
	 * @param patient is an object of patient class
	 */
	public static void searchDoc(List<Doctor> doctorList, Patient patient) {
		System.out.println("Enter id");
		int id = OopsUtility.userInteger();
		int flag = 0;
		try {
			for (Doctor doctor : doctorList) {
				if (id == doctor.getId()) {
					for (Appointment appointment : listOfAppointments) {
						if (doctor.getName().equals(appointment.getDoctorName())) {
							List<Patient> patientAppointmentList = appointment.getPatList();
							if (patientAppointmentList.size() < 5) {
								for (Patient patient2 : patientAppointmentList) {
									if (patient.getId() == patient2.getId()) {
										System.out.println("You have already have an appointment with this doctor");
										flag = 1;
										break;
									} else {
										patientAppointmentList.add(patient);
										appointment.setPatList(patientAppointmentList);
										System.out.println("Appointment is set");
										flag = 1;
										break;
									}
								}

							} else {
								System.out.println("Appointment is full");
								flag = 1;
								break;
							}
						}
					}
					if (flag == 0) {
						Appointment appointment2 = new Appointment();
						List<Patient> patientList1 = new ArrayList<Patient>();
						patientList1.add(patient);
						appointment2.setDoctorName(doctor.getName());
						appointment2.setPatList(patientList1);
						listOfAppointments.add(appointment2);
						System.out.println("Appointment is set");
					}

				}
			}

		} catch (Exception e) {
			System.out.println("Enter the correct id");
		}
	}

	//take appointment continued
	/**
	 * @param patient is an object of patient class
	 * @throws IOException
	 */
	public static void operation(Patient patient) throws IOException {
		System.out.println("Search doctor by:\n1:Name\n2:Speciality\n3:Availability");
		int choice = OopsUtility.userInteger();
		switch (choice) {
		case 1:
			List<Doctor> doctorList = Search.searchByName();
			displayList(doctorList);
			searchDoc(doctorList, patient);
			break;
		case 2:
			List<Doctor> doctorList1 = Search.searchBySpecialization();
			displayList(doctorList1);
			searchDoc(doctorList1, patient);
			break;
		case 3:
			List<Doctor> doctorList2 = Search.searchByAvailability();
			displayList(doctorList2);
			searchDoc(doctorList2, patient);
			break;
		}
	}


	//famous doctor search
	/**
	 * @throws IOException
	 */
	public static void famousDoctor() throws IOException {
		String string = OopsUtility.readFile(appointmentFile);
		Map<String, Integer> map = new HashMap<>();
		try {
			listOfAppointments = OopsUtility.userReadValue(string, Appointment.class);
			for (int i = 0; i < listOfAppointments.size(); i++) {
				Appointment appointment = listOfAppointments.get(i);
				String doctorName = appointment.getDoctorName();
				Integer numberOfAppointments = appointment.getPatList().size();
				map.put(doctorName, numberOfAppointments);
			}
			int maxValue = Collections.max(map.values());//calculates maximum values 
			for (Entry<String, Integer> entry : map.entrySet()) //entry set is used to iterate in map
			{
				if (entry.getValue() == maxValue) {
					System.out.println(

							"Famous Doctor in clinic is " + entry.getKey() + " with  " + entry.getValue() +" number of appointments");
				}
			}
		} catch (Exception e) {
			System.out.println("No list of appointments! Can't search for famous doctors");
		}
	}


	//famous specialist search
	/**
	 * @throws IOException
	 */
	public static void famousSpecialist() throws IOException {
		String string = OopsUtility.readFile(doctorFile);
		List<String> list = new ArrayList<>();
		try {
			listOfDoctor = OopsUtility.userReadValue(string, Doctor.class);
			//to access two elements are equal or not
			for (Doctor doctor : listOfDoctor) {
				for (Doctor doctor1 : listOfDoctor) {
					if (doctor.getSpecialization().equals(doctor1.getSpecialization())) {
						list.add(doctor.getSpecialization());
					}
				}
			}
			int max = 0;
			int curr = 0;
			String currKey = null;
			Set<String> unique = new HashSet<String>(list);
			for (String key : unique) {
				curr = Collections.frequency(list, key);
				if (max < curr) {
					max = curr;
					currKey = key;
				}
			}
			System.out.println("Specialization  " + currKey + " is famours");
		} catch (Exception e) {
			System.out.println("There are no doctors in the system");
		}
	}
}
