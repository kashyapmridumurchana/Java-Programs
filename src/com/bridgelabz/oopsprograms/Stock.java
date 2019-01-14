package com.bridgelabz.oopsprograms;

public class Stock
{
private String stockName;
private int noOfShare;
private float sharePrice;

Stock()
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
