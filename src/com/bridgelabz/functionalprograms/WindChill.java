/********************************************************************** *********
 *   Compilation:  javac -d bin WindChill.java						            *
 *  Execution:    java -cp bin com.bridgelabz.functionalprograms.WindChill       *
 *                                                                  			*
 *  Purpose:  to calculate wind speed        			 *
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   19.12.2018															*
 *  **************************************************************************/
package com.bridgelabz.functionalprograms;
import java .util.*;
import com.bridgelabz.util.*;

public class WindChill 
{
//main method takes the input of the parameters and calls a function
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temperature");
		int t=sc.nextInt();
		System.out.println("Enter the speed");
		int v=sc.nextInt();
		FunctionalUtility fu1=new FunctionalUtility();
		fu1.windChill(t,v);//function call
		
		
		
		
		
	}

}
