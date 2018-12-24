/***********************************************************************************
 *   Compilation:  javac -d bin AnagramAndPalindrome.java						    *
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.AnagramAndPalindrome*
 *                                                                  			    *
 *  Purpose: to find prime numbers within the range 1-1000 and to print the numbers *
 *  which are palindrome as well as anagrams.										*
 *																					*
 *  @author  Mridumurchana Kashyap													*
 *  @version 1.0																	*
 *  @since   19.12.2018																*
 *  *********************************************************************************/

package com.bridgelabz.algorithmprograms;
import com.bridgelabz.util.AlgorithmUtility;

public class AnagramAndPalindrome
{
//main method calls a function
	public static void main(String[] args) 
	{
		
		AlgorithmUtility au=new AlgorithmUtility();
		au.anagramAndPalindrome();//method call
	}

}
