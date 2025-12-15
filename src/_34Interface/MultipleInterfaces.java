package _34Interface;

// First interface: capability to start
interface Startable {
    void start();  // implicitly public abstract
}

// Second interface: capability to stop
interface Stoppable {
    void stop();   // implicitly public abstract
}

// A class can implement BOTH interfaces
class Machine implements Startable, Stoppable {
    @Override
    public void start() {
        System.out.println("Machine starting...");
    }

    @Override
    public void stop() {
        System.out.println("Machine stopping...");
    }
}

public class MultipleInterfaces {
    public static void main(String[] args) {
        // Program to the interface (loose coupling)
        Startable s = new Machine();
        Stoppable t = (Stoppable) s; // same object, different interface view

        s.start();  // Machine        s.start();  // Machine starting...
        t.stop();   // Machine stopping...
    }
    
}

/*
Takeaways

    A class can implement multiple interfaces to compose capabilities.
    If multiple interfaces define the same default method signature, the class must resolve the conflict.
    Interfaces can have constants, default methods, and static methods (and private methods inside the interface since Java 9).
    Use functional interfaces for lambda-friendly APIs, and combine with other interfaces to create clean, modular designs.

*/