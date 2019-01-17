package com.bridgelabz.designpatterns.creational.singleton;

public class ThreadSafeSingleton 
{
private static ThreadSafeSingleton instance;

private ThreadSafeSingleton() {}


//synchronized is used
public static synchronized ThreadSafeSingleton getInstance()
{
    if(instance == null){
        instance = new ThreadSafeSingleton();
    }
    return instance;
}


//using double lock checking

public static ThreadSafeSingleton getInstanceUsingDoubleLocking(){
    if(instance == null){
        synchronized (ThreadSafeSingleton.class) //double lock check
        {
            if(instance == null){
                instance = new ThreadSafeSingleton();
            }
        }
    }
    return instance;
}







}
