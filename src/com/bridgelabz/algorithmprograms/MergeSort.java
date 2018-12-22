package com.bridgelabz.algorithmprograms;
import java.util.*;

import com.bridgelabz.util.AlgorithmUtility;
public class MergeSort 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of your array");
		int n=sc.nextInt();
		String arr[]=new String[n];
		System.out.println("Enter the elements");

		for(int i=0;i<n;i++)
		{	
			arr[i]=sc.next();
		}
		String temparr[]=new String[n];
		int lower=0;
		int higher=arr.length-1;
		
		int middle = lower + (higher - lower) / 2;
        AlgorithmUtility as=new AlgorithmUtility();
		as.mergeSort(temparr,lower,middle); 
		as.mergeSort(temparr,middle+1,higher); 
	
	
	
		

	public void mergeParts(lower, middle, higher)
		{
			for(int i = lower; i <= higher; i++) 
			{
				temparr[i]=arr[i];
			}
		}
		
		
		
		
		
	


