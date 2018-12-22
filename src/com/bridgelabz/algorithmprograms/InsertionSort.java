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
import java.util.*;
import com.bridgelabz.algorithmprograms.*;
import com.bridgelabz.util.AlgorithmUtility;
public class InsertionSort 
{
	//main function takes the input of the array size and array elements
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		String arr[]=new String[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.next();
		}

		
		AlgorithmUtility aa=new AlgorithmUtility();

		aa.insertionSort1(arr, arr.length);//method is called

	}

}
