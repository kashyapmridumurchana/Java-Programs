package com.bridgelabz.functionalprograms;
import java.util.Scanner;
import com.bridgelabz.util.FunctionalUtility;

public class Gambler
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter $Stake value");
		int $Stake=s.nextInt();
		System.out.println("Enter $Goal value");
		int $Goal=s.nextInt();
		System.out.println("Enter number of times");
		int n=s.nextInt();
		
		FunctionalUtility funtionalUtility=new FunctionalUtility();
		funtionalUtility.gambler($Stake,$Goal,n);

	}

}
