package Java_8_Features.Lambda_Expression;

public class Driver1 {

	public static void main(String[] args) {

		// Without Lambda Expression
		Greeting g = new Greeting() {

			@Override
			public void sayWord() {

				System.out.println("Hello java ! \nWithout Lambda Expression !");
			}
		};
		g.sayWord();

	}
}
