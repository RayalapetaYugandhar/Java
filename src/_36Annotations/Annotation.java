
package _36Annotations; // Package name

// Parent class with a method
class Parent {
    public void showMethodToCheckHowAnnotationWillWork() {
        System.out.println("In Parent Show");
    }
}

// Child class extends Parent
class Child extends Parent {    
    // Here we try to override the method, but notice the typo:
    // "WilWork" instead of "WillWork" (missing 'l').
    // Without @Override, this compiles fine but DOES NOT override the parent method.
    public void showMethodToCheckHowAnnotationWilWork() {  //❌ method name typing error
        System.out.println("In Child Show");
    }
}

// Correct usage with @Override annotation
class ChildCorrect extends Parent {    
    @Override
    // public void showMethodToCheckHowAnnotationWilWork() {  //uncomment and check how it will work
    // This will cause a compile-time ERROR because the method name is wrong.
    // @Override forces the compiler to check that the method truly overrides a parent method.

    public void showMethodToCheckHowAnnotationWillWork() {
        
        System.out.println("In Child Show");
    }
}

public class Annotation {
    public static void main(String[] args) {
        Child ch = new Child();
        // Calls Parent's method because Child's method name is wrong (typo).
        ch.showMethodToCheckHowAnnotationWillWork();

        ChildCorrect ch1 = new ChildCorrect();  
        // Calls child method because we don't have any (typo) errors
        ch1.showMethodToCheckHowAnnotationWillWork();
    }
}

// Why @Override?
// - It tells the compiler: "This method MUST override a method from the superclass."
// - If the signature doesn't match (due to typo or wrong parameters), the compiler throws an error.
//


// if you use Annotations then compiler will throws an error, if you made any typo or wrong parameters mistake 