package _16StaticBlock;

class Mobile2 {
    int price;      // instance variable
    String brand;   // instance variable
    static String name; // static variable shared across all objects

    // Static initializer (runs once when the class is loaded)
    static {
        name = "SmartPhone";
        System.out.println("[Static] name initialized to: " + name);
    }

    // 1) No-arg constructor
    public Mobile2() {
        // Set defaults (optional)
        this.brand = "Unknown";
        this.price = 0;
        System.out.println("[Ctor] Defaults set -> brand=" + brand + ", price=" + price);
    }

    // 2) Constructor to set instance fields
    public Mobile2(String brand, int price) {
        System.out.println("[Ctor] Mobile2(String, int) called with brand=" + brand + ", price=" + price);
        this.brand = brand;
        this.price = price;
        // Note: not touching 'name' here because it's class-wide
        System.out.println("[Ctor] Instance fields set -> brand=" + this.brand + ", price=" + this.price);
    }

    // 3) Constructor that also sets the static field (optional)
    public Mobile2(String brand, int price, String className) {
        System.out.println("[Ctor] Mobile2(String, int, String) called with brand=" + brand + ", price=" + price + ", className=" + className);
        this.brand = brand;
        this.price = price;
        Mobile2.name = className; // or: name = className; 
            // changes for ALL Mobile2 objects    Mobile2.name = className; // changes for ALL Mobile2 objects
        System.out.println("[Ctor] Instance fields set; [Static] name changed to: " + Mobile2.name);

    }

    public void show() {
        System.out.println(name + ":" + brand + ":" + price);
    }
}

public class constructor {
    public static void main(String[] a) {

        // Using no-arg constructor + setters
        Mobile2 obj1 = new Mobile2();
        obj1.brand = "Apple";
        obj1.price = 5000;
        Mobile2.name = "SmartPhone";

        // Using parameterized constructor (instance fields only)
        Mobile2 obj2 = new Mobile2("Samsung", 4000);

        // Changing static field affects all instances
        Mobile2.name = "phone";

        obj1.show(); // phone:Apple:5000
        obj2.show(); // phone:Samsung:4000
//
//        // Using constructor that also sets static 'name'
//        Mobile2 obj3 = new Mobile2("OnePlus", 4500, "Handset");
//        obj1.show(); // Handset:Apple:5000
//        obj2.show(); // Handset:Samsung:        obj2.show(); // Handset:Samsung:4000
//        obj3.show(); // Handset:OnePlus:4500
    }
}
