package Java_8_Features.Method_Reference.ToCanstructor;

public class Demo {

	Demo() {
		System.out.println("Constructor Called !!");
	}

	public static void main(String[] args) {

		Message msg = Demo::new;
		msg.getMessage();
	}
}
