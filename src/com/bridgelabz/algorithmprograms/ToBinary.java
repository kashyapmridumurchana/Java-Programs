/********************************************************************** ****************************
 *   Compilation:  javac -d bin ToBinary.java						        						*	
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.ToBinary.java	  	    			*
 *                                                                  								*
 *  Purpose: to convert decimal number to binary													*
 *																									*
 *  @author  Mridumurchana Kashyap																	*
 *  @version 1.0																					*
 *  @since   19.12.2018																				*
 *  ************************************************************************************************/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.AlgorithmUtility;

public class ToBinary {
	//main method contains the input of the parameters,calls the methods and prints the output given by the called methods
    public static void main(String[] args) {
        System.out.println("Enter the decimal number");
        int num=AlgorithmUtility.userInteger();//method call to take integer input
        int[] binary=AlgorithmUtility.toBinary(num);//method call to find binary number
        int [] binary2=new int[binary.length];//array declaration
        int k=0;
        for(int i=binary.length-1;i>=0;i--)
        {
            binary2[k]=binary[i];
            k++;
           
        }
        System.out.println();
        for(int i=0;i<binary2.length;i++)
        {
            System.out.print(binary2[i]);
        }
        System.out.println();
        System.out.println("swaping nibbles");
        System.out.println();
        int first=0,last=binary.length-1;
        int middle=(first+last)/2;
        int[] binary3=AlgorithmUtility.swapNibble(first,middle,last,binary2);//method call to swap the nibble
        for(int i=0;i<binary3.length;i++)
        {
            System.out.print(binary3[i]);
        }
   
        
        int sum=AlgorithmUtility.decimal(binary3);//method call to get the corresponding decimal of the binary number
        System.out.println();
        System.out.println("decimal number : "+sum);
        System.out.println();
        boolean b=AlgorithmUtility.powerOf2(sum);//method call to check if it is power of 2
        if(b==true)
        System.out.println("the resultant number "+sum+" is the number is a power of 2");
        else
            System.out.println("the resultant number "+sum+" is not the number is a power of 2");
           
       
    }

}
