package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayToArrayListExample
{
	 public static void main(String[] args) 
	    {   
		 //Using Arrays.asList() Method :
	       // String[] array = new String[] {"ANDROID", "JSP", "JAVA", "STRUTS", "HADOOP", "JSF"};
	       	        //ArrayList<String> list = new ArrayList<String>(Arrays.asList(array));
	         
	      //  System.out.println(list);
		// Using Collections.addAll() Method:
		 //String[] array = new String[] {"saikiran","madhavi","raja","krishna"};
		// ArrayList<String> list = new ArrayList<String>();
         
	        //Collections.addAll(list, array);
	         
	       // System.out.println(list);
		 //Using Streams from Java 8;
	       // String[] array = new String[] {"sai","udumualmadhavi","udumularaja","udumulakrishna"};
			 //ArrayList<String> list = new ArrayList<String>();
	         
		       // Collections.addAll(list, array);
		         
		        //System.out.println(list);
		 //array to arraylist;
		 ArrayList<String> list = new ArrayList<String>();
         
	        list.add("JAVA8");
	        list.add("JSPand structs");
	        list.add("ANDROID developer");
	        list.add("STRUTS 8");
	        list.add("HADOOP and python");
	        list.add("JSF and selineum");
	        String[] array = new String[list.size()];  
	       // list.toArray(array);
	        //for (String string : array)
	        //{
	            //System.out.println(string);
	       // }
	       // Collections.max(list);
	        Collections.reverse(list);
	        System.out.println(list);
	    }   
	 
}
