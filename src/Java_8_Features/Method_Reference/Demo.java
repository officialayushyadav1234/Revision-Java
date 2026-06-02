package Java_8_Features.Method_Reference;

import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Ayush", "Rahul", "Aman");

		// Without Method Reference ( Lambda Expression )
		names.forEach(name -> System.out.println(name));

		System.out.println("=====================================================");

		// With Method Reference ( Lambda Expression )
		names.forEach(System.out::println);
	}
}
/*
 * Explanation System.out, is an object of PrintStream. 
 * println() is an existing method.
 * Instead of writing: System.out::println ;
 * 
 */
