package Java_8_Features.Optional;

import java.util.Optional;

public class With_Optional {

	public static Optional<String> getName() {

		return Optional.ofNullable(null);
	}

	public static void main(String[] args) {

		String name = getName().orElse("Guest");

		System.out.println(name);
	}
}
