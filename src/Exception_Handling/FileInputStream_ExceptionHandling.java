package Exception_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStream_ExceptionHandling {

	public static void main(String[] args) throws FileNotFoundException {

		System.out.println("This is program6");

		FileInputStream fis = new FileInputStream("f:\\abc.txt");

		System.out.println("Program Ends");
	}
}
