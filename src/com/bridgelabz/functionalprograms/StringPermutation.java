/********************************************************************** *********
 *   Compilation:  javac -d bin StringPermutation.java						      	    *
 *  Execution:    java -cp bin com.bridgelabz.functionalprograms.StringPermutation    *
 *                                                                  			*
 *  Purpose: to compare outputs of iteration and recursion method for a string combination*
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   19.12.2018															*
 *  **************************************************************************/

package com.bridgelabz.functionalprograms;
import java.util.*;
import com.bridgelabz.util.*;
public class StringPermutation 
{

	//main method takes input of strings and calls a function
	public static void main(String[] args) 
	{
		
		FunctionalUtility fu3=new FunctionalUtility();
		System.out.println("Enter the String");
		String s=AlgorithmUtility.userString();	
		String[] str=new String[1000];
		int len=s.length();
		int fact=1;
		for(int i=len;i>=1;i--)
		{
			fact=fact*i;
		}
		
		System.out.println("The number of combination possible is " + fact);
		System.out.println("The recursion output:");
		fu3.recursion("",s);	//recursion output
		
		System.out.println("The iteration output:");
		fu3.iteration(s);         //iteration output
		
	}

}
