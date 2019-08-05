package exceptionhandeling;

public class Temp 
{

	public static void main(String[] args)
	{

		
		Temp t = initT();
		
		t.foo("Hi");
		
	}

	private static Temp initT() {
		return null;
	}

	public void foo(String s) {
		System.out.println(s.toLowerCase());
	}
}
