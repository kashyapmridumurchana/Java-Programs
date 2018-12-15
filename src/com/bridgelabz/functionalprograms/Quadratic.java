package com.bridgelabz.functionalprograms;
import java.util.*;
import com.bridgelabz.util.FunctionalUtility;

public class Quadratic {

	public static void main(String[] args) 
	{
		int a, b, c;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Given quadratic equation: ax^2 + bx + c");
        System.out.print("Enter a:");
        a = s.nextInt();
        System.out.print("Enter b:");
        b = s.nextInt();
        System.out.print("Enter c:");
        c = s.nextInt();
        System.out.println("Given quadratic equation:"+a+"x^2 + "+b+"x + "+c);
        
        FunctionalUtility funtionalUtility=new FunctionalUtility();
		funtionalUtility.quadratic(a,b,c);

	}

}
