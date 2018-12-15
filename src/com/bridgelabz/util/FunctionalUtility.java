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
					head++;
				else
					tail++;
			num--;
		}
	  
	  System.out.println("head percentage is" + head*100/n);
	  System.out.println("tail percentage is" + tail*100/n);
 }

 
 public void leapYear(int year)
 {
	boolean count=false;
	if(year%400==0)
	{
		count=true;
	}
	else if(year%4==0)
	{
		count=true;
	}
	else if(year%100==0)
	{
		count=false;
	}
	else 
	{
		count=false;
	}
	if(count)
	{
		System.out.println("year"+ year +"is a leap year");
	}
	else
	{
		System.out.println("year"+ year +"is not a leap year");	
	}
	
 }

}
 
 

