/********************************************************************** ****************************
 *   Compilation:  javac -d bin TemperatureConversion.java						        			*	
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.TemperatureConversion.java	  	    *
 *                                                                  								*
 *  Purpose: To convert from celsius to fahrenheit and vice versa        							*
 *																									*
 *  @author  Mridumurchana Kashyap																	*
 *  @version 1.0																					*
 *  @since   19.12.2018																				*
 *  ************************************************************************************************/
package com.bridgelabz.algorithmprograms;
import com.bridgelabz.util.*;
import java.util.*;
public class TemperatureConversion {
	
	//main method takes input of the temperature and calls method 
	public static void main(String[] args)
	{
		
		System.out.println("Enter the temperature ");	
		float temp=AlgorithmUtility.userInteger();

		System.out.println("kindly choose among the choices");	
		System.out.println("1. temperature to Fahrenheit   2.temperature to Celsius");

		int c=AlgorithmUtility.userInteger();
		AlgorithmUtility aa=new AlgorithmUtility();
		switch(c)//switch case to choose among the choices
		{
		
		
		//case 1
		case 1:aa.tempConversion(temp);//method call
		      System.out.println("the temperature in fahrenheit is "+ temp);
		break;
		
		
		
		
		//case 2
		case 2:aa.tempConversion1(temp);//method call
		System.out.println("the temperature in celsius is"+ temp);
		break;
		
		
		//default
		default: System.out.println("kindly choose among the given choices");
		break;
		}


	}

}
