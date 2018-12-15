package com.bridgelabz.functionalprograms;
import com.bridgelabz.util.FunctionalUtility;
import java.util.*;
public class FlipCoin 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many times coin has to be flipped");
		int n=sc.nextInt();
		FunctionalUtility funtionalUtility=new FunctionalUtility();
		funtionalUtility.flipCoin(n);
	}

}
