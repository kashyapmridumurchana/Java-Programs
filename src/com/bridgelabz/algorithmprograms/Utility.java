/********************************************************************** *********
 *   Compilation:  javac -d bin Utility.java						        	*
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.Utility         *
 *                                                                  			*
 *  Purpose:  to perform searching and sorting               					*
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   19.12.2018															*
 *  **************************************************************************/
package com.bridgelabz.algorithmprograms;
import com.bridgelabz.util.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

public class Utility 
{
	//main method
	public static void main(String[] args)
	{
		
		List<Double> timeList=new ArrayList<>();
		List<Double> timeList1=new ArrayList<>();
		int choice;
		do {
		System.out.println("1)Integers Binary search " 
				+ "2)string  BinaryS search"
				+ "  3)Integer Insertion Sort "
				+ "  4)String Inserion Sort   "
				+ "5) Integer Bubble Sort"
				+ "6) String Bubble Sort "
				+"7) Exit");

		System.out.println("enter your choice");
		choice=AlgorithmUtility.userInteger();

		//takes input of array and its size
		System.out.println("Enter the size of your array");
		int n=AlgorithmUtility.userInteger();
		
		String arr[]=new String[n];
		System.out.println("Enter the elements");

		for(int i=0;i<n;i++)
		{	
			arr[i]=AlgorithmUtility.userString();
		}

		AlgorithmUtility auu=new AlgorithmUtility();
		switch(choice)//switch case to choose among the choices
		{



		//case 1
		case 1:System.out.println("the original array is:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Enter the Element to be searched");
		String key=AlgorithmUtility.userString();


		double s1=auu.startTimerFunc();//to start timer


		int il=auu.binarySearch(arr, key) ;
		if( il>=0)
		{
			System.out.println(arr[il]+ "is present in "+ (il)+ " position of array");
		}
		else 
			System.out.println(key+ "doesnot exist");


		double s2=auu.stopTimerFunc();//to stop timer

		double e=auu.elapsedTime(s2,s1);//calculates elapsed time
		System.out.println("Elapsed time is"+ e);
		
		timeList.add(e);//Adding to the arraylist
		
		break;



		

		//case 2

		case 2:System.out.println("the original array is:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Enter the Element to be searched");
		String key1=AlgorithmUtility.userString();

		double s3=auu.startTimerFunc();//to start timer

		int ilk=auu.binarySearch(arr, key1) ;
		if( ilk>=0)
		{
			System.out.println(arr[ilk]+ "is present in "+ (ilk)+ " position of array");
		}
		else 
			System.out.println(key1+ "doesnot exist");

		double s4=auu.stopTimerFunc();//to stop timer

		double e1=auu.elapsedTime(s4,s3);//calculates elapsed time
		System.out.println("Elapsed time is"+ e1);
		
		timeList.add(e1);//Adding to the arraylist
		break;


		
		
		
		
		//case 3

		case 3:System.out.println("the original array is:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
		double s5=auu.startTimerFunc();//to start timer
		
		auu.insertionSort(arr, arr.length);
		
		System.out.println("Sorted array list is:");//prints the sorted array
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
		double s6=auu.stopTimerFunc();//to stop timer
		double e2=auu.elapsedTime(s6,s5);//calculates elapsed time
		System.out.println("Elapsed time is"+ e2);
		
		timeList.add(e2);//Adding to the arraylist
		
		break;



		
		
		
		//case 4

		case 4:System.out.println("the original array is:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		double s7=auu.startTimerFunc();//to start timer
		
		auu.insertionSort(arr, arr.length);
		
		System.out.println("Sorted array list is:");//prints the sorted array
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
		double s8=auu.stopTimerFunc();//to stop timer
		double e3=auu.elapsedTime(s8, s7);//calculates elapsed time
		System.out.println("Elapsed time is"+ e3);
		
		timeList.add(e3);//Adding to the arraylist
		
		break;




		//case 5
		case 5:System.out.println("the original array is:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		double s9=auu.startTimerFunc();//to start timer
		
		auu.bubbleSortString1(arr, n);
		
		System.out.println("Sorted array list is:");//prints the sorted array
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
		double s10=auu.stopTimerFunc();//to stop timer
		
		double e4=s10-s9;//calculates elapsed time
		System.out.println("Elapsed time is"+ e4);
		
		timeList.add(e4);//Adding to the arraylist
		
		break;




		//case 6
		case 6: System.out.println("the original array is:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		double s11=auu.startTimerFunc();//to start timer
		
		auu.bubbleSortString1(arr, n);
		
		System.out.println("Sorted array list is:");//prints the sorted array
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
		double s12=auu.stopTimerFunc();//to stop timer
		
		double e5=s12-s11;//calculates elapsed time
		System.out.println("Elapsed time is"+ e5);
		
		timeList.add(e5);//Adding to the arraylist
		
		break;

//case 7
		case 7:
			   System.exit(0);

		//default case

		default:
			System.out.println("kindly enter among the choices");
			break;
		}

       timeList1=auu.listCall(timeList);
		}
		while(choice<=6);
        System.out.println(timeList1);





		
		


	}
}
