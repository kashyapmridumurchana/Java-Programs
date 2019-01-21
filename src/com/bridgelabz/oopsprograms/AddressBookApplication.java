/********************************************************************* *********
 *   Compilation:  javac -d bin AddressBookApplication.java						*
 *  Execution:    java -cp bin com.bridgelabz.oopsprograms.AddressBookApplication*
 *                                                                  			*
 *  Purpose: Address Book Application
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   9.1.2018															*
 *  **************************************************************************/
package com.bridgelabz.oopsprograms;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import com.bridgelabz.util.AddressBookManager;
import com.bridgelabz.util.OopsUtility;
public class AddressBookApplication 
{

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException 
	{
		AddressBookManager addressBookManager =null;
		System.out.println("..........ADDRESS BOOK APPLICATION..........");
		do{
		System.out.println("Enter choice");
		System.out.println("\n1:Create Book\n2:Open book\n3:Save Book\n4:Close book\n5:Save Book As\n6:Quit");
		int choice=OopsUtility.userInteger();
		switch(choice){
		case 1: addressBookManager=new AddressBookManager();
		        addressBookManager.createBook();
				break;		
		case 2: addressBookManager=new AddressBookManager();
		        addressBookManager.openBook();
				break;
		case 3: addressBookManager=new AddressBookManager();
		        addressBookManager.saveBook();
				break;	
		case 4:addressBookManager=new AddressBookManager(); 
		       addressBookManager.closeBook();
				break;	
		case 5:addressBookManager=new AddressBookManager();
		       addressBookManager.saveBookAs();
		       break;
		case 6: System.exit(0);
		default: System.out.println("kindly choose among the choices");
		}	
		}while(addressBookManager!=null);
		}
	}


