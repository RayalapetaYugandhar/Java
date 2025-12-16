
// Package declaration (groups related classes under _30AbstractKeyword)
package _30AbstractKeyword;

/**
 * An abstract class that defines a capability every computer must provide: 'code'.
 * Subclasses must implement the 'code()' method with their specific behavior.
 */
abstract class Computer {
    public abstract void code();
}

/**
 * Laptop is a concrete type of Computer.
 * It provides its own implementation of 'code()'.
 */
class Laptop extends Computer {
    
    public void code() {
        System.out.println("code, compile, run");
    }
}

/**
 * Desktop is another concrete type of Computer.
 * Typically faster, so its behavior reflects that.
 */
class Desktop extends Computer {
    
    public void code() {
        System.out.println("code, compile, run, faster");
    }
}

/**
 * A Developer depends on the abstraction (Computer), not concrete types.
 * This enables polymorphism and loose coupling.
 */
class Developer {
    public void devApp(Computer machine) {
        // Delegates the work to whichever Computer implementation is passed in
        machine.code();
    }
}

/**
 * Demo class showing polymorphism:
 * The same 'devApp' call results in different behavior based on the actual object.
 */
public class NeedOfAbstract {
    public static void main(String[] args) {
        // Upcasting: refer to concrete objects via the abstract type
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer yugandhar = new Developer();

        // Polymorphism in action: resolves to Laptop.code()
        yugandhar.devApp(lap);

        // Polymorphism in action: resolves to Desktop.code()
        yugandhar.devApp(desk);
    }
}
