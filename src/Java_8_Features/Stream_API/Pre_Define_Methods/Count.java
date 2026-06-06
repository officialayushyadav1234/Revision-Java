package Java_8_Features.Stream_API.Pre_Define_Methods;

import java.util.Arrays;
import java.util.List;

public class Count {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Ayush", "Aman", "Sangam");
		
		// Counts the number of elements.
		long count = names.stream()
				          .count();
        System.out.println(count);
	}
}
