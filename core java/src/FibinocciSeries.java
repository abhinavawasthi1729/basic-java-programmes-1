import java.util.Scanner;

public class FibinocciSeries 
{
	private static int secondnumber;

	public static void main(String args[])
	{
		int firstnumber=0;secondnumber=1;int result = 0;
		int use;
		int count=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter then number");
		use =sc.nextInt();
		 while(true)
		 {
			 for(int user1=0;user1<=10;user1++)
			 {
				 System.out.println("user table");
				 break;
			 }
			 result=firstnumber+secondnumber;
			 count++;
			 if(result >=use)
			 {
				 break;
			 }
			 firstnumber=secondnumber;
			 secondnumber=result;
			 System.out.println("fibinocci series"+result);
			 
		 }
	}
}
