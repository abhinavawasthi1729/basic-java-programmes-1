package exceptionhandeling;

public class Temp1
{
public static String mutex = null;
	
	public static void main(String[] args)
	{
		//synchronized(mutex)
		{
			System.out.println("synchronized block and holy");
		}//
		if(mutex ==null) mutex =""; //preventive coding
		
		synchronized(mutex) 
		{
			System.out.println("synchronized block");
		}
		
	}

	
}
