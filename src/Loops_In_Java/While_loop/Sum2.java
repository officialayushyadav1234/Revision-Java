package Loops_In_Java.While_loop;

public class Sum2 {

	public static void main(String[] args) {

		double sum = 0;
		int i = 1;
		while (i <= 100) {

			sum = sum + (1.0 / (i * i));
			i++;
		}
		System.out.println("Total Sum is :" + sum);
	}
}
