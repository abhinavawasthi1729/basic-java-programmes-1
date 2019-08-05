import java.util.Scanner;

public class primenumber
{
	 public static void main(String[] args)
	 {
		 int i;
		 int j=2;
		 int ch=0;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the number");
		 i=sc.nextInt();
		 while(j<=i/2) 
		 {
			 if(i%j==0) 
			 {
				 System.out.println(i+"is not a prime number");
				 ch=1;
				 break;	 
			 }
			 else
			 {
				 j++;
			 }
		 }
		 if(ch==0)
		 {
			 System.out.println("is a prime number");
		 }
	 }
}
