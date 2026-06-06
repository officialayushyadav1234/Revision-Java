package Java_8_Features.Stream_API;

import java.util.Arrays;
import java.util.List;

public class Even_Numbers {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		// find Even Numbers
		numbers.stream()
		       .filter(num -> num % 2 == 0)
		       .forEach(System.out::println);
		

	}
}
