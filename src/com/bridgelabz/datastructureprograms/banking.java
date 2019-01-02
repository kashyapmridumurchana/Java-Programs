package com.bridgelabz.datastructureprograms;
import com.bridgelabz.datastructureprograms.Queue.CashCounterLogic;
import com.bridgelabz.util.DataStructureUtility;

public class banking {

	public static void main(String[] args)
	{
		Queue q=new Queue();
		CashCounterLogic c=q.new CashCounterLogic();
		int ch = 0;
		do
		{ 
			System.out.println();
		   	System.out.println("------------Banking Cash Counter-----------");
		   	System.out.println("1.Deposit");
		   	System.out.println("2.Withdraw");
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
			   		c.display();
			   		break;
		   	case 2:
			   		System.out.println("Enter the amount you want to Withdraw ");
					long u=DataStructureUtility.userInteger();
			   		c.remove();
			   		System.out.println(" Your Available Balance is: "); 
			   		c.display();
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
