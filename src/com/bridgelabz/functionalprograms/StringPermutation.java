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
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String str1=s.nextLine();
		FunctionalUtility fu3=new FunctionalUtility();
		fu3.sPermut(str1);//function call
		int length=str1.length();
		fu3.permute(str1,0,length-1);//function call
				
				
				

	}

}
