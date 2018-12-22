/********************************************************************** *********
 *   Compilation:  javac -d bin Factors.java						      	    *
 *  Execution:    java -cp bin com.bridgelabz.functionalprograms.Factors       *
 *                                                                  			*
 *  Purpose: to find the prime factors of a number								*
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   19.12.2018															*
 *  **************************************************************************/
package com.bridgelabz.functionalprograms;
import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class Factors {
// main method takes the input of the number and calls a function
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number to find the prime factors");
		int n=s.nextInt();
		FunctionalUtility funtionalUtility=new FunctionalUtility();
		funtionalUtility.factors(n);//function call
		

	}

}
