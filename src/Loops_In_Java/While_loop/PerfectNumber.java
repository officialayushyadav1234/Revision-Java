package Loops_In_Java.While_loop;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();

// Perfect Numbers :	a positive integer that equals the exact sum of its proper divisors.
// (all of its positive divisors excluding the number itself). 
// The first two perfect numbers are 6 (since (1+2+3=6)) and 28 (since (1+2+4+7+14=28).

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
