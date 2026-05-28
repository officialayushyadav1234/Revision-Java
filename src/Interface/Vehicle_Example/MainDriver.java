package Interface.Vehicle_Example;

public class MainDriver {

	public static void main(String[] args) {

		Vehicle v1 = new ElectricCar();
		v1.start();
		v1.stop();

		System.out.println("==============");

		Car c1 = new ElectricCar();
		c1.start();
		c1.stop();
		c1.openGate();
	}
}
