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
	{   
		Scanner s=new Scanner(System.in);
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

			}i++;
		}
		System.out.println("Total numbet of notes is"+total);

		}
	}
	/*
	public void yourNumber()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		System.out.println("Now think of a number between 0 and"+ Math.pow(2,n));
		n=(int) Math.pow(2, n);
		int low=0;
		int high=n-1;
		if(high-low==1)
			System.out.println(low);
		int mid=low+(high-low)/2;
		System.out.println("Is the number less than "+mid+"<< type true or false>>");
		boolean b=sc.nextBoolean();
		if(b==true)
		{
		youNum(low,high,n);
		}	

	}
public void youNum(int low,int high,int n)
{
	Scanner sc=new Scanner(System.in);
	int mid=low+(high-low)/2;
	low=0;
	high=mid;
	System.out.println("Is the number less than "+mid+"<< type true or false>>");
	boolean b=sc.nextBoolean();
	if(b==true)
	{
		youNum(low,high,n);
	}
	else
		youNum1(low,high,n);
}
public void youNum1(int low,int high,int n)
{

	Scanner sc=new Scanner(System.in);
	int mid=low+(high-low)/2;
	low=mid;
	n=(int) Math.pow(2, n);
	high=n-1;
	System.out.println("Is the number greater than "+mid+"<< type true or false>>");
	boolean b=sc.nextBoolean();
	if(b==true)
	{
		youNum1(low,high,n);
	}

}*/
	/*
	public void binarySearch()
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of your array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int last=arr.length-1;  
		System.out.println("enter the number to be searched"); 
		int key=sc.nextInt();  
		int first = 0;

		int  mid = (first + last)/2;

		while( first <= last )
		{
			if ( arr[mid] < key)
				first = mid+ 1;
			else if ( arr[mid] == key )
			{
				System.out.println(key + " found at location " + (mid + 1) + ".");
				break;
			}
			else
			{
				last = mid - 1;
			}
			mid = (first + last)/2;
		}
		if ( first > last )
			System.out.println(key + " is not found.\n");
	}*/

	//binary search string
	public String[] binarySearchString(String array[],int n)
	{
		Scanner sc=new Scanner(System.in);



		System.out.println("enter the element to be searched"); 
		String key=sc.nextLine(); 
		for(int i=0;i<=n;i++)
		{
			if(key.compareToIgnoreCase(array[i])==0)
			{
				System.out.println("search done and element found at position" +i);
			}



		}
		return array;
	}




	//insertion sort
	public static String[] insertionSort(String array[], int f)
	{



		String temp="";
		for(int i=0;i<f;i++)
		{
			for(int j=i+1;j<f;j++)
			{
				if(array[i].compareToIgnoreCase(array[j])>0)
				{
					temp = array[i];
					array[i]=array[j];
					array[j]=temp;
				}

			}

		}
		return array;


	}	

	public static void bubbleSortString(String array[],int f)
	{

		System.out.println("the original array is:");
		for(int i=0;i<f;i++)
		{
			System.out.println(array[i]);
		}
		for(int i=0;i<f;i++)
		{
			for( int j=1;j<f;j++)
			{
				if(array[j-1].compareToIgnoreCase(array[j])>0)
				{
					String temp=array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println("Sorted array list is:");
		for (String string : array) {
			System.out.println(string);
		}
		//return array;


	}





}







