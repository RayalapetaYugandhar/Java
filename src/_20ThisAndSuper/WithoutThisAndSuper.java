package _20ThisAndSuper;

class A{
    public A(){  // Default Constructor
        System.out.println("Class A");
    }
}

class B extends A{  // Default Constructor extends another Default Constructor
    public B(){        
        System.out.println("Class B");
    }
}

public class WithoutThisAndSuper {
    public static void main(String []args){
        B e = new B();  // if we create object of class B, it will call constructor of class A first then class B
    }
    
}


//when ever we create object of child class, it will call parent class constructor first then child class constructor
//if we don't write super() in child class constructor, compiler will add it automatically as first statement of child class constructor