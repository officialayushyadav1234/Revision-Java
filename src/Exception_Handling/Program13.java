package Exception_Handling;

import java.util.Scanner;

public class Program13 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] a={12, 4, 0, 30, 80};
		System.out.println("Enter the 1st index: ");
		int p=sc.nextInt();
		System.out.println("Enter the 2nd index: ");
		int q=sc.nextInt();
		try{
			System.out.println("try block starts");
			System.out.println(a[p]/a[q]);
			System.out.println("inside try block");
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
			System.out.println(10/0);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("Thank You!! Program Ends!!");
		}
	} 
}
