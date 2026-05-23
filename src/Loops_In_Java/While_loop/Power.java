package Loops_In_Java.While_loop;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Number : ");
		int a = sc.nextInt();
		System.out.println("Enter the Second Number : ");
		int b = sc.nextInt();

		int i = 1;
		int pow = 1;
		while (i <= b) {
			pow = pow * a;
			i++;
		}
		System.out.println(a + " to power " + b + " is : " + pow);
	}
}
