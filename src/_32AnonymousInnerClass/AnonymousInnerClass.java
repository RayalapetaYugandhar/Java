
// Package declaration (the file is part of package _32AnonymousInnerClass)// Package declaration (the file is part of package _32
package _32AnonymousInnerClass;

// A regular (non-abstract) class with a method 'show'
class Anonymous {
    public void show() {
        System.out.println("In Anonymous class");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {

        // Create an instance of an *anonymous inner class*
        // This syntax: new Anonymous() { ... } creates a subclass of 'Anonymous'
        // on the fly and overrides its 'show' method.
        Anonymous anm = new Anonymous() {
            // This is the overridden method inside the anonymous inner class
            public void show() {  // inner class
                System.out.println("In Anonymous inner class");
            }
        };

        // Calls the overridden 'show' method of the anonymous inner class
        anm.show(); //when you call show(), it will call new implementation not show method present in Anonymous class
    }
}