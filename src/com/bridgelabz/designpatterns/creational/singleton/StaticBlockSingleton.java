package com.bridgelabz.designpatterns.creational.singleton;

public class StaticBlockSingleton
{
private static StaticBlockSingleton instance;

private StaticBlockSingleton() {}
 
//drawback: creates instance even if client application doesnot call it
//static block initialization for exception handling(overcomes the drawback of Eager Initialization
	static {
		
		try {
			instance =new StaticBlockSingleton();
			
		}
		catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}


public static StaticBlockSingleton getInstance()
{
	
	return instance;
}

}