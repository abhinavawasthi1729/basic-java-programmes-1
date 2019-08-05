package exceptionhandeling;

import java.io.IOException;

public class TestExceptionPropagation2 
{
	
void m()throws IOException
{
    throw new IOException("device error");//checked exception
  }
  void n()throws IOException{
    m();
  }
  void p()
  {
   try
   {  
    n();
   }
   catch(Exception e)
   {
	   System.out.println("exception handled");
	   }
  }
  public static void main(String args[])
		  {
   TestExceptionPropagation2 obj=new TestExceptionPropagation2();
   obj.p();
   System.out.println("normal flow...");
  }
}
