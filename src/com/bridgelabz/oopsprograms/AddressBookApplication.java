package com.bridgelabz.oopsprograms;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.util.Address;
import com.bridgelabz.util.AddressBook;
import com.bridgelabz.util.AddressBookManager;
import com.bridgelabz.util.OopsUtility;

public class AddressBookApplication 
{

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException 
	{
		AddressBookManager addm=new AddressBookManager();
		AddressBook add=new AddressBook();
		int op=1;
		while(op==1){
		System.out.println("Enter choice");
		System.out.println("1:Create Book\n  2:Open book\n  3:Save Book\n  4:Close book\n  5:Save Book As\n  6:add Book");
		int choice=OopsUtility.userInteger();
		switch(choice){
		case 1: addm.createBook();
				break;
				
		case 2:addm.openBook();
				break;
				
		case 3: addm.saveBook();
				break;
				
		case 4: addm.closeBook();
				break;
				
		case 5:addm.saveBookAs();
		
		case 6: addm.addressBook();
				
				
		default: System.out.println("kindly choose among the choices");
		}	
		}
		System.out.println("Do you want to continue? yes then 1 else 0");
		op=OopsUtility.userInteger();
		}

	}


