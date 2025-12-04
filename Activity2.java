/**
 * 
 */
package Day_1;

/**
 * 
 */

import java.util.Scanner;

public class Activity2 {
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read user's age as a String
        System.out.print("Enter your age: ");
        String ageString = scanner.nextLine();

        // Step 2: Convert the String to int
        int ageInt = Integer.parseInt(ageString);

        // Step 3: Convert the int into double
        double ageDouble = (double) ageInt;

        // Step 4: Display both the int and double version of age
        System.out.println("Your age in int: " + ageInt);
        System.out.println("Your age in double: " + ageDouble);

        // Close the scanner
        scanner.close();
    }
}

