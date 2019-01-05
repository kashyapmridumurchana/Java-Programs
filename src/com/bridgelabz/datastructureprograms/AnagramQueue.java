/*******************************************************************************
 *   Compilation:  javac -d bin AnagramQueue.java								*
 *  Execution:    java -cp bin com.bridgelabz.datastructureprograms.AnagramQueue*
 *                                                                  			 *
 *  Purpose: Add the Prime Numbers that are Anagram in the Range of 0 - 1000 in *						*
 *			  a Queue using the Linked List and Print the Anagrams 
 *																	             *
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   3.1.2019															*
 *  **************************************************************************/
package com.bridgelabz.datastructureprograms;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.bridgelabz.util.DataStructureUtility;
import com.bridgelabz.util.Queue;
public class AnagramQueue {

	public static void main(String[] args) 
	{
		Queue q=new Queue(1000);
		List<Integer> prime=new ArrayList<Integer>();//list creation
		Set<Integer> primeAnagram=new HashSet();//Set creation
		List<Integer> primeAnagrams=new ArrayList<Integer>();
		List<Integer> primeAnagram1=new ArrayList<Integer>();
		prime=DataStructureUtility.rangePrime(0, 1000);
		primeAnagram=DataStructureUtility.primeAnagram1(prime);
		primeAnagram1.addAll(primeAnagram);

		
		System.out.println("The size of list containing prime anagrams is " +primeAnagram1.size());
		int len=primeAnagram1.size();
		int arr[]=new int[len];
		for(int i=0;i<len;i++)
		{
			arr[i]=primeAnagram1.get(i);
		}
		int[] arr1=DataStructureUtility.sortArray(arr);
		for(int i=0;i<len;i++)
		{
			primeAnagrams.add(arr1[i]);
		}
		//System.out.println(primeAnagrams);
		//System.out.println("the size is:" + primeAnagrams.size());
		for(int i=0;i<len;i++)
		{
			q.enqueue(primeAnagrams.get(i));
		}
		System.out.println("the queue size is " +q.size());
		System.out.println("Elements in the queue are \n");
		
		while(!q.isQueueEmpty())
		{
		q.dequeue();
		
		}

	}

}
