package com.bridgelabz.algorithmprograms;
import java.util.*;
import com.bridgelabz.algorithmprograms.*;
import com.bridgelabz.util.AlgorithmUtility;
public class InsertionSort 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		String arr[]=new String[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextLine();
		}
		AlgorithmUtility aa=new AlgorithmUtility();
		System.out.println("the sorted list is");
		String sortedArray[]=aa.insertionSort(arr, arr.length);
		for( int i=0;i<sortedArray.length;i++)
		{
			System.out.println(sortedArray[i]);
			}
	}

}
