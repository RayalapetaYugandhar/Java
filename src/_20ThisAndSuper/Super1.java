package _20ThisAndSuper;

class A{
    public A(){  // Default Constructor
        System.out.println("Class A");
    }

    public A(int n){
        System.out.println("Class A with parameter");
    }
}
class B extends A{  // Default Constructor extends another Default Constructor
    public B(){        
        System.out.println("Class B");
    }   
    public B(int n){
        super(n);
        System.out.println("Class B with parameter");
    }
}
public class Super1 {
    public static void main(String []args) {
        B ex = new B(5);
    }
}

//here i have removed super(), if we don't write super() in child class constructor, 
// compiler will add it automatically as first statement of child class constructor

//Answer:-

// Class A with parameter
// Class B with parameter

//If you want pass parameterized constructor then explicitly we have to mention super()

// super means call the constructor of super class

// if you call parameterized constructor of 'B', then will get values of  parameterized constructor of 'B' and default constructor of 'A'

// Here we don't want to call default constructor, in that case explictly have to mention super()


// if you want call perticular constructor then you have to pass values in super()
