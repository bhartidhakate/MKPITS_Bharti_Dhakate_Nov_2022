/*WAP that accept an employee id, total worked hours of an month and amount he received per hour.
Print the employee id and salary (two decimal spaces) of a particular month.*/
import java.util.Scanner;
public class Employee
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employee ID :");
		int id=sc.nextInt();
		System.out.println("Enter the total worked hours of month :");
		float hours=sc.nextFloat();
		System.out.println("Enter the amount received per hour :");
		float amt=sc.nextFloat();

		float salary=hours*amt;
		System.out.format("Employee ID :"+id+" \nSalary of particular month is %.2f \n",salary);                  /*System.out.format*/
	}
}
