package Java_8_Features.Lambda_Expression;

public class Program1 {

	// (parameters) -> expression

	/*
	 
	// Without Lambda Expression
	Runnable r = new Runnable() {
		public void run() {
			System.out.println("Hello");
		}
	};
	
	*/

	// With Lambda Expression
	Runnable r = () -> System.out.println("Hello");
}
