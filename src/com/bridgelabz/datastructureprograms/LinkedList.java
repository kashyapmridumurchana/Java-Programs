package com.bridgelabz.datastructureprograms;


public class LinkedList<T> {

    private Node<T> first;
    private Node<T> last;

    public void add(T element) {

        Node<T> nd = new Node<T>();
        nd.setValue(element);
        if (first == null) {
            first = nd;
            last = nd;
        } else {
            last.setNextRef(nd);
            last = nd;
        }
    }

    public int print() {

        Node<T> tmp = first;
        int i = 0;
        while (true) {
            if (tmp == null) {
                break;
            }
            if(tmp.getValue()!=null)
            {
            System.out.println(tmp.getValue());
            i++;
            }
            tmp = tmp.getNextRef();
        }
        return i;
    }

    
    
    
    
    public boolean printValue(int length, String key, LinkedList<String> li) {
        Node<T> nd2 = first;
        while (true) {
            if (nd2 == null) {
                break;
            }
            if (key.compareToIgnoreCase(String.valueOf(nd2.getValue())) == 0) {
                nd2.setValue(null);
                return true;
            }
            nd2 = nd2.getNextRef();
        }
        li.add(key);
        li.print();
        return false;
    }
    
    
    
    
    //ordered list
    public boolean printValue1(int length, int key, LinkedList<Integer> li) {
        Node<T> nd2 = first;
        while (true) {
            if (nd2 == null) {
                break;
            }
            if (Integer.toString(key).compareToIgnoreCase(String.valueOf(nd2.getValue())) == 0) {
                nd2.setValue(null);
                return true;
            }
            nd2 = nd2.getNextRef();
        }
        li.add(key);
        li.print();
        return false;
    }
   
    
    
    
    public void sort(LinkedList<Integer> li) {

        Node<T> tmp = first;
        while (true) {
            if (tmp == null) {
                break;
            }
            if(tmp.getValue()!=null)
            {
            System.out.println(tmp.getValue());
            }
            tmp = tmp.getNextRef();
        }
    }
   
    public boolean findIntegerValue(int length, int key, LinkedList<Integer> li) {
        Node<T> nd2 = first;
        while (true) {
            if (nd2 == null) {
                break;
            }
//            if (String.valueOf(key).compareToIgnoreCase(String.valueOf(nd2.getValue())) == 0)
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




public String [] convString1(LinkedList<Integer> li,int len)
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
}




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