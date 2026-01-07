package Exceptions_Day1;

public class M4_Activity1 {

public class BankAccount {
	public static void main(String[] args) {
		
		// Print header message
		System.out.println("=== Bank Account Name Display ===");
		
		// Test valid account
		testCase("ACC-001");
		
		// Test invalid account 
		testCase("ACC-999");
		
		// Print completion message
		System.out.println("\n=== Program completed successfully! ===");
	}

    // Create a method getAccountName
    public static String getAccountName(String accountNumber) {
        if (accountNumber.equals("ACC-001")) {
            return "Juan Dela Cruz";
        } else if (accountNumber.equals("ACC-002")) {
            return "Maria Santos";
        } else {
            return null;
        }
    }
    // Create testCase method
    public static void testCase(String accountNumber) {
        System.out.println("\nLooking up account: " + accountNumber);

        try {
            // Call getAccountName and assign to String name
            String name = getAccountName(accountNumber);

            // This will throw NullPointerException if name is null
            name = name.toUpperCase();

            // Print the uppercase name
            System.out.println("Account holder: " + name);

        } catch (NullPointerException e) {
            // Catch NullPointerException
            System.out.println("Error: Account not found!");
        }
    }

}

}
