package com.bridgelabz.designpatterns.creational.singleton;

public class LazyInitializationSingleton 
{
	private static LazyInitializationSingleton instance;
	
	private LazyInitializationSingleton() {}
	
	
	//gives best result when used in single threaded environment.
	public static LazyInitializationSingleton getInstance()
	{
		if(instance==null)
		{
			instance=new LazyInitializationSingleton();
			
		}
		return instance;
	}
	

}
