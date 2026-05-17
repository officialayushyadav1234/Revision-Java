package Exception_Handling;

public class Program4 {

	public static void main(String[] args) {

		System.out.println("This is program8");
		test();
	}

	public static void test() {

		System.out.println("This is test method");
		test();
	}
}
