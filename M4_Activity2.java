package Exceptions_Day1;

public class M4_Activity2 {

    public static void main(String[] args) {
        System.out.println("=== ATM Withdrawal System ===");

        // Test 1: Valid withdrawal
        System.out.println("\n--- Test 1: Valid Withdrawal ---");
        processWithdrawal("1", "5000");

        // Test 2: Invalid account index (non-numeric -> NumberFormatException)
        System.out.println("\n--- Test 2: Invalid Account Index ---");
        processWithdrawal("abc", "5000");

        // Test 3: Account not found (index out of range -> ArrayIndexOutOfBoundsException)
        System.out.println("\n--- Test 3: Account Not Found ---");
        processWithdrawal("10", "5000");

        // Test 4: Insufficient funds
        System.out.println("\n--- Test 4: Insufficient Funds ---");
        processWithdrawal("1", "20000");

        System.out.println("\n=== All tests completed! ===");
    }

    // Array of account balances
    static double[] accounts = { 10000, 15000, 20000 };

    // Processes a withdrawal request given an account index and amount as strings
    public static void processWithdrawal(String accountIndexInput, String amountInput) {
        try {
            // Parse inputs
            int index = Integer.parseInt(accountIndexInput);         
            double amount = Double.parseDouble(amountInput);    

            // Get current balance (may throw ArrayIndexOutOfBoundsException)
            double balance = accounts[index];

            // Show current state
            System.out.printf("Account: %d, Amount=%s%n", index, amountInput);
            System.out.printf("Current balance: ₱%,.2f%n", balance);
            System.out.printf("Withdrawal: ₱%,.2f%n", amount);

            // Check funds
            if (amount > balance) {
                System.out.printf("Insufficient funds! Cannot withdraw%n₱%,.2f%n", amount);
            } else {
                double newBalance = balance - amount;
                accounts[index] = newBalance;
                System.out.printf("New balance: ₱%,.2f%n", newBalance);
                System.out.println("Withdrawal successful!");
            }

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input!");
            System.out.println("Please enter valid numbers.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Account not found!");
            System.out.println("Invalid account index.");
        } catch (Exception e) {
            System.out.println("Transaction failed (unexpected error).");
            System.out.println("Details: " + e.getMessage());
        }
    }
}


