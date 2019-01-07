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

public class BalancedParenthesis {
    public static void main(String[] args) throws Exception {
        Stack stack = new Stack(500);
        DataStructureUtility d=new DataStructureUtility();
        int n=0;
        do
        {
            System.out.println("1.Enter the expression\n2.To exit program");
            int choice=DataStructureUtility.userInteger();
            switch(choice)
            {
            case 1:System.out.println("Enter expression: ");
                    String str = DataStructureUtility.userString();
                    int len = str.length();
                    char[] ch = str.toCharArray();
                    if (d.isBalanced(ch)) {
                        System.out.println(str+" is a balanced expression");
                    }
                    else
                    {
                        System.out.println(str +" is not a balanced expression");
                    }
                    break;
            case 2:System.out.println("Exit");
                    System.exit(0);
                    break;
            default:System.out.println("Please select correct choice");
            }
        n++;
        }while(n<30);
    }
}

