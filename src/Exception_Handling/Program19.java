package Exception_Handling;

import java.util.Scanner;

public class Program19 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number: ");
		try {
			int n=sc.nextInt();
			System.out.println("n is: "+n);
		}
		finally{
			System.out.println("This is finally block");
		}
	} 
}
