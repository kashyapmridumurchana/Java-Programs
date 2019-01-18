package com.bridgelabz.designpatterns.creational.singleton;

public class BillPughSingleton
{
	
	
private BillPughSingleton() {}


/*inner static helper class (overcomes the problem of previous methods
in applying with multi-threaded environment) [reason given below in comments]*/
private static class SingletonHelper
{
	private static final BillPughSingleton instance=new BillPughSingleton();
}


public static BillPughSingleton getInstance()
{
	return SingletonHelper.instance;//loaded into memory when the getInstance() is called
}
}
