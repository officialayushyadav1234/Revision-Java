package Exception_Handling;

import java.util.Scanner;

public class Program15 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number: ");
		try {
			int n=sc.nextInt();
			System.out.println("n is: "+n);
			System.exit(1);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("Input is not Valid!!");
		}
		finally {
			System.out.println("Finally block! Program ends!!");
			sc.close();
		}
	} 
}
