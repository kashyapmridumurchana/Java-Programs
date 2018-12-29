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
		//Array list creation
		List<Double> timeList = new ArrayList<>();
		List<Double> timeList1 = new ArrayList<>();

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

				// takes input of array and its size

				System.out.println("Enter the size of your array");
				int n = AlgorithmUtility.userInteger();

				String arr[] = new String[n];
				System.out.println("Enter the elements");

				for (int i = 0; i < n; i++) {
					arr[i] = AlgorithmUtility.userString();
				}	
				switch (choice)// switch case to choose among the choices
				{

				// case 1
				case 1:
					System.out.println("the original array is:");
					for (int i = 0; i < n; i++) {
						System.out.println(arr[i]);
					}
					System.out.println("Enter the Element to be searched");
					String key = AlgorithmUtility.userString();

					double s1 = AlgorithmUtility.startTimerFunc();// to start timer

					int il = AlgorithmUtility.binarySearch(arr, key);
					if (il >= 0) {
						System.out.println(arr[il] + "is present in " + (il) + " position of array");
					} else
						System.out.println(key + "doesnot exist");

					double s2 = AlgorithmUtility.stopTimerFunc();// to stop timer

					double e = AlgorithmUtility.elapsedTime(s2, s1);// calculates elapsed time

					map.put("Integer Binary search", e);//pushing to map

					System.out.println("Elapsed time is" + e);

					timeList.add(e);// Adding to the arraylist

					break;

					// case 2

				case 2:
					System.out.println("the original array is:");
					for (int i = 0; i < n; i++) {
						System.out.println(arr[i]);
					}
					System.out.println("Enter the Element to be searched");
					String key1 = AlgorithmUtility.userString();

					double s3 = AlgorithmUtility.startTimerFunc();// to start timer

					int ilk = AlgorithmUtility.binarySearch(arr, key1);
					if (ilk >= 0) {
						System.out.println(arr[ilk] + "is present in " + (ilk) + " position of array");
					} else
						System.out.println(key1 + "doesnot exist");

					double s4 = AlgorithmUtility.stopTimerFunc();// to stop timer

					double e1 = AlgorithmUtility.elapsedTime(s4, s3);// calculates elapsed time

					map.put("String Binary search", e1);

					System.out.println("Elapsed time is" + e1);

					timeList.add(e1);// Adding to the arraylist
					break;


					// case 3
				case 3:
					System.out.println("the original array is:");
					for (int i = 0; i < n; i++) {
						System.out.println(arr[i]);
					}

					double s5 = AlgorithmUtility.startTimerFunc();// to start timer

					AlgorithmUtility.insertionSort(arr, arr.length);

					System.out.println("Sorted array list is:");// prints the sorted array
					for (int i = 0; i < n; i++) {
						System.out.println(arr[i]);
					}

					double s6 = AlgorithmUtility.stopTimerFunc();// to stop timer
					double e2 = AlgorithmUtility.elapsedTime(s6, s5);// calculates elapsed time

					map.put("Integer Insertion Sort", e2);

					System.out.println("Elapsed time is" + e2);

					timeList.add(e2);// Adding to the arraylist

					break;

					// case 4

				case 4:
					System.out.println("the original array is:");
					for (int i = 0; i < n; i++) {
						System.out.println(arr[i]);
					}
					double s7 = AlgorithmUtility.startTimerFunc();// to start timer

					AlgorithmUtility.insertionSort(arr, arr.length);

					System.out.println("Sorted array list is:");// prints the sorted array
					for (int i = 0; i < n; i++) {
						System.out.println(arr[i]);
					}

					double s8 = AlgorithmUtility.stopTimerFunc();// to stop timer
					double e3 = AlgorithmUtility.elapsedTime(s8, s7);// calculates elapsed time

					map.put("String Insertion sort", e3);

					System.out.println("Elapsed time is" + e3);

					timeList.add(e3);// Adding to the arraylist

					break;

					// case 5
				case 5:
					System.out.println("the original array is:");
					for (int i = 0; i < n; i++) {
						System.out.println(arr[i]);
					}
					double s9 = AlgorithmUtility.startTimerFunc();// to start timer

					AlgorithmUtility.bubbleSortString1(arr, n);

					System.out.println("Sorted array list is:");// prints the sorted array
					for (int i = 0; i < n; i++) {
						System.out.println(arr[i]);
					}

					double s10 = AlgorithmUtility.stopTimerFunc();// to stop timer

					double e4 = AlgorithmUtility.elapsedTime(s10, s9);// calculates elapsed time
					map.put("Integer Bubble sort", e4);
					System.out.println("Elapsed time is" + e4);

					timeList.add(e4);// Adding to the arraylist

					break;

					// case 6
				case 6:
					System.out.println("the original array is:");
					for (int i = 0; i < n; i++) {
						System.out.println(arr[i]);
					}
					double s11 = AlgorithmUtility.startTimerFunc();// to start timer

					AlgorithmUtility.bubbleSortString1(arr, n);

					System.out.println("Sorted array list is:");// prints the sorted array
					for (int i = 0; i < n; i++) {
						System.out.println(arr[i]);
					}

					double s12 = AlgorithmUtility.stopTimerFunc();// to stop timer

					double e5 = AlgorithmUtility.elapsedTime(s12, s11);// calculates elapsed time
					map.put("String Bubble sort", e5);
					System.out.println("Elapsed time is" + e5);

					timeList.add(e5);// Adding to the arraylist

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
				timeList1 = AlgorithmUtility.listCall(timeList);
				choice++;
				System.out.println(timeList1);
				map1=AlgorithmUtility.mapCall(map);
				System.out.println(map1);
			}
			else
				System.out.println("kindly enter among choices");	 
		}
		while (ll<6);
	}
}
