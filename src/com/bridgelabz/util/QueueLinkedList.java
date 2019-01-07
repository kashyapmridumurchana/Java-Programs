/*******************************************************************************
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   3.1.2018															*
 *  **************************************************************************/
package com.bridgelabz.util;

public class QueueLinkedList<T>
{

	public Node<T> front,rear;
	public int size;
	
	public QueueLinkedList(){
		front=null;
		rear=null;
		size=0;
	}
	
	//checks if queue is empty
	public boolean isQueueEmpty(){
		return front==null;
	}
	
	//gives the size  of queue
	public int size(){
		return size;
	}
	
	
	//to insert element in queue
	public void enqueue(T data){
		Node<T> node=new Node<T>(data,null);
		if(rear==null){
			front=node;
			rear=node;
		}
		else{
			rear.setNextRef(node);
			rear=rear.getNextRef();
		}
		size++;
	}
	
	
	//to remove element from queue
	public T dequeue(){
		if(isQueueEmpty())
			System.out.println("Underflow");
		Node<T> curr=front;
		front = curr.getNextRef();        
        if (front == null){
            rear =null;
			size-- ; 
		}       
        return curr.getValue();
	}
	
	
	//prints the queue
	public void display(){  
		if(isQueueEmpty()){
			System.out.println("Queue is empty");
			return;
		}
		else{
			Node<T> tNode=front;
			while(tNode!=null){
				System.out.print(tNode.value+" ");
				tNode=tNode.nextRef;
			}
			
		}
	}

}
