package Java_8_Features.Method_Reference.StaticMethod;

public class Demo {

	public static int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {

		Calculator c = Demo::add;
		System.out.println(c.calculate(10, 15));
	}
}
