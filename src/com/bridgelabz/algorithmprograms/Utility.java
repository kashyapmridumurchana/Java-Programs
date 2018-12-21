package com.bridgelabz.algorithmprograms;
import com.bridgelabz.util.*;

import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

public class Utility 
{

	public static void main(String[] args)
	{
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1)Integers binary search " 
				+ "2)string  binary search"
				+ "  3)Integer Insertion Sort "
				+ "  4)String Inserion Sort   "
				+ "5) Integer Bubble Sort"
				+ "6) String Bubble Sort ");
		System.out.println("enter your choice");
		int choice=sc.nextInt();

		System.out.println("Enter the size of your array");
		int n=sc.nextInt();
		String arr[]=new String[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{	
			arr[i]=sc.nextLine();
		}
		AlgorithmUtility auu=new AlgorithmUtility();
		switch(choice)
		{
		case 1:auu.binarySearchString(arr,arr.length); 
		       break;
		case 2:auu.binarySearchString(arr,arr.length); 
		       break;
		case 3:auu.insertionSort(arr, arr.length);
		       break;
		case 4:auu.insertionSort(arr, arr.length);
		      break;
		case 5:auu.bubbleSortString(arr, n);
		       break;
		case 6: auu.bubbleSortString(arr, n);
		default:
			System.out.println("kindly enter among the choices");
			break;
		}

     
	}
}
