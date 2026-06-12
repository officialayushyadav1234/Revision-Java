package Polymorphism.CompileTime_OR_Static;

public class CalculatorDriver {

	public static void main(String[] args) {

		Calculator c = new Calculator();

		System.out.println(c.add(10, 20));
		System.out.println(c.add(10, 20, 30));
	}
}

// Achieved using Method Overloading.
// Compiler decides which method to call during compilation.