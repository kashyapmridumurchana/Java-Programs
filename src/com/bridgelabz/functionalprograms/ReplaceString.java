package com.bridgelabz.functionalprograms;
import com.bridgelabz.util.FunctionalUtility;
import java.util.*;
public class ReplaceString 
{

	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);	
	System.out.println("Enter the username");
	String str1="Hello ##username##,How are you?";
	FunctionalUtility funtionalUtility=new FunctionalUtility();
	funtionalUtility.replaceString(str1);
	}
	
}