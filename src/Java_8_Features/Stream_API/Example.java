package Java_8_Features.Stream_API;

import java.util.Arrays;
import java.util.List;

public class Example {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Aman", "Ayush", "Rahul", "Sangam");

		// Traditional Approach
		for (String name : names) {
			if (name.startsWith("A")) {
				System.out.println(name);
			}
		}

		System.out.println("========================================================");
		
		// Using Stream API
		names.stream()
		     .filter(name -> name.startsWith("A"))
		     .forEach(System.out::println);

	}
}
