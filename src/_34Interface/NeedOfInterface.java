
// Package declaration (groups related classes under _34Interface)
package _34Interface;

// 1) Define an interface that represents a general capability: "a computer can code"
interface Computer {
    // Abstract method: any class implementing Computer must provide its own 'code' behavior
    void code();
}

// 2) Concrete implementation #1: Laptop behaves like a Computer
class Laptop implements Computer {
    @Override
    public void code() {
        // Laptop-specific behavior (could be slower, portable, etc.)
        System.out.println("code, compile, run");
    }
}

// 3) Concrete implementation #2: Desktop behaves like a Computer
class Desktop implements Computer {
    @Override
    public void code() {
        // Desktop-specific behavior (typically faster, more powerful)
        System.out.println("code, compile, run, faster");
    }
}

// 4) A Developer uses *any* Computer to develop apps.
//    Note: The Developer depends on the abstract type (Computer), not a concrete class (Laptop/Desktop).
class Developer {
    // Method accepts the interface type. This enables polymorphism and loose coupling.
    public void devApp(Computer machine) {
        // Delegates the work to the Computer implementation provided at runtime
        machine.code();
    }
}

// 5) Demo class: shows how interfaces enable flexibility
public class NeedOfInterface {
    public static void main(String[] args) {
        // Create different implementations of the same interface
        Computer lap = new Laptop();   // Upcasting to the interface type
        Computer desk = new Desktop(); // Upcasting to the interface type

        // A Developer who can work with any Computer
        Developer yugandhar = new Developer();

        // Polymorphism in action: the actual 'code()' implementation depends on the object type
        yugandhar.devApp(lap);   // Uses Laptop's version: "code, compile, run"
        yugandhar.devApp(desk);  // Uses Desktop's version: "code        yugandhar.devApp(desk);  // Uses Desktop's version: "code, compile, run, faster"
    }
}


/*


🧠 What’s happening & why this design is good


    Interface (Computer) defines a contract: any computer must be able to code().
    No implementation details are specified—only what needs to be done.


    Polymorphism:
    Computer lap = new Laptop(); and Computer desk = new Desktop(); mean the reference type is the interface, while the runtime type is the concrete class.
    So devApp() can accept any Computer—it calls code(), and the correct method runs based on the actual object.


    Loose coupling (Dependency Inversion Principle):
    Developer depends on an abstraction (the Computer interface) rather than a specific implementation (Laptop, Desktop).
    This makes it easy to add new devices (e.g., Tablet implements Computer) without changing Developer.


    Open/Closed Principle:
    You can extend the system by adding new Computer implementations without modifying existing classes (Developer remains unchanged).



*/