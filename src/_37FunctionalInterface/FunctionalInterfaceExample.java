
package _37FunctionalInterface;

// This annotation tells the compiler this interface is intended to be a Functional Interface.
// A Functional Interface must have exactly ONE abstract method.
// (It may still have default/static methods without breaking the rule.)
@FunctionalInterface
interface Parent {
    // The single abstract method (SAM)
    void show();

    // ❌ If you uncomment the next line, the compiler will error:
    // "Invalid '@FunctionalInterface' annotation; Parent is not a functional interface"
    // void checking();
}

// Concrete class that IMPLEMENTS the functional interface
class Child implements Parent {
    @Override
    public void show() {
        System.out.println("In Child Show");
    }
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        // Traditional implementation via a concrete class
        Parent ch = new Child();
        ch.show();  // prints: In Child Show

    }
}

