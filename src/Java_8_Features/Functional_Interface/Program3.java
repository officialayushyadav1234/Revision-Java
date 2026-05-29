package Java_8_Features.Functional_Interface;

@FunctionalInterface
public interface Program3 {

	void method1(); // One abstract method

	// Multiple default method
	default void add1() {

	}

	default void add2() {

	}

	// Multiple Static method
	static void method() {

	}
}
