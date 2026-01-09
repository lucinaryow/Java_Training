package Exceptions_Day1;


public class M4_Activity4 {

    public static void main(String[] args)  {

        // Test Case 1: Valid (should pass)
        try {
            validateAccountNumber("1234567890");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test Case 2: Invalid - too short
        try {
            validateAccountNumber("123");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test Case 3: Invalid - null
        try {
            validateAccountNumber(null);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Method per instructions
    public static void validateAccountNumber(String accountNumber) throws Exception {

        // If accountNumber is null -> throw NullPointerException
        if (accountNumber == null) {
            throw new NullPointerException("Error: Cannot be null");
        }

        // If length is not 10 -> throw Exception
        if (accountNumber.length() != 10) {
            throw new Exception("Error: Must be 10 digits");
        }

        // If valid -> print
        System.out.println("Valid account: " + accountNumber);
    }
}

