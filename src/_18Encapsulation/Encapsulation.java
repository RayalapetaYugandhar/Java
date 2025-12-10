package _18Encapsulation;
class Encap{
    private String name; //private variable name  // instance variable
    private int age; //private variable age        //  instance variable

    // Getter for name
    public String getName() { 
        return name; //returns the value of the private variable name
    }

    // Setter for name
    public void setName(String name) { //setter method takes a parameter name //"name" is local variable
        this.name = name;  //this.name refers to the instance variable, while name refers to the parameter
    }       // ^
           //"name" is instance variable (if you mention both variable same name then to distinguish we use 'this' keyword)

    // if you mention local variable and instance variable with same name then to distinguish we use 'this' keyword

    //Here we are storing the 'name' value into the instance variable 'name'
    
    // what ever the value is passed in 'n', with the help of 'setName' it will be assigned to the instance variable 'name'
    //this.keyword is used to refer to the current instance of the class.
    // In Java, the "this" keyword is a reference variable that refers to the current object of a class. 
    
    // Getter for age
    public int getAge() {
        return age;  //returns the value of the private variable age
    }

    //setter for age
    public void setAge(int age) { //setter method takes a parameter ag
        this.age = age; //this.age refers to the instance variable, while age refers to the parameter
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Encap e = new Encap();  //creating an object of the Encap class
        e.setName("Yugandhar");  // setting the name using setter method // e.setName("Yugandhar");
        e.setAge(26);           //   setting the age using setter method // e.setAge(26);

        // System.out.println("Name: " + e.getName() + "  Age:" + e.getAge());

        System.out.println("Name: " + e.getName());
        System.out.println("Age: " + e.getAge());
    }
    
}


// Encapsulation is one of the four fundamental OOP concepts.
// The other three are inheritance, polymorphism, and abstraction.
// Encapsulation is the mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit.
// In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class.
// Therefore, it is also known as data hiding.  
// To achieve encapsulation in Java:
// 1. Declare the variables of a class as private.
// 2. Provide public setter and getter methods to modify and view the variables values.
// Example:

// class Person {
//   private String name; // private = restricted access   
//   private int age;   
//   // Getter
//   public String getName() {  
//     return name;
//   }
//   // Setter  
//   public void setName(String newName) {  
//     this.name = newName;   //this keyword is used to refer to the current instance of the class.
//   }
//   // Getter  
//   public int getAge() {  
//     return age;          
//   }
//   // Setter
//   public void setAge(int newAge) {
//     if (newAge > 0) { // age cannot be negative
//       this.age = newAge;     
//     }     
//   }
// }

// In the above example, the variables name and age are declared as private.    
// They can only be accessed and modified through the public getter and setter methods.
// Benefits of Encapsulation:
// 1. Control: You can control the way data is accessed or modified.
// 2. Flexibility: You can change one part of the code without affecting other parts.
// 3. Maintainability: It is easier to maintain and modify code when it is encapsulated.
// 4. Security: It helps to protect sensitive data from unauthorized access.        
// Note: In real-world applications, encapsulation is widely used to protect data and ensure that it is accessed and modified in a controlled manner.   


// Explain this keywords used in the code:// In Java, the "this" keyword is a reference variable that refers to the current object of a class. 
// It is commonly used in the following scenarios:  
// 1. To refer to instance variables: When the names of instance variables are the same as method parameters, the "this" keyword is used to distinguish between them. 
//    For example, in the   
//    public void setName(String n) {
//        this.name = n;    
//    }
//    Here, "this.name" refers to the instance variable "name", while "n" refers to the method parameter.
// 2. To invoke current class methods: The "this" keyword can be used to    
//    call other methods of the current class. For example:
//    public void display() {   
//        System.out.println("Name: " + this.getName());
//    }
// 3. To pass the current object as a parameter: The "this" keyword can be used to pass the current object as a parameter to another method or constructor.
//    For example:      
//    public void printDetails(Encap obj) {
//        System.out.println("Name: " + obj.getName());
//    }
//    can be called as:
//    printDetails(this);
// 4. To return the current object: The "this" keyword can be used to return the current object from a method.
//    For example:  
//    public Encap getCurrentObject() {
//        return this;  
//    }