/*******************************************************************************
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   3.1.2018															*
 *  **************************************************************************/
package com.bridgelabz.util;

//Linked List creation
public class LinkedList<T> {

    Node<T> first;
    private Node<T> last;

    public void add(T element) 
    {

        Node<T> nd = new Node<T>();
        nd.setValue(element);
        if (first == null)
        {
            first = nd;
            last = nd;
        } 
        else
        {
            last.setNextRef(nd);
            last = nd;
        }
    }
    
    
    
//traverses the list and prints the Length of List including the node values
    public int print() {

        Node<T> tmp = first;
        int i = 0;
        while (true) {
            if (tmp == null)//end reached
            {
                break;
            }
            if(tmp.getValue()!=null)//traverses till null not found
            {
            System.out.println(tmp.getValue());//prints node value
            i++;
            }
            tmp = tmp.getNextRef();//node incremented so that next node is traversed till the loop ends
        }
        return i;
    }

    
    
    
   //Searching of a word (UnOrdered List)
    /**
     * @param length is the length of the list
     * @param key is the value to be searched
     * @param li is the list of strings contained in the file
     * @returns boolean value
     */
    public boolean printValue(int length, String key, LinkedList<String> li) {
        Node<T> nd2 = first;
        while (true) {
            if (nd2 == null)//end reached
            {
                break;
            }
            if (key.compareToIgnoreCase(String.valueOf(nd2.getValue())) == 0) {
                nd2.setValue(null);//sets the value of the node as null
                return true;
            }
            nd2 = nd2.getNextRef();//node incremented so that next node is traversed till the loop ends
        }
        li.add(key);//adds the key to the list if not found in file
        li.print();
        return false;
    }
    
    
    
    
  //for sorting the array elements
  	/**
  	 * @param arr is an integer array
  	 * @return the array in sorted order
  	 */
    public int[] sort(int [] arr)
    {
    	int length=arr.length;
    	for(int i=1;i<length;i++)
    	{
    		int key=arr[i];
    		int j=i-1;
    		while(j>=0 && arr[j]>key)
    		{
    			arr[j+1]=arr[j];
    			j--;
    		}
    		arr[j+1]=key;
    	}
    	return arr;
    }
    
    
   //gives the size of the list 
    public int size() {

        Node<T> tmp = first;
        int i = 0;
        while (true) {
            if (tmp == null) {
                break;
            }
            if(tmp.getValue()!=null)
            {
           
            i++;
            }
            tmp = tmp.getNextRef();
        }
        return i;
    }
    
    
    
    
  
    
    
    //Searching of a number (Ordered List) 
    /**
     * @param length is the length of the list
     * @param key is the value to be searched
     * @param li is the list of Integers contained in the file
     * @returns boolean value
     */
    public boolean findIntegerValue(int length, int key, LinkedList<Integer> li) {
        Node<T> nd2 = first;
        while (true) {
            if (nd2 == null)//end reached
            {
                break;
            }

            if(key==Integer.valueOf(String.valueOf(nd2.getValue())))
            {
                nd2.setValue(null);
                return true;
            }
            nd2 = nd2.getNextRef();
        }
        li.add(key);
        li.print();
        return false;
    }

    
    
    
    
    //returns a list of string as an array of strings
    /**
     * @param li is the list containing strings
     * @param len is the length of the list
     * @returns the list elements as a string array
     */
    public String [] convString(LinkedList<String> li,int len)
    {
        Node nd2 = li.first;
        String [] str=new String[len];
        int i=0;
        while (true) {
            if (nd2 == null) {
                break;
            }
            if(nd2.getValue()!=null)
            {
                str[i]=(String) nd2.getValue();
                i++;
            }
            nd2 = nd2.getNextRef();
        }
        return str;
    }


    
    
    //returns a list of Integers as array of Integers
    /**
     * @param li is the list containing Integers
     * @param len is the length of the list
     * @returns the list elements as a Integers array
     */

public  int[] convInteger(LinkedList<Integer> li,int len)
{
    Node nd2 = li.first;
    int [] str=new int[len];
    int i=0;
    while (true) {
        if (nd2 == null) //end reached
        {
            break;
        }
        if(nd2.getValue()!=null)
        {
            str[i]=(int)nd2.getValue();
            i++;
        }
        nd2 = nd2.getNextRef();
    }
    return str;
}


//searching method(used in hashing question)
public boolean search(T data){
	   Node<T> temp=first;
	   while(temp.getNextRef()!=null)
	   {
		   if( data.equals(temp.getValue()))
		   {
			   return true;
		   }
		   temp=temp.getNextRef();
	   }
	   return false;
	}


//returns the index(used in hashing question)
public int index(T data){
	Node<T> curr=first;
	int count=0;
	while(curr!=null){
		if(curr.getValue().equals(data)){
			curr.getNextRef();
			return count;
		}
		count++;
		curr=curr.getNextRef();
	}
	assert(false);
	return 0;
}



//to remove elements(used in hashing question)
/**
 * @param index is the index of the element
 */
public void remove(int index)
{
	if(isEmpty())
		return;
	
	Node<T> temp=first;
	if(index==0)
	{
		first=temp.getNextRef();
		return;
	}
	for(int i=0;temp!=null && i<index-1;i++){
		temp=temp.getNextRef();
	}
	if (temp == null || temp.getNextRef() == null) 
     return; 
	
    Node<T> next = temp.getNextRef().getNextRef(); 
  
       next= temp.getNextRef();
}



//checks if list is empty
public boolean isEmpty()
{
	return first==null;
}






}



//Node creation and operations involved
class Node<T>  {

    private T value;
    private Node<T> nextRef;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNextRef() {
        return nextRef;
    }

    public void setNextRef(Node<T> ref) {
        this.nextRef = ref;
    }
    
    
    
    
    
    
    
    
    
    } 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

