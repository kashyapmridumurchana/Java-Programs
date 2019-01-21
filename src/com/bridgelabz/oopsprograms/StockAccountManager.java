/********************************************************************** *********
 *   Compilation:  javac -d bin StockAccountManager.java						*
 *  Execution:    java -cp bin com.bridgelabz.oopsprograms.StockAccountManager  *
 *                                                                  			*
 *  Purpose: Stock MAnagement Application
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   9.1.2018															*
 *  **************************************************************************/
package com.bridgelabz.oopsprograms;

import java.io.IOException;

import com.bridgelabz.util.OopsUtility;
import com.bridgelabz.util.StockAccount;

public class StockAccountManager {

	public static void main(String[] args) throws IOException 
	{
		int op=3;
		while(op!=0)
		{
			System.out.println("------STOCK MANAGEMENT APPLICATION------");
			System.out.println("Enter the choice");
			System.out.println("1.Create Account\n2.Open Account\n3.Quit");
			int ch=OopsUtility.userInteger();
			switch(ch)
			{
			case 1: StockAccount.createCustomer();
			        break;
			case 2: StockAccount.openAccount();
			        break;
			case 3:  System.exit(0);
			       
			}
		}
		
		
	}

}
