
// Package declaration (organizes classes under _34Interface)
package _34Interface;

// Define an interface named 'A1'
interface A1 {

    /*
     * Variables declared in an interface are implicitly:
     * - public
     * - static
     * - final
     * i.e., they are constants accessible via the interface name.
     * You must assign a value at declaration time.
     */

    // Example constants
    int age = 26;                 // Equivalent to: public static final int age = 26;
    String name = "Yugandhar";    // Equivalent to: public static final String name = "Yugandhar";

    /*
     * Methods in an interface are implicitly:
     * - public
     * - abstract   (until Java 8; interfaces can also have 'default' and 'static' methods)
     * You don't need to write 'public abstract' explicitly.
     */
    void show();    // implicitly public abstract
    void config();  // implicitly public abstract

    /*
     * Regular instance method with a body is NOT allowed unless it's marked
     * as 'default' (Java 8+), 'static' (Java 8+), or 'private' (Java 9+).
     *
     * // public void check() {  // ❌ Won't compile in an interface (unless default/static/private)
     * //     System.out.println("chuicb");
     * // }
     */

    // ✅ Default method (has a body; can be overridden by implementing classes)
    default void check() {
        // This can call other private/default/static methods defined in the interface.
        System.out.println("default check from interface");
    }

    // ✅ Static method (has a body; called via A1.util())
    static void util() {
        System.out.println("static util from interface");
    }

    // ✅ Java 9+: Private helper method (used inside other interface methods)
    // Note: This cannot be called from implementing classes; only within this interface.
    private void helper() {
        System.out.println("private helper for interface methods");
    }

    // Example of using the private helper inside a default method
    default void run() {
        helper(); // allowed: both are inside the same interface
        System.out.println("running from interface default method");
    }

    /*
     * Note:
     * - Interfaces model capabilities/contracts, not stateful implementations.
     * - If all required methods of a type are abstract, prefer an interface instead of an abstract class.
     */
}

// 'B1' implements the interface 'A1'.
// This means 'B1' must provide concrete implementations for all abstract methods of 'A1'.
class B1 implements A1 {
    @Override
    public void show() {
        System.out.println("in show");
    }

    @Override
    public void config() {
        System.out.println("in config");
    }

    // Overriding the default method from the interface
    @Override
    public void check() {
        System.out.println("B1.check overridden");
    }
}

public class Code {
    public static void main(String[] args) {
        // A1 obj = new A1();  // ❌ Not allowed: You cannot instantiate an interface.

        // ✅ Create an object of a class that implements the interface:
        A1 obj = new B1();   // Upcasting: reference type is interface 'A1', object type is 'B1'

        // Polymorphism: calls 'B1's implementations through the 'A1' reference.
        obj.show();    // Prints: in show
        obj.config();  // Prints: in config

        // Calls overridden default method in B1
        obj.check();   // Prints: B1.check overridden

        // Call static method on the interface (use the interface name)
        A1.util();     // Prints: static util from interface

        // Call another default method defined in the interface
        obj.run();     // Prints: private helper... then "running from interface default method"

        // Access interface constants using the interface name (since they are static final)
        System.out.println(A1.age);   // Prints: 26
        System.out.println(A1.name);  // Prints: Yugandhar

        // Note: You could also access via 'B1.age', but using 'A1.age' is clearer and idiomatic.
    }
}

// 🧠 Key concepts summarized

// Interface fields are always public static final (constants). You must assign a value where they are declared.
// Interface methods (without bodies) are implicitly public abstract.
// Since Java 8, interfaces can also have:

// default methods (with a body) — provide a default implementation.
// static methods — utility methods tied to the interface itself.


// You cannot instantiate an interface directly: use a class that implements it.
// Polymorphism: A obj = new B(); lets you program to the interface, improving flexibility and testability.
// Access constants via the interface name: A.age, A.name.



/*

// if you have all abstract methods in a class, then instead of craete a class, we can create a interface 
// To achieve interface we have to use "implements" in child class

// To inherit the feature and properties present in parent class we use "extends" keyword in child class

// To inherit the feature and properties present in interface we use "implements" keyword in child class

//If we are implementing the child class with the reference of parent, then we have to define all methods present in parent 

//If you wright any public method with body in interface it won't allow, you can write default, static, private methods with body
*/