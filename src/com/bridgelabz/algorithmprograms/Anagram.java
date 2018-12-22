/*******************************************************************************
 *   Compilation:  javac -d bin Anagram.java									*
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.Anagram			*
 *                                                                  			*
 *  Purpose: To check if two strings are Anagrams								*
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   19.12.2018															*
 *  **************************************************************************/
package com.bridgelabz.algorithmprograms;
import com.bridgelabz.util.AlgorithmUtility;
import java.util.*;
public class Anagram
{

	//Main methods here takes the input of the strings and calls the function
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first string");
		String s1=sc.nextLine();
		System.out.println("enter the second string");
		AlgorithmUtility au=new AlgorithmUtility();
		String s2=sc.nextLine();
		
		
		boolean b=au.anagrams(s1,s2);//function is called to check the conditions
		if(b)
		{
			System.out.println("Strings are anagrams");
		}
		else 
			System.out.println("Strings are not anagrams");

	}
}
