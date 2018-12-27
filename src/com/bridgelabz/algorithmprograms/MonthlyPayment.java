/*******************************************************************************
 *   Compilation:  javac -d bin MonthlyPayment.java								*
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.MonthlyPayment	*
 *                                                                  			*
 *  Purpose: to calculate monthly payment.									*
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   19.12.2018															*
 *  **************************************************************************/
package com.bridgelabz.algorithmprograms;
import com.bridgelabz.util.*;
public class MonthlyPayment 
{
   //main method performs method call
	public static void main(String[] args)
	{
		System.out.println("Enter the P (principal loan)");
		double P=AlgorithmUtility.userDouble();
		System.out.println("Enter the Y (years to pay off)");
		double Y=AlgorithmUtility.userDouble();
		System.out.println("Enter the R (interest)");
		double R=AlgorithmUtility.userDouble();
	 AlgorithmUtility aa=new AlgorithmUtility();
	double payment= aa.monthlyPayment(P,Y,R);//method is called
	System.out.println("The monthly payment: "+ payment);
	}

}
