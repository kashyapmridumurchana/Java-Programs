package com.bridgelabz.functionalprograms;
import java .util.*;
import com.bridgelabz.util.*;

public class WindChill 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temperature");
		int t=sc.nextInt();
		System.out.println("Enter the speed");
		int v=sc.nextInt();
		FunctionalUtility fu1=new FunctionalUtility();
		fu1.windChill(t,v);
		
		
		
		
		
	}

}
