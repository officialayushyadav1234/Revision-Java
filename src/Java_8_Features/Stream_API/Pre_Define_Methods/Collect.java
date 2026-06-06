package Java_8_Features.Stream_API.Pre_Define_Methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collect {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Ayush", "Aman", "Sangam");

		//Collects stream results into a List or Set.
		List<String> result = names.stream()
				                   .filter(name -> name.startsWith("A"))
				                   .collect(Collectors.toList());

		System.out.println(result);
	}
}
