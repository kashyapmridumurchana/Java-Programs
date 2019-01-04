package com.bridgelabz.util;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class DataStructureUtility
{

    /**
     * static object is created for Scanner class to avoid multiple object creations
     * of the same class.
     */

    static Scanner scanner = new Scanner(System.in);

    /**
     * static function to read integers input from the user
     *
     * @return integer values that are read
     */

    public static int userInteger() {

        return scanner.nextInt();

    }

    /**
     * static function to read double input from the user
     *
     * @return double values that are read
     */
    public static double userDouble() {

        return scanner.nextDouble();

    }

    /**
     * static function to read boolean input from the user
     *
     * @return boolean values that are read
     */
    public static boolean userBoolean() {

        return scanner.nextBoolean();

    }

    /**
     * static function to read string input from the user
     *
     * @return strings that are read
     */
    public static String userString() {
        return scanner.next();

    }
    
  
    
    public static double binomialCoeff(double n, double k) {
        double res = 1.0; 
        for (int i = 0; i < k; ++i) {
            res =res * (n - i);
            res =res /(i + 1);
        }
        return res;
    }

    public static double countBinary(double n) {
        double c = binomialCoeff(2 * n, n);
        double count = c / (n + 1);
        return count;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static List<String> rangePrime1(int start,int end)
	{
		int flag=1;
		List<String> primeList=new ArrayList<>();//list declaration
		for(int i=start;i<=end;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=0;
					break;
				}
				else
					flag=1;
			}
			if(flag==1)
			{
				primeList.add(Integer.toString(i));//integer to String conversion


			}
		}
		//System.out.println(primeList);
		return primeList;
	}
    
    public static List<Integer> rangePrime(int start, int end)
   	{
   		int flag=1;
   		List<Integer> primeList=new ArrayList<>();//list declaration
   		for(int i=start;i<end;i++)
   		{
   			for(int j=2;j<i;j++)
   			{
   				if(i%j==0)
   				{
   					flag=0;
   					break;
   				}
   				else
   					flag=1;
   			}
   			if(flag==1)
   			{
   				primeList.add((i));//integer to String conversion


   			}
   		}
   		
   		return primeList;
   	}

	public static Set<String> primeAnagram(List<String> primeList)
	{	
		Set<String> primeAnagramSet=new HashSet<String>();
		for(int i=0;i<primeList.size();i++)
		{

			for(int j=i+1;j<primeList.size();j++)
			{
				if(AlgorithmUtility.anagrams(String.valueOf(primeList.get(i)), String.valueOf(primeList.get(j))))
				{
					
					primeAnagramSet.add(primeList.get(i));
					primeAnagramSet.add(primeList.get(j));
					//System.out.println(primeList.get(i)+"    "+primeList.get(j) );
				}
			}
		}

		return primeAnagramSet;
	}
    
	public static void printPrimeAndAnagram(List<List<String>> list1)
    {
        List<String> demo = new ArrayList<String>();
        for (int i = 0; i < list1.size(); i++) {
            demo = list1.get(i);
            if (i == 0) {
                System.out.println("Numbers which are prime and anagram are:"+demo.size());
                System.out.println();
                for (int j = 0; j < demo.size(); j++) {
                    System.out.print(demo.get(j) + " ");
                }
            } else {
            	System.out.println();
                System.out.println("Numbers which are prime but not anagram are:"+demo.size());
                System.out.println();
                for (int j = 0; j < demo.size(); j++) {
                    System.out.print(demo.get(j) + " ");
                }
            }
            System.out.println();
        }
    }
	
	public static Set<Integer> primeAnagram1(List<Integer> primeList)
	{	
		Set<Integer> primeAnagramSet=new HashSet<Integer>();
		for(int i=0;i<primeList.size();i++)
		{

			for(int j=i+1;j<primeList.size();j++)
			{
				if(AlgorithmUtility.anagrams(String.valueOf(primeList.get(i)), String.valueOf(primeList.get(j))))
				{
					
					primeAnagramSet.add(primeList.get(i));
					primeAnagramSet.add(primeList.get(j));
					//System.out.println(primeList.get(i)+"    "+primeList.get(j) );
				}
			}
		}

		return primeAnagramSet;
	}
	public static int[] sortArray(int [] arr) {
        int length = arr.length;
        for (int i = 1; i < length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j]>key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

	public static int day(int month, int i, int year)
    { int y = year - (14 - month) / 12;
    int x = y + y/4 - y/100 + y/400;
    int m = month + 12 * ((14 - month) / 12) - 2;
    int d = (i + x + (31*m)/12) % 7;
    return d;
    }
   
    public static boolean isLeapYear(int year)
    {
            if  ((year % 4 == 0) && (year % 100 != 0))
            	return true;
            if  (year % 400 == 0) 
            	return true;
           
            
            return false;
    }
	
	
	
	
	 
	 





}


	


