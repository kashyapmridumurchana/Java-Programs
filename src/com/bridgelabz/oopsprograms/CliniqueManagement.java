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
import java.io.FileNotFoundException;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.util.DoctorManagement;
import com.bridgelabz.util.OopsUtility;

public class CliniqueManagement
{

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException 
	{
		DoctorManagement dm=new DoctorManagement();



		OopsUtility o=new OopsUtility();
		System.out.println(".........CLINIC MANAGEMENT...........");
		boolean run=true;
		while(run==true)
		{
			System.out.println("Choose among the choices");
			System.out.println("1.Add \n2.Search \n3.Famous Doctor in the Clinic\n4.Famous Specialist\n5.Quit ");
			int choice=OopsUtility.userInteger();
			switch(choice)
			{
			
			case 1: o.add();
			run=true;
			break;
			
			
			case 2: o.search();
			run=true;
			break;
			
			
			
			case 3:dm.famousDoctor();
			run=true;
			break;
			case 4:dm.famousSpecialist();
			run=true;
			break;

			case 5: System.exit(0);



			}
		}



	}

}
