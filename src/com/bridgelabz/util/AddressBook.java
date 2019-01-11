package com.bridgelabz.util;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.util.OopsUtility;

public class AddressBook 
{

	static private List<Person> listOfPerson=new ArrayList<Person>();
	Person person=null;

	public void addPerson() throws JsonGenerationException, JsonMappingException, IOException
	{
		person=new Person();
		 ObjectMapper objectMapper = new ObjectMapper();
		System.out.println("Enter the firstname");
		person.setFirstName(OopsUtility.userString());
		System.out.println("Enter the lastname");
		person.setLastName(OopsUtility.userString());
		System.out.println("Enter the phone number");
		person.setPhoneNumber(OopsUtility.userLong());

		Address addr=new Address();//creating object of address class
		System.out.println("Enter the street");
		addr.setStreet(OopsUtility.userString());
		System.out.println("Enter the city");
		addr.setCity(OopsUtility.userString());
		System.out.println("Enter the state");
		addr.setState(OopsUtility.userString());
		System.out.println("Enter the zip code");
		addr.setZipCode(OopsUtility.userLong());
		person.setAddr(addr);
		listOfPerson.add(person);
		String json = objectMapper.writeValueAsString(listOfPerson);
		OopsUtility.write1(json);
	}

	public void editPerson() throws JsonGenerationException, JsonMappingException, IOException {
		System.out.println("Enter the details of the person whose details need to be changed");
		System.out.println("Enter the first name");
		String fName=OopsUtility.userString();
		System.out.println("Enter the last name");
		String lName=OopsUtility.userString();
		person=new Person();
		ObjectMapper objectMapper = new ObjectMapper();
		for(int i=0;i<listOfPerson.size();i++)
		{
			person=listOfPerson.get(i);
			if(fName.contains(person.getFirstName()))
			{
				if(lName.contains(person.getLastName()))
				{
					System.out.println("Choose which details you want to edit");
					//System.out.println("1. Phone Number \n 2. Address\n 3.End  ");
					
					
					int n=1;
					while(n==1)
					{   
						System.out.println("1. Phone Number \n 2. Address\n 3.End  ");
						int ch=OopsUtility.userInteger();
						switch(ch)
						{
						case 1:   System.out.println("Enter the phone number to update");
						person.setPhoneNumber(OopsUtility.userLong());
						System.out.println("Phone number updated");
						String json = objectMapper.writeValueAsString(listOfPerson);
						OopsUtility.write1(json);
						
						break;

						case 2: Address addr=person.getAddr();//to get that particular address
						int n1=1;
						while(n1==1)
						{ 
							System.out.println("Choose your option to edit in address\n 1. Street\n 2.City\n 3.State 4.Zipcode");
							int choice=OopsUtility.userInteger();
							switch(choice)
							{
							case 1: System.out.println("Enter the new street details");
							addr.setStreet(OopsUtility.userString());
							System.out.println("Street details updated");
							break;

							case 2:  System.out.println("Enter the new street details");
							addr.setCity(OopsUtility.userString());
							System.out.println("City details updated");
							break;
							case 3: System.out.println("Enter the new state details");
							addr.setState(OopsUtility.userString());
							System.out.println("State details updated");
							break;
							case 4: System.out.println("Enter the new zipcode");
							addr.setZipCode(OopsUtility.userLong());
							System.out.println("Zipcode details updated");
							break;
							default: System.out.println("Enter correct choice");

							}//end of inside switch
							person.setAddr(addr);

							//System.out.println("1. Continue \n 2. Exit");
							//n1=OopsUtility.userInteger();
						}
						default: System.out.println("Choose among the choices");
						} //end of outside switch


						System.out.println("1. Continue \n 2. Exit");
						n=OopsUtility.userInteger();

					}//end of inside if

				}//end of outside if

			}//end of for loop
		}//end of editPerson method






	}

	public void display() 
	{
		
		
		  for (Person per2 : listOfPerson) {
	            System.out.println("First name : " + per2.getFirstName());
	            System.out.println("Last name : " + per2.getLastName());
	            System.out.println("Phone number : " + per2.getPhoneNumber());
	            Address addr = per2.getAddr();
	            System.out.println("Address :\n");
	            System.out.println("Street : " + addr.getStreet());
	            System.out.println("City : " + addr.getCity());
	            System.out.println("State : " + addr.getState());
	            System.out.println("Zip Code : " + addr.getZipCode());
	            System.out.println("--------------------------------------");
		
	}
	}

	public void deletePerson() throws JsonGenerationException, JsonMappingException, IOException 
	{
		 ObjectMapper objectMapper=new ObjectMapper();
		        System.out.println("Enter the first name of the person which has to be deleted");
		        String fName = OopsUtility.userString();
		        System.out.println("Enter the last name of the person which has to be deleted");
		        String lName = OopsUtility.userString();
		        int flag=0;
		        for (Person per : listOfPerson) {
		        	if(fName.contains(per.getFirstName()))
					{
						if(lName.contains(per.getLastName()))
						{
		                listOfPerson.remove(per);
		                System.out.println("Person removed from the address book ");
		                String json = objectMapper.writeValueAsString(listOfPerson);
		        		OopsUtility.write1(json);
		                break;
		            }
		            flag=1;
		        }
		        if (flag == 0) {
		            System.out.println("Entered first name and last name does not exist in address book");
		        }
		  
		
	}
	
	}
	
	public void sortByLastName()
	{
		Collections.sort(listOfPerson,(person1,person2)->person1.getLastName().compareTo(person2.getLastName()));
		display();
	}
	
	public void sortByZipCode()
	{
		
		Collections.sort(listOfPerson,(person1,person2)->person1.getAddr().getZipCode()>person2.getAddr().getZipCode()? 1
				:person1.getAddr().getZipCode()<person2.getAddr().getZipCode() ? -1: 
					person1.getAddr().getZipCode()==person2.getAddr().getZipCode() ?0 :-10);
		
		
		
}
	
	
	
	
	
	
	
	
	}
