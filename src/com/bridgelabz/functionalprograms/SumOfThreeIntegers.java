package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class SumOfThreeIntegers {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in array");
		int n=sc.nextInt();
		
		FunctionalUtility funtionalUtility=new FunctionalUtility();
		funtionalUtility.sumOfThree(n);

	}

}
