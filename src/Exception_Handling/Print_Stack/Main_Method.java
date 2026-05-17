package Exception_Handling.Print_Stack;

public class Main_Method {

	public static void main(String[] args) {
		try {

			Test.test();

		} catch (ArithmeticException e) {

			System.out.println(e);
			System.out.println("=======================");
			e.printStackTrace();
			System.out.println("========");

		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Thank You!!");
	}
}
