/*******************************************************************************
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   19.12.2018															*
 *  **************************************************************************/
package com.bridgelabz.util;

public class Stack<T>
{
	private int maxSize;
	private long[] stackArray;
	private int top;
	private int size=0;

	//for size  
	public <T> Stack(int s)
	{
	maxSize = s;
	stackArray = new long[maxSize];
	top = -1;
	}
	//for push   
	public <T> void push(long j)
	{
	stackArray[++top] = j;
	size++;
	}
	public <T> int size()
	{
	return size;
	}
	//for pop   
	public <T> long pop() 
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
	public <T> boolean isEmpty()
	{
	return (top == -1);
	}
	//to check whether stack is full	   
	public <T> boolean isFull()
	{
	return (top == maxSize - 1);
}
}
