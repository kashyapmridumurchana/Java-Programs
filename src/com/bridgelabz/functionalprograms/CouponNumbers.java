/********************************************************************** *********
 *   Compilation:  javac -d bin CouponNumbers.java						      	*
 *  Execution:    java -cp bin com.bridgelabz.functionalprograms.CouponNumbers  *
 *                                                                  			*
 *  Purpose: to find distinct coupon number										*
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   19.12.2018															*
 *  **************************************************************************/
package com.bridgelabz.functionalprograms;
import java.util.Scanner;
import com.bridgelabz.util.FunctionalUtility;

public class CouponNumbers 
{
   //main method takes input for number of coupons
	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the total number of coupons ");
		int n=s.nextInt();
		FunctionalUtility funtionalUtility=new FunctionalUtility();
		funtionalUtility.couponNumber(n);	//method call

	}

}
