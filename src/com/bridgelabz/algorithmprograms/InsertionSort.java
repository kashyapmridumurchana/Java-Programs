/*******************************************************************************
 *   Compilation:  javac -d bin InsertionSort.java								*
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.InsertionSort	*
 *                                                                  			*
 *  Purpose: Sorting using insertion sort										*
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   19.12.2018															*
 *  **************************************************************************/
package com.bridgelabz.algorithmprograms;
import com.bridgelabz.util.AlgorithmUtility;
public class InsertionSort 
{
	//main function takes the input of the array size and array elements
	public static void main(String[] args) 
	{
		
		System.out.println("Enter the size of array");
		int n=AlgorithmUtility.userInteger();
		String arr[]=new String[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=AlgorithmUtility.userString();
		}
		System.out.println("the original array is:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		AlgorithmUtility.insertionSort(arr,n);//method is called
		System.out.println("Sorted array list is:");//prints the sorted array
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
