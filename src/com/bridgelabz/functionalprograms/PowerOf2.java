/********************************************************************** *********
 *   Compilation:  javac -d bin PowerOf2.java						      	    *
 *  Execution:    java -cp bin com.bridgelabz.functionalprograms.PowerOf2       *
 *                                                                  			*
 *  Purpose: 	To get the series of power of 2									*
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   19.12.2018															*
 *  **************************************************************************/

package com.bridgelabz.functionalprograms;
import com.bridgelabz.util.FunctionalUtility;
import java.util.*;
public class PowerOf2 {
//main method takes the input of the number and calls a method
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=s.nextInt();
		FunctionalUtility funtionalUtility=new FunctionalUtility();
		funtionalUtility.powerOf2(n);//method call
		

	}

}
