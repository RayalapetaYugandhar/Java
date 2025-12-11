package _20ThisAndSuper;

class TH{
    public TH(){  // Default Constructor
        super();     
        System.out.println("Class A");
    }

    public TH(int n){
        super();     
        System.out.println("Class A with parameter");
    }
}

class BH extends TH{  // Default Constructor extends another Default Constructor
    public BH(){   
        super();   // calling parameterized constructor of class TH
        System.out.println("Class B");
    }   
    public BH(int n){    
        this();    
        System.out.println("Class B with parameter");
    }
}
public class This {
    public static void main(String []args) {
        BH ex = new BH(10);
    }
}

//changed names A - TH and B - BH

// "this" method will execute the constructor of a same class
// "super" mothod will execute the constructor of a super class


//Answer:-
    // Class A
    // Class B
    // Class B with parameter




// every class in java extends the object class

// ex:- 

// class A extends Object{ 
//     public A(){  // Default Constructor
//         super();     
//         System.out.println("Class A");
//     }

//     public A(int n){
//         super();     
//         System.out.println("Class A with parameter");
//     }
// }
// class B extends A{  // Default Constructor extends another Default Constructor
//     public B(){   
//         super(5);   // calling parameterized constructor of class A
//         System.out.println("Class B");
//     }   
//     public B(int n){    
//         super();    
//         System.out.println("Class B with parameter");
//     }
// }    