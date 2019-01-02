package com.bridgelabz.datastructureprograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.bridgelabz.util.DataStructureUtility;

public class OrderedList 
{

	public static void main(String[] args) throws IOException
	{
		FileReader f=new FileReader("/home/admin1/Desktop/file1.txt");
		BufferedReader br=new BufferedReader(f);
		FileWriter w=new FileWriter("/home/admin1/Desktop/file4.txt",true);
		BufferedWriter writer = new BufferedWriter(w);
		final String DELIMITER= "\n";
		Node nd=null;
		int n=0;
		LinkedList<Integer> li=new LinkedList<>();
		try
		{
			String word;
			while ((word = br.readLine()) !=null)
			{
				String[] tokens = word.split(DELIMITER);
				for(String token:tokens)
				{
					li.add(Integer.parseInt(token));
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		System.out.println("File Contents :");
		int length=li.print();
		do 
		{
			System.out.println("1.Enter the number to be searched\n2.Exit the program and display the file ");
			int choice=DataStructureUtility.userInteger();
			switch(choice)
			{
			case 1: 
				System.out.println("enter the number to be searched");
				int key=DataStructureUtility.userInteger();
				boolean b=li.printValue1(length,key,li);
				if(b)//runs when true
				{
					System.out.println("number found");
					System.out.println("Number is removed from the file ");
					System.out.println("new file list is :");
					li.print();
				}
				else
				{
					System.out.println("number not found");
					System.out.println("seached number added to file ");
				}
				break;
			case 2://replaces the whole so that redundancy can be avoided
				FileOutputStream writer2 = new FileOutputStream("/home/admin1/Desktop/file4.txt");
				writer2.write(("").getBytes());
				//getbytes:Converts a string into sequence of bytes and returns an array of bytes.
				writer2.close();
				int len=li.print();
				li.sort(li);
				String [] newStr=li.convString1(li, len);
				for(int i=0;i<newStr.length;i++)
				{
					writer.write(newStr[i]);
					writer.write(" ");
				}
				writer.flush();
				writer.close();
				System.exit(0);
				break;
			default :System.out.println("please select correct choice");
			break;

			}




















		}
		while(n<50)	;	

























	}

}
