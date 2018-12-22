/*******************************************************************************
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   19.12.2018															*
 *  **************************************************************************/
package com.bridgelabz.util;
import java.util.*;

import com.bridgelabz.algorithmprograms.BubbleSort;

public class AlgorithmUtility
{
	//String Anagrams	
	public static  boolean anagrams(String s1,String s2)
	{

		char[] str1=s1.toLowerCase().toCharArray();
		char[] str2=s2.toLowerCase().toCharArray();
		int len1=str1.length;
		int len2=str2.length;
		if(len1!=len2)
		{
			return false;
		}
		else 
		{
			Arrays.sort(str1);
			Arrays.sort(str2);
			for(int i=0;i<len1;i++)
			{
				if(str1[i]==str2[i])
				{
					return true;
				}
			}	
			return false;
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






	//bubble sorting for integers
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
		for(int i = lower; i <= higher; i++) 
		{
			temparr[i]=arr[i];
		}
		int middle = lower + (higher - lower) / 2;


	}







	//Vending Machine
//	public int vendingMachine(int money,int[] notes)
//	{
//		 int i=0;
//		 int total=0;
//		
//		
//		
//			int rem;
//			if(money==0)
//			{
//				return -1 ;
//			}
//			else
//			{
//				if(money>=notes[i])
//				{
//					int calNotes =money/notes[i];
//					rem = money%notes[i];
//					money =rem;
//					total += calNotes;
//					System.out.println(notes[i]+   "Rs Notes are  " +calNotes );
//				}
//				i++;
//				return vendingMachine(money, notes);
//
//			}
//		
//	}

		public void vendingMachine(int money,int[] notes)
	{
		int rem;
		int i=0;
		int total=0;

		if(money==0)
		{
			System.out.println("no outputs");
		}
		else
		{ for(i=0;i<notes.length;i++)
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
		 



		//insertion sort

		public static void insertionSort1(String array[], int f)
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
			System.out.println("the sorted list is");
			for (String string : array) {
				System.out.println(string);
			}
		}





		//Linear search 
		public String[] linearSearch(String array[],int n)
		{
			Scanner sc=new Scanner(System.in);
			double startTimer=System.currentTimeMillis(); 

			System.out.println("enter the element to be searched"); 
			String key=sc.nextLine(); 
			for(int i=0;i<n;i++)
			{
				if(key.compareToIgnoreCase(array[i])==0)
				{
					System.out.println("search done and element found at position " +i);
				}

			}
			double stopTimer=System.currentTimeMillis();
			double timeElapsed=stopTimer-startTimer;
			System.out.println("Elapsed time is"+ timeElapsed);

			return array;

		}






		//insertion sort
		public static void insertionSort(String array[], int f)
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
			for (String string : array) {
				System.out.println(string);
			}


		}	





		//bubble sort for both integers and strings
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

		}




		//temperature conversion
		public void tempConversion(float temp)
		{
			float fah=(temp*9/5)+32;
			System.out.println("the temperature in fahrenheit is "+ fah);
		}
		public void tempConversion1(float temp)
		{
			float cel=(temp-32)*5/9;
			System.out.println("the temperature in celsius is"+ cel);
		}






		//Monthly payment
		public void monthlyPayment()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the P (principal loan)");
			double P=sc.nextDouble();
			System.out.println("Enter the Y (years to pay off)");
			double Y=sc.nextDouble();
			System.out.println("Enter the R (interest)");
			double R=sc.nextDouble();
			double n=12 *Y;
			double r=R/(12*100);
			double k=Math.pow((1+r),(-n));
			double payment=P*R/1-k;
			System.out.println("monthly payment is "+ payment);

		}





		//Square root
		public void squareRoot(double num)
		{
			double temp=num;
			double epsilon=1e-15;
			if(num>0) 
			{
				while(Math.abs(temp-num/temp)>epsilon*temp)
				{
					temp=(num/temp+temp)/2;

				}
				System.out.println("the square root of "+ num+ " is " + temp);
			}

			else
				System.out.println("Kindly enter a non negative number");	

		}





		//to Binary
		public  static void toBinary(int num)
		{
			int bin[] = new int[50];
			int index = 0;
			while(num > 0)
			{
				bin[index++] = num%2;
				num = num/2;
			}
			for(int i = index-1;i >= 0;i--)
			{
				System.out.println(bin[i]);
			}
		}






		//Binary search

		public static void bSearch(int lower,int upper,int middle,int count,String input,int n)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Is your number:"+middle);
			System.out.println("Enter your answer as in 'yes'or 'high' or 'low'");
			input=sc.nextLine(); 
			do
			{
				if(input.equals("high"))
				{
					lower=middle;
					count++;
				}
				else if (input.contentEquals("yes"))
				{
					System.out.println("Your number is"+middle);
					int no=count;
					System.out.println("It took "+ no+ " times to get your number");
					break;
				}
				else if(input.equals("low"))
				{
					upper=middle;
					count++;

				}
				if(count<n)
				{
					middle=(lower+upper +1)/2;
					System.out.println("is your number"+middle);
					input=sc.nextLine();
				}
			}
			while(lower<upper);
			if(count>n)
			{
				System.out.println("number not found");	
			}
			else
			{
				System.exit(0);
			}
		}





		//day of week
		public static int dayOfWeek(int m,int d,int y)
		{
			int y1=y-(14-m)/12;
			int x=y1+(y1/4)-(y1/100)+(y1/400);
			int m1=m+12*((14-m)/12)-2;
			int d1=(d+x+31*m1/12)%7;
			return d1;
		}





		//binary reverse print

		public  static void toBinary1(int num)
		{
			int bin[] = new int[50];
			int index = 0;
			while(num > 0)
			{
				bin[index++] = num%2;
				num = num/2;
			}
			for(int i = 0;i <index;i++)
			{
				System.out.println(bin[i]);
			}
		}









	}





