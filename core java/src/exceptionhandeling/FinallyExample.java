package exceptionhandeling;

public class FinallyExample 
{
	public static void main(String[] args)
	{  
		try
		{  
		int x=300;
		x=899;
		}
		catch(Exception e)
		{
			System.out.println(e);
			}  
		finally{System.out.println("finally block is executed");}  
		}

}
