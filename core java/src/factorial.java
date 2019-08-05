import java.util.Scanner;

public class factorial 
{
	 public static void main(String[] args)
	{
		int n = 1,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number:");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.print("factorial of "+n+"is"+fact);
	}

}
