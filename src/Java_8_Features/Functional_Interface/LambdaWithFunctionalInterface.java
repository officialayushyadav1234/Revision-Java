package Java_8_Features.Functional_Interface;

public interface LambdaWithFunctionalInterface {

	public static void main(String[] args) {

		Program2 c = (a, b) -> a + b; // Lambda Expression

		System.out.println(c.add(10, 20));
	}
}
