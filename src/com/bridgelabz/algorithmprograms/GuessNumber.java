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
import java.util.*;
import com.bridgelabz.util.*;
public class GuessNumber
{
	//main method contains the input of the number by the user and calls method
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=sc.nextInt();

		int range=(int) (Math.pow(2,n-1));  //range is calculated using pre-defined function 'poower'
		System.out.println("take number between '0' to "+range);
		int count=0;
		String input=null;
		int lower=0;
		int upper=range;
		int middle=(lower+upper)/2;

		
		AlgorithmUtility aa=new AlgorithmUtility();
		aa.bSearch(lower,upper,middle,count,input,n);//method is called

	}

}
