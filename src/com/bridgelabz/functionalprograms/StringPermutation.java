package com.bridgelabz.functionalprograms;
import java.util.*;
import com.bridgelabz.util.*;
public class StringPermutation 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String str1=s.nextLine();
		FunctionalUtility fu3=new FunctionalUtility();
		fu3.sPermut(str1);
		int length=str1.length();
		fu3.permute(str1,0,length-1);
				
				
				

	}

}
