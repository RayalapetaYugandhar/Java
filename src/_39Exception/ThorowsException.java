
package _39Exception;

// A simple class named 'parent' that declares a method which may throw a checked exception
class parent {
    /**
     * The method 'show' declares 'throws ClassNotFoundException' in its signature.
     * This means the method may propagate a ClassNotFoundException to its caller
     * if the class named below is not found by the class loader.
     */
    public void show() throws ClassNotFoundException {
        // Attempt to load a class by its fully qualified name.
        // If the class "checkingclass" does not exist on the classpath,
        // Class.forName(...) throws ClassNotFoundException (a checked exception).
        Class.forName("checkingclass");
    }
}

public class ThorowsException { // Consider renaming to 'ThrowsException' (typo fix)
    public static void main(String[] args) {
        parent obj = new parent();

        try {
            // Call 'show()'. Since 'show()' declares 'throws ClassNotFoundException',
            // we must either catch it here or declare 'main' with 'throws'.
            obj.show();

            // If the class is found, execution continues normally and no exception is thrown.

        } catch (ClassNotFoundException e) {
            // This catch block handles the checked exception thrown by Class.forName(...)
            // Print a stack trace for debugging (shows where the exception originated).
            e.printStackTrace();

            // Provide a user-friendly message. Note: fix typos in output text for clarity.
            System.out.println("Handling 'throws' exception: " + e);
        }
    }
}
/*
You’re trying to load a class named "checkingclass".
Since this class does not exist, Class.forName() will throw a checked exception: ClassNotFoundException.
The method says:
“I’m not handling this exception here. I’ll just declare throws ClassNotFoundException so whoever calls me must handle it.”
*/


/*  //main is calling show method

Here we don't have "checkingclass", still we are trying to get the class in show method,
what show method is saying, i don't handle exception here i will just throws the exception to main, 
then main will handle exception with the help of try catch block


*/