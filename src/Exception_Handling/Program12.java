package Exception_Handling;

import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("try block starts");
			System.out.println(10 / 0);
			System.out.println("inside try block");
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			try {
				System.out.println(10 / 0);
			} catch (Exception e1) {
				System.out.println("From inside catch: " + e1.getMessage());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Program is terminatted Normally Thank You!!");
	}
}
