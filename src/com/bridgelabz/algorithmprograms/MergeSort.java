/*******************************************************************************
 *   Compilation:  javac -d bin MergeSort.java									*
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.MergeSort		*
 *                                                                  			*
 *  Purpose: to sort strings using merge sort									*
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   19.12.2018															*
 *  **************************************************************************/
package com.bridgelabz.algorithmprograms;
import com.bridgelabz.util.AlgorithmUtility;
public class MergeSort 
{
//main method takes the input of the parameters and calls a method
	public static void main(String[] args) 
	{
		
		System.out.println("Merge sort");
		int i;
		System.out.println("Enter the size of your array");
		int n=AlgorithmUtility.userInteger();
		String arr[]=new String[n];
		System.out.println("Enter the elements");

		for( i=0;i<n;i++)
		{	
			arr[i]=AlgorithmUtility.userString();
		}
		AlgorithmUtility.mergeSort(arr,0,n);//method call
		System.out.println("Elements after sorting");
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]+"");
		}
  
	}

}





