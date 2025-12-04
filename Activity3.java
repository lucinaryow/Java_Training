/**
 * 
 */
package Day_1;

/**
 * 
 */

import java.util.Scanner;

public class Activity3 {
    public static void main(String[] args) {
    	compute();
    }
    
    	static void compute() {
        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Step 1: Accept two integer inputs from user
        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();

        // Step 2: Compute sum, difference, and product
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;

        // Step 3: Display all three results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);

        // Close scanner
        scanner.close();
    }
}


