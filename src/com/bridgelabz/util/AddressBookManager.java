package com.bridgelabz.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class AddressBookManager
{
AddressBook addr=new AddressBook();
List<AddressBook> listBook=new ArrayList<AddressBook>();
ObjectMapper obj=new ObjectMapper();

public void createBook() throws IOException
{
System.out.println("Enter the name of Address book to be created.");
String book=OopsUtility.userString();
	File file=new File("/home/admin1/eclipse-workspace/Java-Programs/"+ book+".json");
	boolean done=file.createNewFile();//to create new files
	 if(done)
	 {
		 System.out.println("Book created");
	 }
	 else
		 System.out.println("Book already exists");
}

@SuppressWarnings("unlikely-arg-type")
public void openBook() throws JsonGenerationException, JsonMappingException, IOException
{
	System.out.println("Available file are");
	//stores all the available name of files in the form of array of files
	 File[] arrayOfFiles = new File(System.getProperty("user.dir")).listFiles();
	for(File file:arrayOfFiles)
	{
		System.out.println(file+ "");
	}
	System.out.println("Enter the book name you want to open");
	String b=OopsUtility.userString();
	for(File file:arrayOfFiles)
	{
		if(b.equals(file.getName()))
     {
	   addressBook();
     }
	}
	

}

public void addressBook() throws JsonGenerationException, JsonMappingException, IOException{
	AddressBook ab=new AddressBook();
	int op=1;
	while(op==1){
	System.out.println("Enter choice");
	System.out.println("1:Add Person  2:Edit Person  3:Display Persons  4:Delete Person  5:Sort  6:Quit");
	int choice=OopsUtility.userInteger();
	switch(choice){
	case 1:ab.addPerson();
			break;
	case 2:ab.editPerson();
			break;
	case 3: ab.display();
			break;
	case 4: ab.deletePerson();
			break;
	case 5: System.out.println("Enter your choice");
			System.out.println("1:Sort by Last Name  2:Sort by Zip Code");
			int ch=OopsUtility.userInteger();
			switch(ch){
			case 1: System.out.println("Sorting by last name");
					ab.sortByLastName();
					System.out.println("Your list is sorted");
					break;
			case 2: System.out.println("Sorting by zip code");
					ab.sortByZipCode();
					System.out.println("Your list is sorted");
					break;
			default:System.out.println("Invalid choice");
					System.exit(0);
			
			}
	default: System.out.println("Invalid choice");
			System.exit(0);
	}
	System.out.println("Do you want to continue? yes then 1 else 0");
	op=OopsUtility.userInteger();
	}

}

public void saveBook()
{
	
	
}

public void closeBook() {
	// TODO Auto-generated method stub
	
}

public void saveBookAs() {
	// TODO Auto-generated method stub
	
}



}