/********************************************************************** *********
 *   Compilation:  javac -d bin StockAccount.java						        *
 *  Execution:    java -cp bin com.bridgelabz.oopsprograms.StockAccount         *
 *                                                                  			*
 *  Purpose: Stock MAnagement Application
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   9.1.2018															*
 *  **************************************************************************/
package com.bridgelabz.oopsprograms;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.LinkedList;
import com.bridgelabz.util.OopsUtility;
import com.bridgelabz.util.QueueLinkedList;
import com.bridgelabz.util.StackLinkedList;

public class StockAccount {
	//member declaration
	static String chooseAccount;
	static List<StockCustomer> listOfStocks = new ArrayList<StockCustomer>();
	static String path = "/home/admin1/eclipse-workspace/Java-Programs/";
	static LinkedList<String> list=new LinkedList<String>();
	static QueueLinkedList<String> queue=new QueueLinkedList<String>();
	static StackLinkedList<String> stack=new StackLinkedList<String>();
	static StackLinkedList<String> tempStack=new StackLinkedList<String>();



//contains switch cases for get stock details
	/**
	 * @throws IOException
	 */
	public static void stockEntry() throws IOException {
		int op=4;
		while (op!=0) {
			System.out.println("Enter the choice");
			System.out.println("1.Buy Stock\n2.Sell Stock\n3.Save Stock\n4.Print Report\n5.Go Back");
			int ch = OopsUtility.userInteger();
			switch (ch) {
			case 1:
				buyStock();
				
				break;
			case 2:
				sellStock();
				
				break;
			case 3:
				saveStock();
				
				break;
			case 4:
				printReport();
				
				break;
			case 5:
				StockAccountManager.main(null);
				

			}
		}
	}

	
	
	//buy stock
	/**
	 * @throws IOException
	 */
	public static void buyStock() throws IOException
	{
		System.out.println("Stocks available are");
		StockPortfolio.displayStock();
		System.out.println("Enter the stock name you want to buy");
		String sName = OopsUtility.userString();
		System.out.println("Enter how many shares you want ");
		int nOshare = OopsUtility.userInteger();
		String s1 = OopsUtility.readFile1(path + chooseAccount);// Current file details in s1
		String s2 = OopsUtility.readFile1(StockPortfolio.stockFile);// StockFile in s2
		StockPortfolio.listOfStock = OopsUtility.userReadValue(s2, Stock.class);
		try {
			listOfStocks = OopsUtility.userReadValue(s1, StockCustomer.class);
			StockCustomer stt = newEntry(sName, nOshare);
			listOfStocks.add(stt);
		} catch (Exception e) {

		}
		String json = OopsUtility.userWriteValueAsString(StockPortfolio.listOfStock);
		OopsUtility.write11(json, StockPortfolio.stockFile);
	}

	
	
	//buy stock continued
	/**
	 * @param sName is the name of the stock
	 * @param nOfShare  is the number of the stock
	 * @return
	 */
	public static StockCustomer newEntry(String sName, int nOfShare) {
		for (Stock stock : StockPortfolio.listOfStock) {
			if (sName.equals(stock.getStockName())) {
				int newNoOfShare = stock.getNoOfShare() - nOfShare;
				stock.setNoOfShare(newNoOfShare);
				StockCustomer stockCustomer = new StockCustomer();
				stockCustomer.setStockName(sName);
				stockCustomer.setNoOfShare(nOfShare);
				stockCustomer.setSharePrice(stock.getSharePrice());
				Transaction transaction = new Transaction();
				String date1=StockPortfolio.getDate();
				transaction.setDate(date1);
				transaction.setTransactionStatus("Purchase");
				stockCustomer.setTransaction(transaction);
				return stockCustomer;
			}

		}
		return null;
	}
	
	
	

	//buy stock continued
	/**
	 * @throws IOException
	 */
	public static void displayAccount() throws IOException {
		String string = OopsUtility.readFile1(path + chooseAccount);
		File[] arrayOfFiles = new File(System.getProperty("user.dir")).listFiles();
		for (File file : arrayOfFiles) {
			String fileName = file.getName();
			if (chooseAccount.equals(fileName))
				try {
					listOfStocks = OopsUtility.userReadValue(string, StockCustomer.class);
					System.out.println("Account details are:");
					for (StockCustomer stockCustomer : listOfStocks) {
						System.out.println("Stock name is " + stockCustomer.getStockName());
						System.out.println("Number of share " + stockCustomer.getNoOfShare());
						System.out.println("Share price is " + stockCustomer.getSharePrice());
						System.out.println("Transaction date is " + stockCustomer.getTransaction().getDate());
						System.out.println("Transaction status is " + stockCustomer.getTransaction().getTransactionStatus());
						System.out.println("-------------------------------------------------");
					}
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("Empty file");
				}
		}
	}

	
	//sell stock
	
