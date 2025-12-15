package Module3_Day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class M3_Act1 {
    public static void main(String[] args) {
        // Create a List of Products with 5 records
        List<String> products = new ArrayList<>();
        products.add("Laptop");
        products.add("Mouse");
        products.add("Keyboard");
        products.add("Monitor");
        products.add("Printer");

        // Print products
        System.out.println("Activity #1: Product List (M3_ACTIVITY1)\n");
        System.out.println("All products:");
        printNumbered(products);

        products.add("Webcam");          // add
        products.remove("Mouse");        // remove

        System.out.println("\nAfter adding and removing products:");
        printNumbered(products);

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter product name to search: ");
        String query = scanner.nextLine().trim();

        // For loop search
        boolean foundByLoop = false;
        for (String item : products) {
            if (item.equals(query)) {
                foundByLoop = true;
                break;
            }
        }

        // Contains method
        boolean foundByContains = products.contains(query);

        // Show result
        if (foundByLoop || foundByContains) {
            System.out.println("Product found: " + query);
        } else {
            System.out.println("Product not found: " + query);
        }

        scanner.close();
    }

    private static void printNumbered(List<String> items) {
        for (int i = 0; i < items.size(); i++) {
            System.out.printf("%d. %s%n", i + 1, items.get(i));
        }
    }
}
