/********************************************************************** **************
 *   Compilation:  javac -d bin StockManagementApplication.java				         *
 *  Execution:    java -cp bin com.bridgelabz.oopsprograms.StockManagementApplication*
 *                                                                  	       		 *
 *  Purpose: Stock MAnagement Application
 *																					 *
 *  @author  Mridumurchana Kashyap													 *
 *  @version 1.0																	 *
 *  @since   9.1.2018																 *
 *  **********************************************************************************/
package com.bridgelabz.oopsprograms;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.util.OopsUtility;

public class StockManagementApplication 
{

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException 
	{
		System.out.println("-----STOCK MANAGEMENT APPLICATION------");
		
		int op=2;
		while(op!=0)
		{
			
			System.out.println("Enter your choice");
			System.out.println("1.Add Stock\n2.Calculate each stock value\n3.Calculate value of total stocks\n4.Quit");
			int ch=OopsUtility.userInteger();

			switch(ch)
			{
			case 1: StockPortfolio.addStock();
			        break;
			case 2: StockPortfolio.eachStockValue(); 
			       break;
			case 3:StockPortfolio.totalStockValue();
			       break;
			case 4: System.exit(0);
			default:System.out.println("kindly enter among the choices");
			        StockManagementApplication.main(null);
			        break;
				
			}
		}
		

	}

}
