
package _38LambdaInterface;

// @FunctionalInterface ensures this interface has exactly ONE abstract method.
// This makes it a "functional interface" suitable for lambda expressions.
@FunctionalInterface
interface Parents {
    // Single Abstract Method (SAM): enables lambda usage.
    void show(int i);

    // If you add another abstract method here, compilation will fail.
    // void checking();
}

public class LambdaInterfaceExample1 {
    public static void main(String[] args) {

        // ✅ Lambda expression implementing the functional interface 'Parents'.
        // The lambda provides the body for the abstract method 'show(int i)'.
        // Syntax: (parameters) -> { method body }
        Parents ch = (int i) -> {
            System.out.println("In Child Show" + " : " + i);
        };

        //both are same

        Parents ch2 = i -> {  //we already declared type as "int" in abstarct method then no need mention again
                              //if we have only one condition then no need to mention round brackets ()
            System.out.println("Without Round Brackets" + " : " + i);
        };

        //both are same

        // ✅ Anonymous inner class implementation (pre-Java 8 style).
        // This creates an unnamed class that implements 'Parents' and overrides 'show(int i)'.
        Parents ch1 = new Parents() {
            public void show(int i) {
                System.out.println("Checking the difference" + " : " + i);
            }
        };

        // ✅ Invoking both implementations:
        ch.show(10);   // prints: In Child Show : 10
        ch1.show(5);   // prints: Checking the difference : 5
        ch2.show(4);   // prints: Without Round Brackets: 4
    }
}
