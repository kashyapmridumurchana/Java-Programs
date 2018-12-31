package com.bridgelabz.datastructureprograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;

import com.bridgelabz.util.DataStructureUtility;

public class UnOrderedList  {
    public static void main(String[] args) throws FileNotFoundException
    {
        String str="/home/admin1/Desktop/file.txt";
        FileReader f=new FileReader(str);
        BufferedReader read=new BufferedReader(f);
        final String DELIMITER=" ";
        Node nd=null;
        LinkedList<String> li=new LinkedList<>();
        try
        {
            String word;
              while ((word = read.readLine()) != null)
              {
              String[] tokens = word.split(DELIMITER);
                for(String token:tokens)
                {
                    li.add(token);
//                    System.out.println(token);
                }
              }
              System.out.println("words in a file are :");
              int length=li.traverse();
              System.out.println(length);
              System.out.println("enter the word to be searched");
              Object key=DataStructureUtility.userString();
              li.printValue(length);
              while(li==key)
              {
                  System.out.println("found");
              }
           
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }


}

