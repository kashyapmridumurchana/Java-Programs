package com.bridgelabz.designpatterns.creational.singleton;

public class EagerInitializationSingletonTest {

	
	public static void main(String[] args) 
	{
		
		EagerInitializationSingleton e=EagerInitializationSingleton.getInstance();
		System.out.println(e);
		
		
		EagerInitializationSingleton e1=EagerInitializationSingleton.getInstance();
		System.out.println(e1);
		
		/*Below statement shows constructor not visible as constructor
		 *  is private so accessible within the same class*/
		
		
		//EagerInitializationSingleton e=new EagerInitializationSingleton();  

	}

}
