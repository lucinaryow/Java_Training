package OOP_Day2;

public class Main {
    public static void main(String[] args) {
        // --- Instantiate using No-Args Constructor ---
        Car car1 = new Car();
        // Assign values to attributes using setters
        car1.setMake("Toyota");
        car1.setModel("Vios");
        car1.setYear(2018);
        car1.setColor("Silver");
        car1.setMileage(30000);

        // --- Instantiate using Parameterized Constructor ---
        Car car2 = new Car("Honda", "Civic", 2022, "Blue", 12000.0);

        // --- Display info for both cars ---
        car1.displayInfo();
        car2.displayInfo();

        // --- Call method (drive) ---
        car1.drive(15.2);
        car2.drive(42.7);

        // Display info again after driving
        car1.displayInfo();
        car2.displayInfo();
    }
    
}

