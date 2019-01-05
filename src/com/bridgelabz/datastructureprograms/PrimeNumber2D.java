/*****************************************************************************************
 *   Compilation:  javac -d bin PrimeNumber2D.java								   		 *
 *  Execution:    java -cp bin com.bridgelabz.datastructureprograms.PrimeNumber2D    	 *
 *                                                                  					 *
 *  Purpose: Take a range of 0 - 1000 Numbers and find the Prime numbers in that range.  
             Store the prime numbers in a 2D Array
																				     	 *
 *														          						 *
 *  @author  Mridumurchana Kashyap													     *
 *  @version 1.0																	   	 *
 *  @since   3.1.2019															         *
 *  **************************************************************************************/
package com.bridgelabz.datastructureprograms;

import java.util.*;

import com.bridgelabz.util.DataStructureUtility;

public class PrimeNumber2D 
{

	public static void main(String[] args) 
	{
		List<List<Integer>> list=new ArrayList<List<Integer>>();
		List<Integer> list1=new ArrayList<Integer>();
		int a=0;
		int b=100;

		for(int i=0;i<10;i++)
		{
			System.out.println("prime numbers between " +a+ " and "+b +" are");
			list1=DataStructureUtility.rangePrime(a, b);
			list.add(list1);
			System.out.println(list1);
			a+=100;
			b+=100;
		}


	}

}