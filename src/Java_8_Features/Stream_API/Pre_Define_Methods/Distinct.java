package Java_8_Features.Stream_API.Pre_Define_Methods;

import java.util.Arrays;
import java.util.List;

public class Distinct {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(10, 20, 20, 30, 30);

		// Removes duplicate elements.
		nums.stream()
		    .distinct()
		    .forEach(System.out::println);
	}
}
