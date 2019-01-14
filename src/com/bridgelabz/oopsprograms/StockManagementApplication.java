package com.bridgelabz.oopsprograms;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.util.OopsUtility;

public class StockManagementApplication 
{

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException 
	{
		System.out.println("-----STOCK MANAGEMENT APPLICATION------");
		boolean run=true;
		while(run)
		{
			System.out.println("Enter your choice\n1.Add Stock\n2.Calculate each stock value\n3.Calculate value of total stocks\n4.Quit");
			int ch=OopsUtility.userInteger();
			switch(ch)
			{
			case 1: StockPortfolio.addStock();
			        run=true;
			        break;
			case 2: StockPortfolio.eachStockValue();
			       run=true;
			       break;
			case 3:
			case 4: System.exit(0);
			default:System.out.println("kindly enter amon the choices");
			        StockManagementApplication.main(null);
			        break;
				
			}
		}

	}

}
