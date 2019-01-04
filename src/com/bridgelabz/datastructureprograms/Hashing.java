package com.bridgelabz.datastructureprograms;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import java.util.Map;

import com.bridgelabz.util.DataStructureUtility;
import com.bridgelabz.util.LinkedList;

public class Hashing {
	public static void main(String[] args) throws IOException{
		
		DataStructureUtility d=new DataStructureUtility(); 
		LinkedList<Integer> ds=new LinkedList();
		LinkedList<Integer> ds1 = null;
		Map<Integer, LinkedList<Integer>> map=new HashMap<Integer, LinkedList<Integer>>();
		for(int i=0;i<10;i++){
			ds1 = new LinkedList();
			map.put(i, ds1);
		}
		
		FileReader fr=new FileReader("C:\\Users\\Nikita\\Desktop\\HashNumb.csv");
		BufferedReader br=new BufferedReader(fr);
		int rem;
		String num;
		String delimitor=",";
		while((num=br.readLine())!=null){
			String number[]=num.split(delimitor);
			for(String numb:number){
				ds.add(Integer.parseInt(numb));
			}
		}
		System.out.println("The numbers in the file are:");
		ds.print();
		System.out.println();
		int len=ds.size();
		int[] array=new int[len];
		int [] array2=d.sortArray(array);
		//int[] res=ds.convertIntArray(array2);
		int[] sorted=ds.sort(array2);
		System.out.println("The sorted array are:");
		for(int s:sorted)
			System.out.print(s+" ");
		System.out.println();
		System.out.println("Diving each number by 11");
		for(int i=0;i<sorted.length;i++){
			rem=sorted[i]%11;
			if(map.isEmpty()){
				ds1.add(sorted[i]);
				map.put(rem, ds1);
			}
			else{
				map.put(rem, ds1);
				ds1=map.get(rem);
				if(ds1.size()==0){
					ds1.add(sorted[i]);
				}
				else{
					if(!ds1.search(sorted[i])){
						ds1.add(sorted[i]);
					}
				}
				
			}
		}
		int n=0;
		do{
			System.out.println("Enter choice");
			System.out.println("1:Search for the number  2:Write  3:Exit");
			int choice=DataStructureUtility.userInteger();
			switch(choice){
			case 1: System.out.println("Enter the number to search");
					int user_num=DataStructureUtility.userInteger();
					boolean rs=ds1.search(user_num);
					if(rs){
						System.out.println("The number is found");
						System.out.println("Fetching the index of the number");
						int index=ds1.index(user_num);
						System.out.println(index);
						ds1.remove(index);
						System.out.println("The list after removing the number");
						ds1.print();
					}
					else{
						System.out.println("Number not found");
						ds1.add(user_num);
						System.out.println("The list after adding the not found element");
						ds1.print();
					}
					break;
			case 2: System.out.println("Writing the modifications into the file..");
					FileWriter fw=new FileWriter("C:\\Users\\Nikita\\Desktop\\HashNumb.csv");
					BufferedWriter bw=new BufferedWriter(fw);
					int leng=ds1.size();
					int[] res_array=new int[leng];
					int[] result=d.sortArray(res_array);
					for(int i=0;i<result.length;i++){
						bw.write(result[i]+", ");
					}
					br.close();
					bw.close();
					break;
			case 3: System.out.println("Invalid choice");
					System.exit(0);
			}
			n++;
		}while(n<5);
		
		br.close();
	}

}
