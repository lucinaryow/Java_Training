package OOP_Day4;


public class Seatwork6 {


    public static void main(String[] args) {
        Car car = new Car(4,"Toyota");
        Truck truck = new Truck(8,"Optimus Prime");

        // Inherited getters from Vehicle
        System.out.println("Car brand: " + car.getBrand());
        System.out.println("Car wheels: " + car.getNumberOfWheels());

        System.out.println("Truck brand: " + truck.getBrand());
        System.out.println("Truck wheels: " + truck.getNumberOfWheels());

        // Implemented/abstract methods
        car.startEngine();
        car.refuel();

        truck.startEngine();
        truck.refuel();

        // Destroy via helper method
        destroyVehicle(car);
        destroyVehicle(truck);
    }
    
    // Takes ONE parameter (either a Car or Truck since both are Vehicles)
    public static void destroyVehicle(Vehicle vehicle) {
    	vehicle.destroy();
    }
}

