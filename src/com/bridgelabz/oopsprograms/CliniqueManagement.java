/********************************************************************** *********
 *   Compilation:  javac -d bin ClinicManagement.java							*
 *  Execution:    java -cp bin com.bridgelabz.oopsprograms.ClinicManagement     *
 *                                                                  			*
 *  Purpose: Clinic Management
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   9.1.2018															*
 *  **************************************************************************/
package com.bridgelabz.oopsprograms;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.util.OopsUtility;

public class CliniqueManagement
{

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException 
	{




		OopsUtility o=new OopsUtility();
		System.out.println("--------CLINIC MANAGEMENT---------");
		boolean run=true;
		while(run==true)
		{
			
			System.out.println("Enter the choice");
			System.out.println("1:Add\n2:Search\n3:Take Appointment\n4:Famous Doctor\n5:Famous Specialists\n6:Quit");
			int choice = OopsUtility.userInteger();
			switch (choice) {
			case 1:
				CliniqueManager.add();
				run = true;
				break;
			case 2:
				CliniqueManager.search();
				run = true;
				break;
			case 3:
				CliniqueManager.takeAppointment();
				run = true;
				break;
			case 4:
				CliniqueManager.famousDoctor();
				run = true;
				break;
			case 5:
				CliniqueManager.famousSpecialist();
				run=true;
				break;
			default:
				System.out.println("Invalid choice");
				run = false;
				break;
			}
			}
		}
	






}


