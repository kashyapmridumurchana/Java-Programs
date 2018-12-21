package com.bridgelabz.util;
import java.util.*;

import com.bridgelabz.algorithmprograms.BubbleSort;

public class AlgorithmUtility
{


	//Anagrams	
	public void anagrams(String s1,String s2)
	{

		if(s1.length()!=s2.length())
		{
			System.out.println("Doesn't have same length");
		}
		else
		{
			s1.equalsIgnoreCase(s2);
			System.out.println("Strings are anagrams");
		}



	}

	//Range of prime numbers 

	public void rangePrime()
	{
		for(int i=1;i<=1000;i++)
		{
			int n=2;
			if(i%1==0 && i%i==0)
			{
				if(i%n!=0)
				{


					System.out.println("Numbers are prime" + i); 
					n++;
				}
			}		

		}
	}

	public void anaPali()
	{
		int rev=0;

		for(int i=0;i<1000;i++)
		{
			if(i>=10)
			{
				rev=rev*10;
				rev =rev +i%10;
				i=i/10;	
			}
			System.out.println("reverse is"+ rev);
			/*else
			{

			}*/
		}

	}

	public void bubbleSort()
	{   Scanner s=new Scanner(System.in);
	System.out.println("How many numbers you want to insert");
	int n=s.nextInt();
	System.out.println("Enter the integer numbers for the array");
	int[] array=new int[n];
	int i;
	for( i=0;i<n;i++)
	{
		array[i]=s.nextInt();
	}	
	System.out.println("the original array is:");
	for(i=0;i<n;i++)
	{
		System.out.println(array[i]);
	}
	for(i=0;i<array.length-1;i++)
	{
		for( int j=1;j<array.length-i;j++)
		{
			if(array[j-1]>array[j])
			{
				int temp=array[j-1];
				array[j-1]=array[j];
				array[j]=temp;
			}
		}
	}
	System.out.println("Sorted array list is:");
	for(i=0;i<n;i++)
	{
		System.out.println(array[i]);
	}



	}

	//Merge Sort
	public static void mergeSort()
	{

	}


	//Vending Machine
	public void vendingMachine(int money,int[] notes)
	{
		int rem;
		int i=0;
		int total=0;
		
		if(money==0)
		{
			System.out.println("no money");
		}
		else
		{ for(i=0;i<=money;i++) 
		{
			if(money>=notes[i])
			{
				int calculateNotes=money/notes[i];
				rem=money%notes[i];
				money=rem;
				total=total+calculateNotes;
				System.out.println(notes[i]+ " Notes:  "+calculateNotes);

			}
		  }
		System.out.println("Total numbet of notes is"+total);
		
		}
	}

	public void yourNumber(int low,int high)
	{
		
	}

	
	
	
	
	
	
	
	
	
	


}
