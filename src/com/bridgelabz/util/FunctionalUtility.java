/*******************************************************************************
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   19.12.2018															*
 *  **************************************************************************/
package com.bridgelabz.util;
import java.io.PrintWriter;
import java.util.*;
public class FunctionalUtility<E> 
{
	//to replace a string

	/**
	 * @param str1 is the string where a sub string needs to be replaced
	 */
	public void replaceString(String str1)
	{
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		String usname=s.nextLine();
		if(usname.length()>=3)
		{
			String pString=str1.replace("<<username>>",usname);
			System.out.println(pString);
		} 
		else
		{
			System.out.println("kindly enter more than 3 characters");
		} 
	}





	//To flip a coin and calculate the head and tail percentages

	/**
	 * @param n is the number of times coin need to be flipped
	 */
	public void flipCoin(int n)
	{
		double head=0.0,tail=0.0;
		int num=n;
		Random r=new Random();
		while(num>0)
		{
			int nr=r.nextInt(2);
			if(nr==0.0)
				tail++;
			else if(nr==1.0)
				head++;
			num--;
		}
		System.out.println("head " + head);
		System.out.println("tail " + tail);

		System.out.println("head percentage is" + head*100/n);
		System.out.println("tail percentage is" + tail*100/n);
	}







	//To check if a year is leap year or not

	/**
	 * @param year is the year given by the user
	 */
	public void leapYear(int year)
	{
		if(String.valueOf(year).length()==4)
			if((year%4==0)&&(year%100!=0)||(year%400==0))
				System.out.println("year "+ year + " is a leap year");
			else
				System.out.println("year "+ year + " is not a leap year");
		else	 
			System.out.println("please enter a year having  4 digits");	
	}






	//prints a table of the powers of 2 that are less than or equal to 2^N. 

	/**
	 * @param n is the input of the number given by the user
	 */
	public void powerOf2(int n)
	{   
		double t=0;
		int count=0;
		if(n>=0 && n<31)
		{   
			for(int i=0;i<=n;i++)
			{
				t=Math.pow(2, count);
				System.out.println(t);
				count++;

				
			}
			System.out.println("the series is " + t);
		}
	}






	// Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N 

	/**
	 * @param n is the number till which harmonic number is to be found
	 */
	public void harmonicNo(int n)
	{
		double result=0.0;
		for(double i=1;i<=n;i++)
		{
			result+=1/i;
		}
		System.out.println( result); 
	}






	// prime factorization of N

	/**
	 * @param n is the number whose prime factor is to be found
	 */
	public void factors(int n)
	{
		for(int i=2;i<=n;i++)
		{ 
			while(n%i==0)
			{
				System.out.println(i+ " ");
				n=n/i;		
			}
		}

	}






	//Gambler game

	/**
	 * @param $Stake is the total amount available to play 
	 * @param $Goal is the goal set by the user
	 * @param n is the number of times
	 */
	public void gambler(int $Stake,int $Goal,int n)
	{
		double wins=0.0,loss=0.0;
		for(int i=0;i<n;i++)
		{
			int money=$Stake;
			while(money>0 && money<$Goal)
			{
				
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
		
	}






	// to generate distinct coupon numbers

	/**
	 * @param n is the number of coupons to be generated
	 */
	public void couponNumber(int n)
	{
		boolean[] a=new boolean[n];
		int array[]=new int[n];
		int notCollectedEarlier=0;
		while(notCollectedEarlier<n)
		{
			Random rand=new Random();
			int content=rand.nextInt(n);
			
			if(!a[content])
			{
				notCollectedEarlier++;
				System.out.println(notCollectedEarlier);
				a[content]=true;
			}
			
		}
		

	}





	/*A library for reading in 2D arrays of integers, doubles, or booleans
	from standard input and printing them out to standard output.*/

	/**
	 * @param garray is the generic array
	 * @param m is the number of rows
	 * @param n is the number of coloumns
	 */
	public void displayArray(E[][] garray,int m,int n)
	{
		PrintWriter p=new PrintWriter(System.out,true);
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(garray[i][j]+" ");
			}
			System.out.println();
		}

	}









	//Sum of three Integer adds to ZERO

