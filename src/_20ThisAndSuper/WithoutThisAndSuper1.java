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
        System.out.println("Class B with parameter");
    }
}

public class WithoutThisAndSuper1 {
    public static void main(String []args){
        B e = new B(5);  // if we create object of class B, it will call constructor of class A first then class B
    }
}

// when you pass the arruments to parameterized constructor then, it will call constructor of class A first then class B of parameterized constructor 

// Answer:-

//     CLass A
//     Class B with parameter

//Every constructor in java has a method, even if we don't mention (that is 'super')
// ex:-

    //  public A(){ 
    //     super();
    //     System.out.println("Class A");
    // }


// super means call the constructor of super class

// if you call parameterized constructor of 'B', then will get values of  parameterized constructor of 'B' and default constructor of 'A'


// if you want call perticular constructor then you have to pass values in super method


