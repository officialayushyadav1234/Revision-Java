package Java_8_Features.Lambda_Expression;

public class Driver2 {

	public static void main(String[] args) {

		// With Lambda Expression

		Greeting g = () -> System.out.println("Hello Java \nWith Lambda Expression !!");
		g.sayWord();
	}
}
