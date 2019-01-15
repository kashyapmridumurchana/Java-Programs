package com.bridgelabz.oopsprograms;

import java.util.Date;

public class Transaction
{
private Date date=new Date();
private String transactionStatus;

public Transaction()
{
	transactionStatus=null;
}



public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public String getTransactionStatus() {
	return transactionStatus;
}
public void setTransactionStatus(String transactionStatus) {
	this.transactionStatus = transactionStatus;
}


}
