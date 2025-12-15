
// Package declaration (organizes the class in a namespace)
package _33AbstractAnonymousInnerClass;

// Abstract class with one abstract method 'show'.
// Abstract classes cannot be instantiated directly.
abstract class Anony {
    abstract public void show();
}

public class AbstractAnonymousInnerClass {
    public static void main(String[] args) {

        // Create an instance of an *anonymous inner class* that extends 'Anony'.
        // The syntax `new Anony() { ... }` defines an unnamed subclass inline
        // and provides the required implementation of the abstract method 'show'.
        Anony anm = new Anony() {  // creating object of anonymous subclass of Anony

            // Override the abstract method. Adding @Override is recommended.
            @Override
            public void show() 
            {  // concrete implementation
                System.out.println("Anonymous class implementation");
            }
        };

        // Calls the overridden method in the anonymous inner class
        anm.show();
    }
}