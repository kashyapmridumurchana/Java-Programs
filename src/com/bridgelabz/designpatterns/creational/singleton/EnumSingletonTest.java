package com.bridgelabz.designpatterns.creational.singleton;

public class EnumSingletonTest {

	public static void main(String[] args) 
	{
		EnumSingleton e=EnumSingleton.getInstance();
		System.out.println("First instantiation: "+e);
		
		EnumSingleton e1=EnumSingleton.getInstance();
		System.out.println("Second instantiation: "+e1);

	}

}
