package _34Interface;

interface A{

    // int age;  //if you create any variables in interface then it is final and constant
    // String name; // if it is final and constant then you have assign values direclt here

    int age = 26;
    String name = "Yugandhar Babu";
    // public abstract void show();
    // public abstract void config();

            //or   // both will work same 

    void show();  //if you are workig on interface then no need to mention public abstract 
    void config();  // by default it is abstract

    // public void check() {  //it won't work because interface will have only abstract method, in abstarct method we don't specify a body
    //     System.out.println("chuicb");
    // }

    
    // ✅ Default method (has a body; can be overridden by implementing classes)
    default void check() {
        System.out.println("default check from interface");
    }

    
    // ✅ Static method (has a body; called via A.util())
    static void util() {
        System.out.println("static util from interface");
    }

    // ✅ Java 9+: Private helper method (used inside other interface methods)
    private void helper() {
        System.out.println("private helper for interface methods");
    }

    // Example of using the private helper inside a default method
    default void run() {
        helper(); // allowed: both are inside the same interface
        System.out.println("running from interface default method");
    }

    // if you have all abstract methods in a class, then no need to craete a class, we can create a interface 
}

class B implements A{
    public void show() {
        System.out.println("in show");
    }
    public void config() {
        System.out.println("in config");
    }
    
    public void check() {
        System.out.println("B.check overridden");
    }

}

public class InterfaceExample {
    public static void main(String []args) {
        // A obj = new A(); // you can't create reference of A, because A is  not a class, it is a interface 
        A obj = new B();
        obj.show();
        obj.config();
        obj.check();
        A.util();
        obj.run();

        //you can call final varibale with the help of class name or interface name
        System.out.println(A.age);
        System.out.println(A.name);
    }
}

// if you have all abstract methods in a class, then instead of craete a class, we can create a interface 
// To achieve interface we have to use "implements" in child class

// To inherit the feature and properties present in parent class we use "extends" keyword in child class

// To inherit the feature and properties present in interface we use "implements" keyword in child class

//If we are implementing the child class with the reference of parent, then we have to define all methods present in parent 

//If you wright any public method with body in interface it won't allow, you can write default, static, private methods with body