/* Write a program to compute the sum of the two given integers.
If the sum is in the range 10..20 inclusive return 30. */
import java.util.Scanner;
class assignment_23_1
{
	static int sum1(int x,int y)
	{
		int a=x;
		int b=y;
		int sum=a+b;
		if(sum<=20 && sum>=10)
		{
			return 30;
		}
		else
		{
			return sum;
		}
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		sum30 ob=new sum30();
		int sum=ob.sum1(a,b);
		System.out.println("Sum of two numbers : "+sum);
	}
}




