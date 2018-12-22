/********************************************************************** ****************************
 *   Compilation:  javac -d bin ToBinary.java						        						*	
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.ToBinary.java	  	    			*
 *                                                                  								*
 *  Purpose: to convert decimal number to binary													*
 *																									*
 *  @author  Mridumurchana Kashyap																	*
 *  @version 1.0																					*
 *  @since   19.12.2018																				*
 *  ************************************************************************************************/
package com.bridgelabz.algorithmprograms;
import java.util.*;
import com.bridgelabz.util.*;
public class ToBinary
{
//main method gives input of the decimal number
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the decimal number to be converted to binary");
		int num=sc.nextInt();
		AlgorithmUtility aa=new AlgorithmUtility();
		aa.toBinary(num);//method call
		

	}

}
