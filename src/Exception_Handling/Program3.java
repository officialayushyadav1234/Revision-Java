package Exception_Handling;

public class Program3 {

	public static void main(String[] args) {

		String s1 = "mohan";
		System.out.println(s1.charAt(1));
		System.out.println(s1.charAt(2));
		System.out.println(s1.charAt(3));

		try {
			System.out.println(s1.charAt(6));
		} catch (Exception e) {
			System.out.println("Given Index doesn't exist");
		}

		System.out.println(10 + 20);
		System.out.println(34 + 65 * 2);
		System.out.println("Thank You");

	}
}
