package com.bridgelabz.designpatterns.creational.singleton;

public class ThreadSafeSingletonTest
{

	public static void main(String[] args) 
	{
		ThreadSafeSingleton t=ThreadSafeSingleton.getInstance();
		System.out.println(t);
		
		ThreadSafeSingleton t1=ThreadSafeSingleton.getInstance();
		System.out.println(t1);
	
		System.out.println("---------------------------");
		System.out.println("Double checking output: ");
	ThreadSafeSingleton t2= ThreadSafeSingleton.getInstanceUsingDoubleLocking();
	System.out.println(t2);
	
	ThreadSafeSingleton t3=ThreadSafeSingleton.getInstanceUsingDoubleLocking();
	System.out.println(t3);
	
	
	}
	
}
