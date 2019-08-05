import java.util.Scanner;

public class evenorodd 
{
	 public static void main(String[] args)
	{
		int t = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		t=sc.nextInt();
		if(t%2==0)
		{
			System.out.println("even number");
		}
		else
		{
			System.out.println("odd number");
		}
	}

}
