package com.bridgelabz.datastructureprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;


import com.bridgelabz.util.DataStructureUtility;


public class AnagramStack
{

	public static void main(String[] args)
	{
		DataStructureUtility dw=new DataStructureUtility();
		List<Integer> prime=new ArrayList<Integer>();
		Set<Integer> primeAnagram=new HashSet();
		List<Integer> primeAnagrams=new ArrayList<Integer>();
		List<Integer> primeAnagram1=new ArrayList<Integer>();
		prime=DataStructureUtility.rangePrime(0, 1000);
		primeAnagram=DataStructureUtility.primeAnagram1(prime);
		primeAnagram1.addAll(primeAnagram);

		//System.out.println("The prime anagrams are " +primeAnagram1);
		//System.out.println("The prime anagrams size is " +primeAnagram1.size());
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
		System.out.println("the size is of list containing prime anagrams is:" + primeAnagrams.size());
		
		
		com.bridgelabz.util.Stack st=new com.bridgelabz.util.Stack(len);


		for(int i=0;i<len;i++)
		{
			st.push(primeAnagrams.get(i));
		}
		System.out.println("the stack is size is " +st.size());
		System.out.println("the stack in reverse order is \n");
		while(!st.isEmpty())
		{
			System.out.print(st.pop()+" ");

		}




	}

}
