/*
    Statement: Create an Employee class with id, name, age and validate all fields in the 
        constructor(e.g for Null or Empty or Range)
  */

package _19Constructor;

class Employee {
     int id;
     String name;
     int age;

    public Employee(int id, int age, String name){  // parameterized constructor with validation
         
        if (id <= 0) { 
            throw new IllegalArgumentException("Id must be positive");
        }else if (name == null || name.trim().length() < 2) {
            throw new IllegalArgumentException("Name must be at least 2 characters");            
        }else if (age < 18 || age > 100) {
            throw new IllegalArgumentException("Age must be between 18 and 100");
        }
        
        // Assign once after validation
        this.id = id;
        this.name = name;
        this.age = age;

        System.out.println("Default Constructor");

    }
}

public class ParameterizedConstructor1 {
    public static void main(String [] args) {
        try{
            Employee e1 = new Employee(10, 26, "Yugandhar");

                System.out.println("Employee Details: " + "ID: " + e1.id + " Name: " + e1.name + " Age: " + e1.age);  // valid values
            
            Employee e2 = new Employee(-1, 20, "Yu"); // invalid id
                System.out.println("Employee Details: " + "ID: " + e2.id + " Name: " + e2.name + " Age: " + e2.age);

        } catch (IllegalArgumentException ex) {
            System.out.println("Validation Failed: " + ex.getMessage());
        }
    }
}