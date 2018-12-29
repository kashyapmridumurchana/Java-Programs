/********************************************************************** *********
 *   Compilation:  javac -d bin Array.java						             	*
 *  Execution:    java -cp bin com.bridgelabz.functionalprograms.Array          *
 *                                                                  			*
 *  Purpose: to read integer,double and boolean value for an array and display it*
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   19.12.2018															*
 *  **************************************************************************/
package com.bridgelabz.functionalprograms;

import java.util.Scanner;
import com.bridgelabz.util.*;


public class Array {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		FunctionalUtility fu = new FunctionalUtility();
		System.out.println("Enter the number of rows :m");
		int m = s.nextInt();
		System.out.println("Enter the number of rows :n");
		int n = s.nextInt();
		System.out.println("1)Integers   2)Double  3)Boolean ");
		int choice = s.nextInt();

		switch (choice)// to choose among the choices
		{
		case 1:// for integers
			Integer array[][] = new Integer[m][n];
			System.out.println("Enter the elements");
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					array[i][j] = s.nextInt();
				}
			}
			fu.displayArray(array, m, n);// method call
			break;
		case 2:// for Double
			Double darray[][] = new Double[m][n];
			System.out.println("Enter the elements");
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					darray[i][j] = s.nextDouble();
				}
			}
			fu.displayArray(darray, m, n);// method call
			break;
		case 3:// for boolean
			Boolean barray[][] = new Boolean[m][n];
			System.out.println("Enter the elements");
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					barray[i][j] = s.nextBoolean();
				}
			}
			fu.displayArray(barray, m, n);// method call
			break;

		default:
			System.out.println("Please choose among the choices");

		}

	}

}
