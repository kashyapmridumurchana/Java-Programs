/*******************************************************************************
 *   Compilation:  javac -d bin GuessNumber.java								*
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.GuessNumber		*
 *                                                                  			*
 *  Purpose: Question to find your number										*
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   19.12.2018															*
 *  **************************************************************************/
package com.bridgelabz.algorithmprograms;
import com.bridgelabz.util.*;
public class GuessNumber
{
	//main method contains the input of the number by the user and calls method
	public static void main(String[] args)
	{
       String i=args[0];
       int n=Integer.parseInt(i);
		int range=(int) (Math.pow(2,n));  //range is calculated using pre-defined function 'power'
		int r=range-1;
		System.out.println("take number between '1' to "+r);
		int count=0;
		String input=null;
		int lower=0;
		int upper=range;
		int middle=(lower+upper)/2;
		AlgorithmUtility.bSearch(lower,upper,middle,count,input,n);//method is called

	}

}
