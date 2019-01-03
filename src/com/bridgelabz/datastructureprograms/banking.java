package com.bridgelabz.datastructureprograms;
import javax.xml.crypto.Data;

import com.bridgelabz.datastructureprograms.Queue.Queue1;
import com.bridgelabz.util.DataStructureUtility;

public class banking {

	public static void main(String[] args)
	{
		DataStructureUtility dd=new DataStructureUtility(); 
		Queue q=new Queue();
		Queue1 c=q.new Queue1();
		int ch = 0;
		do
		{ 
			System.out.println();
		   	System.out.println("<<<<<<<<<<<CASH COUNTER>>>>>>>>>>>>");
		   	System.out.println("1.Deposit money");
		   	System.out.println("2.Withdraw money");
		   	System.out.println("3.Number of people in the Queue ");
		   	System.out.println("4.Exit");
		   	System.out.println();
		   	System.out.println("Enter your choice: ");
		   	int choice=DataStructureUtility.userInteger();
		   	switch (choice) 
		   	{
		   	case 1:
			   		System.out.println("Enter the amount you want to Deposit");
			   		int qq=DataStructureUtility.userInteger();
			   		c.insert(qq);
			   		long dd1=dd.deposit(qq);
			   		System.out.println("Available amount is"+ dd1);
			   		
			   		
			   		break;
		   	case 2:
			   		System.out.println("Enter the amount you want to Withdraw ");
					long u=DataStructureUtility.userInteger();
			   		c.remove(u);
			   		System.out.println(" Your Available Balance is: "); 
			         long dd.();
			   		break;
			case 3:
					int j=c.getSize();
					System.out.println("The Number of People in Queue is: "+j);			
		   	case 4:
			   		System.exit(0);
		   	default: 
			   		System.out.println("You entered wrong choice");
			   		break;
		   	}
	   	}
while(ch<5);

	}

}
