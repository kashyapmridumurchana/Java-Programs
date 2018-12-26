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

import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

public class Utility 
{
	//main method
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1)Integers linear search " 
				+ "2)string  linear search"
				+ "  3)Integer Insertion Sort "
				+ "  4)String Inserion Sort   "
				+ "5) Integer Bubble Sort"
				+ "6) String Bubble Sort ");
		System.out.println("enter your choice");
		int choice=sc.nextInt();
		//takes input of array and its size
		System.out.println("Enter the size of your array");
		int n=sc.nextInt();
		String arr[]=new String[n];
		System.out.println("Enter the elements");

		for(int i=0;i<n;i++)
		{	
			arr[i]=sc.next();
		}

		AlgorithmUtility auu=new AlgorithmUtility();
		switch(choice)//switch case to choose among the choices
		{
		case 1: double startTimer=System.currentTimeMillis();//to start timer
		auu.linearSearch(arr,arr.length); //method call
		double stopTimer=System.currentTimeMillis();//to stop timer
		double timeElapsed=stopTimer-startTimer;//calculates elapsed time
		System.out.println("Elapsed time is"+ timeElapsed);
		break;

		case 2:double startTimer1=System.currentTimeMillis();//to start timer
		auu.linearSearch(arr,arr.length); 
		double stopTimer1=System.currentTimeMillis();//to stop timer
		double timeElapsed1=stopTimer1-startTimer1;//calculates elapsed time
		System.out.println("Elapsed time is"+ timeElapsed1);
		break;

		case 3:double startTimer2=System.currentTimeMillis();//to start timer
		auu.insertionSort(arr, arr.length);
		double stopTimer2=System.currentTimeMillis();//to stop timer
		double timeElapsed2=stopTimer2-startTimer2;//calculates elapsed time
		System.out.println("Elapsed time is"+ timeElapsed2);
		break;


		case 4:double startTimer3=System.currentTimeMillis();//to start timer
		auu.insertionSort(arr, arr.length);
		double stopTimer3=System.currentTimeMillis();//to stop timer
		double timeElapsed3=stopTimer3-startTimer3;//calculates elapsed time
		System.out.println("Elapsed time is"+ timeElapsed3);
		break;


		case 5: double startTimer4=System.currentTimeMillis();//to start timer
		auu.bubbleSortString(arr, n);
		double stopTimer4=System.currentTimeMillis();//to stop timer
		double timeElapsed4=stopTimer4-startTimer4;//calculates elapsed time
		System.out.println("Elapsed time is"+ timeElapsed4);
		break;


		case 6: double startTimer5=System.currentTimeMillis();//to start timer
		auu.bubbleSortString(arr, n);
		double stopTimer5=System.currentTimeMillis();//to stop timer
		double timeElapsed5=stopTimer5-startTimer5;//calculates elapsed time
		System.out.println("Elapsed time is"+ timeElapsed5);
		break;


		default:
			System.out.println("kindly enter among the choices");
			break;
		}



	}
}
