/********************************************************************** *********
 *   Compilation:  javac -d bin ReplaceString.java						        *
 *  Execution:    java -cp bin com.bridgelabz.functionalprograms.ReplaceString   *
 *                                                                  			*
 *  Purpose: to replace a string with another				     				*
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   19.12.2018															*
 *  **************************************************************************/
package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.FunctionalUtility;
import java.util.*;
public class ReplaceString 
{
//main method takes input of strings and calls a function
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);	
	System.out.println("Enter the username");
	String str1="Hello <<username>>,How are you?";
	FunctionalUtility funtionalUtility=new FunctionalUtility();
	funtionalUtility.replaceString(str1);//function call
	}
	
}