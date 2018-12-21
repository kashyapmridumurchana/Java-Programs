package com.bridgelabz.algorithmprograms;
import java.util.*;

import com.bridgelabz.util.AlgorithmUtility;

public class VendingMachine {

	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the money");
	int money=sc.nextInt();
	int notes[]= {2000,500,200,100,50,10,5,2,1};
	AlgorithmUtility auu=new AlgorithmUtility();
	auu.vendingMachine(money, notes);
	
	}

}
