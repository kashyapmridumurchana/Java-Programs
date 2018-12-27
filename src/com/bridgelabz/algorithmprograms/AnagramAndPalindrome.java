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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.bridgelabz.util.AlgorithmUtility;

public class AnagramAndPalindrome
{
//main method calls a function
	public static void main(String[] args) 
	{
		System.out.println("The prime numbers between 0-1000 are");
		List<String> primeList=new ArrayList<>();//declaration
		primeList=AlgorithmUtility.rangePrime();
		
	
		
		Set<String> primeAnagramSet=new HashSet<>();//declaration
		System.out.println("The prime numbers which are anagrams are");
		primeAnagramSet=AlgorithmUtility.primeAnagram(primeList);//method call
		
		
		
		
		
		Set<String> primePalindromeSet=new HashSet<>();//Set declaration
		System.out.println("The prime numbers which are anagram and palindrome are");
		primePalindromeSet=AlgorithmUtility.primePalindrome(primeAnagramSet);//method call
        System.out.println(primePalindromeSet);
		
		
		
		
		
		
	}
	
	
	
	

	}


