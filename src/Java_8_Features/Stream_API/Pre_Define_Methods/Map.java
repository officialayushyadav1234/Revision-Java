package Java_8_Features.Stream_API.Pre_Define_Methods;

import java.util.Arrays;
import java.util.List;

public class Map {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Ayush", "Aman", "Sangam");

		// Used to transform data.
		names.stream()
		     .map(name -> name.toUpperCase())
		     .forEach(System.out::println);
	}
}
