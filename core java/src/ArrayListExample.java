import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListExample 
{
	public static void main(String args[])
	{
	ArrayList<String> arraylist=new ArrayList<String> ();
	LinkedList<String> linkedlist=new LinkedList<String>();
			{
				arraylist.add("sai");
			    arraylist.add("kiran");
			    linkedlist.add("blue");
			    linkedlist.add("green");
			    linkedlist.add("white");
			    
				System.out.println("\n Arraylist:");
				System.out.println(arraylist);
				arraylist.add(2,"venkata");
				System.out.println("arraylist after the adding the new item[venkata at position 2]:");
				System.out.println(arraylist);
				
				
				System.out.println(linkedlist);
				linkedlist.addLast("ysr");
				linkedlist.addFirst("reddys");
				System.out.println("linkedlist after the adding the new item");
				System.out.println(linkedlist);
				
				
			}
	}
}
		

