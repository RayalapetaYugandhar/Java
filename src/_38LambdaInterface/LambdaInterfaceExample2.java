
package _38LambdaInterface;

// @FunctionalInterface ensures this interface has exactly ONE abstract method.
// This makes it a "functional interface" suitable for lambda expressions.
@FunctionalInterface
interface Paren {
    // Single Abstract Method (SAM): enables lambda usage.
    void show(int i, int j);

    // If you add another abstract method here, compilation will fail.
    // void checking();
}

public class LambdaInterfaceExample2 {
    public static void main(String[] args) {

        // ✅ Lambda expression implementing the functional interface 'Paren'.
        // The lambda provides the body for the abstract method 'show(int i)'.
        // Syntax: (parameters) -> { method body }
        
        Paren ch = (i,j) -> {  //we already declared type as "int" then no need mention again
            System.out.println("In Child Show" + " : " + "i value is " + i + " and j value is " +j);
        };

        // ✅ Invoking both implementations:
        ch.show(10, 7);   // prints: In Child Show : 10
    }
}
