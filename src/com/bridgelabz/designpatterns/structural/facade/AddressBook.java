package com.bridgelabz.designpatterns.structural.facade;

import java.io.File;
import java.sql.Connection;

public class AddressBook 
{
	public static Connection getMyFileConnection()
	{
		//get file connection using connection parameters
		return null;
	}
	
	public static void generateMyFileReport(String path, Connection con)
	{
		//get data from table and generate  report
		File[] arrayOfFiles = new File(System.getProperty("user.dir")).listFiles();
		for (File file : arrayOfFiles) {
			if (file.getName().endsWith(".json"))
				System.out.println(file.getName());
		}
		
	}
}
