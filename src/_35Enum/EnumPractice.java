package _35Enum; // The package (folder/namespace) where this file belongs

// An enum is a special type that represents a fixed set of constants.

enum Status {
    // Enum constants. By default:
    // - They are public, static, and final.
    // - Their 'ordinal' is assigned by declaration order: 0, 1, 2, ...
    Running, Failed, Pending, Success; // The trailing semicolon is optional here
}

// ⚠️ NOTE: Naming this class 'Enum' is confusing and risky,
// because it shadows java.lang.Enum (the base type of all enums).
// Prefer a different class name like 'EnumDemo' or 'StatusDemo'.
public class EnumPractice {
    public static void main(String[] args) {
        // int i = 10; // Unused variable (can be removed)

        // values() is a compiler-generated static method for every enum.
        // It returns an array of all enum constants in the order they were declared.
        
        Status s1 = Status.Running; //directly printing "Running"
        System.out.println(s1);

        Status[] s = Status.values();  //values() will give you the array

        // Enhanced for-loop to iterate over all enum constants.
        for (Status ss : s) {
            // Prints the name of the enum constant (toString() of an enum returns its name).
            System.out.println(ss);

            // ordinal() returns the zero-based position in the enum declaration.
            // Running -> 0, Failed -> 1, Pending -> 2, Success -> 3
            System.out.println(ss + ": " + ss.ordinal());
        }
        
        // Normal for loop using index
        for (int i = 0; i < s.length; i++) {
            // Access each element by index
            System.out.println(s[i]);
            System.out.println(s[i] + ": " + s[i].ordinal());
        }

    }
}

//enum is a class
//You can't extends enum with any other class