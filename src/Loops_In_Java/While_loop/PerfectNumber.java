package Loops_In_Java.While_loop;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		int sum = 0;
		int i = 1;
		while (i <= n / 2) {
			if (n % i == 0) {
				sum = sum + i;
			}
			i++;
		}
		if (sum == n)
			System.out.println(n + " is a Perfect Number");
		else
			System.out.println(n + " is NOT a Perfect Number");
	}

}
