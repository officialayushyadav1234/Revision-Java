package Java_8_Features.Lambda_Expression;

public class AdditionDriver {

	public static void main(String[] args) {

		// Example with parameter

		Addition obj = (a, b) -> a + b;

		System.out.println(obj.add(10, 14));
	}
}
