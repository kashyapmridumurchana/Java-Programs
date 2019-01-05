/*****************************************************************************************
 *   Compilation:  javac -d bin Banking.java											 *
 *  Execution:    java -cp bin com.bridgelabz.datastructureprograms.Banking              *
 *                                                                  					 *
 *  Purpose: Simulate Banking Cash Counter
																				     	 *
 *														          						 *
 *  @author  Mridumurchana Kashyap													     *
 *  @version 1.0																	   	 *
 *  @since   3.1.2019															         *
 *  **************************************************************************************/
package com.bridgelabz.datastructureprograms;
 

import com.bridgelabz.util.DataStructureUtility;
import com.bridgelabz.util.Queue;

public class banking {
	public static void main(String[] args) {
		Queue queue=new Queue(400);
		int n=0,i=0;
		double cash=20000;
		do {
			System.out.println("1.Add member to the queue\n2.Check cashier balance\n3.exit");
			int choice=DataStructureUtility.userInteger();
			switch(choice)
			{
			//case 1
			case 1:
				queue.enqueue(i++);
				System.out.println(i+" member added to queue\n");
				System.out.println("Choose among the choices\n1. Deposit money\n2. Withdraw money");
				int choi=DataStructureUtility.userInteger();
				switch(choi)
				{
				
				//case 1
				case 1: System.out.println("Enter the amount to be deposited");
				double depositAmount=DataStructureUtility.userDouble();
				cash+=depositAmount;
				System.out.println();
				System.out.println("cash deposited and updated on to your account");
				break;
				
				//case 2
				case 2:System.out.println("Enter the amount to be withdrawn");
				double withdrawAmount=DataStructureUtility.userDouble();
				if(cash<withdrawAmount)
				{
					System.out.println("amount cannot be withdrawn or no cash with cashier due to technical problem in bank\n");
				}
				else
				{
					cash-=withdrawAmount;
					System.out.println("\ncash debited and updated your account balance\n");
				}
				break;
				default:System.out.println("choose among the options");
				}
				queue.dequeue();
				System.out.println("removed him from the queue");
				break;
			//case 2
			case 2:System.out.println("Cash count is :"+cash);
			break;
			//case 3
			case 3:System.exit(0);
			break;
			//default case
			default:System.out.println("choose correct choice");
			}
			n++;
		}while(n<30);

	}

}