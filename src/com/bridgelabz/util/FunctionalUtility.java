package com.bridgelabz.util;
import java.util.*;
import com.bridgelabz.functionalprograms.*;
public class FunctionalUtility<E> 
{

	//Replace a string

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

	//FlipCoin

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

	//Leap Year?

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


	//Power of 2

	public void powerOf2(int n)
	{   
		int count=0;
		if(n>=0 && n<31)
		{   
			for(int i=0;i<=n;i++)
			{
				double t=Math.pow(2, count);
				count++;

				System.out.println("the series is" + t);
			}
		}
	}
	//Harmonic Number
	public void harmonicNo(int n)
	{
		double result=0.0;
		for(double i=1;i<=n;i++)
		{
			result+=1/i;
		}
		System.out.println( result); 
	}


	//Factors

	public void factors(int n)
	{
		for(int i=2;i<n;i++)
		{
			while(n%i==0)
			{
				System.out.println(i+ " ");
				n=n/i;
			}

		}
		if(n>2)
		{
			System.out.println(n);
		}
	}


	//Gambler

	public void gambler(int $Stake,int $Goal,int n)
	{
		int bets=0,wins=0,loss=0;
		for(int i=0;i<n;i++)
		{
			int money=$Stake;
			while(money>0 && money<$Goal)
			{
				bets++;
				if(Math.random()<0.5)
				{
					money--;   //wins $1

				}
				else
					money++;   //loss $1

			}
			if(money==$Goal)

				wins++;
			else 
				loss++;

		}
		System.out.println(wins+ ":"+loss+ ":"+n); 	
		System.out.println("percentage of wins:" +wins*100/n);
		System.out.println("percentage of loss:" +loss*100/n);
		System.out.println("bet is" +bets);	
	}


	//Coupon Number

	public void couponNumber(int n)
	{
		boolean[] a=new boolean[n];
		int count=0;
		int notCollectedEarlier=0;
		while(notCollectedEarlier<n)
		{
			Random rand=new Random();
			int content=rand.nextInt(n);
			count++;
			if(!a[content])
			{
				notCollectedEarlier++;
				System.out.println(notCollectedEarlier);
				a[content]=true;
			}
		}
		System.out.println("assigning is done for "+count+" number of times");

	}

	//2D array
	public void displayArray(E[][] garray,int m,int n)
	{
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.println(garray[i][j]+" ");
			}
		}

	}






	//Sum of three Integers is Zero?

	public void sumOfThree(int n)
	{
		int a[]=new int[n];
		Scanner scc=new Scanner(System.in);
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the array element at position "+ i);
			a[i]=scc.nextInt();

		}

		boolean flag=false;
		for(int p=0;p<n-2;p++)
		{
			for(int q=p+1;q<n-1;q++)
			{
				for(int r=q+1;r<n;r++)
				{
					if(a[p]+a[q]+a[r]==0)
					{
						flag=true;
						System.out.println("description"+ a[p]+a[q]+a[r]);
					}

				}
			}
		}
		if(flag==false)
		{
			System.out.println("No triplets found");	
		}
	}

	//Euclidean Distance
	public void distance(int x,int y)
	{
		double square=Math.pow(x,2) + Math.pow(y,2);
		double dist=Math.sqrt(square);
		System.out.println("Euclidean distance is"+ dist);

	}

	//Quadratic equation

	public void quadratic(int a,int b,int c)
	{
		double root1, root2, d;
		d = b * b - 4 * a * c;

		if(d>0)
		{
			System.out.println("Roots are real and unequal");
			root1=(-b - Math.sqrt(d))/(2*a);
			root2=(-b - Math.sqrt(d))/(2*a);
			System.out.println("First root is" +root1);
			System.out.println("Second root is"+ root2);
		}
		else if(d==0)
		{
			System.out.println("Roots are real and equal");
			root1=(-b + Math.sqrt(d))/(2*a);
			System.out.println("Root"+ root1);
		}
		else
		{
			System.out.println("Roots are imaginary");
		}

	}

	//Stopwatch code

	public double startTimer=0;
	public double stopTimer=0;
	public double timeElapsed;

	//to start the timer
	public void start()
	{
		startTimer=System.currentTimeMillis();
		//System.out.println("Start time is: " + startTimer);
	}

	//to stop the timer
	public void stop()
	{
		stopTimer=System.currentTimeMillis();
		//System.out.println("Stop time is: " + stopTimer);
	}

	//Calculates the time elapsed
	public void timeTaken()
	{
		timeElapsed=stopTimer-startTimer;
		System.out.println("time elapsed is" + timeElapsed);
	}

	//WindChill

	public void windChill(int t,int v)
	{

		if(t<50 && (v>3 || v<120))
		{
			double x= Math.pow(v,0.16);
			double x2=(0.4275*t - 35.75);
			double w=35.74 + 0.6215*t + x2*x;
			System.out.println("The wind chill is: " + w);


		}
	}
//String permutation
	public void sPermut(String str1)
	{
		int fact=1;
		int len1=str1.length();
		for(int i=1;i<=len1;i++)
		{
			fact=fact*i;
		}
		System.out.println("The number of arrangement possible for the given string is: " + fact);
		

	}

	public void permute(String str1,int l,int r)
	{
		if(l==r)
		{
			System.out.println(str1);
		}
		else
		{
			for(int i=1;i<=r;i++)
			{
				str1=swap(str1,l,i);
				permute(str1,l+1,r);
				str1=swap(str1,l,i);
					
			}
		}
		
	}
public String swap(String a1,int i,int j)
{
	char temp;
	char a[]=a1.toCharArray();
	temp=a[i];
	a[i]=a[j];
	a[j]=temp;
    return String.valueOf(a);
	
}



	
	
}



