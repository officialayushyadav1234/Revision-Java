package Java_8_Features.DateTime_API;

import java.time.LocalDate;

public class CreatingSpecificDate {

	public static void main(String[] args) {

		LocalDate date = LocalDate.of(2001, 8, 15);
		System.out.println(date);

		// Adding Days
		LocalDate today = LocalDate.now();
		System.out.println(today.plusDays(10));

		// Subtracting days
		System.out.println(LocalDate.now().minusDays(5));
	}
}
