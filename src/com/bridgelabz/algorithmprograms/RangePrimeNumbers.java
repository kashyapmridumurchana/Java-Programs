/*******************************************************************************
 *   Compilation:  javac -d bin RangePrimeNumbers.java							*
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.RangePrimeNumbers*
 *                                                                  			*
 *  Purpose: to find prime numbers within the range 1-1000						*
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   19.12.2018															*
 *  **************************************************************************/
package com.bridgelabz.algorithmprograms;
import com.bridgelabz.util.*;

public class RangePrimeNumbers 
{
  //main method calls the method
	public static void main(String[] args)
	{
		System.out.println("The prime number in the range 0-1000 are:");
		AlgorithmUtility.rangePrime(); //method call
	}

}
