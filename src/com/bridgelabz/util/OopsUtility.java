/*******************************************************************************
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   9.1.2018															*
 *  **************************************************************************/
package com.bridgelabz.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.CollectionType;
import org.codehaus.jackson.type.TypeReference;

public class OopsUtility {
	/**
	 * static object is created for Scanner class to avoid multiple object creations
	 * of the same class.
	 */

	static Scanner scanner = new Scanner(System.in);

	static ObjectMapper objectMapper=new ObjectMapper();
	/**
	 * static function to read integers input from the user
	 *
	 * @return integer values that are read
	 */

	public static int userInteger() {

		return scanner.nextInt();

	}

	/**
	 * static function to read double input from the user
	 *
	 * @return double values that are read
	 */
	public static double userDouble() {

		return scanner.nextDouble();

	}

	/**
	 * static function to read boolean input from the user
	 *
	 * @return boolean values that are read
	 */
	public static boolean userBoolean() {

		return scanner.nextBoolean();

	}

	/**
	 * static function to read string input from the user
	 *
	 * @return strings that are read
	 */
	public static String userString() {
		return scanner.next();

	}

	/**
	 * static function to read float input from the user
	 *
	 * @return float values that are read
	 */
	public static float userFloat() {

		return scanner.nextFloat();

	}

	/**
	 * static function to read long input from the user
	 *
	 * @return long values that are read
	 */
	public static long userLong() {

		return scanner.nextLong();

	}
	public static <T> List<T> userReadValue(String str, Class<?> clazz) throws JsonParseException, JsonMappingException, IOException{
		CollectionType colletion = objectMapper.getTypeFactory().constructCollectionType(ArrayList.class, clazz);
		return objectMapper.readValue(str, colletion);
	}
	
	public static <T> String userWriteValueAsString(List<T> list) throws JsonGenerationException, JsonMappingException, IOException{
		return objectMapper.writeValueAsString(list);
	}
	

	// replace string
	public static String replaceString(String first, String fullName, String phoneNum, String date, String line) {
		 String REGEX_NAME1 = "<{2}+\\w+>{2}";
		String REGEX_NAME2 = "<{2}+\\w+ +\\w+>{2}";
		 String REGEX_NAME3 = "x{10}";

		final String REGEX_NAME4 = "<{2}\\d{2}+/+\\d{2}+/\\d{4}+>{2}";
		Pattern p1 = Pattern.compile(REGEX_NAME1);
		Matcher m1 = p1.matcher(line);
		line = m1.replaceAll(first);

		Pattern p2 = Pattern.compile(REGEX_NAME2);
		Matcher m2 = p2.matcher(line);
		line = m2.replaceAll(fullName);

		Pattern p3 = Pattern.compile(REGEX_NAME3);
		Matcher m3 = p3.matcher(line);
		line = m3.replaceAll(phoneNum);

		Pattern p4 = Pattern.compile(REGEX_NAME4);
		Matcher m4 = p4.matcher(line);
		line = m4.replaceAll(date);
		return line;
	}


