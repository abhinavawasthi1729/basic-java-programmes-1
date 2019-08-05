package collections;

import java.util.ArrayList;
import java.util.HashSet;

public class MainClass2
{
	public static void main(String[] args)
    {
        //Constructing An ArrayList
        ArrayList<String> listWithDuplicateElements = new ArrayList<String>();
        listWithDuplicateElements.add("JAVA");
        listWithDuplicateElements.add("J2EE");
        listWithDuplicateElements.add("JSP");
        listWithDuplicateElements.add("SERVLETS");
        listWithDuplicateElements.add("JAVA");
        listWithDuplicateElements.add("STRUTS");
        listWithDuplicateElements.add("JSP");
     
        //Printing listWithDuplicateElements
        System.out.print("ArrayList With Duplicate Elements :");
        System.out.println(listWithDuplicateElements);
        //Constructing HashSet using listWithDuplicateElements
        HashSet<String> set = new HashSet<String>(listWithDuplicateElements);
        //Constructing listWithoutDuplicateElements using set
        ArrayList<String> listWithoutDuplicateElements = new ArrayList<String>(set);
        listWithDuplicateElements.add("saikiran");
        System.out.println(listWithoutDuplicateElements);
        //Printing listWithoutDuplicateElements
        System.out.println(listWithoutDuplicateElements);
    }
}
