package com.bridgelabz.algorithmprograms;
import java.util.*;

import com.bridgelabz.util.AlgorithmUtility;
public class YourNumber 
{

	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	n=(int) Math.pow(2, n);
	System.out.println("Now think of a number between 0 and"+ (n-1));
	AlgorithmUtility ax=new AlgorithmUtility();
	ax.yourNumber(low,high);

	}

}
