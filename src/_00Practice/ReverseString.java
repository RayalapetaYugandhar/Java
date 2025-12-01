package _00Practice;

public class ReverseString {
    public static void main(String[] args) {
        String input = "Hello World";
        
        // Method 1: Using StringBuilder
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed (StringBuilder): " + reversed);

    }
}