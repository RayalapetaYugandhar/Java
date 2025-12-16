
package _37FunctionalInterface;

// @FunctionalInterface tells the compiler this interface must have exactly ONE abstract method.
// You can still add default or static methods without breaking the rule.
@FunctionalInterface
interface Parents {
    // SAM (Single Abstract Method): this is what enables lambdas and method references.
    void show();

    // If you uncomment another abstract method, compilation will fail because of @FunctionalInterface.
    // void checking();
}

public class FunctionalInterfaceExample1 {
    public static void main(String[] args) {

        // Anonymous class implementation of the functional interface.
        // This was the standard approach before Java 8 lambdas.
        Parents ch = new Parents() {
            @Override
            public void show() {  //Anonymous inner class
                System.out.println("In Child Show");
            }
        };

        // Invokes the overridden implementation in the anonymous class above.
        ch.show();  // prints: In Child Show
    }
}