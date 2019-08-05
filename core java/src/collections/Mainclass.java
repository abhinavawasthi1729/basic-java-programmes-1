package collections;

import java.util.ArrayList;
import java.util.List;

public class Mainclass 
{
	 public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
 
        //Now 'list' can hold 10 elements (Default Initial Capacity)
 
        list.ensureCapacity(23);
 
        //Now 'list' can hold 20 elements.
        list.add("ONE");
        
        list.add("TWO");
 
        list.add("THREE");
        list.add("23");
        list.add("JSP");
        
        list.add("JAVA");
 
        list.add("SERVLETS");
 
        list.add("java");
 
        list.add("STRUTS");
        list.add("FOUR");
        list.add(1,"sakikiran");

       // System.out.println(list);  
        //System.out.println("Size Of ArrayList = "+list.size());
        //reducing the current capacity to current size of an ArrayList.
        
        list.trimToSize();
        
        //ArrayList<Float> list1 = new ArrayList<Float>();
        
        //System.out.println(list1.isEmpty());

        //System.out.println(list.contains(111.1111)); 

        //System.out.println(list.indexOf("JSP"));     //Output : 0
 
        //Getting the index of last occurrence of "JAVA"
 
        //System.out.println(list.lastIndexOf("STRUTS")); 
        
        
        	//System.out.println(list.get(3));
        	//list.remove(4);
        	//list.remove("java");
       
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        
        list2.add(555);
         
        list2.add(666);
         
        list2.add(777);
         
        list2.add(888);
 
 ArrayList<Integer> list3 = new ArrayList<Integer>();
        
        list3.add(55);
         
        list3.add(66);
         
        list3.add(77);
         
        list3.add(88);
        //System.out.println(list3); 
        list3.addAll(2, list2);
        
        System.out.println(list3); 
    }
}
