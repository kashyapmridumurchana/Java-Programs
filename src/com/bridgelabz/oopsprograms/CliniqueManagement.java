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
		CliniqueManagement clinicManagement=null;
		System.out.println("--------CLINIC MANAGEMENT---------");
		do{
			System.out.println("Enter the choice");
			System.out.println("1:Add\n2:Search\n3:Take Appointment\n4:Famous Doctor\n5:Famous Specialists\n6:Quit");
			int choice = OopsUtility.userInteger();
			switch (choice) {
			case 1:CliniqueManager.add();
				   break;
			case 2:CliniqueManager.search();
			       break;
			case 3:CliniqueManager.takeAppointment();
                   break;
			case 4:CliniqueManager.famousDoctor();
			       break;
			case 5:CliniqueManager.famousSpecialist();
			       break;
			default:System.out.println("Invalid choice,Kindly enter valid one");
			       CliniqueManagement.main(null);
				   break;}
			}while(clinicManagement!=null);
		}
	






}


