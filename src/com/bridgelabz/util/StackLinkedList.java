/*******************************************************************************
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   3.1.2018															*
 *  **************************************************************************/
package com.bridgelabz.util;

public class StackLinkedList<T>
{

		 private Node<T> top;
		    private int size;
		   
		    //Constructor
		    public StackLinkedList(){
		        top=null;
		        size=0;
		    }
		   
		    //checks if stack is empty
		    public boolean isEmpty(){
		        return top==null;
		    }
		   
		    //returns the size of stack
		    public int getSize(){
		        return size;
		    }
		   
		    
		    //inserts element to the stack
		    public void push(T data){
		        Node<T> tnode=new Node<T>(data,null);
		        if(top==null)
		            top=tnode;
		        else{
		            tnode.setNextRef(top);
		             top = tnode;
		        }
		        size++;
		    }
		   
		    
		    //removes the top[ element
		    public T pop(){
		        if(isEmpty()){
		            System.out.println("No elements");
		            return null;
		        }
		        Node<T> tnode=top;
		        top=tnode.getNextRef();
		        size--;
		        return tnode.getValue();
		    }

	}


