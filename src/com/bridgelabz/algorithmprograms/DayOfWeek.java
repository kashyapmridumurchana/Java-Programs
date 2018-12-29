
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

	// main method gives the month,date and year as input and calls method
	public static void main(String[] args) {

		String str[] = { "Sunday", "Monday", "tuesday", "Wednesday", "Thursday", "Friday", "Staurday" };
		System.out.println("Enter the M (month)");
		int m = AlgorithmUtility.userInteger();
		System.out.println("Enter the D (date)");
		int d = AlgorithmUtility.userInteger();
		System.out.println("Enter the Y (year)");
		int y = AlgorithmUtility.userInteger();
		int r = AlgorithmUtility.dayOfWeek(m, d, y);// method is called
		System.out.println("the day is " + str[r]);

	}

}
