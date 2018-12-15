package com.bridgelabz.util;
import java.util.*;
import com.bridgelabz.functionalprograms.*;

public class FunctionalUtility 
{

	
 public void replaceString(String str1)
 {
	 Scanner s=new Scanner(System.in);
	 String usname=s.nextLine();
	if(usname.length()>=3)
	{
		String pString=str1.replace("##username##",usname);
		System.out.println(pString);
	} 
	else
	{
		System.out.println("kindly enter more than 3 characters");
	} 
 }

 
 public void flipCoin(int n)
 {
	    int head=0,tail=0;
	    int num=n;
	    Random r=new Random();
		while(num>0)
		{
				int nr=r.nextInt(2);
				if(nr==0)
					tail++;
				else
					head++;
			num--;
		}
	  
	  System.out.println("head percentage is" + head*100/n);
	  System.out.println("tail percentage is" + tail*100/n);
 }

 
 public void leapYear(int year)
 {
	Scanner s=new Scanner(System.in);
	//int year=s.nextInt();
	if(String.valueOf(year).length()==4)
	 if((year%4==0)&&(year%100!=0)||(year%400==0))
		 System.out.println("year "+ year + " is a leap year");
	 else
		 System.out.println("year "+ year + " is not a leap year");
	else	 
		System.out.println("please enter a year having  4 digits");	
 }

 public void powerOf2(int n)
 {   
	 int count=0;
	 if(n<31)
	 {   
	    for(int i=0;i<=n;i++)
	 {
		double t=Math.pow(2, count);
		count++;
		
	    System.out.println("the series is" + t);
	 }
	}
 }
 
 public void harmonicNo(int n)
 {
	double result=0.0;
	while(n>0)
	{   
		float c=1/n;
		result+=c;
		n--;
	}
	System.out.println(+ result); 
 }

 
 
 
 
 
}
 
 

