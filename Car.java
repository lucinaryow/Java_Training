package OOP_Day4;

public class Car extends Vehicle implements Refuelable {
	
	public Car(int numberOfWheels, String brand) {
		super(4,brand);
	}
	
	@Override
	public void refuel() {
		// TODO Auto-generated method stub
		System.out.println("Car " + getBrand() + " is refueling.");
	}

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("Car " + getBrand() + " engine has started.");
	}
	
}
