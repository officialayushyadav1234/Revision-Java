package Java_8_Features.Stream_API.Pre_Define_Methods;

import java.util.Arrays;
import java.util.List;

public class Filter {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(12, 14, 25, 45, 13, 18, 21);

		// Used to filter data based on a condition.
		numbers.stream()
		       .filter(n -> n > 20)  // all Numbers which is greater than 20 
		       .forEach(System.out::println);
	}
}
