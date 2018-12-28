package com.bridgelabz.util;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
import com.bridgelabz.util.Node;

public class File
{
	public File(String string) {
		// TODO Auto-generated constructor stub
	}
	public File() {
		
	}
	public Node readFile(Node node)
	{
		try {
			FileInputStream f=new FileInputStream("/home/admin1/Desktop/file.txt");
			char c;
			String words="";
			while(f.available()>0)
			{
				c=(char)f.read();
				words=words+c;
			}
			String[] wordsArray=words.split(" ");
			for(int i=0;i<wordsArray.length;i++)
			{
				node=addWordsToList(node,wordsArray[i]);
			}
		}
		catch(NullPointerException n)
		{
			System.out.println(n);
		}
		catch(IOException i)
		{
			i.printStackTrace();
		}
		return node;	
	}	
	public Node addWordsToList(Node node1,String str)
	{

		Node node2=node1;
		Node newNode=new Node();
		newNode.data1=str;
		newNode.nextNode=null;
		if(node1==null)
		{
			return newNode;
		}
		else
		{
			while(node1.nextNode!=null)
			{
				node1=node1.nextNode;
			}
			node1.nextNode=newNode;
		}
		return node2;

	}

	public Node searchData(Node node,String word)
	{
		Node temp=node;
		while(node.nextNode!=null){
			if(word.compareTo((node.nextNode).data1)==0)
			{
				node.nextNode=(node.nextNode).nextNode;
				System.out.println("Word is Found");
				System.out.println("the founded word is deleted from the file");
				System.out.println("file saved");
				return temp;
			}
			node=node.nextNode;
		}
		System.out.println("Word is not Found");
		System.out.println("the not founded word is added to the file");
		System.out.println("file saved");
		temp=addWordsToList(temp,word);
		return temp;
	}
	public void writeDataToFile(String nWord)
	{
		try{
			File f1=new File("home/admin/Desktop/file.csv");
			FileWriter fw=new FileWriter(nWord);
			fw.write(nWord);
			fw.close();
		}
		catch(IOException e){
		}
	}










}
