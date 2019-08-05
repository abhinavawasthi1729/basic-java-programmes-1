import java.util.Scanner;

public class Additionwithoutaddoperator
{
	public static void main(String args[])
	{
		int num1;
		int num2;
		//int num3;
		//int add;
		//int sub;
		//int mul;
		int div;
		int q = 1;
		int mod;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ente the  numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		//num3=sc.nextInt();
		
		//add = num1-(-num2);
		//sub=num1-(+num2);
		//mul=num1*num2;
		div=num1/num2;
		mod=num1-num2*q;
		
		
		//System.out.println("addition is"+add);
		//System.out.println("subtraction is "+sub);
		//System.out.println("multiplication is"+mul);
		System.out.println("division is"+div);
		
	}

}
