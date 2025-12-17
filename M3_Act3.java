package Module3_Day1;


import java.util.*;

public class M3_Act3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a Map with 5 initial products
        Map<String, Integer> products = new HashMap<>();
        products.put("Laptop", 5000);
        products.put("Monitor", 7000);
        products.put("Mouse", 500);
        products.put("Keyboard", 1000);
        products.put("Printer", 6000);

        int choice;
        do {
            // Display menu repeatedly
            System.out.println("\nSelect an option:");
            System.out.println("1. Search a product");
            System.out.println("2. Add a product");
            System.out.println("3. Print all products and prices");
            System.out.println("4. Find the cheapest product");
            System.out.println("5. Exit");
            System.out.print("> ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    // Search a product
                    System.out.print("Enter product name to search: ");
                    String searchName = scanner.nextLine();
                    if (products.containsKey(searchName)) {
                        System.out.println("Product found! Price: " + products.get(searchName));
                    } else {
                        System.out.println("Product not found!");
                    }
                    break;

                case 2:
                    // Add a product
                    System.out.print("Enter product name to add: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter price: ");
                    int newPrice = scanner.nextInt();
                    products.put(newName, newPrice);
                    System.out.println("Product added: " + newName);
                    break;

                case 3:
                    // Print all products and prices
                    System.out.println("All products and prices:");
                    for (Map.Entry<String, Integer> entry : products.entrySet()) {
                        System.out.println(entry.getKey() + " - " + entry.getValue());
                    }
                    System.out.println("Total products: " + products.size());
                    break;

                case 4:
                    // Find the cheapest product
                    String cheapestProduct = null;
                    int cheapestPrice = Integer.MAX_VALUE;
                    for (Map.Entry<String, Integer> entry : products.entrySet()) {
                        if (entry.getValue() < cheapestPrice) {
                            cheapestPrice = entry.getValue();
                            cheapestProduct = entry.getKey();
                        }
                    }
                    System.out.println("Cheapest product: " + cheapestProduct + " - " + cheapestPrice);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option! Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}

