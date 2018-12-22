/********************************************************************** *********
 *   Compilation:  javac -d bin FlipCoin.java						      	    *
 *  Execution:    java -cp bin com.bridgelabz.functionalprograms.FlipCoin       *
 *                                                                  			*
 *  Purpose: Flip a coin and get the head and tail percentage								*
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   19.12.2018															*
 *  **************************************************************************/
package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.FunctionalUtility;
import java.util.*;
public class FlipCoin 
{
//main method takes the input of number of time coin is to be flipped and calls a function 
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many times coin has to be flipped");
		int n=sc.nextInt();
		FunctionalUtility funtionalUtility=new FunctionalUtility();
		funtionalUtility.flipCoin(n);//function call
	}

}
