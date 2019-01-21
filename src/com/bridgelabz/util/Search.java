/********************************************************************** *********
 *   Compilation:  javac -d bin Search.java						                *
 *  Execution:    java -cp bin com.bridgelabz.oopsprograms.Search               *
 *                                                                  			*
 *  Purpose: Clinic Management
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   9.1.2018															*
 *  **************************************************************************/
package com.bridgelabz.util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Search {

	//search a doctor by name
	/**
	 * @returns list of doctor after successful search
	 * @throws IOException
	 */
	public static List<Doctor> searchByName() throws IOException {
		String string = OopsUtility.readFile(CliniqueManager.DOCTOR_FILE);
		try {
			CliniqueManager.doctors = OopsUtility.userReadValue(string, Doctor.class);
			List<Doctor> list = new ArrayList<>();
			System.out.println("Enter the doctor's name to be searched");
			String name = OopsUtility.userString();
			System.out.println(name);
			for (Doctor doctor : CliniqueManager.doctors) {
				if (name.equals(doctor.getName())) {
					list.add(doctor);
				}
			}
			return list;
		}
		catch (Exception e)
		{
			System.out.println("File is empty!");
			return null;
		}
	}

	
	//search a doctor by id
	/**
	 * @returns list of doctor after successful search
	 * @throws IOException
	 */
	public static List<Doctor> searchById() throws IOException {
		String string = OopsUtility.readFile(CliniqueManager.DOCTOR_FILE);
		try {
			CliniqueManager.doctors = OopsUtility.userReadValue(string, Doctor.class);
			List<Doctor> list = new ArrayList<>();
			System.out.println("Enter the doctor's id to be searched");
			int id = OopsUtility.userInteger();
			for (Doctor doctor : CliniqueManager.doctors) {
				if (id == doctor.getId()) {
					list.add(doctor);

				}
			}
			return list;
		} catch (Exception e) {
			System.out.println("File is empty!");
			return null;
		}

	}

	//search doctor by specialization
	/**
	 * @returns list of doctor after successful search
	 * @throws IOException
	 */
	public static List<Doctor> searchBySpecialization() throws IOException {
		String string = OopsUtility.readFile(CliniqueManager.DOCTOR_FILE);
		try {
			CliniqueManager.doctors= OopsUtility.userReadValue(string, Doctor.class);
			List<Doctor> list = new ArrayList<>();
			System.out.println("Enter the doctor's name to be searched");
			String specialization = OopsUtility.userString();
			for (Doctor doctor : CliniqueManager.doctors) {
				if (specialization.equals(doctor.getSpecialization())) {
					list.add(doctor);
				}
			}

			return list;
		} catch (Exception e) {
			System.out.println("File is empty!");
			return null;
		}

	}

	//search doctor by availability
	/**
	 * @returns list of doctor after successful search
	 * @throws IOException
	 */
	public static List<Doctor> searchByAvailability() throws IOException {
		String string = OopsUtility.readFile(CliniqueManager.DOCTOR_FILE);
		try {
			CliniqueManager.doctors = OopsUtility.userReadValue(string, Doctor.class);
			List<Doctor> list = new ArrayList<>();
			System.out.println("Enter when you need the doctor (eg: am/pm)");
			String availability = OopsUtility.userString();
			for (Doctor doctor : CliniqueManager.doctors) {
				if (availability.equals(doctor.getAvail())) {
					list.add(doctor);
				}
			}
			return list;
		} catch (Exception e) {
			System.out.println("File is empty!");
			return null;
		}

	}

	//search a patient by id
	
	/**
	 * @returns list of patient after successful search
	 * @throws IOException
	 */
	public static Patient searchByPatientId() throws IOException {
		String string = OopsUtility.readFile(CliniqueManager.PATIENT_FILE);
		CliniqueManager.patients = OopsUtility.userReadValue(string, Patient.class);
		System.out.println("Enter the patient's id to be searched");
		int id = OopsUtility.userInteger();
		for (Patient patient : CliniqueManager.patients) {
			if (id == patient.getId()) {
				return patient;
			}
		}
		return null;
	}

	//search a patient by phone number
	/**
	 * @returns list of patient after successful search
	 * @throws IOException
	 */
	public static Patient searchByPhoneNo() throws IOException {
		String string = OopsUtility.readFile(CliniqueManager.PATIENT_FILE);
		CliniqueManager.patients = OopsUtility.userReadValue(string, Patient.class);
		System.out.println("Enter the patient's phone number to search");
		long phoneNo = OopsUtility.userLong();

		for (Patient patient : CliniqueManager.patients) {
			if (phoneNo == patient.getPhNo()) {
				return patient;
			}
		}
		return null;
	}

}



