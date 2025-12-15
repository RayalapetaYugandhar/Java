package _31InnerCLass;
class outerClass {  //outer class

    int age;   //Varibale 
    public void show() {  //Method
        System.out.println("In Outer Class");
    }

    static class innerClass {  //static inner Class
        public void show() {
            System.out.println("In Inner Class");
        }
    }//Only inner class can make static, we can't make outer class as static
}

public class StaticInnerCLass {
    public static void main(String []args) {
        outerClass out = new outerClass();  // Creates an instance of the outer class named outer and stores it in the variable out.
        out.show();
        //if you make your class as static, then directly we can use
        // Because innerClass is static, you can instantiate it without an outer instance:
        outerClass.innerClass inot = new outerClass.innerClass();   
        
        inot.show();
    }
}


/*
Key rules to remember


Static nested class (static class innerClass):

    Instantiate with new outerClass.innerClass().
    Cannot directly access non-static members of outerClass (needs an instance).
    Useful for grouping helper classes that conceptually belong to outerClass.



Non-static inner class (class innerClass without static):

    Must be instantiated with an outer instance: outerObj.new innerClass().
    Has an implicit reference to the enclosing outerClass instance (outerClass.this) and can access its non-static members.



*/