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
	 
		//FileReader file=new FileReader("home/admin1/Desktop/file1.txt");
		Scanner sc=new Scanner(System.in);
		AlgorithmUtility ai=new AlgorithmUtility();
		System.out.println("Enter the String to be searched");
		String[] str=new String[50];    
		sc.next();
		ai.wordBinarySearch(str);
		

	}

}
