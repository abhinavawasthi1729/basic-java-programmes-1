package exceptionhandeling;

public class TestExceptionPropagation1
{
	void s()
	{
		int data=10;
		for(int s=0;s>=data;s++)
        System.out.println("this is my blog");
	}
	
	void m()
	{  
	    int data=50/0;  
	  }  
	  void n()
	  {  
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
	   TestExceptionPropagation1 obj=new TestExceptionPropagation1();  
	   obj.s();  
	   System.out.println("normal flow...");  
	  }  
}
