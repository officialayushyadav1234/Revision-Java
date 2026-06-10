package Java_8_Features.DateTime_API;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Program1 {

	public void demo() {

		LocalDate today = LocalDate.now();
		System.out.println(today);

		LocalDate nextWeek = today.plusDays(7);
		System.out.println(nextWeek);

		LocalDateTime todayTime = LocalDateTime.now();
		System.out.println(todayTime);

	}

	public static void main(String[] args) {

		Program1 p = new Program1();
		p.demo();

	}
}
