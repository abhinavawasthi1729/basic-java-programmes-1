package exceptionhandeling;

public class Data
{

	public  double foo()
	{
		System.out.println("foo");
		double interst;
		return interst=3.14;
	}
	
	public void bar() 
	{
 		System.out.println("bar");
 	}
	 public static void main(String[] args)
	{

		Data d = new Data();
		d.foo();
		d.bar();
		
}
}
