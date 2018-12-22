/********************************************************************** *********
 *   Compilation:  javac -d bin HarmonicNo.java						      	    *
 *  Execution:    java -cp bin com.bridgelabz.functionalprograms.HarmonicNo      *
 *                                                                  			*
 *  Purpose: 	Harmonic number    												*
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   19.12.2018															*
 *  **************************************************************************/
package com.bridgelabz.functionalprograms;


import com.bridgelabz.util.FunctionalUtility;
import java.util.*;

public class HarmonicNo 
{
//main method takes the input for the parameter and calls the function
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=s.nextInt();
		FunctionalUtility funtionalUtility=new FunctionalUtility();
		funtionalUtility.harmonicNo(n);//method call
		

	}

}
