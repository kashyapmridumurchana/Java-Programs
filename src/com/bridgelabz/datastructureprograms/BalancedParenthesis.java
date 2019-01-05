/*****************************************************************************************
 *   Compilation:  javac -d bin BalancedParenthesis.java								 *
 *  Execution:    java -cp bin com.bridgelabz.datastructureprograms.BalancedParenthesis  *
 *                                                                  					 *
 *  Purpose: Simple Balanced Parentheses
 																						 *
 *														          						 *
 *  @author  Mridumurchana Kashyap													     *
 *  @version 1.0																	   	 *
 *  @since   3.1.2019															         *
 *  **************************************************************************************/
package com.bridgelabz.datastructureprograms;
import com.bridgelabz.util.DataStructureUtility;
import com.bridgelabz.util.Stack;
public class BalancedParenthesis
{
	public static void main(String[] args) 
	{
		
		System.out.println("Enter max size: ");//to ensure that the max size is greater than 0
		int n=DataStructureUtility.userInteger();
	

		/* Creating Stack */
		Stack stack = new Stack(n);
		System.out.println();
		System.out.println("Parenthesis Matching");
		System.out.println();
		 

		/* Accepting expression */
		System.out.println("Enter expression: ");
		String exp = DataStructureUtility.userString();        
		int len = exp.length();
		System.out.println("length of expression is "+len);//total length of expression
		System.out.println("Observation ");

		for (int i = 0; i <len; i++)
			
		{    
		char ch = exp.charAt(i);

			if (ch == '(')
			{
			stack.push(i);//pushing index value for further check
			}
				else if (ch == ')')
				{
					try
					{
					long l = (stack.pop()+1);
					
					System.out.println("'(' at index "+l+" matched with ')' at index "+(i+1));
					System.out.println("TRUE");
					}
					
					catch(Exception e)
					{
					System.out.println("')' at index "+(i+1)+" is unmatched");
					
					System.out.println("FALSE");
					}
				}            
			}
		while (!stack.isEmpty() )
		{
		System.out.println("'(' at index "+(stack.pop() +1)+" is unmatched");
		}                          
    }
}
