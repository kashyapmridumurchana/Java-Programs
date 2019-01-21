package com.bridgelabz.oopsprograms;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.util.OopsUtility;
import com.bridgelabz.util.StockPortfolio;

public class StockPortfolioApplication {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		int op=3;
		while(op!=0){
			System.out.println("Enter your choice\n1:Add Stock\n2:Calculate each stock value\n3:Calculate value of total stocks\n4:Display\n5:Quit");
			int choice = OopsUtility.userInteger();
			switch (choice) {
			case 1:
				StockPortfolio.addStock();
				break;
			case 2:
				StockPortfolio.eachStockValue();
				
				break;
			case 3:
				StockPortfolio.totalStockValue();
				break;
			case 4:
				StockPortfolio.displayStock();
				break;
			case 5: System.exit(0);
			default:
				System.out.println("Invalid choice");
				break;
			}
		}
}
}


