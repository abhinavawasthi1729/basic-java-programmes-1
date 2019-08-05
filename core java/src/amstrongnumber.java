import java.util.Scanner;

public class amstrongnumber 
{
	public static void main(String args[])
	{
		int num;
		int temp;
		int sum=0;
		int i=1;
		int n=0;
		
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		sum=0;
		i=num;
		while(num>0)
		{
			num=num%10;
			num=num/10;
			sum=sum+(n*n*n);
		}
		if(sum==i)
		{
			System.out.println("i+Amstromg number");
		}
		else
		{
			System.out.println("i+not an amstrong number");
		}
	}

}
