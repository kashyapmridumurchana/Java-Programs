/*******************************************************************************
 *   Compilation:  javac -d bin AnagramStack.java								*
 *  Execution:    java -cp bin com.bridgelabz.datastructureprograms.AnagramStack *
 *                                                                  			 *
 *  Purpose: Add the Prime Numbers that are Anagram in the Range of 0 - 1000 in *						*
 *			  a Stack using the Linked List and Print the Anagrams and print in 
 *			reverse order.
 *														          				 *
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   3.1.2019															*
 *  **************************************************************************/
package com.bridgelabz.datastructureprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


import com.bridgelabz.util.DataStructureUtility;
import com.bridgelabz.util.Stack;


public class AnagramStack
{

	public static void main(String[] args)
	{

		
	    List<Integer> list2 = new ArrayList<Integer>();
	    list2 = DataStructureUtility.rangePrime(0, 1000); //finding prime
	    int len=list2.size();
	    Stack stack=new Stack(len);
	    stack=DataStructureUtility.primeAnagram2(list2); //finding anagram
	    System.out.println(stack.size()+" is the size of the stack");
	    System.out.println("Printing the elements in reverse order using pop function of stack");
	    while(!stack.isEmpty())
	    {
	        System.out.println(stack.pop()+" "+stack.pop());
	    }
	}
		
		
		



	}


