package Abstract_Class;

public class Driver {

	public static void main(String[] args) {

		Vehicle v1 = new ElectricCar();
		v1.start();
		v1.stop();
		v1.drive();

	}
}

/*
 * static block Non static block Start the electric Car Stop the electric Car
 * Drive vehicle
 * 
 * 
 */