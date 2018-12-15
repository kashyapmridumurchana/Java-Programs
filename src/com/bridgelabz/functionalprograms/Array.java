package com.bridgelabz.functionalprograms;
import java.util.Scanner;
import com.bridgelabz.util.*;
public class Array
{

	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	FunctionalUtility fu=new FunctionalUtility();
	System.out.println("Enter the number of rows :m");
	int m=s.nextInt();
	System.out.println("Enter the number of rows :m");
	int n=s.nextInt();
	System.out.println("1)Integers   2)Double  3)Boolean ");
	int choice=s.nextInt();
	switch(choice)
	{
	case 1:
		Integer array[][]=new Integer[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
			array[i][j]=s.nextInt();
			}
		}
		fu.displayArray(array,m,n);
		break;
	case 2:
		Double darray[][]=new Double[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
			darray[i][j]=s.nextDouble();
			}
		}
		fu.displayArray(darray,m,n);
		break;
	case 3:
		Boolean barray[][]=new Boolean[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
			barray[i][j]=s.nextBoolean();
			}
		}
		fu.displayArray(barray,m,n);
		break;
		
	default: System.out.println("Please choose among the choices");
	
	
		
		
	}
	
		

	}

}
