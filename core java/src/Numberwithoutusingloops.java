import java.util.Scanner;

public class Numberwithoutusingloops
{
	static int count=1;
	static void printNumbers(int n)
	{
		System.out.println(count);
		count++;
		
		if(count==n-1)
			return;
		printNumbers(n);
	}
	   public static void main(String[] args)
	{
		int num = 0;
		Scanner sc=new Scanner(System.in);

		System.out.print("ente the number");

		
		printNumbers(num);

			
		
	}

}
