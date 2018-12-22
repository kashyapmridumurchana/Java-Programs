/********************************************************************** *********
 *   Compilation:  javac -d bin StopWatch.java						      	    *
 *  Execution:    java -cp bin com.bridgelabz.functionalprograms.StopWatch      *
 *                                                                  			*
 *  Purpose: to make a stop watch												*
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   19.12.2018															*
 *  **************************************************************************/

package com.bridgelabz.functionalprograms;
import com.bridgelabz.util.FunctionalUtility;
import java.util.*;

public class StopWatch 
{
	
//main method takes input from user and calls a function
	public static void main(String[] args)
	{
		FunctionalUtility fu=new FunctionalUtility();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 4 to start the timer");
		int n=sc.nextInt();
		fu.start();//method call
		System.out.println("Press 5 to start the timer");
		int n1=sc.nextInt();
		fu.stop();//method call
		fu.timeTaken();//method call
		
		
		

	}

}
