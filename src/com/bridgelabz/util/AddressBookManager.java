/*******************************************************************************
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   19.12.2018															*
 *  **************************************************************************/
package com.bridgelabz.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.oopsprograms.AddressBookApplication;

public class AddressBookManager {
	AddressBook addr = new AddressBook();
	List<AddressBook> listBook = new ArrayList<AddressBook>();
	List<Person> listBook1 = new ArrayList<Person>();
	ObjectMapper obj = new ObjectMapper();
	static String str="/home/admin1/eclipse-workspace/Java-Programs/";

	public void createBook() throws IOException {
		System.out.println("Enter the name of Address book to be created.");
		String book = OopsUtility.userString();
		File file = new File("/home/admin1/eclipse-workspace/Java-Programs/" + book + ".json");
		boolean done = file.createNewFile();// to create new files
		if (done) {
			System.out.println("Book created");
		} else
			System.out.println("Book already exists");
	}

	@SuppressWarnings("unlikely-arg-type")
	public void openBook() throws JsonGenerationException, JsonMappingException, IOException {

		System.out.println("Available file are");
		// stores all the available name of files in the form of array of files
		File[] arrayOfFiles = new File(System.getProperty("user.dir")).listFiles();
		for (File file : arrayOfFiles) {
			if (file.getName().endsWith(".json"))
				System.out.println(file.getName());
		}
		System.out.println("Enter the book name you want to open");
		String b = OopsUtility.userString();
		for (File file : arrayOfFiles) {
			String fileName = file.getName();
			if (b.equals(fileName)) {
				if (file.length() > 0) {
					System.out.println("Address book is not empty");
					String str = OopsUtility.readFile1(fileName);
					listBook1 = obj.readValue(str, new TypeReference<List<Person>>() {
					});
					AddressBook.setListOfPerson(listBook1);
					addressBook();
				}
				else {
				System.out.println("Address Book is empty");
				System.out.println("Add new data onto the address book");
				addressBook();
				}
			}
		}

	}

	public void addressBook() throws JsonGenerationException, JsonMappingException, IOException {
		AddressBook ab = new AddressBook();
		int op = 1;
		while (op == 1) {
			System.out.println("Enter choice");
			System.out.println("1:Add Person\n  2:Edit Person\n  3:Display Persons\n  4:Delete Person\n  5:Sort\n  6:Quit");
			int choice = OopsUtility.userInteger();
			switch (choice) {
			case 1:
				ab.addPerson();
				break;
			case 2:
				ab.editPerson();
				break;
			case 3:
				ab.display();
				break;
			case 4:
				ab.deletePerson();
				break;
			case 5:
				System.out.println("Enter your choice");
				System.out.println("1:Sort by Last Name  2:Sort by Zip Code");
				int ch = OopsUtility.userInteger();
				switch (ch) {
				case 1:
					System.out.println("Sorting by last name");
					ab.sortByLastName();
					System.out.println("Your list is sorted");
					break;
				case 2:
					System.out.println("Sorting by zip code");
					ab.sortByZipCode();
					System.out.println("Your list is sorted");
					break;
				case 6:
					return;
				default:
					System.exit(0);

				}
			default:
				System.out.println("Invalid choice");
				System.exit(0);
			}
			System.out.println("Do you want to continue? yes then 1 else 0");
			op = OopsUtility.userInteger();
		}

	}

	public void saveBook() {
		System.out.println("Available Book are");
		File[] arrayOfFiles = new File(System.getProperty("user.dir")).listFiles();
		for (File file : arrayOfFiles) {
			if (file.getName().endsWith(".json"))
			System.out.println(file.getName());
		}
		System.out.println("Enter the book name you want to save");
		String ch = OopsUtility.userString();
		for (File file : arrayOfFiles) {
			String fileName = file.getName();
			if (ch.equals(fileName)) {
				try {
					String json = obj.writeValueAsString(AddressBook.getListOfPerson());
					OopsUtility.write11(json, fileName);
					System.out.println("Address book details are saved");
				} catch (Exception e) {
					System.out.println("Cannot write onto the file");
				}
			}
		}

	}

	public void closeBook() {
		String fileName = null;
		File[] arrayOfFiles = new File(System.getProperty("user.dir")).listFiles();
		for (File file : arrayOfFiles) {
			fileName = file.getName();
		}
		try {
			String json = obj.writeValueAsString(AddressBook.getListOfPerson());
			OopsUtility.write11(json, fileName);
			System.out.println("All entered details are been saved,ready to close the book");
			close1();

		} catch (Exception e) {
			System.out.println("Data was not saved,kindly don't press 1");
		}

	}

	public void saveBookAs() throws IOException {
        System.out.println("List of files");
        File[] arrayOfFiles = new File(System.getProperty("user.dir")).listFiles();
        for (File file : arrayOfFiles) {
            if(file.getName().endsWith(".json"))
                System.out.println(file.getName());
        }
        System.out.println("Enter the file name to be saved with extension (eg:file.json)");
        String book = OopsUtility.userString();
        File file = new File(str + book );
        boolean rs = file.createNewFile();
        if (rs) {
            System.out.println("File is created");
            String json = obj.writeValueAsString(AddressBook.getListOfPerson());
            OopsUtility.write11(json, book);
            System.out.println("Address book details saved");
            AddressBookApplication.main(null);
        } else {
            System.out.println("File of that name already exists");
            AddressBookApplication.main(null);
        }
    }


	
	
	

	public void call()
	{
		File[] arrayOfFiles = new File(System.getProperty("user.dir")).listFiles();
		for (File file : arrayOfFiles) {
			if (file.getName().endsWith(".json"))
				System.out.println(file.getName());
		}
		
	}
		
//		
//		for (File file : arrayOfFiles) {
//			String fileName = file.getName();
//			if (ch.equals(fileName)) {
//				System.out.println("Your entered name already exists,so choose some different name");
//				String ch1 = OopsUtility.userString();
//				File newFile = new File("/home/admin1/eclipse-workspace/Java-Programs/" + ch1 + ".json");
//				boolean b = file.renameTo(newFile);
//				if (b) {
//					System.out.println("Saved as per your new name");
//				} else
//					System.out.println("file is not saved as per the new name");
//
//			}
////			File[] arrayOfFiles1 = new File(System.getProperty("user.dir")).listFiles();
////			for (File file1 : arrayOfFiles) {
////				System.out.println(file1 + "");
////			}

		//}

	
	

	public void close1() {
		System.out.println("press 1 to close");
		int ch = OopsUtility.userInteger();
		if (ch == 1) {
			System.exit(0);
		} else
			System.out.println("kindly press 1 to close");
		close1();
	}

}