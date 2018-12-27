/*******************************************************************************
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   19.12.2018															*
 *  **************************************************************************/
package com.bridgelabz.util;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import com.bridgelabz.algorithmprograms.BubbleSort;

/**
 * @author admin1
 *
 */
/**
 * @author admin1
 *
 */
public class AlgorithmUtility
{
	static int i;//global variables
	static  String l,m;//global variables
	static Scanner sc=new Scanner(System.in);
	public static int userInteger()
	{
		try {
			return sc.nextInt();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return 0;
	}
	public static double userDouble()
	{
		try {
			return sc.nextDouble();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return 0.0;
	}
	public static boolean userBoolean()
	{
		try {
			return sc.nextBoolean();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false ;
	}
	public static String userString()
	{
		try {
			return sc.next();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	public static long userLong()
	{
		try {
			return sc.nextLong();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return 0;
	}




	//String Anagrams	
	/**
	 * @param s1
	 * @param s2
	 * @return
	 */
	public static  boolean anagrams(String s1,String s2)
	{

		char[] ch1=s1.toLowerCase().toCharArray();
		char[] ch2=s2.toLowerCase().toCharArray();
		int len1=ch1.length;
		int len2=ch2.length;
		if(len1!=len2)
		{
			return false;
		}
		else 
		{
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			for(int i=0;i<len1;i++)
			{
				String str1=String.valueOf(ch1);
				String str2=String.valueOf(ch2);

				boolean b=str1.contentEquals(str2);
				{
					if(b==true)
						return true;
				}
			}
			return false;
		}
	}







	//Range of prime numbers 

	/**
	 * @return
	 */
	public static List<String> rangePrime()
	{
		int flag=1;
		List<String> primeList=new ArrayList<>();
		for(int i=2;i<=1000;i++)
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
				primeList.add(Integer.toString(i));


			}
		}
		System.out.println(primeList);
		return primeList;
	}











	//Anagram and Palindrome	

	/**
	 * @param primeList
	 * @return
	 */
	public static Set<String> primeAnagram(List<String> primeList)
	{	



		Set<String> primeAnagramSet=new HashSet<>();
		for(int i=0;i<primeList.size();i++)
		{

			for(int j=i+1;j<primeList.size();j++)
			{
				if(AlgorithmUtility.anagrams(primeList.get(i), primeList.get(j)))
				{
					
					primeAnagramSet.add(primeList.get(i));
					primeAnagramSet.add(primeList.get(j));
					System.out.println(primeList.get(i)+"    "+primeList.get(j) );
				}
			}
		}

		return primeAnagramSet;
	}


	/**
	 * @param primeAnagramSet
	 * @return
	 */
	public static Set<String> primePalindrome(Set<String> primeAnagramSet)
	{
		Iterator iter = primeAnagramSet.iterator();
		Set<String> resultSet=new HashSet<>();

		String a;
		while (iter.hasNext()) 
		{ 
		    a=(String) iter.next();
			int a1=Integer.parseInt(a);
			int lk=reverse(a1);

			if(primeAnagramSet.contains(Integer.toString(lk)))

			{
				String b=Integer.toString(lk);
				resultSet.add(b);
			}


		}
		return resultSet;
	}
	

/**
 * @param n
 * @return
 */
public static int reverse(int n)
{
	
	int reverse=0;
	while(n!=0)
	{
		reverse = reverse * 10;
		reverse = reverse + n%10;
		n = n/10;
	}
	return reverse;
}







//bubble sorting for integers
/*
public void bubbleSort()
{   
	
	System.out.println("How many numbers you want to insert");
	int n=AlgorithmUtility.userInteger();
	System.out.println("Enter the integer numbers for the array");
	int[] array=new int[n];
	int i;
	for( i=0;i<n;i++)
	{
		array[i]=AlgorithmUtility.userInteger();
	}	
	System.out.println("the original array is:");
	for(i=0;i<n;i++)
	{
		System.out.println(array[i]);
	}
	for(i=0;i<array.length-1;i++)
	{
		for( int j=1;j<array.length-i;j++)
		{
			if(array[j-1]>array[j])
			{
				int temp=array[j-1];
				array[j-1]=array[j];
				array[j]=temp;
			}
		}
	}
	System.out.println("Sorted array list is:");
	for(i=0;i<n;i++)
	{
		System.out.println(array[i]);
	}

}
*/







//Merge Sort
/**
 * @param array
 * @param low
 * @param high
 */
public static void mergeSort(String array[],int low,int high)
{
	int n=high-low;
	if(n<=1)
		return;
	int mid=low+n/2;
	mergeSort(array,low,mid);//recursive calling
	mergeSort(array,mid,high);//recursive calling
	String[] temparr=new String[n];
	int i=low,j=mid;
	for(int k=0;k<n;k++)
	{
		if(i==mid)
			temparr[k]=array[j++];
		else if(j==high)
			temparr[k]=array[i++];
		else if(array[j].compareToIgnoreCase(array[i])<0)
			temparr[k]=array[j++];
		else 
			temparr[k]=array[i++];
	}

	for(int k=0;k<n;k++)
	{
		array[low +k]=temparr[k];
	}
}








//vending machine
/**
 * @param money
 * @param notes
 */
public void vendingMachine(int money,int[] notes)
{
	int rem;
	int i=0;
	int total=0;

	if(money==0)
	{
		System.out.println("no outputs");
	}
	else
	{ for(i=0;i<notes.length;i++)
	{
		if(money>=notes[i])
		{
			int calculateNotes=money/notes[i];
			rem=money%notes[i];
			money=rem;
			total=total+calculateNotes;
			System.out.println(notes[i]+ " Notes:  "+calculateNotes);

		}

	}

	System.out.println("Total numbet of notes is"+total);

	}
}





////insertion sort
//
///**
// * @param array
// * @param f
// */
//public static void insertionSort1(String array[], int f)
//{ 
//
//	String temp="";
//	for(int i=0;i<f;i++)
//	{
//		for(int j=i+1;j<f;j++)
//		{
//			if(array[i].compareToIgnoreCase(array[j])>0)
//			{
//				temp = array[i];
//				array[i]=array[j];
//				array[j]=temp;
//			}
//
//		}
//
//	}
//	System.out.println("the sorted list is");
//	for (String string : array) {
//		System.out.println(string);
//	}
//}





////Linear search 
//public String[] linearSearch(String array[],int n)
//{
//	Scanner sc=new Scanner(System.in);
//	double startTimer=System.currentTimeMillis(); 
//
//	System.out.println("enter the element to be searched"); 
//	String key=sc.nextLine(); 
//	for(int i=0;i<n;i++)
//	{
//		if(key.compareToIgnoreCase(array[i])==0)
//		{
//			System.out.println("search done and element found at position " +i);
//		}
//
//	}
//	double stopTimer=System.currentTimeMillis();
//	double timeElapsed=stopTimer-startTimer;
//	//System.out.println("Elapsed time is"+ timeElapsed);
//
//	return array;
//
//}






//insertion sort
public static void insertionSort(String array[], int f)
{
	String temp="";
	for(int i=0;i<f;i++)
	{
		for(int j=i+1;j<f;j++)
		{
			if(array[i].compareToIgnoreCase(array[j])>0)
			{
				temp = array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
	}
}	



//bubble sort for both integers and strings
/**
 * @param array
 * @param f
 * @return
 */
public static String[] bubbleSortString1(String array[],int f)
{
	for(int i=0;i<f;i++)
	{
		for( int j=1;j<f;j++)
		{
			if(array[j-1].compareToIgnoreCase(array[j])>0)
			{
				String temp=array[j-1];
				array[j-1]=array[j];
				array[j]=temp;
			}
		}
	}
return array;
}




//
////bubble sort for both integers and strings
//public static void bubbleSortString(String array[],int f)
//{
//
//	System.out.println("the original array is:");
//	for(int i=0;i<f;i++)
//	{
//		System.out.println(array[i]);
//	}
//
//	for(int i=0;i<f;i++)
//	{
//		for( int j=1;j<f;j++)
//		{
//			if(array[j-1].compareToIgnoreCase(array[j])>0)
//			{
//				String temp=array[j-1];
//				array[j-1]=array[j];
//				array[j]=temp;
//			}
//		}
//	}
//	System.out.println("Sorted array list is:");
//	for (String string : array) {
//	
//		System.out.println(string);
//	}
//}




//temperature conversion
/**
 * @param temp
 * @return
 */
public float tempConversion(float temp)
{
	float fah=(temp*9/5)+32;
	return fah;
	}

/**
 * @param temp
 * @return
 */
public float tempConversion1(float temp)
{
	float cel=(temp-32)*5/9;
    return temp;
}






//Monthly payment
/**
 * @param P
 * @param Y
 * @param R
 * @return
 */
public double monthlyPayment(double P,double Y,double R)
{
	double n=12 *Y;
	double r=R/(12*100);
	double k=Math.pow((1+r),(-n));
	double payment=P*R/1-k;
	return payment;

}






//Square root
/**
 * @param num
 * @param temp
 * @return
 */
public double squareRoot(double num,double temp)
{
	
	double epsilon=1e-15;
	if(num>0) 
	{
		while(Math.abs(temp-num/temp)>epsilon*temp)
		{
			temp=(num/temp+temp)/2;

		}
	}
	else
		System.out.println("Kindly enter a non negative number");	
	 
	return temp;
}






//Decimal to binary problem
/**
 * @param num
 */
public static int[] toBinary(int num)
{
    int[] binary=new int[8];
    int i=0;
    while(num>0)
    {
         binary[i]=num%2;
         num=num/2;
         i++;
    }
    return binary;
}

public static int [] swapNibble(int first,int middle,int last,int [] binary)
{
    int n1=middle-first+1;
    int n2=last-middle;
    int [] left_array=new int[n1];
    int [] right_array=new int[n2];
    int [] binary2=new int[8];
    int k=0;
    for(int i=middle+1;i<=last;i++)
    {
        left_array[k]=binary[i];
        k++;
    }

    int l=0;
    for(int i=0;i<=middle;i++)
    {
        right_array[l]=binary[i];
        l++;
    }

    System.out.println();
    int i=0,j=0;
    int m=0;
    while(j<n1)
    {
        binary2[m]=left_array[j];
        j++;
        m++;
    }
    while(i<n2)
    {
        binary2[m]=right_array[i];
        i++;
        m++;
    }
    return binary2;
   
}

  
    
    public static int decimal(int [] binary)
    {
        int num2=binary.length-1;
        int sum=0;
//        System.out.println(num2);
        for(int i=0;i<binary.length;i++)
        {
            int res=(int)(Math.pow(2, num2));
            sum+=(binary[i]*res);
            num2--;
        }
        return sum;
    }
   
    
    
     public static boolean powerOf2(int number){
          if(number<=0){
           return false;
          }
          while(number > 1){
           if(number % 2 != 0){
            return false;
           }
           number = number / 2;
          }
          return true;
         }




//Binary search 

/**
 * @param lower
 * @param upper
 * @param middle
 * @param count
 * @param input
 * @param n
 */
public static void bSearch(int lower,int upper,int middle,int count,String input,int n)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Is your number:"+middle);
	System.out.println("Enter your answer as in 'yes'or 'high' or 'low'");
	input=sc.nextLine(); 
	do
	{
		if(input.equals("high"))
		{
			lower=middle;
			count++;
		}
		else if (input.contentEquals("yes"))
		{
			System.out.println("Your number is"+middle);
			int no=count;
			System.out.println("It took "+ no+ " times to get your number");
			break;
		}
		else if(input.equals("low"))
		{
			upper=middle;
			count++;

		}
		if(count<n)
		{
			middle=(lower+upper +1)/2;
			System.out.println("is your number"+middle);
			input=sc.nextLine();
		}
	}
	while(lower<upper);
	if(count>n)
	{
		System.out.println("number not found");	
	}
	else
	{
		System.exit(0);
	}
}






//day of week
/**
 * @param m
 * @param d
 * @param y
 * @return
 */
public static int dayOfWeek(int m,int d,int y)
{
	int y1=y-(14-m)/12;
	int x=y1+(y1/4)-(y1/100)+(y1/400);
	int m1=m+12*((14-m)/12)-2;
	int d1=(d+x+31*m1/12)%7;
	return d1;
}






//Word binary Search

//sorting
/**
 * @param str
 * @return
 */
public static String[] sort(String[] str)
{
	int length=str.length;
	for(int i=0;i<length;i++)
	{
		for(int j=i+1;j<length;j++)
		{
			if(str[i].compareToIgnoreCase(str[j])>0)
			{
				String temp=str[j];
				str[j]=str[i];
				str[i]=temp;
			}
		}

	}
	return str;
}







//binary search
/**
 * @param str
 * @param key
 * @return
 */
public static int binarySearch(String str[],String key)
{
	int first=0;
	int last=str.length-1;
	int middle=(first+last)/2;
	while(first<=last)
	{
		if(str[middle].compareToIgnoreCase(key)<0)
			first=middle+1;
		else if(str[middle].compareToIgnoreCase(key)==0)
		{
			return middle;
		}
		else 
			last=middle-1;
		middle=(first+last)/2;
	}
	return -1;
}




//for timer start and stop
public static double startTimerFunc()
{
	double d=System.nanoTime();
	return d;
}
public static double stopTimerFunc()
{
	double d1=System.nanoTime();
	return d1;
}
public static double elapsedTime(double startTime,double stopTime)
{
	
	double timeElapsed=stopTime-startTime;
	return timeElapsed;
}
public static List<Double> listCall(List<Double> timeList)
{
   Collections.sort(timeList);	
   return timeList;
}










}





