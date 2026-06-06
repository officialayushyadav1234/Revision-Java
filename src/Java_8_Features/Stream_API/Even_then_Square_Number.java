package Java_8_Features.Stream_API;

import java.util.Arrays;
import java.util.List;

public class Even_then_Square_Number {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		// First find Even then Square numbers
		numbers.stream()
		       .filter(num -> num % 2 == 0)
		       .map(num -> num * num)
		       .forEach(System.out::println);
	}
}
