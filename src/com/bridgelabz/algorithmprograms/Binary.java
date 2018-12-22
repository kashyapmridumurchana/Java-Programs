/*******************************************************************************
 *   Compilation:  javac -d bin Binary.java									    *
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.Binary			*
 *                                                                  			*
 *  Purpose: to get the reverse of the binary form of a decimal number			*
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   19.12.2018															*
 *  **************************************************************************/
package com.bridgelabz.algorithmprograms;
import com.bridgelabz.util.*;
import java.util.*;
public class Binary {

	//main methods takes the input as a decimal number and calls the function
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element to get the binary form");
		int num=sc.nextInt();

		
		AlgorithmUtility aa=new AlgorithmUtility();
		aa.toBinary1(num);//method is called

	}

}
