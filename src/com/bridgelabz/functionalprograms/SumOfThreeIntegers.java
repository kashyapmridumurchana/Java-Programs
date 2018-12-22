/********************************************************************** *********
 *   Compilation:  javac -d bin SumOfThreeIntegers.java						    *
 *  Execution:    java -cp bin com.bridgelabz.functionalprograms.SumOfThreeIntegers  *
 *                                                                  			*
 *  Purpose:   to check if sum of numbers integer sums to 0         			  *
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   19.12.2018															*
 *  **************************************************************************/


package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class SumOfThreeIntegers {
//main method inputs the array elements and calls a function
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in array");
		int n=sc.nextInt();
		
		FunctionalUtility funtionalUtility=new FunctionalUtility();
		funtionalUtility.sumOfThree(n);//function call

	}

}
