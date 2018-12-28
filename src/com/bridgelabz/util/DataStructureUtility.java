package com.bridgelabz.util;
import com.bridgelabz.util.Node;
import java.util.Scanner;
import com.bridgelabz.util.File;

public class DataStructureUtility 
{

	//unordered list	
	public void unOrdered(Node node)
	{
		try {		
			Scanner sc=new Scanner(System.in);
			File n=new File();
			System.out.print("Enter the word to search :");
			String word1=sc.nextLine();
			node=n.searchData(node,word1);
			String word2=" ";

			while(node!=null)
			{
				word2=word2+node.data;
				word2=word2+" ";
				node=node.nextNode;
			}
			n.writeDataToFile(word2);

		}
		catch(NullPointerException n) 
		{
			System.out.println(n);
		}

	}




}