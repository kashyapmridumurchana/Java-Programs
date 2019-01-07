/*****************************************************************************************
 *   Compilation:  javac -d bin CalenderQueue.java										 *
 *  Execution:    java -cp bin com.bridgelabz.datastructureprograms.CalenderQueue        *
 *                                                                  					 *
 *  Purpose:  Week Object in a Queue to finally display the Calendar
																				     	 *
 *														          						 *
 *  @author  Mridumurchana Kashyap													     *
 *  @version 1.0																	   	 *
 *  @since   3.1.2019															         *
 *  **************************************************************************************/
package com.bridgelabz.datastructureprograms;
import com.bridgelabz.util.*;
public class CalenderQueue 
{

	public static void main(String[] args) 
	{
		
		int month = Integer.parseInt(args[0]);
		int year = Integer.parseInt(args[1]);
		String[] months = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		 if (month == 2 && DataStructureUtility.isLeapYear(year))
	            days[month] = 29;
		System.out.println("\t\t " + months[month] + " " + year);
		System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
		int d = AlgorithmUtility.dayOfWeek(month, 1, year);
		QueueLinkedList<QueueLinkedList<Integer>> customQueue = new QueueLinkedList<QueueLinkedList<Integer>>();
		QueueLinkedList<Integer> queue = new QueueLinkedList<Integer>();
		for (int i = 0; i < d; i++)
			System.out.print("\t");
		for (int i = 1; i <= days[month]; i++) 
		{
			queue.enqueue(i);
			
			if (((i + d) % 7 == 0) || (i == days[month]))
			{
				
				customQueue.enqueue(queue);
				queue = new QueueLinkedList<Integer>();
				continue;
				
			}
		}

		for (int i = 0; i < customQueue.size(); i++) {
			QueueLinkedList<Integer> week = customQueue.dequeue();
			for (int j = 0; j < week.size(); j++) {
				System.out.print(week.dequeue() + "\t");
			}
			System.out.println();
		}
		

	}

}
