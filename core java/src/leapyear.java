import java.util.Scanner;

public class leapyear
{
	public static void main(String args[])
	{
		int year;
		
		Scanner sc=new Scanner(System.in);
		year=sc.nextInt();
		System.out.println("enter the year");
	
	{
		if(year % 100 ==0)
		{
			System.out.println("leap year");
		}
		
		else if(year %400==0)
		{
			System.out.println("not a leap year");
		}
		else if(year%4==0);
		{
			System.out.println("is a leap year");
		}
	
		{
			System.out.println("is a  notleap year");
		}
	
	}
	}
}
	
