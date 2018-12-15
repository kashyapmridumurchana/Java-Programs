package com.bridgelabz.functionalprograms;
import com.bridgelabz.util.FunctionalUtility;
import java.util.*;

public class StopWatch 
{
	

	public static void main(String[] args)
	{
		FunctionalUtility fu=new FunctionalUtility();
		//StopWatch sw=new StopWatch();
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 4 to start the timer");
		int n=sc.nextInt();
		fu.start();
		System.out.println("Press 5 to start the timer");
		int n1=sc.nextInt();
		fu.stop();
		fu.timeTaken();
		
		
		

	}

}
