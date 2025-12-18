
package _39Exception;

// Custom checked exception that extends Exception
class YugandharException extends Exception {

    // Constructor that takes a message and passes it to the parent Exception
    public YugandharException(String str) {
        super(str);
    }
}

public class CustomException {
    public static void main(String[] args) {
        int i = 20; // Divisor used for integer division
        int j = 0;  // Result variable

        try {
            // Perform integer division: 18 / 20 = 0 (because it's integer math, fractions are truncated)
            j = 18 / i;
            System.out.println(j); // Prints 0

            // If condition evaluates true (j == 0), we throw our custom exception
            if (j == 0) {
                // Throwing a user-defined (custom) checked exception with a message
                throw new YugandharException("Yugandhar exception called");
            }

        } catch (YugandharException e) {
            // This block handles the custom exception specifically
            System.out.println("Custom Exception called: " + e);
            // System.out.println("Custom Exception called: " + e.getMessage());
            // You could also log e for the stack trace if needed: e.printStackTrace();

        } catch (Exception e) {
            // This is a general catch for any other exceptions (e.g., ArithmeticException, NullPointerException, etc.)
            System.out.println("Default execution: " + e);
        }

        // Optional: you can add a finally block to run clean-up code regardless of exceptions
               // finally {
        //     System.out.println("Cleanup/closing resources if any.");
        // }
    }
}