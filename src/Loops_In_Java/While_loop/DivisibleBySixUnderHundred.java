package Loops_In_Java.While_loop;

public class DivisibleBySixUnderHundred {

	public static void main(String[] args) {

		System.out.println("Starts Loops =>");
		int i = 1;
		while (i <= 100) {

			if (i % 6 == 0)
				System.out.print(i + " ");
			i++;
		}
		System.out.println("\n Ends Program.");
	}
}
