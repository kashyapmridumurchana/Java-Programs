/********************************************************************** *********
 *   Compilation:  javac -d bin StockPortfolio.java						        *
 *  Execution:    java -cp bin com.bridgelabz.oopsprograms.StockPortfolio       *
 *                                                                  			*
 *  Purpose: Stock Management
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   9.1.2018															*
 *  **************************************************************************/
package com.bridgelabz.oopsprograms;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.util.OopsUtility;

public class StockPortfolio 
{

	static List<Stock> listOfStock=new ArrayList<Stock>();
	static String stockFile="/home/admin1/eclipse-workspace/Java-Programs/Stock.json";
	
	
	//adding a stock
	/**
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	public static void addStock() throws JsonGenerationException, JsonMappingException, IOException
	{
		String string=OopsUtility.readFile(stockFile);
		try {
			listOfStock = OopsUtility.userReadValue(string, Stock.class);
			System.out.println("File is not empty!");
		} catch (Exception e) {
			System.out.println("File is empty!");
		}
		Stock stock=new Stock();
		System.out.println("Enter the name of stock");
		stock.setStockName(OopsUtility.userString());
		System.out.println("Enter the number of share");
		stock.setNoOfShare(OopsUtility.userInteger());
		System.out.println("Enter the price per share");
		stock.setSharePrice(OopsUtility.userFloat());
		listOfStock.add(stock);
		System.out.println("Stock created");
		String json=OopsUtility.userWriteValueAsString(listOfStock);
		OopsUtility.write11(json,stockFile);
			
	}
	
	
	//per share stock's price calculation
	/**
	 * @throws FileNotFoundException
	 */
	public static void eachStockValue() throws FileNotFoundException
	{
		String string=OopsUtility.readFile(stockFile);
		try {
			listOfStock = OopsUtility.userReadValue(string, Stock.class);
			System.out.println("File is not empty!");
		} catch (Exception e) {
			System.out.println("File is empty!");
		}	
		for(Stock stock:listOfStock)
		{
			float dir=stock.getSharePrice()*stock.getNoOfShare();
			System.out.println("Stock is " +stock.getStockName() + " and price of each share of it is " +dir);
			
		}
			
	}
	
	
	
	//total stock share calculation
	/**
	 * @throws FileNotFoundException
	 */
	public static void totalStockValue() throws FileNotFoundException
	{
		float sum=0;
		String string=OopsUtility.readFile(stockFile);
		try {
			listOfStock=OopsUtility.userReadValue(string, Stock.class);
			System.out.println("File is not empty!");
		}catch(Exception e) {
			System.out.println("File is empty");
		}
		for(Stock stock:listOfStock)
		{
			float dir=stock.getSharePrice()*stock.getNoOfShare();
			sum+=dir;
			System.out.println("Total stock of "+stock.getStockName()+" is " +sum);
			
		}
	}
	
	
	
	//displaying stock
	/**
	 * @throws IOException
	 */
	public static void displayStock() throws IOException 
	{
		String s2=OopsUtility.readFile1(StockPortfolio.stockFile);
		try {
			StockPortfolio.listOfStock=OopsUtility.userReadValue(s2, Stock.class);
		}
		catch(Exception e)
		{
			System.out.println("unable to read");
		}
		for (Stock st : listOfStock)
		{
            System.out.println("Stock name : " +st.getStockName());
            System.out.println("Stock's number of share : " + st.getNoOfShare());
            System.out.println("Stock per share price : " + st.getSharePrice());
            System.out.println("------------------------------------------------------");
	}
	
	}
	
	//date 
	public static String getDate() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		String date = dtf.format(now);
		return date;
	}
	
	
	
	
	
}
