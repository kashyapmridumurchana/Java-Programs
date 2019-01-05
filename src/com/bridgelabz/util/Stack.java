package com.bridgelabz.util;

public class Stack
{
	private int maxSize;
	private long[] stackArray;
	private int top;
	private int size=0;

	//for size  
	public Stack(int s)
	{
	maxSize = s;
	stackArray = new long[maxSize];
	top = -1;
	}
	//for push   
	public void push(long j)
	{
	stackArray[++top] = j;
	size++;
	}
	public int size()
	{
	return size;
	}
	//for pop   
	public long pop() 
	{
	size--;
	return stackArray[top--];
	
	}
	//for peek   
	public long peek() 
	{
	return stackArray[top];
	}
	//to check whether stack is empty	   
	public boolean isEmpty()
	{
	return (top == -1);
	}
	//to check whether stack is full	   
	public boolean isFull()
	{
	return (top == maxSize - 1);
}
}
