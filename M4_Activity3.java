package Exceptions_Day1;

public class M4_Activity3 {

    public static void main(String[] args) {

        System.out.println("=== ATM BALANCE INQUIRY SYSTEM ===\n");
        
        System.out.println("--- Test Case 1: Valid Savings Account ---");
        checkBalance("100123456", 15000.0);   

        System.out.println("--- Test Case 2: Valid Checking Account ---");
        checkBalance("20987654", 25000.0);

        System.out.println("--- Test Case 3: Invalid Account Number Format ---");
        checkBalance("ABC12345", 15000.0);

        System.out.println("--- Test Case 4: Empty Account Number ---");
        checkBalance("", 15000.0);
    }

    // Method to check balance
    public static void checkBalance(String accountNumber, double balance) {

        try {
            System.out.println("Processing balance inquiry...");

            // Validate account number by converting to integer
            Integer.parseInt(accountNumber);

            // Get account type from first character
            char accountType = accountNumber.charAt(0);

            if (accountType == '1') {
                System.out.println("Account Type: Savings");
            } else if (accountType == '2') {
                System.out.println("Account Type: Checking");
            } else {
                System.out.println("Account Type: Unknown");
            }

            System.out.println("Account Number: " + accountNumber);
            System.out.println("Current Balance: ₱" + balance);
            System.out.println("Balance inquiry successful!");

        } catch (NumberFormatException e) {
            System.out.println(
                "Error: Invalid account number format! Account numbers must be numeric."
            );
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(
                "Error: Invalid account number format! Account numbers must be numeric."
            );
        } finally {
            System.out.println("\n========== RECEIPT ==========");
            System.out.println("Transaction Date: December 3, 2025");
            System.out.println("Transaction Type: Balance Inquiry");
            System.out.println("ATM Location: Main Branch");
            System.out.println("Thank you for banking with us!");
            System.out.println("=============================\n");
        }
    }
}
