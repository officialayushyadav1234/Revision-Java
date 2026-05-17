package Exception_Handling;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the 1st Number: ");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd Number: ");
		int b = sc.nextInt();
		System.out.println(a + "+" + b + "= " + (a + b));
		System.out.println(a + "-" + b + "= " + (a - b));
		System.out.println(a + "*" + b + "= " + (a * b));

		try {
			System.out.println("try block starts");
			System.out.println(a + "/" + b + "= " + (a / b));
			System.out.println("inside try block");
		} catch (Exception e) {
			System.out.println(a + "/" + b + "= Infinity");
		}
		System.out.println("Thank You!!");
	}
}
