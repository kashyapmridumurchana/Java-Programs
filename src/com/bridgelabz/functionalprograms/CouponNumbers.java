package com.bridgelabz.functionalprograms;
import java.util.Scanner;
import com.bridgelabz.util.FunctionalUtility;

public class CouponNumbers 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the total number of coupons ");
		int n=s.nextInt();
		FunctionalUtility funtionalUtility=new FunctionalUtility();
		funtionalUtility.couponNumber(n);	

	}

}
