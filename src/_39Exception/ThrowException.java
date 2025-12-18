
package _39Exception;

public class ThrowException {
    public static void main(String[] args) {
        int i = 20; // Divisor used for integer division
        int j = 0;  // Variable to hold the result

        try {
            // Integer division: 18 / 20 = 0 (fraction truncated)
            j = 18 / i;
            System.out.println(j); // Prints 0

            // If condition is met, we explicitly throw an exception using 'throw'
            if (j == 0) {
                // Throwing a built-in unchecked exception (ArithmeticException)
                // You can add a message to describe the failure cause:
                // throw new ArithmeticException("Failed: result was zero");
                throw new ArithmeticException(); 
            }

        } catch (ArithmeticException e) {
            // This catch handles the specific ArithmeticException thrown above
            System.out.println("Problem in calculation");
            // If no message was provided, e.getMessage() may be null.
            // For debugging, you can print the stack trace:
            // e.printStackTrace();

        } catch (Exception e) {
            // Generic fallback for any other exceptions
            System.out.println("Default execution: " + e);
        }

        // Note: No finally block here; add one if you need cleanup code (closing files, DB, etc.)
    }
}

// 'throw' keyword is used to explicitly throw an exception.
// It
