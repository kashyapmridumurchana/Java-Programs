package com.bridgelabz.designpatterns.creational.singleton;

public class StaticBlockSingletonTest {

	public static void main(String[] args) 
	{
		StaticBlockSingleton s=StaticBlockSingleton.getInstance();
		System.out.println(s);
		
		StaticBlockSingleton s1=StaticBlockSingleton.getInstance();
       System.out.println(s1);
	}

}
