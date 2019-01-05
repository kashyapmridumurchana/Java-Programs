/*******************************************************************************
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   3.1.2018															*
 *  **************************************************************************/

package com.bridgelabz.util;

public class Queue {
	private int capacity;
	int queueArr[];
	int front = 0;
	int rear = -1;
	int currentSize = 0;
	
	public Queue(int queueSize){
		this.capacity = queueSize;
		queueArr = new int[this.capacity];
	}

	
	
	//Calculates the size of queue
	public int size()
	{
		return currentSize;
	}
	
	
	
	
	
	//adds element onto the queue
	/**
	 * this method adds element at the end of the queue.
	 * @param item is the item to be added
	 */
	
	public void enqueue(int item) {
		if (isQueueFull())
		{
			System.out.println("Overflow ! Unable to add element: "+item);
		} else {
			rear++;
			if(rear == capacity-1){
				rear = 0;
			}
			queueArr[rear] = item;
			currentSize++;
      // System.out.println("Element " + item+ " is pushed to Queue !");
		}
	}

	
	
	//removes element from queue
	/**
	 * this method removes an element from the top of the queue
	 */
	public void dequeue() {
		if (isQueueEmpty()) {
			System.out.println("Underflow ! Unable to remove element from Queue");
		} else {
			front++;
			if(front == capacity-1){
				System.out.println(queueArr[front-1]);
				front = 0;
			} else {
				System.out.println(queueArr[front-1]);
			}
			currentSize--;
		}
	}

	
	
	//checks if queue is full
	/**
	 * This method checks whether the queue is full or not
	 * @return boolean
	 */
	public boolean isQueueFull(){
		boolean status = false;
		if (currentSize == capacity){
			status = true;
		}
		return status;
	}
	
	
	
	//checks if queue is empty
	/**
	 * This method checks whether the queue is empty or not
	 * @returns a boolean value
	 */
	public boolean isQueueEmpty(){
		boolean status = false;
		if (currentSize == 0){
			status = true;
		}
		return status;
	}
}