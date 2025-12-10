
package _16StaticBlock;

class Mobile {
    int price;         // Instance variable: unique per object
    String brand;      // Instance variable: unique per object
    static String name; // Static variable: shared by ALL Mobile objects
    
    // Static initializer block:
    // Runs ONCE when the class is loaded by the JVM (before any objects are created)
    static {    //static block is used to initialize static variables
        name = "SmartPhone"; // Initialize the class-wide 'name'
        System.out.println("in static block"); // Log to show static block execution
    }  
                         
    // if we don't create constructor then also default constructor will be created by compiler


   //  public Mobile() {   //here we are creating a constructor and initializing instance variables
   //      brand = "";     // Default instance state
   //      price = 100;    // Default instance state
   //      System.out.println("in constructor default"); // Log constructor execution
   //  }

    // Instance method: prints the shared name and this object's brand/price
    public void show() {
        System.out.println(name + ":" + brand + ":" + price);
    }
}

public class StaticBlock1 {
    public static void main(String[] a) {

        // First object creation:
        // 1) If Mobile class isn't loaded yet, static block runs once.
        // 2) Constructor runs for obj1.
        Mobile obj1 = new Mobile();

        // Set per-object fields
        obj1.brand = "Apple";
        obj1.price = 5000;

        // Change the static field: affects ALL Mobile objects
        Mobile.name = "SmartPhone"; // ✅ Fixed: use Mobile.name (not Mobile2.name)


         Mobile obj2 = new Mobile(); // it will call default constructor created by compiler // Object 2 dont have any values assigned, so it will take default values from constructor

        // Optional: see current state
        obj1.show(); // SmartPhone:Apple:5000
        obj2.show(); // SmartPhone::0
    }
}

/*
Execution order explanation:

1) When Mobile class is first referenced, JVM loads it:
   -> static block runs once:
      prints: "in static block"
      sets: name = "SmartPhone"

2) Creating obj1:
   -> constructor runs:
      prints: "in constructor default"
      sets: brand = "", price = 110
   -> then you set obj1.brand = "Apple", obj1.price = 5000

3) Changing Mobile.name:
   -> updates the static field for ALL objects of Mobile

4) Creating obj2:
   -> constructor runs again:
      prints: "in constructor default"
      obj2.brand = "", obj2.price = 110

5) show():
   -> uses current static 'name' and each object's own brand/price
*/
