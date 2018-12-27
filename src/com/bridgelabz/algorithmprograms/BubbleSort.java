 /*******************************************************************************
 *   Compilation:  javac -d bin BubbleSort.java									*
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.BubbleSort		*
 *                                                                  			*
 *  Purpose: To do sorting of integers using bubble sort						*
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   19.12.2018															*
 *  **************************************************************************/
package com.bridgelabz.algorithmprograms;
import com.bridgelabz.util.AlgorithmUtility;
public class BubbleSort 
{
	//main method calls the method to perform sorting
	public static void main(String[] args) 
	{
		System.out.println("Enter the size of your array");
		int n=AlgorithmUtility.userInteger();
		System.out.println("Enter the array elements");
		String[] arr=new String[n];
		for( int i=0;i<n;i++)
		{
			arr[i]=AlgorithmUtility.userString();
		}	
		System.out.println("the original array is:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
		AlgorithmUtility.bubbleSortString1(arr, n);//method call
		System.out.println("Sorted array list is:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