	/**
	 * @throws IOException
	 */
	public static void sellStock() throws IOException {
		displayAccount();
		System.out.println("Enter the name of stock to sell");
		String stockName = OopsUtility.userString();
		System.out.println("how many shares you want to sell");
		int numOfShares = OopsUtility.userInteger();
		String string = OopsUtility.readFile1(path + chooseAccount);
		try {
			listOfStocks = OopsUtility.userReadValue(string, StockCustomer.class);
			StockCustomer newS = soldData(stockName, numOfShares);
			listOfStocks.add(newS);
			updateStock(stockName, numOfShares);
		} catch (Exception e) {
			System.out.println("kindly buy before selling");
		}

	}

	
	//sell stock continued
	/**
	 * @param stockName is name of stock
	 * @param numOfShares  is the number of the stock
	 * @throws IOException
	 */
	private static void updateStock(String stockName, int numOfShares) throws IOException {
		String string = OopsUtility.readFile1(StockPortfolio.stockFile);
		try {
			StockPortfolio.listOfStock = OopsUtility.userReadValue(string, Stock.class);
			for (Stock st : StockPortfolio.listOfStock) {
				if (stockName.equals(st.getStockName())) {
					int newDetail = st.getNoOfShare() + numOfShares;
					st.setNoOfShare(newDetail);
				}
			}
		} catch (Exception e) {
			System.out.println("Unable to update the details");
		}

	}

	
	
	//sell stock continued
	/**
	 * @param stockName is name of stock
	 * @param numOfShares is the number of the stock
	 * @returns new stock details
	 */
	private static StockCustomer soldData(String stockName, int numOfShares) {
		for (StockCustomer stock : listOfStocks) {
			if (stockName.equals(stock.getStockName())) {
				StockCustomer newStock = new StockCustomer();
				newStock.setStockName(stockName);
				newStock.setNoOfShare(numOfShares);
				newStock.setSharePrice(stock.getSharePrice());
				Transaction transaction = new Transaction();
				String date1=StockPortfolio.getDate();
				transaction.setDate(date1);
				transaction.setTransactionStatus("Sold");
				newStock.setTransaction(transaction);

				return newStock;
			}
		}

		return null;
	}

	
	
	//saving a stock
	public static void saveStock() {
		System.out.println("Saving the account");
		File[] arrayOfFiles = new File(System.getProperty("user.dir")).listFiles();
		for (File file : arrayOfFiles) {
			String fileName = file.getName();
			if (chooseAccount.equals(fileName))
				try {
					String json = OopsUtility.userWriteValueAsString(listOfStocks);
					OopsUtility.write11(json, fileName);
					System.out.println("details saved");

				} catch (Exception e) {
					System.out.println("Unable to write into the file");
				}
		}

	}

	
	
//Printing stock
	/**
	 * @throws IOException
	 */
	public static void addPrint() throws IOException 
	{
		String string=OopsUtility.readFile1(path +chooseAccount);
		for(StockCustomer stock:listOfStocks)
			try {
				listOfStocks=OopsUtility.userReadValue(string, StockCustomer.class);
				list.add(stock.getStockName());
				queue.enqueue(stock.getTransaction().getDate());
				stack.push(stock.getTransaction().getTransactionStatus());
			}
		catch(Exception e)
		{
			System.out.println("No operations performed");
		}
	}

	
	
//printing stock continued
	/**
	 * @throws IOException
	 */
	public static void printReport() throws IOException
	{
		addPrint();
		System.out.println("Stock sold and purchased details are:");

			list.getLinkedList();

		System.out.println();
		for(int i=0;i<queue.size;i++)
		{

			System.out.print(queue.dequeue()+"\t\t");

		}
		System.out.println();
		while(!stack.isEmpty())
		{
			tempStack.push(stack.pop());
		}

		while(!tempStack.isEmpty())
		{
			System.out.print(tempStack.pop() +"\t\t\t");
		}
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------------");
	}

	
	
	//creating a new customer
	/**
	 * @throws IOException
	 */
	public static void createCustomer() throws IOException {

		System.out.println("Enter the name of Customer.");
		String sCus = OopsUtility.userString();

		File file = new File(path + sCus + ".json");

		boolean done = file.createNewFile();// to create new files
		if (done) {
			System.out.println("Account created");
		} else
			System.out.println("Account already exists");
	}

	
	
	//opening a customer's account
	/**
	 * @throws IOException
	 */
	public static void openAccount() throws IOException {

		System.out.println("Enter your choice");
		File[] arrayOfFiles = new File(System.getProperty("user.dir")).listFiles();
		for (File file : arrayOfFiles) {
			if (file.getName().endsWith(".json"))
				System.out.println(file.getName());
		}

		chooseAccount = OopsUtility.userString();
		for (File file : arrayOfFiles) {
			String fileName = file.getName();
			if (chooseAccount.equals(fileName)) {
				if (file.length() > 0) {
					System.out.println("File is not Empty ");
					String string = OopsUtility.readFile1(fileName);
					listOfStocks = OopsUtility.userReadValue(string, StockCustomer.class);
					stockEntry();

				} // end of if
				else {
					System.out.println("File is empty");
					System.out.println("Add new data onto the address book");
					stockEntry();

				}
			} // end of if

		} // end of for

	}// end of method
}
