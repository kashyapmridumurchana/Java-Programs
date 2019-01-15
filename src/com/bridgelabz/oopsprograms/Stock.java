/********************************************************************** *********
 *   Compilation:  javac -d bin Stock.java						                *
 *  Execution:    java -cp bin com.bridgelabz.oopsprograms.Stock                *
 *                                                                  			*
 *  Purpose: Stock MAnagement Application
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   9.1.2018															*
 *  **************************************************************************/
package com.bridgelabz.oopsprograms;

public class Stock
{
private String stockName;
private int noOfShare;
private float sharePrice;

public Stock()
{
	stockName=null;
	noOfShare=0;
	sharePrice=0;
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




}
