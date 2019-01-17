package com.bridgelabz.designpatterns.creational.singleton;

import java.lang.reflect.Constructor;

public class Reflection 
{
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
	 EagerInitializationSingleton instanceOne = EagerInitializationSingleton.getInstance();
     EagerInitializationSingleton instanceTwo = null;
     
     StaticBlockSingleton instanceOne1=StaticBlockSingleton.getInstance();
     StaticBlockSingleton instanceTwo2= null;
     
     
     try {
    	 
    	 //destroying for EagerInitialization
         Constructor[] constructors = EagerInitializationSingleton.class.getDeclaredConstructors();
         
       //destroying for Static block Initialization
         Constructor[] constructor1=StaticBlockSingleton.class.getDeclaredConstructors();
        
         for (Constructor constructor : constructors) {
        	 
             //Below code will destroy the singleton pattern for eager initialization
             constructor.setAccessible(true);
             instanceTwo = (EagerInitializationSingleton) constructor.newInstance();
             break;
         }
         
       //Below code will destroy the singleton pattern for Static block 
         for(Constructor constructor: constructor1)
         {
        	 constructor.setAccessible(true);
        	 instanceTwo2=(StaticBlockSingleton) constructor.newInstance();
        	 break;
        			 
         }
        	 
        	 
     } catch (Exception e) {
         e.printStackTrace();
     }
     System.out.println("Eager Initialization instances:");
     System.out.println(instanceOne.hashCode());
     System.out.println(instanceTwo.hashCode());
     
     System.out.println("\nStatic block instances:");
     System.out.println(instanceOne1.hashCode());
     System.out.println(instanceTwo2.hashCode());
     
     
 }

}
