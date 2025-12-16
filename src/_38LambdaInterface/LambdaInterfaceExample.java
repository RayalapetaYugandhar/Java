
package _38LambdaInterface;

// @FunctionalInterface enforces exactly ONE abstract method in the interface.
// (You can still add default/static methods; they do not break the functional rule.)
@FunctionalInterface
interface Parent {
    // SAM (Single Abstract Method): this single method enables use of lambdas and method references.
    void show();

    // If you add another abstract method here, the compiler will error because of @FunctionalInterface.
    // void checking();
}

public class LambdaInterfaceExample {
    public static void main(String[] args) {

        // Lambda expression implementing the functional interface 'Parent'.
        // The lambda provides the body for the single abstract method 'show()'.
        // NOTE: Use the actual '->' token, not the HTML entity '&gt;'.
        Parent ch = () -> {
            System.out.println("In Child Show");
        };
            // both will works as same(if you have only one statement then no need to mention brackets)
            
        Parent ch1 = () -> 
            System.out.println("Just checking without brackets");        

        // Invokes the implementation supplied by the lambda above.
        ch.show();  // prints: In Child Show
        ch1.show();  // prints: In Child Show
    }
}
