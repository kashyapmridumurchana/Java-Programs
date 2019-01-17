package com.bridgelabz.designpatterns.creational.singleton;

public class SerializedSingletonTest {

	public static void main(String[] args) {
		SerializedSingleton s=SerializedSingleton.getInstance();
		System.out.println(s);
		
		SerializedSingleton s2=SerializedSingleton.getInstance();
		System.out.println(s2);

	}

}
