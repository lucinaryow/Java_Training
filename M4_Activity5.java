package Exceptions_Day1;


public class M4_Activity5 {

    public static void main(String[] args) {
        System.out.println("=== Account Number Validation Test ===");

        testValidation("1: Valid account", "1234567890");
        testValidation("2: Too short", "123");
        testValidation("3: Contains letters", "12345ABC90");
        testValidation("4: Contains space", "1234 567890");
        testValidation("5: Null value", null);
    }

    private static void testValidation(String testName, String accountNumber) {
        if (accountNumber != null) {
            System.out.println("\nTest " + testName + " (" + accountNumber + ")");
        } else {
            System.out.println("\nTest " + testName);
        }

        try {
            AccountValidator.validateAccountNumber(accountNumber);
        } catch (InvalidAccountNumberException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidAccountFormatException | NullPointerException e) {
            System.out.println("Warning: " + e.getMessage());
        }
    }

    static class AccountValidator {
        static void validateAccountNumber(String accountNumber)
                throws InvalidAccountNumberException {

            // 1. Check for null
            if (accountNumber == null) {
                throw new NullPointerException("Account number cannot be null");
            }

            // 2. Check for format (digits only)
            for (char c : accountNumber.toCharArray()) {
                if (!Character.isDigit(c)) {
                    throw new InvalidAccountFormatException(
                        "Account number must contain only digits"
                    );
                }
            }

            // 3. Check length exactly 10
            if (accountNumber.length() != 10) {
                throw new InvalidAccountNumberException(
                    "Account number must be exactly 10 digits"
                );
            }

            // 4. Valid
            System.out.println("Valid account number: " + accountNumber);
        }
    }

    // Custom Exceptions

    static class InvalidAccountNumberException extends Exception {
        InvalidAccountNumberException(String message) {
            super(message);
        }
    }

    // Unchecked Exception
    static class InvalidAccountFormatException extends RuntimeException {
        InvalidAccountFormatException(String message) {
            super(message);
        }
    }
}
