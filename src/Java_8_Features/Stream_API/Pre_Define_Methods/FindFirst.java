package Java_8_Features.Stream_API.Pre_Define_Methods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirst {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Ayush", "Aman", "Sangam");

		// Returns the first element.
		Optional<String> first = names.stream()
				                      .findFirst();

		System.out.println(first.get());
	}
}
