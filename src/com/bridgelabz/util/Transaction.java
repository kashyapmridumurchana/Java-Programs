/********************************************************************** *********
 *   Compilation:  javac -d bin Transaction.java						        *
 *  Execution:    java -cp bin com.bridgelabz.oopsprograms.Transaction          *
 *                                                                  			*
 *  Purpose: Stock MAnagement Application
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   9.1.2018															*
 *  **************************************************************************/
package com.bridgelabz.util;

public class Transaction {
	private String date;
	private String transactionStatus;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

}
