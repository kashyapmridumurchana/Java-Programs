/*******************************************************************************
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   19.12.2018															*
 *  **************************************************************************/
package com.bridgelabz.util;
import java.util.*;

public class AlgorithmUtility<T>
{
	static int i;//global variables
	static  String l,m;//global variables
	
	//Scanner creation
	static Scanner sc=new Scanner(System.in);
	//for integers
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
	//for double
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
	//for Boolean
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
	//for String
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
	//for long
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




	//to check if strings are anagrams or not	
	/**
	 * @param s1 is the first string
	 * @param s2 is the second String
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
			ch1=sortChar(ch1);
			ch2=sortChar(ch2);
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
	
	
	
	

	//Anagram program continued
	
	/**
	 * @param ch is the character array input
	 * @returns sorted array
	 */
	public static char[] sortChar(char [] ch)
	{
		char[] c=new char[ch.length];
		for(int i=0;i<ch.length;i++)
		{
			int count=0;
			for(int j=0;j<ch.length;j++)
			{
				if(ch[i]<ch[j])
				{
					count++;
				}
			}
			c[count]=ch[i];
		}
		return c;
	}







	//prime numbers between 0-1000

	/**
	 * @returns an array List which contains all the prime numbers between 0-1000 
	 */
	public static List<String> rangePrime()
	{
		int flag=1;
		List<String> primeList=new ArrayList<>();//list declaration
		for(int i=2;i<=500;i++)
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
		System.out.println(primeList);
		return primeList;
	}



	//to find the prime numbers which are Anagram and Palindrome	

	/**
	 * @param primeList is the list of prime numbers given by the rangePrime() method
	 * @returns an array set of prime anagrams 
	 */
	public static Set<String> primeAnagram(List<String> primeList)
	{	
		Set<String> primeAnagramSet=new HashSet<>();
		for(int i=0;i<primeList.size();i++)
		{

			for(int j=i+1;j<primeList.size();j++)
			{
				if(AlgorithmUtility.anagrams(String.valueOf(primeList.get(i)), String.valueOf(primeList.get(j))))
				{
					
					primeAnagramSet.add(primeList.get(i));
					primeAnagramSet.add(primeList.get(j));
					System.out.println(primeList.get(i)+"    "+primeList.get(j) );
				}
			}
		}

		return primeAnagramSet;
	}
	
	/*
	public static Set<Integer> primePalindrome(Set<Integer> primeAnagramSet) {
        Set<Integer> pal_set=new HashSet<>();
        Iterator<Integer> itr=primeAnagramSet.iterator();
        while(itr.hasNext()){
            Integer num=itr.next();
            if(isPalindrom(String.valueOf(num))){
                pal_set.add(num);
            }
        }
        return pal_set;
    }
    public static boolean isPalindrom(String str){
        char temp;
        int begin=0;
        int end=str.length()-1;
        String rev_str=str;
        char[] array=str.toCharArray();
        while(begin<=end){
            temp=array[begin];
            array[begin]=array[end];
            array[end]=temp;
            begin++;
            end--;
        }
        String new_str=String.valueOf(array);
        if(rev_str.equals(new_str))
            return true;
        else
            return false;
    }

	*/

     //prime number program continued
	/**
	 * @param primeAnagramSet is the set of prime anagrams given by the primAnagram() method
	 * @returns the set of prime numbers which are anagrams and palindrome
	 */
	public static Set<String> primePalindrome(Set<String> primeAnagramSet)
	{
		//Iterator iter=primeAnagramSet.iterator(); 
		Iterator<String> iter = primeAnagramSet.iterator();    //Alternative of the line no 196
		Set<String> resultSet=new HashSet<>();

		String a;
		while (iter.hasNext()) //iterates till set is empty
		{ 
		    a=(String) iter.next();
			int a1=Integer.parseInt(a);//type casting
			int lk=reverse(a1);//gives the reverse of a1 and stores in lk

			if(primeAnagramSet.contains(Integer.toString(lk)))//comparison 

			{
				String b=Integer.toString(lk);
				resultSet.add(b);
			}


		}
		return resultSet;
	}
	
