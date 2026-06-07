package Java_8_Features.Optional;

public class Without_Optional {

	public static String getName() {

		return null; // Simulating a null value
	}

	public static void main(String[] args) {

		String name = getName();

		if (name != null) {
			System.out.println(name);
		} else {
			System.out.println("Name is null");
		}
	}
}
