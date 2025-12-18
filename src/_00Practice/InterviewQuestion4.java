/*
 * POJO with validation 
 * 
 * Statement: Create an Employee class with id, name, age and validate all fields in the 
 * constructor(e.g for Null or Empty or Range)
 * 
 * */

package _00Practice;

class Employee {

    // Private fields (data members) of Employee
    private int id;
    private String name;
    private int age;

    // Constructor that sets values and also performs validation
    public Employee(int id, String name, int age) {

        // Validate ID — must be positive
        if (id <= 0) {
            throw new IllegalArgumentException("Id must be positive");
        }

        // Validate name — must not be null and must have at least 2 characters
        if (name == null || name.trim().length() < 2) {
            throw new IllegalArgumentException("Name must be at least 2 characters");
        }

        // Validate age — must be between 18 and 100
        if (age < 18 || age > 100) {
            throw new IllegalArgumentException("Age must be between 18 and 100");
        }

        // Assign values to the object AFTER all validations pass
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // toString method — defines how the object will be printed
    public String toString() {
        return "Employee{id=" + id + ", name=" + name + ", age=" + age + "}";
    }
}

public class InterviewQuestion4 {

    public static void main(String[] args) {

        try {
            // Creating Employee object with valid values
            // If any value fails validation, an exception will be thrown
            Employee emp = new Employee(10, "Raghu", 28);

            // Printing the employee object
            // This automatically calls toString() method
            System.out.println(emp);

        } catch (Exception e) {
            // If validation fails, this block executes
            System.out.println("Validation Failed: " + e.getMessage());
        }
    }
}