	//prime number program continued
/**
 * @param n is a number,who reverse is to be found
 * @returns the reverse of n
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




//to perform sorting of array using merge sort
/**
 * @param array is the array of elements provided by the user
 * @param low is the first element
 * @param high is the last element
 */
public static void mergeSort(String array[],int low,int high)
{
	if(array.length>0)
	{
	int n=high-low;
	if(n<=1)
		return;
	int mid=low+n/2;//middle element calculation
	mergeSort(array,low,mid);//recursive calling to sort the lower half of array
	mergeSort(array,mid,high);//recursive calling to sort the lower half of array
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
	else
		System.out.println("kindly enter the more thn one string");
}








//vending machine
/**
 * @param money is the amount entered by the user
 * @param notes is the array of available notes
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





//to perform sorting of array using insertion sort
/**
 * @param array is the array of elements provided by the user 
 * @param f is the size of array
 */
public static <T extends Comparable<T>> void insertionSort(T array[], int f)
{
	T temp;
	for(int i=0;i<f;i++)
	{
		for(int j=i+1;j<f;j++)
		{
			if(array[i].compareTo(array[j])>0)
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
 * @param array is the array of elements provided by the user
 * @param f is the size of array
 * 
 */
public static <T extends Comparable<T>> void bubbleSort(T array[],int f)
{
	for(int i=0;i<f;i++)
	{
		for( int j=1;j<f;j++)
		{
			if(array[j-1].compareTo((T)array[j])>0)
			{
				T temp=array[j-1];
				array[j-1]=array[j];
				array[j]=temp;
			}
		}
	}

}




//temperature conversion
/**
 * @param temp is the temperature entered by the user
 * @returns the temperature entered by the user in fahrenheit
 */
public float tempConversion(float temp)
{
	float fah=(temp*9/5)+32;
	return fah;
	}
//temperature conversion continued
/**
 * @param temp is the temperature entered by the user
 * @returns the temperature entered by the user in celsius
 */
public float tempConversion1(float temp)
{
	float cel=(temp-32)*5/9;
    return cel;
}






//to calculate Monthly payment
/**
 * @param P is the principal loan
 * @param Y is the years
 * @param R is the rate of interest
 * @returns the  monthly payment
 */
public double monthlyPayment(double P,double Y,double R)
{
	double n=12 *Y;
	double r=R/(12*100);
	double k=Math.pow((1+r),(-n));
	double payment=P*R/1-k;
	return payment;

}






//to calculate the Square root of a number
/**
 * @param num is the number whose square root is to be found
 * @param temp stores the final square root  result 
 * @returns the temp
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






//to convert a Decimal number  to binary problem
/**
 * @param num is the decimal number whose binary value is to be found out
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

//Decimal to binary continued

/**
 * @param first is the first element
 * @param middle is the middle element
 * @param last is the last element
 * @param binary is the array of collection of binary number of a corresponding decimal number
 * @returns the swapped nibble
 */
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




 // decimal to binary continued 
    
    /**
     * @param binary is the array of collection of binary number of a corresponding decimal number 
     * @returns the corresponding decimal of the binary number
     */
    public static int decimal(int [] binary)
    {
        int num2=binary.length-1;
        int sum=0;
        for(int i=0;i<binary.length;i++)
        {
            int res=(int)(Math.pow(2, num2));
            sum+=(binary[i]*res);
            num2--;
        }
        return sum;
    }
    
  
    
 // decimal to binary continued  
    
     /**
     * @param number is the decimal number 
     * @returns a boolean value(true if decimal number is power of 2)
     */
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



    

//to search an element using binary search

/**
 * @param lower is the first element
 * @param upper is the range value
 * @param middle is the middle element
 * @param count is declared to count how many iterations the searching process took
 * @param input is the string which is provided by the user as answer. 
 * @param n is the number given by user
 */
public static void bSearch(int lower,int upper,int middle,int count,String input,int n)
{
	
	System.out.println("Is your number:"+middle);
	System.out.println("Enter your answer as in 'yes'or 'high' or 'low'");
	input=AlgorithmUtility.userString();
	do
	{
		if(input.equals("high"))
		{
			lower=middle;
			count++;
		}
		else if (input.contentEquals("yes"))
		{
			count++;
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
			input=AlgorithmUtility.userString();
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






//to calculate day of week
/**
 * @param m is the month provided by user
 * @param d is the  date provided by user
 * @param y is the year provided by user
 * @returns the day of the week as an integer(0 as sunday and so on)
 */
public static int dayOfWeek(int m,int d,int y)
{
	int y1=y-(14-m)/12;
	int x=y1+(y1/4)-(y1/100)+(y1/400);
	int m1=m+12*((14-m)/12)-2;
	int d1=(d+x+31*m1/12)%7;
	return d1;
	
	
}






//Binary search of a word from a file

//sorting
/**
 * @param str is the array of strings as input
 * @return the sorted array
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

//word binary search
//Searching of a string using binary search
/**
 * @param arr is an array of strings 
 * @param key is the value to be searched
 * @return 
 * @returns an integer value 
 */
public static int binarySearch(String[] arr,String key)
{
	int first=0;
	int last=arr.length-1;
	int middle=(first+last)/2;
	while(first<=last)
	{
		if(arr[middle].compareToIgnoreCase(key)<0)
			first=middle+1;
		else if(arr[middle].compareToIgnoreCase(key)==0)
		{
			return middle;
		}
		else 
			last=middle-1;
		middle=(first+last)/2;
	}
	return -1;
}




public static  <T extends Comparable<T>> int binarySearch1(T[] arr,T key)
{
	int first=0;
	int last=arr.length-1;
	int middle=(first+last)/2;
	while(first<=last)
	{
		if(arr[middle].compareTo(key)<0)
			first=middle+1;
		else if(arr[middle].compareTo(key)==0)
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


//method to Start the timer
public static double startTimerFunc()
{
	double d=System.nanoTime();
	return d;
}

//method to stop the timer
public static double stopTimerFunc()
{
	double d1=System.nanoTime();
	return d1;
}

//method which calculates elapsed time
public static double elapsedTime(double stopTime,double startTime)
{
	
	double timeElapsed=stopTime-startTime;
	return timeElapsed;
}

//returns an array list which stores the elapsed time of some methods
public static List<Double> listCall(List<Double> timeList)
{
   return timeList;
}

//returns a map sorted in decreasing order
public static Map<String,Double> mapCall(Map<String,Double > map)
{
	Map<String, Double> sortedMap = new LinkedHashMap<>();
	 map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
	 .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
	 return sortedMap;
}









}





