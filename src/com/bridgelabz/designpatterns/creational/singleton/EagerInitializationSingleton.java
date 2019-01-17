package com.bridgelabz.designpatterns.creational.singleton;

public class EagerInitializationSingleton 
{
private static EagerInitializationSingleton instance=new EagerInitializationSingleton();

private EagerInitializationSingleton() {	}

//drawback: instance is created even though it is not called by client application
//drawback: no scope of exception handling

public static EagerInitializationSingleton getInstance()
{
	return instance;
}

}
