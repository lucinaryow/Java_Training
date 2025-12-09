package OOP_Day4;

public class Truck extends Vehicle implements Refuelable {
	
	public Truck(int numberOfWheels, String brand) {
		super(numberOfWheels,brand);
	}
	
	@Override
	public void refuel() {
		// TODO Auto-generated method stub
		System.out.println("Truck " + getBrand() + " is refueling.");
	}

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("Truck " + getBrand() + " engine has started.");
	}
	
}

