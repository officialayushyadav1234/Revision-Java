package Polymorphism.RunTime_OR_Dynamic;

public class AnimalDriver {

	public static void main(String[] args) {

		Animal a = new Dog();

		a.sound();
	}
}

// Achieved using Method Overriding.
// Method is decided at runtime based on the actual object (
