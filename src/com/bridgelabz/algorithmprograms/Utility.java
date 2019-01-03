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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bridgelabz.util.AlgorithmUtility;

public class Utility {
	// main method
	public static void main(String[] args) {
		int ll=0;

		//Map creation
		Map<String, Double> map=new HashMap<String, Double>();
		Map<String, Double> map1=new HashMap<String, Double>();
		int choice;
		do {

			System.out.println("1)Integers Binary search " + "2)string  Binary search" + "  3)Integer Insertion Sort "
					+ "  4)String Inserion Sort   " + "5) Integer Bubble Sort" + "6) String Bubble Sort " + "7) Exit");

			System.out.println("enter your choice");
			choice = AlgorithmUtility.userInteger();

			if(choice<=7)
			{
				System.out.println("Enter the size of your array");
				int n = AlgorithmUtility.userInteger();
				switch (choice)// switch case to choose among the choices
				{

				// case 1
				case 1:
					Integer arr[]=new Integer[n];
					System.out.println("Enter the elements");
					for (int i = 0; i < n; i++) {
						arr[i] = AlgorithmUtility.userInteger();
					}	

					System.out.println("the original array is:");
					for (int i = 0; i < n; i++) {
						System.out.println(arr[i]);
					}
					System.out.println("Enter the Element to be searched");
					Integer key = AlgorithmUtility.userInteger();

					double s1 = AlgorithmUtility.startTimerFunc();// to start timer

					int il = AlgorithmUtility.binarySearch1(arr, key);
					if (il >= 0) {
						System.out.println(arr[il] + "is present in " + (il) + " position of array");
					} else
						System.out.println(key + "doesnot exist");

					double s2 = AlgorithmUtility.stopTimerFunc();// to stop timer

					double e = AlgorithmUtility.elapsedTime(s2, s1);// calculates elapsed time

					map.put("Integer Binary search", e);//pushing to map

					System.out.println("Elapsed time is" + e);
					break;




					// case 2

				case 2:
					String arr1[]=new String[n];
					System.out.println("Enter the elements");
					for (int i = 0; i < n; i++) {
						arr1[i] = AlgorithmUtility.userString();
					}	
					System.out.println("the original array is:");
					for (int i = 0; i < n; i++) {
						System.out.println(arr1[i]);
					}
					System.out.println("Enter the Element to be searched");
					String key1 = AlgorithmUtility.userString();

					double s3 = AlgorithmUtility.startTimerFunc();// to start timer

					int ilk = AlgorithmUtility.binarySearch1(arr1, key1);
					if (ilk >= 0) {
						System.out.println(arr1[ilk] + "is present in " + (ilk) + " position of array");
					} else
						System.out.println(key1 + "doesnot exist");

					double s4 = AlgorithmUtility.stopTimerFunc();// to stop timer

					double e1 = AlgorithmUtility.elapsedTime(s4, s3);// calculates elapsed time

					map.put("String Binary search", e1);

					System.out.println("Elapsed time is" + e1);
					break;



					// case 3
				case 3:
					Integer arr2[]=new Integer[n];
					System.out.println("Enter the elements");
					for (int i = 0; i < n; i++) {
						arr2[i] = AlgorithmUtility.userInteger();
					}	
					System.out.println("the original array is:");
					for (int i = 0; i < n; i++) {
						System.out.println(arr2[i]);
					}

					double s5 = AlgorithmUtility.startTimerFunc();// to start timer

					AlgorithmUtility.insertionSort(arr2, arr2.length);

					System.out.println("Sorted array list is:");// prints the sorted array
					for (int i = 0; i < n; i++) {
						System.out.println(arr2[i]);
					}

					double s6 = AlgorithmUtility.stopTimerFunc();// to stop timer
					double e2 = AlgorithmUtility.elapsedTime(s6, s5);// calculates elapsed time

					map.put("Integer Insertion Sort", e2);

					System.out.println("Elapsed time is" + e2);

					break;


					// case 4

				case 4:String arr3[]=new String[n];
				System.out.println("Enter the elements");
				for (int i = 0; i < n; i++) {
					arr3[i] = AlgorithmUtility.userString();
				}	
				System.out.println("the original array is:");
				for (int i = 0; i < n; i++) {
					System.out.println(arr3[i]);
				}
				double s7 = AlgorithmUtility.startTimerFunc();// to start timer

				AlgorithmUtility.insertionSort(arr3, arr3.length);

				System.out.println("Sorted array list is:");// prints the sorted array
				for (int i = 0; i < n; i++) {
					System.out.println(arr3[i]);
				}

				double s8 = AlgorithmUtility.stopTimerFunc();// to stop timer
				double e3 = AlgorithmUtility.elapsedTime(s8, s7);// calculates elapsed time

				map.put("String Insertion sort", e3);

				System.out.println("Elapsed time is" + e3);

				break;


				// case 5
				case 5:
					Integer arr4[]=new Integer[n];
					System.out.println("Enter the elements");
					for (int i = 0; i < n; i++) {
						arr4[i] = AlgorithmUtility.userInteger();
					}	
					System.out.println("the original array is:");
					for (int i = 0; i < n; i++) {
						System.out.println(arr4[i]);
					}
					double s9 = AlgorithmUtility.startTimerFunc();// to start timer

					AlgorithmUtility.bubbleSort(arr4, n);

					System.out.println("Sorted array list is:");// prints the sorted array
					for (int i = 0; i < n; i++) {
						System.out.println(arr4[i]);
					}

					double s10 = AlgorithmUtility.stopTimerFunc();// to stop timer

					double e4 = AlgorithmUtility.elapsedTime(s10, s9);// calculates elapsed time
					map.put("Integer Bubble sort", e4);
					System.out.println("Elapsed time is" + e4);
					break;



					// case 6
				case 6:
					String arr5[]=new String[n];
					System.out.println("Enter the elements");
					for (int i = 0; i < n; i++) {
						arr5[i] = AlgorithmUtility.userString();
					}	
					System.out.println("the original array is:");
					for (int i = 0; i < n; i++) {
						System.out.println(arr5[i]);
					}
					double s11 = AlgorithmUtility.startTimerFunc();// to start timer

					AlgorithmUtility.bubbleSort(arr5, n);

					System.out.println("Sorted array list is:");// prints the sorted array
					for (int i = 0; i < n; i++) {
						System.out.println(arr5[i]);
					}

					double s12 = AlgorithmUtility.stopTimerFunc();// to stop timer

					double e5 = AlgorithmUtility.elapsedTime(s12, s11);// calculates elapsed time
					map.put("String Bubble sort", e5);
					System.out.println("Elapsed time is" + e5);
					break;


					
					// case 7
				case 7:
					System.exit(0);

					ll++;


					// default case
				default:
					System.out.println("kindly enter among the choices");
					break;	
				}
				
				choice++;
				
				map1=AlgorithmUtility.mapCall(map);
				System.out.println(map1);
			}
			else
				System.out.println("kindly enter among choices");	 
		}
		while (ll<6);
	}
}
