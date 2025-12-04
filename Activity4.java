/**
 * 
 */
package Day_1;

/**
 * 
 */

import java.util.Scanner;


public class Activity4 {
    public static void main(String[] args) {
    	
    activity5();	
    	
    }
    static void activity5() {
        Scanner scanner = new Scanner(System.in);

        // Ask for age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Conditional statements
        if (age < 18) {
            System.out.println("Minor");
        } else if (age >= 18 && age <= 59) {
            System.out.println("Adult");
        } else {
            System.out.println("Senior");
        }

        scanner.close();
    }
}



