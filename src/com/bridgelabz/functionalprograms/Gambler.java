/********************************************************************** *********
 *   Compilation:  javac -d bin Gambler.java						      	    *
 *  Execution:    java -cp bin com.bridgelabz.functionalprograms.Gambler        *
 *                                                                  			*
 *  Purpose: Gambler game           											*
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   19.12.2018															*
 *  **************************************************************************/
package com.bridgelabz.functionalprograms;

import java.util.*;
import com.bridgelabz.util.FunctionalUtility;

public class Gambler
{
 //main method takes the input of the parameters and calls the function
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter $Stake value");
		int $Stake=s.nextInt();
		System.out.println("Enter $Goal value");
		int $Goal=s.nextInt();
		System.out.println("Enter number of times");
		int n=s.nextInt();
		
		FunctionalUtility funtionalUtility=new FunctionalUtility();
		funtionalUtility.gambler($Stake,$Goal,n);//function call

	}

}
