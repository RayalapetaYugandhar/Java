package _20ThisAndSuper;

class AB{
    public AB(){  // Default Constructor
        System.out.println("Class A");
    }

    public AB(int n){
        System.out.println("Class A with parameter");
    }
}

class BC extends AB{  // Default Constructor extends another Default Constructor
    public BC(){        
        System.out.println("Class B");
    }
    public BC(int n){
        System.out.println("Class B with parameter");
    }
}

public class WithoutThisAndSuper1 {
    public static void main(String []args){
        BC e = new BC(5);  // if we create object of class BC, it will call constructor of class AB first then class BC
    }
}


//changed names A - AB and B - BC

// when you pass the arruments to parameterized constructor then, it will call constructor of class AB first then class BC of parameterized constructor 

// Answer:-

//     CLass A
//     Class B with parameter

//Every constructor in java has a method, even if we don't mention (that is 'super')
// ex:-

    //  public AB(){ 
    //     super();
    //     System.out.println("Class AB");
    // }


// super means call the constructor of super class

// if you call parameterized constructor of 'BC', then will get values of  parameterized constructor of 'BC' and default constructor of 'AB'


// if you want call perticular constructor then you have to pass values in super method


