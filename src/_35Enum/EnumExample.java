
package _35Enum; // Package (folder/namespace) for this class file

// An enum is a special type that represents a fixed set of constants.
// Enums in Java can hold fields, have constructors, and methods.
// The set of constants (Dell, Hp, Lenovo) is fixed at compile time.

enum Laptop {
    // Each enum constant provides a price to the private constructor below.
    Dell(1000),
    Hp(500),
    Lenovo(1200),
    ThinkPad;  //if you want achieve this, you have to create default constructor with or without specifying price

    private Laptop() { //default constructor
            //if you don't specify any value then "ThinkPad" price will be "0"
        this.price = 200;  //it means by default "ThinkPad" price will be "200"
    }
    // Instance field: each constant has its own price stored here.
    private int price;

    // Enum constructor: runs once per constant (e.g., Dell -> 1000).
    // Enum constructors are implicitly private (you can't 'new' an enum).
    private Laptop(int price) {  //Parameterized Constructor for price
        this.price = price;
    }

    // Getter: read the current price for a given constant.
    public int getPrice() {
        return price;
    }

    // Setter: change the price at runtime.
    // Note: mutating enum state is possible but often discouraged.
    public void setPrice(int price) {
        this.price = price;
    }
}

public class EnumExample {
    public static void main(String[] args) {
        // Select one enum constant (Dell) and print its price.
        Laptop lp = Laptop.Dell;
        System.out.println(lp + " : " + lp.getPrice());  // e.g., "Dell : 1000"

        // values() returns an array of all constants in declaration order.
        Laptop[] lps = Laptop.values();

        // Enhanced for-loop: iterate through all constants and print their prices.
        for (Laptop lp1 : lps) {
            System.out.println(lp1 + " : " + lp1.getPrice());
        }

        // Demonstrate that enum instances are singletons:
        // Changing Hp's price will affect Hp everywhere in the program.
        Laptop.Hp.setPrice(900); // update price for Hp

        // Read back Hp after update to verify the change.
        Laptop lp2 = Laptop.Hp;
        System.out.println(lp2 + " : " + lp2.getPrice()); // prints "Hp : 900"
    }
}