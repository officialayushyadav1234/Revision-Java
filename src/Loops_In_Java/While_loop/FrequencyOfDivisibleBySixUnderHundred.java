package Loops_In_Java.While_loop;

public class FrequencyOfDivisibleBySixUnderHundred {

	public static void main(String[] args) {

		int i = 1;
		int count = 0;
		while (i <= 100) {

			if (i % 6 == 0)
				count++;
			i++;
		}
		System.out.println("Count is : " + count);
	}
}
