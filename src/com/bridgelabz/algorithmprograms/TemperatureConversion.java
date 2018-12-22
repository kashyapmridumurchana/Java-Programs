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
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temperature ");	
		float temp=sc.nextFloat();
		
		System.out.println("kindly choose among the choices");	
		System.out.println("1. temperature to Fahrenheit   2.temperature to Celsius");
		
		int c=sc.nextInt();
     AlgorithmUtility aa=new AlgorithmUtility();
     switch(c)//switch case to choose among the choices
     {
     case 1:aa.tempConversion(temp);//method call
            break;
     case 2:aa.tempConversion1(temp);//method call
            break;
     default: System.out.println("kindly choose among the given choices");
              break;
     }

	
	}

}
