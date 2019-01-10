/*******************************************************************************
 *   Compilation:  javac -d bin AnagramStack.java								  *
 *  Execution:    java -cp bin com.bridgelabz.datastructureprograms.AnagramStack  *
 *                                                                  			  *
 *  Purpose: Add the Prime Numbers that are Anagram in the Range of 0 - 1000 in   *						*
 *			  a Stack using the Linked List and Print the Anagrams and print in   *
 *			reverse order.														  *
 *														          				  *
 *  @author  Mridumurchana Kashyap												  *
 *  @version 1.0																  *
 *  @since   3.1.2019															  *
 *  *******************************************************************************/
package com.bridgelabz.datastructureprograms;

import java.util.ArrayList;
import java.util.List;
import com.bridgelabz.util.DataStructureUtility;

import com.bridgelabz.util.StackLinkedList;


public class AnagramStack
{

	public static void main(String[] args)
	{

		DataStructureUtility<Integer> du=new DataStructureUtility<Integer>();
	    List<Integer> list2 = new ArrayList<Integer>();
	    list2 = DataStructureUtility.rangePrime(0, 1000); //finding prime
	   
	    StackLinkedList<Integer> stack=new StackLinkedList<Integer>();
	    stack=du.primeAnagram2(list2); //finding anagram
	    System.out.println(stack.getSize()+" is the size of the stack");
	    System.out.println("Printing the elements in reverse order using pop function of stack");
	    while(!stack.isEmpty())
	    {
	        System.out.println(stack.pop()+" "+stack.pop());
	    }
	}
		
		
		



	}


