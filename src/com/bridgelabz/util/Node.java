package com.bridgelabz.util;

public class Node<E>
{
public String data1;
public int data;
public Node nextNode;

public void SetData(String data1)
{
	this.data1=data1;
	nextNode=null;
}
public void SetData(int data)
{
	this.data=data;
	nextNode=null;
}

}
