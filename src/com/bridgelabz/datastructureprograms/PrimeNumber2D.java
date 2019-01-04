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