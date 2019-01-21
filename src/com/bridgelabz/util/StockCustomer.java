/********************************************************************** *********
 *   Compilation:  javac -d bin StockCustomer.java						        *
 *  Execution:    java -cp bin com.bridgelabz.oopsprograms.StockCustoemr        *
 *                                                                  			*
 *  Purpose: Stock MAnagement Application
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   9.1.2018															*
 *  **************************************************************************/
package com.bridgelabz.util;

public class StockCustomer {
	private String stockName;
	private int noOfShare;
	private float sharePrice;
	private Transaction transaction;

	public StockCustomer() {
		stockName = null;
		noOfShare = 0;
		sharePrice = 0;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public int getNoOfShare() {
		return noOfShare;
	}

	public void setNoOfShare(int noOfShare) {
		this.noOfShare = noOfShare;
	}

	public float getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(float sharePrice) {
		this.sharePrice = sharePrice;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

}
