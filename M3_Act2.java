package Module3_Day1;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class M3_Act2 {

    // Utility to normalize product names for case-insensitive uniqueness
    private static String normalize(String s) {
        return s == null ? "" : s.trim().toLowerCase();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Using a HashSet for O(1) average add/search and uniqueness
        Set<String> products = new HashSet<>();

        // 5 initial data
        products.add(normalize("Laptop"));
        products.add(normalize("Monitor"));
        products.add(normalize("Mouse"));
        products.add(normalize("Keyboard"));
        products.add(normalize("Printer"));

        // Menu loop
        boolean running = true;
        while (running) {
            printMenu();
            System.out.print("> ");
            String choiceLine = scanner.nextLine().trim();

            // Basic input validation: ensure a numeric choice
            int choice;
            try {
                choice = Integer.parseInt(choiceLine);
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter a valid option number (1-4).\n");
                continue;
            }

            switch (choice) {
                case 1:
                    // Search a product
                    System.out.print("Enter product name to search: ");
                    String searchName = scanner.nextLine();
                    String key = normalize(searchName);
                    if (products.contains(key)) {
                        // Print original casing as entered for friendliness
                        // In a real app you might store canonical display names separately
                        System.out.println("Product found: " + searchName.trim());
                    } else {
                        System.out.println("Product not found!");
                    }
                    System.out.println();
                    break;

                case 2:
                    // Add a product
                    System.out.print("Enter product name to add: ");
                    String addName = scanner.nextLine();
                    String addKey = normalize(addName);

                    if (addKey.isEmpty()) {
                        System.out.println("Product name cannot be empty.\n");
                        break;
                    }

                    boolean added = products.add(addKey);
                    if (added) {
                        System.out.println("Product added: " + addName.trim());
                    } else {
                        System.out.println("Product already exists (duplicate ignored).");
                    }
                    System.out.println();
                    break;

                case 3:
                    // Print all products and count
                    TreeSet<String> sorted = new TreeSet<>(products);

                    System.out.println("\nAll products:");
                    for (String p : sorted) {
                        // Capitalize first letter for nicer output
                        System.out.println(capitalize(p));
                    }
                    System.out.println("Total unique products: " + products.size());
                    System.out.println();
                    break;

                case 4:
                    // Exit
                    System.out.println("Exiting...");
                    running = false;
                    break;

                default:
                    System.out.println("Option must be between 1 and 4.\n");
            }
        }

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("Select an option:");
        System.out.println("1. Search a product");
        System.out.println("2. Add a product");
        System.out.println("3. Print all products and count");
        System.out.println("4. Exit");
    }

    // Formatting to capitalize items
    private static String capitalize(String s) {
        if (s == null || s.isEmpty()) return s;
        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }
}

