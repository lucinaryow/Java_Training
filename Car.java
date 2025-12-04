package OOP_Day2;

public class Car {
	// --- Attributes ---
	private String make;
	private String model;
	private String color;
	private int year;
	private double mileage;

	// --- No-Args Constructor ---
	public Car() {
		this.make = "Unknown";
		this.model = "Unknown";
		this.year = 0;
		this.color = "Unpainted";
		this.mileage = 0.0;
	}

	// --- Parameterized Constructor ---
	public Car(String make, String model, int year, String color, double mileage) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
		this.mileage = mileage;
	}

	// --- Method: drive ---
	public void drive(double kilometers) {
		if (kilometers <= 0) {
			System.out.println("Distance must be positive.");
			return;
		}
		this.mileage += kilometers;
		System.out.println(model + " drove " + kilometers + " km. Total mileage: " + mileage + " km.");
	}

	// --- Method: displayInfo ---
	public void displayInfo() {
		System.out.println("Car Info:");
		System.out.println("- Make:   " + make);
		System.out.println("- Model:  " + model);
		System.out.println("- Year:   " + year);
		System.out.println("- Color:  " + color);
		System.out.println("- Mileage:" + mileage + " km");
		System.out.println();
	}

	// --- Getters & Setters (to assign values when using the no-args constructor) ---
	public String getMake() { 
		return make; 
		
	}
	public void setMake(String make) { 
		this.make = make; 
	}

	public String getModel() { 
		return model; 
	}
	
	public void setModel(String model) {
		this.model = model; 
	}

	public int getYear() { 
		return year; 
	}
	
	public void setYear(int year) {
		this.year = year; 
	}

	public String getColor() { 
		return color; 
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	public double getMileage() { 
		return mileage; 
	}
	
	public void setMileage(double mileage) { 
		this.mileage = mileage; 
	}
	
} // End of Class