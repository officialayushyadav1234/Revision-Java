package Loops_In_Java.While_loop;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();

// Prime Number : greater than 1, that is divisible only by 1, and itself.
// (2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97)

		int i = 1;
		int count = 0;
		while (i <= n / 2) {
			if (n % i == 0) {
				count++;
			}
			i++;
		}
		if (count == 1)
			System.out.println("It is Prime Number ! ");
		else
			System.out.println("It is Not Prime Number !! ");
	}
}
