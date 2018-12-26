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

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.*;

public class RangePrimeNumbers 
{
  //main method calls the method
	public static void main(String[] args)
	{
	    List<String> primeList=new ArrayList<>();
		AlgorithmUtility au=new AlgorithmUtility();
		System.out.println("The prime number in the range 0-1000 are:");
		au.rangePrime(); //method call
	}

}
