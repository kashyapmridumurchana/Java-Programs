/*****************************************************************************************
 *   Compilation:  javac -d bin PrimeAnagram.java								   		 *
 *  Execution:    java -cp bin com.bridgelabz.datastructureprograms.PrimeAnagram    	 *
 *                                                                  					 *
 *  Purpose: Take a range of 0 - 1000 Numbers and find the Prime Anagrams numbers in .  
            that range and Store the prime numbers in a 2D Array
																				     	 *
 *														          						 *
 *  @author  Mridumurchana Kashyap													     *
 *  @version 1.0																	   	 *
 *  @since   3.1.2019															         *
 *  **************************************************************************************/
package com.bridgelabz.datastructureprograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.bridgelabz.util.AlgorithmUtility;
import com.bridgelabz.util.DataStructureUtility;

public class PrimeAnagrams 
{

	public static void main(String[] args)
	{
		
		List<List<String>> list1=new ArrayList<List<String>>();
		
		List<String> primeAnagram=new ArrayList<String>();
		List<String> prime=new ArrayList<String>();
		//List<String> primeAnagram1=new ArrayList<String>();
		
		prime=DataStructureUtility.rangePrime1(0, 1000);		
		
		primeAnagram=DataStructureUtility.primeAnagram(prime);
		
       // primeAnagram1.addAll(primeAnagram);
        
        
        
        list1.add(primeAnagram);
        
      
        for(int i=0;i<primeAnagram.size();i++)
        {
        	if(prime.contains(primeAnagram.get(i)))
        	{
        		prime.remove(primeAnagram.get(i));
        	}
        	
        }
        list1.add(prime);
        DataStructureUtility.printPrimeAndAnagram(list1);


	}

}




















