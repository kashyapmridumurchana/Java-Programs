package com.bridgelabz.designpatterns.creational.singleton;

public class LazyInitializationSingletonTest {

	public static void main(String[] args) 
	{
		LazyInitializationSingleton l=LazyInitializationSingleton.getInstance();
		System.out.println(l);
		
		LazyInitializationSingleton l1=LazyInitializationSingleton.getInstance();
		System.out.println(l1);

	}

}
