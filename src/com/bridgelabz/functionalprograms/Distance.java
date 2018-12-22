/********************************************************************** *********
 *   Compilation:  javac -d bin Distance.java						      	    *
 *  Execution:    java -cp bin com.bridgelabz.functionalprograms.Distance       *
 *                                                                  			*
 *  Purpose: to calculate euclidean distance									*
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   19.12.2018															*
 *  **************************************************************************/
package com.bridgelabz.functionalprograms;
import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;
public class Distance 
{
//main method gives input to the parameters x and y
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the x value");
		int x=sc.nextInt();
		System.out.println("Enter the y value");
		int y=sc.nextInt();
		FunctionalUtility funtionalUtility=new FunctionalUtility();
		funtionalUtility.distance(x,y);//method call

	}

}
