package com.bridgelabz.oopsprograms;

import com.bridgelabz.util.OopsUtility;

public class StockAccountManager {

	public static void main(String[] args) 
	{
		
		boolean isRun=true;
		while(isRun)
		{
			System.out.println("------STOCK MANAGEMENT APPLICATION------");
			System.out.println("Enter the choice");
			System.out.println("1.Buy Stock\n2.Sell Stock\n3.Save Stock\n4.Print Report\n5.Quit");
			int ch=OopsUtility.userInteger();
			switch(ch)
			{
			case 1: StockAccount.buyStock();
			        isRun=true;
			        break;
			case 2: StockAccount.sellStock();
			        isRun=true;
			        break;
			case 3: StockAccount.saveStock();
			        isRun=true;
			        break;
			case 4: StockAccount.printReport();
			        isRun=true;
			        break;
			case 5: System.exit(0);
			        
			}
		}
		
		
	}

}
