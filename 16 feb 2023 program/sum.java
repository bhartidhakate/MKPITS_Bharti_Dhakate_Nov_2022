/*WAP that accept two integers from users and calculate the sum of two integers*/
import java.util.Scanner;
public class sum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the two integers :");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int sum=x+y;
		System.out.println("Sum : "+sum);
	}
}