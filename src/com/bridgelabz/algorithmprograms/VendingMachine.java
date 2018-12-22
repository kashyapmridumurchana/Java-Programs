/********************************************************************** *********
 *   Compilation:  javac -d bin VendingMachine.java						        *
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.VendingMachine  *
 *                                                                  			*
 *  Purpose:   Vending machine           										*
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   19.12.2018															*
 *  **************************************************************************/
package com.bridgelabz.algorithmprograms;
import java.util.*;

import com.bridgelabz.util.AlgorithmUtility;

public class VendingMachine {

	//main method gives input of the money
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the money");
	int money=sc.nextInt();
	int notes[]= {1000,500,100,50,10,5,2,1};
	AlgorithmUtility auu=new AlgorithmUtility();
	auu.vendingMachine(money, notes);//method call
	
	}

}
