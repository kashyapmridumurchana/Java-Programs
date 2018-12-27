
/*******************************************************************************
 *   Compilation:  javac -d bin DayOfWeek.java								    *
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.DayOfWeek		*
 *                                                                  			*
 *  Purpose: To get the particular day,provided with month,date and year		*
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   19.12.2018															*
 *  **************************************************************************/
package com.bridgelabz.algorithmprograms;
import com.bridgelabz.util.AlgorithmUtility;

public class DayOfWeek {

	//main method gives the month,date and year as input and calls method
	public static void main(String[] args)
	{
		
		System.out.println("Enter the M (month)");
		int m=AlgorithmUtility.userInteger();
		System.out.println("Enter the D (date)");
		int d=AlgorithmUtility.userInteger();
		System.out.println("Enter the Y (year)");
		int y=AlgorithmUtility.userInteger();
		int r=AlgorithmUtility.dayOfWeek(m,d,y);//method is called
		System.out.println("the day of the week is equivalent to the order from 0-6 eg:0 is sunday,1 is monday and so on" );
		System.out.println("the day is " + r);

	}

}
