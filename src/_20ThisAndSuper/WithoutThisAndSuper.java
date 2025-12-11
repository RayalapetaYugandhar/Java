package _20ThisAndSuper;

class AW{
    public AW(){  // Default Constructor
        System.out.println("Class A");
    }
}

class BW extends AW{  // Default Constructor extends another Default Constructor
    public BW(){        
        System.out.println("Class B");
    }
}

public class WithoutThisAndSuper {
    public static void main(String []args){
        BW e = new BW();  // if we create object of class B, it will call constructor of class A first then class B
    }
    
}

//changed names A - AW and B - BW

//when ever we create object of child class, it will call parent class constructor first then child class constructor
//if we don't write super() in child class constructor, compiler will add it automatically as first statement of child class constructor