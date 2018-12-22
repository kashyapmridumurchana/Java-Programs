/********************************************************************** *********
 *   Compilation:  javac -d bin SquareRoot.java						        	*
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.SquareRoot      *
 *                                                                  			*
 *  Purpose: to find the square root of a number             					*
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   19.12.2018															*
 *  **************************************************************************/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.AlgorithmUtility;
import java.util.*;
public class SquareRoot
{
//main method takes input and calls the function
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to geth the square root");
		Double num=sc.nextDouble();
		
		AlgorithmUtility aa=new AlgorithmUtility();
		 aa.squareRoot(num);//function call
	}

}
