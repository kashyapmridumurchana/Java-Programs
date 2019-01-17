package com.bridgelabz.designpatterns.creational.singleton;

public enum EnumSingleton
{
instance;
	public static EnumSingleton getInstance()
	{
		return instance;
	}
}
