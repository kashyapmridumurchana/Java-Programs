package com.bridgelabz.datastructureprograms;

import com.bridgelabz.util.DataStructureUtility;
import com.bridgelabz.util.Deque;
import com.bridgelabz.util.Deque.DequeUtility;

public class PalindromeChecker 
{
	public static void main(String[] args) 
	{
		Deque de=new Deque();
		DequeUtility deq=de.new DequeUtility();
		System.out.println("Enter a String: ");
		String s=DataStructureUtility.userString();

		//adding each character to the rear of the deque
		for(int i=0;i<s.length();i++)
		{
			char c =s.charAt(i);
			deq.addRear(c);
		}
		int flag=0;

		while(deq.size()>1)
		{
			if(deq.removeFront()!=deq.removeRear())
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
