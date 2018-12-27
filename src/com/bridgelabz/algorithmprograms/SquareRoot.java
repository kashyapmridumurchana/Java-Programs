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
public class SquareRoot
{
//main method takes input and calls the function
	public static void main(String[] args) 
	{
		System.out.println("Enter the number to geth the square root");
		Double num=AlgorithmUtility.userDouble();
		double temp=num;
		AlgorithmUtility aa=new AlgorithmUtility();
		 aa.squareRoot(num,temp);//function call
		System.out.println("the square root of "+ num+ " is " + temp);
	}

}
