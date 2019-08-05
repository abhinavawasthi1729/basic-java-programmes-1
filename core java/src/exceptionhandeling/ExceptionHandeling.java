package exceptionhandeling;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandeling
{

	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
		try
		{
			System.out.println("this is my blog");
			testException(-9);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Releasing resources");			
		}
		testException(1);
	}
	
	private static void testException(int i) throws FileNotFoundException, IOException
	{
		if(i > 56)
		{
			FileNotFoundException myException = new FileNotFoundException("positive integer "+i);
			throw myException;
		}
		else if(i< 10)
		{
			throw new IOException("Only supported for index 0 to 10");
		}

	}

}


