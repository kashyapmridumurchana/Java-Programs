/*****************************************************************************************
 *   Compilation:  javac -d bin PalindromeChecker.java								   	 *
 *  Execution:    java -cp bin com.bridgelabz.datastructureprograms.PalindromeChecker    *
 *                                                                  					 *
 *  Purpose:  Palindrome Checker

																				     	 *
 *														          						 *
 *  @author  Mridumurchana Kashyap													     *
 *  @version 1.0																	   	 *
 *  @since   3.1.2019															         *
 *  **************************************************************************************/
package com.bridgelabz.datastructureprograms;

import com.bridgelabz.util.DataStructureUtility;
import com.bridgelabz.util.Deque;


public class PalindromeChecker 
{
	public static void main(String[] args) 
	{
		Deque de=new Deque();
		
		System.out.println("Enter a String: ");
		String st=DataStructureUtility.userString();
        String s=st.toLowerCase();
		//adding each character to the rear of the deque
		for(int i=0;i<s.length();i++)
		{
			char c =s.charAt(i);
			de.addRear(c);
		}
		int flag=0;

		while(de.size()>1)
		{
			if(de.removeFront()!=de.removeRear())
			{
				flag=1;
				break;
			}
		}

		if(flag==0)
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}
}
