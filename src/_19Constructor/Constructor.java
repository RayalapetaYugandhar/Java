package _19Constructor;

class ConstructorExample {
    String name;
    int age;

    // No-arg constructor
    public ConstructorExample() {  //constructor name same as class name
        this.name = "Yugandhar";
        this.age = 26;
        System.out.println("Constructor is called");
    }

}
public class Constructor {
    public static void main(String []args) {
        ConstructorExample c = new ConstructorExample();

            c.name = "King";  //Here we are accessing instance variable using object reference
            c.age = 27;    

            System.out.println(c.name + ":" + c.age);   // here we have values assigned by us, that's why it will print King:27

        ConstructorExample c1 = new ConstructorExample();  // if we don't have assigned any value then it will print the values assigned in constructor
            System.out.println(c1.name + ":" + c1.age);
    }
    
}


// Constructo looks like a method but it does not have a return type
// Constructor name must be same as class name
// Constructor is used to initialize the object
// If we do not create a constructor Java provides a default constructor
// We can create our own constructor (parameterized constructor or no-arg constructor)
// Constructor is called when we create an object of the class  
// We can have multiple constructors in a class (constructor overloading)
// Constructor can have access modifiers (public, private, protected, default)
// Constructor cannot be inherited
// Constructor can call another constructor using this() keyword

// Example:
// class Person {
//     String name;
//     int age;

//     // No-arg constructor
//     public Person() {
//         this.name = "Unknown";
//         this.age = 0;
//     }

//     // Parameterized constructor
//     public Person(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }
// }