	// reads a file
	public static String readFile(String str) throws FileNotFoundException {
		FileReader f = new FileReader(str);
		@SuppressWarnings("resource")
		BufferedReader read = new BufferedReader(f);
		String line = "";
		try {
			String word = "";
			while ((word = read.readLine()) != null) {
				line = word;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return line;

	}

	//display function
	public static void display(List<InventoryList> list2) {
		for (int i = 0; i < list2.size(); i++) {
			InventoryList it = list2.get(i);
			System.out.println("Inventory name :" + it.getInventoryName());
			for (int j = 0; j < it.getListOfInventories().size(); j++) {
				System.out.println("name :" + it.getListOfInventories().get(j).getName());
				System.out.println("price :" + it.getListOfInventories().get(j).getPrice());
				System.out.println("weight :" + it.getListOfInventories().get(j).getWeight());
				System.out.println();
			}
			System.out.println("---------------------------------------------");
		}

	}

	public static InventoryList insertInventoryList(String inventoryName, List<Inventory> listOfInventories) {
		InventoryList inventoryList = new InventoryList();
		inventoryList.setInventoryName(inventoryName);
		inventoryList.setListOfInventories(listOfInventories);
		return inventoryList;
	}

	public static Inventory insertInventoryDetail() {
		Inventory inventory = new Inventory();
		System.out.println("Enter name of inventory");
		inventory.setName(OopsUtility.userString());
		System.out.println("Enter weight of inventory");
		inventory.setWeight(OopsUtility.userFloat());
		System.out.println("Enter price of inventory");
		inventory.setPrice(OopsUtility.userDouble());
		return inventory;
	}

	static List<Inventory> liInventories = new ArrayList<Inventory>();

	public static List<Inventory> insertInventory(String name, float weight, double price) {
		Inventory inventory = new Inventory();
		inventory.setName(name);
		inventory.setWeight(weight);
		inventory.setPrice(price);
		liInventories.add(inventory);
		return liInventories;
	}

	public static void write(String json) throws IOException {
		FileWriter fw = new FileWriter("/home/admin1/Desktop/Inventory.json");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(json);
		bw.flush();
	}

	public static void price(List<InventoryList> list2)
	{

		for (int i = 0; i < list2.size(); i++) {
			InventoryList it = list2.get(i);
			System.out.println("Inventory name :" + it.getInventoryName());
			for (int j = 0; j < it.getListOfInventories().size(); j++) {
				System.out.println("name :" + it.getListOfInventories().get(j).getName());
				double sum=it.getListOfInventories().get(j).getPrice()*it.getListOfInventories().get(j).getWeight();
				System.out.println("total price to be given is :"+sum);
			}
			System.out.println("---------------------------------------------");
		}
	}



	public static String readFile1(String str) throws IOException {
		FileReader f = new FileReader(str);
		BufferedReader read = new BufferedReader(f);
		String line = "";
		String word = "";
		while ((word = read.readLine()) != null) {
			line = word;
		}
		return line;

	}

	public static void write11(String json, String file) throws IOException {
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(json);
		bw.flush();
	}

	 public static QueueLinkedList<QueueLinkedList<String>> deckQueueStore(String[] deck )
	    {
	        QueueLinkedList<QueueLinkedList<String>> mainQueue = new QueueLinkedList<QueueLinkedList<String>>();
	        QueueLinkedList<String> queueLinkedList = new QueueLinkedList<String>();
	        System.out.println("Total numver of deck of cards are " + deck.length);
	        //storing those cards of particular person in an array
	        for (int i = 0; i < 4; i++) {
	            String[] demo = new String[9];
	            for (int j = 0; j < 9; j++) {
	                demo[j] = deck[i + j * 4];
	            }
	            //sorting demo array and storing in str2
	            String[] str2 = sortArray(demo);
	            for (int k = 0; k < str2.length; k++) {
	                queueLinkedList.enqueue(str2[k]);//inserting it to one queue
	            }
	            mainQueue.enqueue(queueLinkedList);//inserting to the main queue
	            queueLinkedList = new QueueLinkedList<String>();//takes the cards of the particular person corresponding to the indices
	            continue;
	        }
	        return mainQueue;
	    }
	    public static void displayDeck(QueueLinkedList<QueueLinkedList<String>> mainQueue)
	    {
	        for (int i = 0; i < mainQueue.size(); i++) {
	            QueueLinkedList<String> queue2 = mainQueue.dequeue();
	            System.out.println("---------------------------------------- Person " + (i + 1)
	                    + " -------------------------------------------");
	            for (int j = 0; j < queue2.size(); j++) {
	                System.out.print(queue2.dequeue() + " ");
	            }
	            System.out.println();
	        }
	    }
	    //Sorting function(insertion)
	    public static <T extends Comparable<T>> T[] sortArray(T str[]) {
	        int length = str.length;
	        for (int i = 1; i < length; i++) {
	            T key = str[i];
	            int j = i - 1;
	            while (j >= 0 && ((str[j].compareTo(key) > 0))) {
	                str[j + 1] = str[j];
	                j--;
	            }
	            str[j + 1] = key;
	        }
	        return str;
	    }

	
	











}
