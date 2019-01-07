/*****************************************************************************************
 *   Compilation:  javac -d bin CalenderStack.java										 *
 *  Execution:    java -cp bin com.bridgelabz.datastructureprograms.CalenderStack        *
 *                                                                  					 *
 *  Purpose:  Queue in two Stacks to print the Calender
																				     	 *
 *														          						 *
 *  @author  Mridumurchana Kashyap													     *
 *  @version 1.0																	   	 *
 *  @since   3.1.2019															         *
 *  **************************************************************************************/
package com.bridgelabz.datastructureprograms;
import com.bridgelabz.util.AlgorithmUtility;
import com.bridgelabz.util.DataStructureUtility;
import com.bridgelabz.util.QueueLinkedList;
import com.bridgelabz.util.StackLinkedList;

public class CalenderStack 
{
	public static void main(String args[]) {
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
	StackLinkedList<QueueLinkedList<Integer>> customStack= new StackLinkedList<QueueLinkedList<Integer>>();
	QueueLinkedList<Integer> queue=new QueueLinkedList<Integer>();
	for (int i = 0; i < d; i++)
		System.out.print("\t");
	for (int i = 1; i <= days[month]; i++) {
		queue.enqueue(i);
		if (((i + d) % 7 == 0) || (i == days[month])) {
			customStack.push(queue);
			queue = new QueueLinkedList<Integer>();
			continue;
		}
	}
	
	StackLinkedList<QueueLinkedList<Integer>> stackLinkedList = new StackLinkedList<>();
	int size = customStack.getSize();
	for(int i=0; i < size; i++){
		stackLinkedList.push(customStack.pop());
	}

	for (int i = 0; i < size; i++) {
		QueueLinkedList<Integer> week = stackLinkedList.pop();
		for (int j = 0; j < week.size(); j++) {
			System.out.print(week.dequeue() + "\t ");
		}
		System.out.println();
	}
}
}
