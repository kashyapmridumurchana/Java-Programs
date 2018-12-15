package com.bridgelabz.functionalprograms;
import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class Factors {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number to find the prime factors");
		int n=s.nextInt();
		FunctionalUtility funtionalUtility=new FunctionalUtility();
		funtionalUtility.factors(n);
		

	}

}
