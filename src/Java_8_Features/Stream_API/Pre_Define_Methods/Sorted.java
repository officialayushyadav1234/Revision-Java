package Java_8_Features.Stream_API.Pre_Define_Methods;

import java.util.Arrays;
import java.util.List;

public class Sorted {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(50, 10, 30, 20);

		// Used to sort data.
		nums.stream()
		    .sorted()
		    .forEach(System.out::println);
	}
}
