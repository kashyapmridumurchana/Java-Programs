package com.bridgelabz.designpatterns.creational.singleton;

public class BillPughSingletonTest {

	public static void main(String[] args)
	{
		BillPughSingleton b=BillPughSingleton.getInstance();
		System.out.println(b);
		
		BillPughSingleton b1=BillPughSingleton.getInstance();
		System.out.println(b1);

	}

}