	/**
	 * @param n is the number of elements to be inserted into the array
	 */
	public void sumOfThree(int n)
	{
		int count=0;
		int a[]=new int[n];
		@SuppressWarnings("resource")
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
						count++;
						System.out.println("description "+ a[p]+" + "+a[q]+" + "+a[r]);
					}
System.out.println();
				}
			}
		}
		System.out.println("The number of combination found is"+count);
		if(flag==false)
		{
			System.out.println("No triplets found");	
		}
	}






	//prints the Euclidean distance from the point (x, y) 

	/**
	 * @param x is the value of x-coordinate
	 * @param y is the value of y-coordinate
	 */
	public void distance(int x,int y)
	{
		double square=Math.pow(x,2) + Math.pow(y,2);
		double dist=Math.sqrt(square);
		System.out.println("Euclidean distance is"+ dist);

	}






	//To find roots of a Quadratic equation


	/** equation of the form : ax^2 + bx +c=0 
	 * @param a is the value given by the user for a
	 * @param b is the value given by the user for b
	 * @param c is the value given by the user for c
	 */
	public void quadratic(int a,int b,int c)
	{
		double root1, root2, d;
		d = b * b - 4 * a * c;

		if(d>0)
		{
			System.out.println("Roots are real and unequal");
			root1=(-b + Math.sqrt(d))/(2*a);
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





	//To create a stop watch

	public double startTimer=0;
	public double stopTimer=0;
	public double timeElapsed;

	//to start the timer
	public void start()
	{
		startTimer=System.currentTimeMillis();

	}

	//to stop the timer
	public void stop()
	{
		stopTimer=System.currentTimeMillis();

	}

	//Calculates the time elapsed
	public void timeTaken()
	{
		timeElapsed=stopTimer-startTimer;
		System.out.println("time elapsed is" + timeElapsed);
	}







	//WindChill

	/**
	 * @param t is the temperature value
	 * @param v is the speed
	 */
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


	

	//To return all permutation of a String using iterative method and Recursion method
	/**
	 * @param candidate is an empty string for the first recursion and then takes the 
	 * input accordingly for next recursion
	 * 
	 * @param remaining is the string provided by the user for the first 
	 * recursion and updated accordingly for next recursion
	 */
	public static void recursion(String candidate,String remaining)//using recursion
	{

		
		if(remaining.length()==0)
		{
			System.out.println(candidate);


		}
		for(int i=0;i<remaining.length();i++)
		{
			String newCandidate=candidate+remaining.charAt(i);

			String newRemaining=(remaining.substring(0,i)+remaining.substring(i+1));

			recursion(newCandidate,newRemaining);	

		}

	}
	
	
	//String permutation continued
	/**
	 * @param s is the string input by the user
	 */
	public static void iteration(String s)//using iteration
	{
		List<String> partial=new ArrayList<>();
		partial.add(String.valueOf(s.charAt(0)));
		for(int i=1;i<s.length();i++)
		{
			for(int j=partial.size()-1;j>=0;j--)
			{
				String str=partial.remove(j);
				for(int k=0;k<=str.length();k++)
				{
					partial.add(str.substring(0,k)+s.charAt(i)+ str.substring(k));
				}
			}		
		}
		System.out.println(partial);
	}





	
	//Cross Game or Tic-Tac-Toe Game 

	static int player = 0;
	static int[][] BOARD = new int[3][3];
	static boolean isEmpty = true;

	public static void initBoard() {
		System.out.println("TIC TAC TOE GAME \n Computer is o \nPlayer  is x ");
		for (int i = 0; i < BOARD.length; i++) {
			for (int j = 0; j < BOARD[i].length; j++) {
				BOARD[i][j] = -3;
			}
		}
		System.out.println("Board is this :");
		dispBoard();
	}

	public static void dispBoard() {
		int count = 0;
		for (int i = 0; i < BOARD.length; i++) {
			System.out.println("---------------");
			System.out.print("||");
			for (int j = 0; j < BOARD[i].length; j++) {
				if (BOARD[i][j] == 0) {
					count++;
					System.out.print(" o |");
				} else if (BOARD[i][j] == 1) {
					count++;
					System.out.print(" x |");
				} else
					System.out.print("   |");
			}
			System.out.println("|");
		}
		if (count == 9) {
			isEmpty = false;
		}
		System.out.println("---------------");
	}


	public static void putVal() {
		try{
			int i;
		
		int j;
		if (player % 2 == 1) {
			i = (int) (Math.random() * 10) % 3;
			j = (int) (Math.random() * 10) % 3;
		} else {

			System.out.println("enter value of x and y by space");
			i = AlgorithmUtility.userInteger();
			j =  AlgorithmUtility.userInteger();
		}
		if (BOARD[i][j] == -3) {
			if (player % 2 == 0) {
				BOARD[i][j] = 0;
			} else {
				BOARD[i][j] = 1;
				System.out.println("Computer Choosing " + i + " " + j);
			}
		} else
			putVal();
		}
		catch(Exception e)
		{
			System.out.println("Kindly enter valid inputs");
			putVal();
		}
	}

	public static boolean win() {
		return ((BOARD[0][0] + BOARD[0][1] + BOARD[0][2] == player * 3)
				|| (BOARD[1][0] + BOARD[1][1] + BOARD[1][2] == player * 3)
				|| (BOARD[2][0] + BOARD[2][1] + BOARD[2][2] == player * 3)
				|| (BOARD[0][0] + BOARD[1][0] + BOARD[2][0] == player * 3)
				|| (BOARD[0][1] + BOARD[1][1] + BOARD[2][1] == player * 3)
				|| (BOARD[0][2] + BOARD[1][2] + BOARD[2][2] == player * 3)
				|| (BOARD[0][0] + BOARD[1][1] + BOARD[2][2] == player * 3)
				|| (BOARD[2][0] + BOARD[1][1] + BOARD[0][2] == player * 3));
	}

	public static void play() {
		initBoard();
		int count=0;
		while (isEmpty) {
			System.out.println("Players turn");
			putVal();
			dispBoard();
			if (win()) {
				System.out.println("Player won");
				return;
			}
			player = 1;
			count++;
			if(count<5) 
			{
				System.out.println("Computers turn");
				putVal();
				dispBoard();
				if (win()) {
					System.out.println("Computer won");
					return;
				}
			}
			else
				System.out.println("Its a draw");
			player = 0;
		}
	}




}



