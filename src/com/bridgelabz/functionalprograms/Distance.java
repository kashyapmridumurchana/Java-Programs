package com.bridgelabz.functionalprograms;
import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;
public class Distance 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the x value");
		int x=sc.nextInt();
		System.out.println("Enter the y value");
		int y=sc.nextInt();
		FunctionalUtility funtionalUtility=new FunctionalUtility();
		funtionalUtility.distance(x,y);

	}

}
