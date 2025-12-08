
/*
 * Validate Email Format 
 * Statement: Write a method isValidEmail(String email) to validate the format of email address 
 * without using external libraries
 * 
 * */
package _00Practice;

public class InterviewQuestion5 {

    public static void main(String[] args) {

        // Array of test emails
        String[] emails = {
                "user@example.com",       // valid
                "user.name@domain.co",    // valid
                "bad-email@.com"          // invalid
        };

        // Loop through each email and check validity
        for (String e : emails) {
            System.out.println(e + " -> " + isValidEmail(e));
        }
    }

    // Method to validate email using regex
    public static boolean isValidEmail(String email) {

        // If email is null, it's invalid
        if (email == null) return false;

        // Regex pattern that checks valid email format
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

        // matches() returns true if email matches the regex pattern
        return email.matches(regex);
    }
}
