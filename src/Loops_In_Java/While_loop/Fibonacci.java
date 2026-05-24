package Loops_In_Java.While_loop;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();

//	Fibonacci sequence is an infinite series of numbers where each number is the sum of the two preceding ones, typically starting with 0 and 1.
//	The First 15 Fibonacci Numbers :
//	Following the rule of adding the last two numbers ((0 + 1 = 1), (1 + 1 = 2), (1 + 2 =3) etc.), 
//	the sequence progresses as follows:0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377
		int n1 = 0;
		int n2 = 1;
		System.out.print(n1 + "  " + n2 + "  ");
		int i = 1;

		while (i <= n - 2) {
			int n3 = n1 + n2;
			System.out.print(n3 + "  ");
			n1 = n2;
			n2 = n3;
			i++;
		}
	}
}
