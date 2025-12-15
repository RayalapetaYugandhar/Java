package _31InnerCLass;
class outer {  //outer class

    int age;   //Varibale 
    public void show() {  //Method
        System.out.println("In Outer Class");
    }

    class inner {  //inner Class
        public void show() {
            System.out.println("In Inner Class");
        }
    }

}
public class InnerClass {
    public static void main(String []args) {
        outer out = new outer();  // Creates an instance of the outer class named outer and stores it in the variable out.
        out.show();

        outer.inner inout = out.new inner();   // Creates an instance of the inner (non‑static) class inner, but bound to the specific outer instance out.
        
        inout.show();

    }
}


//outer.inner inout = out.new inner();  
//if you want to create object of inner class, we have to use object of outer class 
// if you want create a object of inner class, first we have to create object of outer class