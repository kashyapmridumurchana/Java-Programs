/*******************************************************************************
 *   Compilation:  javac -d bin WordBinarySearch.java							*
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.WordBinarySearch*
 *                                                                  			*
 *  Purpose: to search a word from a file										*
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   19.12.2018															*
 *  **************************************************************************/
package com.bridgelabz.algorithmprograms;
import java.util.*;

import com.bridgelabz.util.AlgorithmUtility;

import java.io.*;
public class WordBinarySearch 
{

	public static void main(String[] args) throws IOException
	{
		    String[] str=new String[50];  
			String file="/home/admin1/Desktop/file1.csv";
			BufferedReader fileReader=new BufferedReader(new FileReader(file));
			Scanner sc=new Scanner(System.in);
			final String DELIMITER=",";
			try {
				String line="";
				while((line=fileReader.readLine())!=null)
				{
					String[] tokens=line.split(DELIMITER);
					AlgorithmUtility.sort(tokens);


					for(String token:tokens)
					{
						System.out.println(token);
					}
					System.out.println("Enter the String to be searched");
					String key=sc.next();
					int i=AlgorithmUtility.binarySearch(tokens,key);
					if(i>=0)
					{
						System.out.println(tokens[i]+ "is present in "+ (i+1)+ " position of array");
					}
					else 
						System.out.println(key+ "doesnot exist");
				}

			}catch(Exception e)
			{
				e.printStackTrace();
			}

		}
		
		
		
		

	

}
