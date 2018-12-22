/********************************************************************** *********
 *   Compilation:  javac -d bin LeapYear.java						      	    *
 *  Execution:    java -cp bin com.bridgelabz.functionalprograms.LeapYear      *
 *                                                                  			*
 *  Purpose: to check if the year is leap year or not							*
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   19.12.2018															*
 *  **************************************************************************/
package com.bridgelabz.functionalprograms;


import com.bridgelabz.util.FunctionalUtility;
import java.util.*;
public class LeapYear 
{
   //main method takes the input year and calls a method
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the year");
		int year=s.nextInt();
		FunctionalUtility funtionalUtility=new FunctionalUtility();
		funtionalUtility.leapYear(year);//method call
		
	}

}
